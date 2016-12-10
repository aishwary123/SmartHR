package com.sap.aish.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.UniqueConstraint;

import com.sap.aish.validation.UniqueEmail;
import com.sap.aish.validation.UniquePan;


@Embeddable
public class JobSeekerLoginKey implements Serializable {

	public JobSeekerLoginKey() {
		// TODO Auto-generated constructor stub
	}
	
	public JobSeekerLoginKey(String emailId,String panNumber){
		this.emailId=emailId;
		this.panNumber=panNumber;
	}
	
	@UniqueEmail
	@Column(name="EMAIL_ID",nullable=false,length=250)
	private String emailId;
	
	

	@UniquePan
	@Column(name="PAN_NUMBER",nullable=false,length=15)
	private String panNumber;

	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((panNumber == null) ? 0 : panNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobSeekerLoginKey other = (JobSeekerLoginKey) obj;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		return true;
	}

}
