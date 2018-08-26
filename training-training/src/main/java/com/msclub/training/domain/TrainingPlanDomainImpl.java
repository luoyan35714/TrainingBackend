package com.msclub.training.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclub.base.exception.TechnicalFailureException;
import com.msclub.training.dto.TrainingPlan;
import com.msclub.training.exception.TrainingExceptionCode;
import com.msclub.training.repository.TrainingPlanRepository;

@Service
public class TrainingPlanDomainImpl implements TrainingPlanDomain {

	@Autowired
	private TrainingPlanRepository trainingPlanRepository;

	@Override
	public List<TrainingPlan> getAllTrainingPlan() {
		try {
			return trainingPlanRepository.findAll();
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}

	@Override
	public TrainingPlan getTrainingPlan(Integer id) {
		try {
			return trainingPlanRepository.findOne(id);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}

	@Override
	public void addTrainingPlan(TrainingPlan trainingPlan) {
		try {
			trainingPlanRepository.save(trainingPlan);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}

	@Override
	public void deleteTrainingPlan(Integer id) {
		try {
			trainingPlanRepository.delete(id);
		} catch (Exception e) {
			throw new TechnicalFailureException(TrainingExceptionCode.ERROR_010002, e);
		}
	}

}
