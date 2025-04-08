package com.example.sepweekend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sepweekend.model.student;
import com.example.sepweekend.service.studentservice;

@RestController
@RequestMapping("/student")
public class studentcontroller {
	@Autowired
	studentservice stdservice;
	@GetMapping("/msg")
	public String getmsg() {
		return "hello";
	}
	@GetMapping("/msg1")
	public String getmsg1() {
		return "hello1";
	}
	@PostMapping("/create")
	public String createstudent(@RequestBody student std) {
		return stdservice.createuser(std);
	}
	@GetMapping("/getAll")
	public List<student>getall(){
		return stdservice.getAll();
	}
	@GetMapping("/getbyid")
	public student getbyid(@RequestParam int id){
		return stdservice.getbyid(id);
	}
	@DeleteMapping("/Deletebyid")
	public String deletebyid(@RequestParam int id){
		return stdservice.deletebyid(id);
	}
	@PutMapping("/updatebyid")
	public String updatestud(@RequestBody student std) {
		return stdservice.updatestud(std);
	}
}