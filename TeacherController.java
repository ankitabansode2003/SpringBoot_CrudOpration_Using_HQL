package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Teacher;
import com.spring.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	TeacherService ts; 
	
	@PostMapping("/insertdata")
	public String insertData(@RequestBody Teacher t) {
		return ts.insertData(t);
	}
	@PutMapping("/updatedata/{t_id}")
	public String UpdateData( @RequestBody Teacher t, @PathVariable int  t_id) {
		return ts.UpdateData(t, t_id);
	}
	
	@DeleteMapping("/deletedata")
	public String DeleteData(@RequestParam int  t_id) {
		return ts.DeleteData(t_id);
	}
	
	@GetMapping("/getsingledata")
	public Teacher SingleData( @RequestParam int t_id) {
		return ts.GetSingleData(t_id);
	}
	
	@GetMapping("fetchalldata")
	public List<Teacher> GetAllData() {
		return ts.TeacherAllData();
	}
}
