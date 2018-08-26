package com.msclub.common.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.msclub.training.web.stater.model.CommonResponse;
import com.msclub.training.web.stater.util.RestClientUtil;

@RequestMapping("/excel")
public class ExcelController {

	@Autowired
	private RestClientUtil restClientUtil;

	@RequestMapping("/import")
	public CommonResponse importExcel(HttpServletRequest request) throws Exception {
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		/** 构建图片保存的目录 **/
		String logoPathDir = "/resources/upload_excel/" + dateformat.format(new Date());
		/** 得到图片保存目录的真实路径 **/
		String logoRealPathDir = request.getSession().getServletContext().getRealPath(logoPathDir);
		/** 根据真实路径创建目录 **/
		File logoSaveFile = new File(logoRealPathDir);
		if (!logoSaveFile.exists())
			logoSaveFile.mkdirs();
		/** 页面控件的文件流 **/
		MultipartFile multipartFile = multipartRequest.getFile("import_excel");

		String afterFix = multipartFile.getOriginalFilename();
		if (StringUtils.isNotEmpty(afterFix)) {
			afterFix = afterFix.substring(afterFix.lastIndexOf("."));
		} else {
			afterFix = "";
			return null;
		}
		// 构建非重复文件名称
		String logImageName = UUID.randomUUID().toString() + afterFix;

		/** 拼成完整的文件保存路径加文件 **/
		String fileName = logoRealPathDir + File.separator + logImageName;

		File file = new File(fileName);

		multipartFile.transferTo(file);

		String savePath = logoPathDir + "/" + logImageName;
		
		return null;
	}

	@RequestMapping("/export")
	public CommonResponse exportExcel() throws JsonProcessingException {
		CommonResponse response = new CommonResponse();

		return restClientUtil.buildSuccessCommonResponse("/bin");
	}

}
