package com.thiruacademy.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thiruacademy.entity.Department;
import com.thiruacademy.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
		@Autowired
		private DepartmentService departmentService;
		
		@PostMapping("/save")
		public Department saveDepartment(@RequestBody Department department) {
			return departmentService.saveDepartment(department);
		}
		
		@GetMapping("/{id}")
		/*
		 * @CircuitBreaker(name="deptservice", fallbackMethod="fallbackMethod")
		 * 
		 * @Retry(name="deptservice")
		 * 
		 * @TimeLimiter(name="deptservice")
		 */
		@ResponseStatus(HttpStatus.ACCEPTED)
		public Department getDepartmentById(@PathVariable Long id) {
			//System.out.println(10/0);
			return departmentService.getDepartmentById(id);
		}
		
		@ResponseStatus(HttpStatus.BAD_REQUEST)
		public CompletableFuture<String> fallbackMethod(@PathVariable Long id, RuntimeException ex) {
			return CompletableFuture.supplyAsync(()->"Dept Service is down. Please try after some time.");
		}

	}