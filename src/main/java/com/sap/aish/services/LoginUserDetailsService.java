package com.sap.aish.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sap.aish.domain.JobSeekerLoginDetails;
import com.sap.aish.repositories.LoginUserDetailsRepositories;
import com.sap.aish.util.MyUtil;

import org.springframework.transaction.annotation.Propagation;;



@Service
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class LoginUserDetailsService {
	
	@Autowired
	private LoginUserDetailsRepositories loginUserDetailsRepositories;

	private static final Log log=LogFactory.getLog(LoginUserDetailsService.class);
	
	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public void saveFirstLoginOfUser(JobSeekerLoginDetails jobSeekerLoginDetails){
		
		log.info("Saving the first time details of User who signed up");
		JobSeekerLoginDetails temp=new JobSeekerLoginDetails();
		temp.setJobSeekerLoginKey(jobSeekerLoginDetails.getJobSeekerLoginKey());
		temp.setPassword(MyUtil.getRandomUUID());
		temp.setAuthorisation((jobSeekerLoginDetails.getAuthorisation().equals("")
				||jobSeekerLoginDetails.getAuthorisation()==null)?"UNAUTHORISED":jobSeekerLoginDetails.getAuthorisation());
		temp.setVerificationCode(MyUtil.getRandomUUID());
		loginUserDetailsRepositories.save(temp);
		log.info("Successfully saved the first time details of User who signed up");
		
	}
	
}
