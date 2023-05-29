package com.manager.monitors.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manager.monitors.entity.Monitor;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor, Integer> {
	
}
