package com.testspace.test_smart_sec_school_proposer;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Not Selected School")
public class NotSelectedSchool implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "School")
	private com.testspace.test_smart_sec_school_proposer.School school;

	public NotSelectedSchool() {
	}

	public com.testspace.test_smart_sec_school_proposer.School getSchool() {
		return this.school;
	}

	public void setSchool(
			com.testspace.test_smart_sec_school_proposer.School school) {
		this.school = school;
	}

	public NotSelectedSchool(
			com.testspace.test_smart_sec_school_proposer.School school) {
		this.school = school;
	}

}