package com.msclub.training.model;

import java.util.List;

public class GetAllTrainingPlanResponse {

	private List<GetTrainingPlanResponse> traningPlans;

	public List<GetTrainingPlanResponse> getTraningPlans() {
		return traningPlans;
	}

	public void setTraningPlans(List<GetTrainingPlanResponse> traningPlans) {
		this.traningPlans = traningPlans;
	}

}
