package com.nbsc.nbsc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.nbsc.nbsc.models.Student;
import com.nbsc.nbsc.services.StService;

@Controller
public class StController {
    
    private StService stService;

    public StController(StService stService){
        super();
        this.stService = stService;
    }

    @GetMapping("/student")
    public String listStudents(Model model){
      
        model.addAttribute("student", stService.getAllStudent());

        return "student";
    }

    @GetMapping("/student/add")
    public String createStudent(Model model){
        Student student= new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/student")
	public String saveStudent(@ModelAttribute("student") Student student) {
		stService.saveStudent(student);
		return "redirect:/student";
	}

    @GetMapping("/student/edit/{id}")
	public String editStudentForm(@PathVariable Integer id, Model model) {
		model.addAttribute("student", stService.getStudentById(id));
		return "edit_student";
	}
    
    @PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Integer id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		Student existingStudent = stService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setSname(student.getSname());
		existingStudent.setCourse(student.getCourse());
		
		stService.updateStudent(existingStudent);
		return "redirect:/student";		
	}

    @GetMapping("/student/{id}")
	public String deleteStudent(@PathVariable Integer id) {
		stService.deleteStudentById(id);
		return "redirect:/student";
	}	
    


}
