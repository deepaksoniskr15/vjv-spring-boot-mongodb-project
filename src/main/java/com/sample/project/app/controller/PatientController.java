package com.sample.project.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.project.app.dto.ApiResponseDto;
import com.sample.project.app.dto.ApiResponseDto.ApiResponseDtoBuilder;
import com.sample.project.app.model.Patient;
import com.sample.project.app.repository.PatientRepository;
import com.sample.project.app.service.IPatientService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class PatientController {

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private IPatientService patientService;

	/*
	 * Api For Add Patient Information
	 * 
	 * @param patient
	 * 
	 * return
	 */

	@RequestMapping(value = "/patient/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ApiResponseDto addPatient(@RequestBody Patient patient) {
		ApiResponseDtoBuilder apiResponseDtoBuilder = new ApiResponseDtoBuilder();
		patientService.addPatient(patient);
		if (patient.getId() != null) {
			apiResponseDtoBuilder.withMessage("Patient Has Been Added Successfully").withStatus(HttpStatus.OK)
					.withData(patient);
		} else {
			apiResponseDtoBuilder.withMessage("fail").withStatus(HttpStatus.BAD_REQUEST);
		}
		return apiResponseDtoBuilder.build();
	}

	/*
	 * Api For Get Patient Information
	 * 
	 * @param patientId
	 */

	@RequestMapping(value = "/patient/get/{patientId}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ApiResponseDto getPatient(@PathVariable String patientId) {
		ApiResponseDtoBuilder apiResponseDtoBuilder = new ApiResponseDtoBuilder();
		Optional<Patient> patient = patientRepository.findById(patientId);
		if (patient.isPresent()) {
			apiResponseDtoBuilder.withMessage("success").withStatus(HttpStatus.OK).withData(patient.get());
		} else {
			apiResponseDtoBuilder.withMessage("No Patient Exists").withStatus(HttpStatus.NO_CONTENT);
		}
		return apiResponseDtoBuilder.build();
	}

	/*
	 * Api For Get All Patient
	 * 
	 * return
	 */

	@RequestMapping(value = "/patient/all", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ApiResponseDto getAllPatient() {
		ApiResponseDtoBuilder apiResponseDtoBuilder = new ApiResponseDtoBuilder();
		List<Patient> list = patientRepository.findAll();
		apiResponseDtoBuilder.withMessage("success").withStatus(HttpStatus.OK).withData(list);
		return apiResponseDtoBuilder.build();
	}

	/*
	 * Api For Delete Patient
	 * 
	 * return
	 */

	@RequestMapping(value = "/patient/delete/{patientId}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ApiResponseDto deletePatient(@PathVariable String patientId) {
		ApiResponseDtoBuilder apiResponseDtoBuilder = new ApiResponseDtoBuilder();
		patientRepository.deleteById(patientId);
		apiResponseDtoBuilder.withMessage("Patient Has Been Deleted Successfully").withStatus(HttpStatus.OK);
		return apiResponseDtoBuilder.build();
	}
}
