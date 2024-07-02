package com.lxisoft.school;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository repo;

    public List<School> getAllSchools() {
        return repo.findAll();
    }

    public School getSchoolById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public School getSchoolName(String name)
    {
        return repo.findByName(name);
    }

    public School createSchool(School school) {
        return repo.save(school);
    }

    public School updateSchool(Long id, School schoolDetails) {
        School school = repo.findById(id).orElse(null);
        if (school != null) {
            school.setName(schoolDetails.getName());
            school.setAddress(schoolDetails.getAddress());
            school.setAge(schoolDetails.getAge());
            school.setFile(schoolDetails.getFile());
            return repo.save(school);
        }
        return null;
    }

    public void deleteSchool(Long id) {
        repo.deleteById(id);
    }
}
