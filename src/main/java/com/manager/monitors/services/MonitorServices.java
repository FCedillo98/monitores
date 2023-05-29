package com.manager.monitors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manager.monitors.entity.Monitor;
import com.manager.monitors.repository.MonitorRepository;

@Service
public class MonitorServices implements MonitorServicesInterface {

	@Autowired
	private MonitorRepository repository;
	
	@Override
	public List<Monitor> listMonitors() {
		
		return repository.findAll();
	}

	@Override
	public Monitor addMonitor(Monitor monitor) {
		
		return repository.save(monitor);
	}

	@Override
	public Monitor getMonitorById(Integer id) {
		
		return repository.findById(id).get();
	}

	@Override
	public Monitor updatedMonitor(Monitor monitor) {
		
		return repository.save(monitor);
	}

	@Override
	public void deleteMonitor(Integer id) {
		
		repository.deleteById(id);
	}



	
}
