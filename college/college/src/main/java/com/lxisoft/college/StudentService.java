package com.lxisoft.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
 

@Service
public class StudentService {
	@Autowired
	StudentRepository repo;
		public Student createStudent(Student s) {
			return repo.save(s);
		}
		public List<Student> fetchStudent(){
		 return repo.findAll();
		}
		public Student updateStudent(int id,Student s) {
	         
	        repo.findById(id);
	        s.setName(s.getName());
	        s.setMark(s.getMark());
			return repo.save(s);
		}
 
			public void deleteStudent(@PathVariable int id){
		        repo.deleteById(id);
		}
}
