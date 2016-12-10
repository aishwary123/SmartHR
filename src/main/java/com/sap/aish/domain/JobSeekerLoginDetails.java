package com.sap.aish.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name="JobSeekerLoginDetails")
public class JobSeekerLoginDetails {
	
	
	
	@EmbeddedId
	private JobSeekerLoginKey jobSeekerLoginKey;
	
	@Column(name="password")
	private String password;
	
	@Column(name="Authorisation")
	private String authorisation="UNAUTHORISED";
	
	@Column(length = 36, unique=true)
	private String verificationCode;


	public JobSeekerLoginDetails() {
		jobSeekerLoginKey=new JobSeekerLoginKey();
	}
	
	public JobSeekerLoginDetails(JobSeekerLoginKey jobSeekerLoginKey,String password,String authorisation,String verificationCode){
		this.jobSeekerLoginKey=jobSeekerLoginKey;
		this.password=password;
		this.authorisation=authorisation;
		this.verificationCode=verificationCode;
	}
	

	

	public JobSeekerLoginKey getJobSeekerLoginKey() {
		return jobSeekerLoginKey;
	}

	public void setJobSeekerLoginKey(JobSeekerLoginKey jobSeekerLoginKey) {
		this.jobSeekerLoginKey = jobSeekerLoginKey;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(String authorisation) {
		this.authorisation = authorisation;
	}
	
	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorisation == null) ? 0 : authorisation.hashCode());
		result = prime * result + ((jobSeekerLoginKey == null) ? 0 : jobSeekerLoginKey.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		JobSeekerLoginDetails other = (JobSeekerLoginDetails) obj;
		if (authorisation == null) {
			if (other.authorisation != null)
				return false;
		} else if (!authorisation.equals(other.authorisation))
			return false;
		if (jobSeekerLoginKey == null) {
			if (other.jobSeekerLoginKey != null)
				return false;
		} else if (!jobSeekerLoginKey.equals(other.jobSeekerLoginKey))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	
}
