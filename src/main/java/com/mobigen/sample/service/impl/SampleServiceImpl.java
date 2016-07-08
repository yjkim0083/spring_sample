package com.mobigen.sample.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobigen.sample.dao.SampleDAO;
import com.mobigen.sample.domain.Sample;
import com.mobigen.sample.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	private static final Logger LOG = LoggerFactory.getLogger(SampleServiceImpl.class);
	
	@Autowired
	private SampleDAO sampleDAO;
	
	@Override
	public List<Sample> getSampleList() throws Exception {
		return sampleDAO.getList();
	}

	@Override
	public Sample getSample(String name) throws Exception {
		return null;
	}

}
