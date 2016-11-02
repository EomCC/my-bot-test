package com.linecorp.jobsearch.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linecorp.jobsearch.rest.dto.JobDTO;
import com.linecorp.jobsearch.rest.mapper.JobMapper;

@RestController
@RequestMapping("/api")
public class JobListController {
	@Autowired
	JobMapper jobMapper;
	
	@RequestMapping("/jobList")
	public List<JobDTO> index() {
		return jobMapper.selectAllJob();
	}
}
