package com.msclub.common.service;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelService {

	private void importExcel(File file, String fileName) throws Exception {

		String version = "2007";
		if (!fileName.endsWith("xlsx")) {
			version = "2003";
		}

		Workbook workbook = null;
		if (version.equals("2007")) {
			workbook = new XSSFWorkbook(file);// 创建 一个excel文档对象
		} else if (version.equals("2003")) {
			workbook = new HSSFWorkbook(new FileInputStream(file));// 创建一个excel文档对象
		}

		Sheet sheet = workbook.getSheet("import_file");
		sheet.getPhysicalNumberOfRows();
	}
}