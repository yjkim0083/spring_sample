package com.mobigen.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mobigen.sample.service.SampleService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SampleController {
	
	@SuppressWarnings("unused")
	private static final Logger LOG = LoggerFactory.getLogger(SampleController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView sample() throws Exception {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("sampleList", sampleService.getSampleList());
		return mav;
	}
}
