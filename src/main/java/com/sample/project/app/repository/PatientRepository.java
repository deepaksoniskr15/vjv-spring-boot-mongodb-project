package com.sample.project.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sample.project.app.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

}
