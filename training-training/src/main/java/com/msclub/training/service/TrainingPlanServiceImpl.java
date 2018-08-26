package com.msclub.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.training.domain.TrainingPlanDomain;
import com.msclub.training.dto.TrainingPlan;

@Service
public class TrainingPlanServiceImpl implements TrainingPlanService {

	@Autowired
	private TrainingPlanDomain trainingPlanDomain;

	@Override
	public List<TrainingPlan> getAllTrainingPlan() {
		return trainingPlanDomain.getAllTrainingPlan();
	}

	@Override
	public TrainingPlan getTrainingPlan(Integer id) {
		return trainingPlanDomain.getTrainingPlan(id);
	}

	@Override
	public void addTrainingPlan(TrainingPlan trainingPlan) {
		trainingPlanDomain.addTrainingPlan(trainingPlan);
	}

	@Override
	public void deleteTrainingPlan(Integer id) {
		trainingPlanDomain.deleteTrainingPlan(id);
	}

}
