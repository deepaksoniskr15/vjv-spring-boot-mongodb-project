package com.sample.project.app.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.project.app.model.Patient;
import com.sample.project.app.repository.PatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void addPatient(Patient patient) {
		patient.setHash(getHashCode(patient.getPatientName() + patient.getBirthDate()));
		patientRepository.save(patient);
	}

	private String getHashCode(String originalString) {
		try {
			MessageDigest digest;
			digest = MessageDigest.getInstance("SHA-256");
			byte[] encodedhash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));
			String hash = bytesToHex(encodedhash);
			return hash;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	private static String bytesToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1)
				hexString.append('0');
			hexString.append(hex);
		}
		return hexString.toString();
	}
}
