package com.manager.monitors.services;

import java.util.List;

import com.manager.monitors.entity.Monitor;


public interface MonitorServicesInterface {

	public List<Monitor> listMonitors();
	
	public Monitor addMonitor(Monitor monitor);
	
	public Monitor getMonitorById(Integer id);
	
	public Monitor updatedMonitor(Monitor monitor);
	
	public void deleteMonitor(Integer id);
}
