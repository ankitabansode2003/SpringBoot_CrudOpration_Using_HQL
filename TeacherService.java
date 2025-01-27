package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.TeacherDAO;
import com.spring.entity.Teacher;
@Service
public class TeacherService {
	@Autowired
	TeacherDAO td;
	
	public String insertData(Teacher t) {
		return td.InsertData(t);
	}
	
	public String UpdateData(Teacher t,int t_id) {
		return td.updateData(t, t_id);
	}
	
	public String DeleteData(int t_id) {
		return td.DeleteData(t_id);
	}
	
	public Teacher GetSingleData(int t_id) {
		return td.GetSingleData(t_id);
	}
	
	public  List<Teacher> TeacherAllData() {
		return td.GetAllData();
	}
}
