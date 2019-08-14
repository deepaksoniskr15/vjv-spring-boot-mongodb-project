package com.sample.project.app.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sample.project.app.config.CustomDateAndTimeDeserialize;
import com.sample.project.app.config.CustomJsonDateSerializer;
import com.sample.project.app.dto.DataDto;
import com.sample.project.app.dto.PatientHistoryDto;
import com.sample.project.app.dto.ReviewOfSystemsDto;

@Document(collection = "patient_details")
@JsonIgnoreProperties
public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(nullable = false, updatable = false)
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	@JsonDeserialize(using = CustomDateAndTimeDeserialize.class)
	private Date createdAt = new Date();

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	@JsonSerialize(using = CustomJsonDateSerializer.class)
	@JsonDeserialize(using = CustomDateAndTimeDeserialize.class)
	private Date updatedAt = new Date();

	private String patientName;
	private String homePhone;
	private String address;
	private String officePhone;
	private String fax;
	private Date birthDate;
	private String status;
	private String gender;
	private String maritalStatus;
	private String contactBy;
	private String race;
	private String socSecNo;
	private String language;
	private String respProv;
	private String mrn;
	private String referredBy;
	private String empStatus;
	private String email;
	private String sensChart;
	private String homeLOC;
	private String externalID;
	private List<String> problems;
	private List<String> medications;
	private PatientHistoryDto patientHistory;
	private List<DataDto> physicalExam;

	private ReviewOfSystemsDto reviewOfSystems;

	private String hospitalName;
	private String hospitalFax;
	private String hospitalPhone;
	private String hash;

	private String ht;
	private int wt;
	private String rhythm;
	private String bP;

	public String getHt() {
		return ht;
	}

	public void setHt(String ht) {
		this.ht = ht;
	}

	public int getWt() {
		return wt;
	}

	public void setWt(int wt) {
		this.wt = wt;
	}

	public String getRhythm() {
		return rhythm;
	}

	public void setRhythm(String rhythm) {
		this.rhythm = rhythm;
	}

	public String getbP() {
		return bP;
	}

	public void setbP(String bP) {
		this.bP = bP;
	}

	public ReviewOfSystemsDto getReviewOfSystems() {
		return reviewOfSystems;
	}

	public void setReviewOfSystems(ReviewOfSystemsDto reviewOfSystems) {
		this.reviewOfSystems = reviewOfSystems;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getContactBy() {
		return contactBy;
	}

	public void setContactBy(String contactBy) {
		this.contactBy = contactBy;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getSocSecNo() {
		return socSecNo;
	}

	public void setSocSecNo(String socSecNo) {
		this.socSecNo = socSecNo;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRespProv() {
		return respProv;
	}

	public void setRespProv(String respProv) {
		this.respProv = respProv;
	}

	public String getMrn() {
		return mrn;
	}

	public void setMrn(String mrn) {
		this.mrn = mrn;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSensChart() {
		return sensChart;
	}

	public void setSensChart(String sensChart) {
		this.sensChart = sensChart;
	}

	public String getHomeLOC() {
		return homeLOC;
	}

	public void setHomeLOC(String homeLOC) {
		this.homeLOC = homeLOC;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public List<String> getProblems() {
		return problems;
	}

	public void setProblems(List<String> problems) {
		this.problems = problems;
	}

	public List<String> getMedications() {
		return medications;
	}

	public void setMedications(List<String> medications) {
		this.medications = medications;
	}

	public PatientHistoryDto getPatientHistory() {
		return patientHistory;
	}

	public void setPatientHistory(PatientHistoryDto patientHistory) {
		this.patientHistory = patientHistory;
	}

	public List<DataDto> getPhysicalExam() {
		return physicalExam;
	}

	public void setPhysicalExam(List<DataDto> physicalExam) {
		this.physicalExam = physicalExam;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalFax() {
		return hospitalFax;
	}

	public void setHospitalFax(String hospitalFax) {
		this.hospitalFax = hospitalFax;
	}

	public String getHospitalPhone() {
		return hospitalPhone;
	}

	public void setHospitalPhone(String hospitalPhone) {
		this.hospitalPhone = hospitalPhone;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
