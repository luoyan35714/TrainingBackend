package com.msclub.training.domain;

import java.util.List;

import com.msclub.training.dto.TrainingPlan;

public interface TrainingPlanDomain {

	public List<TrainingPlan> getAllTrainingPlan();

	public TrainingPlan getTrainingPlan(Integer id);

	public void addTrainingPlan(TrainingPlan trainingPlan);

	public void deleteTrainingPlan(Integer id);

}
