package com.testspace.test_smart_sec_school_proposer;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Student implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "Postal Code")
	private int postalCode;
	@org.kie.api.definition.type.Label(value = "Mode of transport")
	private java.lang.String modeOfTransport;
	@org.kie.api.definition.type.Label(value = "Expected or Prelims Score")
	private int expectedScore;
	@org.kie.api.definition.type.Label(value = "Mother Tongue ")
	private java.lang.String motherTongue;
	@org.kie.api.definition.type.Label(value = "Resident Status")
	private java.lang.String residentStatus;
	@org.kie.api.definition.type.Label(value = "Gender")
	private java.lang.String gender;
	@org.kie.api.definition.type.Label(value = "Preference of co-ed/single")
	private java.lang.String preferenceCoedOrSingle;

	public Student() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public java.lang.String getModeOfTransport() {
		return this.modeOfTransport;
	}

	public void setModeOfTransport(java.lang.String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public int getExpectedScore() {
		return this.expectedScore;
	}

	public void setExpectedScore(int expectedScore) {
		this.expectedScore = expectedScore;
	}

	public java.lang.String getMotherTongue() {
		return this.motherTongue;
	}

	public void setMotherTongue(java.lang.String motherTongue) {
		this.motherTongue = motherTongue;
	}

	public java.lang.String getResidentStatus() {
		return this.residentStatus;
	}

	public void setResidentStatus(java.lang.String residentStatus) {
		this.residentStatus = residentStatus;
	}

	public java.lang.String getGender() {
		return this.gender;
	}

	public void setGender(java.lang.String gender) {
		this.gender = gender;
	}

	public java.lang.String getPreferenceCoedOrSingle() {
		return this.preferenceCoedOrSingle;
	}

	public void setPreferenceCoedOrSingle(
			java.lang.String preferenceCoedOrSingle) {
		this.preferenceCoedOrSingle = preferenceCoedOrSingle;
	}

	public Student(java.lang.String name, int postalCode,
			java.lang.String modeOfTransport, int expectedScore,
			java.lang.String motherTongue, java.lang.String residentStatus,
			java.lang.String gender, java.lang.String preferenceCoedOrSingle) {
		this.name = name;
		this.postalCode = postalCode;
		this.modeOfTransport = modeOfTransport;
		this.expectedScore = expectedScore;
		this.motherTongue = motherTongue;
		this.residentStatus = residentStatus;
		this.gender = gender;
		this.preferenceCoedOrSingle = preferenceCoedOrSingle;
	}

}