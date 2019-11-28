package com.lxisoft.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
public class StudentController {
       @Autowired
	StudentService studentService;
       
       @PostMapping("/student")
       public Student create(@RequestBody Student student){
           
           return studentService.createStudent(student);
       }
       @GetMapping("/student")
       public List<Student> read(){
           return studentService.fetchStudent();
       }
       @PutMapping("/student/{id}")
       public Student update(@PathVariable int id, @RequestBody Student student){
           return studentService.updateStudent(id,student);
       }
      
       @DeleteMapping("/student/{id}")
       public void delete(@PathVariable int id){
    	   studentService.deleteStudent(id);
       }
}
