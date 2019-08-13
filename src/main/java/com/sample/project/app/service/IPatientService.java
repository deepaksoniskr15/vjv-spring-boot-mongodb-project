package com.sample.project.app.service;

import org.springframework.stereotype.Service;

import com.sample.project.app.model.Patient;

@Service
public interface IPatientService {

	void addPatient(Patient patient);

}
