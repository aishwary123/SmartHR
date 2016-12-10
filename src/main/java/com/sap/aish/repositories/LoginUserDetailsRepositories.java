package com.sap.aish.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.aish.domain.JobSeekerLoginDetails;
import com.sap.aish.domain.JobSeekerLoginKey;

@Repository
public interface LoginUserDetailsRepositories extends JpaRepository<JobSeekerLoginDetails, JobSeekerLoginKey>{

	
}
