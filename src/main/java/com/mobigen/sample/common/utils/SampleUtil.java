package com.mobigen.sample.common.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.mobigen.sample.domain.Sample;

@Component
public class SampleUtil {
	
	private List<Sample> sampleList = new ArrayList<Sample>();
	

	public List<Sample> initSampleList() {
		sampleList.clear();
		sampleList.add(new Sample("김용주",35));
		sampleList.add(new Sample("류준석",33));
		sampleList.add(new Sample("황인용",32));
		sampleList.add(new Sample("최영철",31));
		sampleList.add(new Sample("김진태",31));
		
		return sampleList;
	}
	
	public Sample getSampleByName(String name) {
		return sampleList.stream()
			.filter(sample -> sample.getName().equals(name))
			.findFirst()
			.get();
	}
}
