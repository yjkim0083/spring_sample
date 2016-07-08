package com.mobigen.sample.service;

import java.util.List;

import com.mobigen.sample.domain.Sample;

public interface SampleService {

	public List<Sample> getSampleList() throws Exception;
	
	public Sample getSample(String name) throws Exception;
}
