package com.jsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

@Controller

public class HospitalController {
	@Autowired
	HospitalService service;

	@RequestMapping("/loadhospital")
	public ModelAndView load() {
		ModelAndView mv = new ModelAndView("registerhospital.jsp");
		mv.addObject("hospital", new Hospital());
		return mv;

	}

	@RequestMapping("/savehospital")
	public ModelAndView save(@ModelAttribute Hospital hospital) {

		Hospital hospital2 = service.saveService(hospital);
		if (hospital2 != null) {
			ModelAndView mv = new ModelAndView("Home.jsp");

			mv.addObject("msg", "data is saved");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("/loadhospital");
			return mv;
		}
	}

	@RequestMapping("/deletehospital")
	public ModelAndView delete(@RequestParam int id) {
		service.deleteService(id);

		ModelAndView mv = new ModelAndView("/displayhospital");

		return mv;

	}

	@RequestMapping("/updatehospital")
	public ModelAndView update(@ModelAttribute Hospital hospital) {

		service.updateService(hospital);

		ModelAndView mv = new ModelAndView("/displayhospital");

		return mv;

	}

	@RequestMapping("/displayhospital")
	public ModelAndView display() {

		ModelAndView mv = new ModelAndView("displayhospital.jsp");
		mv.addObject("list", service.getAllService());
		return mv;

	}

	@RequestMapping("/edithospital")
	public ModelAndView edit(@RequestParam int id) {

		ModelAndView mv = new ModelAndView("updatehospital.jsp");
		mv.addObject("update", service.getByIdService(id));
		return mv;

	}
}
