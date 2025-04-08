package com.example.sepweekend.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sepweekend.model.student;
import com.example.sepweekend.repo.StudentRepo;
@Service
public class studentservice {
	@Autowired
	StudentRepo stdrepo;
	public String createuser(student std) {
		stdrepo.save(std);
		return "inserted sucessfully";
	}
	public List<student> getAll() {
		// TODO Auto-generated method stub
		return stdrepo.findAll();
	}
	public student getbyid(int id) {
		// TODO Auto-generated method stub
		if(stdrepo.findById(id).isPresent()) {
			return stdrepo.findById(id).get();
		}
		else {
			return null;
		}
	}
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		if(stdrepo.findById(id).isPresent()) {
			stdrepo.deleteById(id);
			return "deleted sucessfully";
		}
		else {
			return "no id found";
		}
	}
	public String updatestud(student std) {
		// TODO Auto-generated method stub
		if(stdrepo.findById(std.getId()).isPresent()) {
			student getstd=stdrepo.findById(std.getId()).get();
			getstd.setName(std.getName());
			getstd.setAddress(std.getAddress());
			stdrepo.save(getstd);
			return "updated sucessfully";
		}
		else {
			return "no id found";
		}
	}
}
