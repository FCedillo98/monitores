package com.manager.monitors.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.manager.monitors.entity.Monitor;
import com.manager.monitors.services.MonitorServicesInterface;

@Controller
public class MonitorController {
	
	
	
	@Autowired
	private MonitorServicesInterface service;
	
	@GetMapping({"/monitors", "/"})
	public String monitorsList(Model model) {
		
		model.addAttribute("monitors", service.listMonitors());
		
		return "monitorsList";
	}
	
	@GetMapping("/monitors/newMonitorForm")
	public String showMonitorForm(Model model) {
		
		Monitor newMonitor = new Monitor();
		model.addAttribute("monitor", newMonitor);
		
		return "newMonitorForm";
	}
	
	@PostMapping("/monitors")
	public String saveNewMonitor(@ModelAttribute("monitor") Monitor newMonitor) {
		
		service.addMonitor(newMonitor);
		
		return "redirect:/monitors";
	}
	
	
	@GetMapping("/monitors/updateMonitorForm/{id}")
	public String showUpdateMonitorForm(@PathVariable Integer id, Model model) {
		
		model.addAttribute("monitor", service.getMonitorById(id));
		
		return "updateMonitor";
	}
	
	@PostMapping("/monitors/{id}")
	public String updateMonitor(@PathVariable Integer id, @ModelAttribute("monitor") Monitor monitor, Model model) {
		
		Monitor monitorToUpdate = service.getMonitorById(id);
		
		monitorToUpdate.setId(id);

		monitorToUpdate.setName(monitor.getName());
		monitorToUpdate.setSurname(monitor.getSurname());
		monitorToUpdate.setEmail(monitor.getEmail());
		
		service.updatedMonitor(monitorToUpdate);
		
		return "redirect:/monitors";
	}
	
	@GetMapping("/monitors/{id}")
	public String deleteMonitor(@PathVariable Integer id) {
		
		service.deleteMonitor(id);
		
		return "redirect:/monitors";
	}
	
	
	@PostMapping("/error")
	public String error(Model model) {
		
		return "error";
	}
}
