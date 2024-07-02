package com.lxisoft.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    @Autowired
    private SchoolService serv;

    @GetMapping
    public List<School> getAllSchools() {
        return serv.getAllSchools();
    }

    @GetMapping("/name/{name}")
public School getSchoolByName(@PathVariable String name)
{
return serv.getSchoolName(name);
}

    @PostMapping
    public School createSchool(
            @RequestParam("name") String name,
            @RequestParam("address") String address,
            @RequestParam("age") String age,
            @RequestParam("file") MultipartFile file) {
        School school = new School();
        school.setName(name);
        school.setAddress(address);
        school.setAge(age);
        try {
            school.setFile(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return serv.createSchool(school);
    }
    

    @GetMapping("/{id}")
    public School getSchoolById(@PathVariable Long id) {
        return serv.getSchoolById(id);
    }

    @PutMapping("/{id}")
    public School updateSchool(@PathVariable Long id, @RequestBody School schoolDetails) {
        return serv.updateSchool(id, schoolDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteSchool(@PathVariable Long id) {
        serv.deleteSchool(id);
    }
}
