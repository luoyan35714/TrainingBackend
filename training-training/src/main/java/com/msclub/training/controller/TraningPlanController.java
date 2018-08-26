package com.msclub.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclub.training.dto.TrainingPlan;
import com.msclub.training.model.AddTrainingPlanRequest;
import com.msclub.training.model.GetAllTrainingPlanResponse;
import com.msclub.training.model.GetTrainingPlanResponse;
import com.msclub.training.model.TrainingHistoryResponse;
import com.msclub.training.model.TrainingPlanResponse;
import com.msclub.training.service.TrainingPlanService;

@RequestMapping("/training/plan")
@RestController
public class TraningPlanController {

	@Autowired
	private TrainingPlanService trainingPlanService;

	@PostMapping("/list")
	public GetAllTrainingPlanResponse getAllTrainingPlan() {
		List<TrainingPlan> trainingPlans = trainingPlanService.getAllTrainingPlan();
		GetAllTrainingPlanResponse allTrainingPlanResponse = new GetAllTrainingPlanResponse();
		List<GetTrainingPlanResponse> trainingPlanResponse = new ArrayList<GetTrainingPlanResponse>();

		for (TrainingPlan trainingPlan : trainingPlans) {
			GetTrainingPlanResponse trainingPlanRes = new GetTrainingPlanResponse();
			trainingPlanRes.setId(trainingPlan.getId());
			trainingPlanRes.setName(trainingPlan.getName());
			trainingPlanRes.setYear(trainingPlan.getYear());
			trainingPlanRes.setCreator(trainingPlan.getCreator());

			trainingPlanResponse.add(trainingPlanRes);
		}
		allTrainingPlanResponse.setTraningPlans(trainingPlanResponse);
		return allTrainingPlanResponse;
	}

	@GetMapping("/{id}")
	public TrainingHistoryResponse getTrainingPlan(@PathVariable Integer id) {
		trainingPlanService.getTrainingPlan(id);
		return null;
	}

	@PostMapping("/")
	public TrainingPlanResponse addTrainingPlan(AddTrainingPlanRequest request) {
		trainingPlanService.addTrainingPlan(null);
		return null;
	}

	@DeleteMapping("/{id}")
	public TrainingPlanResponse deleteTrainingPlan(@PathVariable Integer id) {
		trainingPlanService.deleteTrainingPlan(id);
		return null;
	}

}
