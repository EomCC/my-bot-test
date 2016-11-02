package com.linecorp.jobsearch.rest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.linecorp.jobsearch.rest.dto.JobDTO;

@Mapper
public interface JobMapper {
	@Select("SELECT * FROM job")
	public List<JobDTO> selectAllJob();
}
