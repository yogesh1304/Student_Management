package com.nbsc.nbsc.servicesImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nbsc.nbsc.models.Student;
import com.nbsc.nbsc.repositories.StRepo;
import com.nbsc.nbsc.services.StService;

@Service
public class StServiceImpl implements StService {

    private StRepo strepo;

    public StServiceImpl(StRepo strepo){

        super();

        this.strepo = strepo;


    }

    @Override
    public List<Student> getAllStudent() {
        return strepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        
        return strepo.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {

        return strepo.findById(id).get();
    
    }

    @Override
    public Student updateStudent(Student student) {
        
        return strepo.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {

        strepo.deleteById(id);
       
    }
    
}
