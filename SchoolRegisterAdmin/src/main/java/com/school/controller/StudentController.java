package com.school.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.school.dao.StudentDao;
import com.school.student.Student;

@Controller
public class StudentController {
	@Autowired
	StudentDao stdDao;

	@RequestMapping(value = "/showStudent")
	public String showStudent(Model md) {
		Student std = new Student();
		md.addAttribute("student", std);
		return "Register";

	}
	
	@RequestMapping(value = "/savestudent")
	public String saveStudent(@Valid @ModelAttribute("student") Student std,BindingResult br) {
		 if(br.hasErrors())  
	        {  
			 System.out.println("has error and redirected to register");
	            return "Register";  
	        }  
		 else {
			 System.out.println("has no error");
		stdDao.saveStudent(std);
		System.out.println("your record is saved at database");
		return "saved";
		 }

	}
	 @RequestMapping("/viewstudent")    
	    public ModelAndView PrintAllStudents() {
		 ModelAndView m=new ModelAndView("viewstudent");
		 List<Student> list=stdDao.getAllstudents();
		 System.out.println(list);
		 m.addObject("list",list);
		
		 return m;
	 }
	 
	 @RequestMapping(value="/deletestu/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int id){    
		 stdDao.delete(id);    
	        return "redirect:/viewstudent";    
	    }     
	 @RequestMapping(value = "/editemp/{id}")
		public String showEdit(Model md) {
			Student std = new Student();
			md.addAttribute("student", std);
			return "stuedit";

		}
	 
	 @PostMapping(value = "/saveupdate")
	 public String saveContact(@ModelAttribute Student student) {
		 System.out.println("at update controller");
	     stdDao.saveOrUpdate(student);
	     return "redirect:/viewstudent";
	 }
	 
	 @RequestMapping(value="/searchcontroller/{val}",method = RequestMethod.GET)    
	    public ModelAndView getstudentbyid(@PathVariable int val){ 
		 System.out.println("at search controller");
		 ModelAndView m=new ModelAndView("searchresult");
		 List<Student> list=stdDao.getstudent(val);
		 System.out.println(list);
		 m.addObject("list",list);
		
		 return m;
    
	    }   
//	  
//	 @RequestMapping(value="afteredit",method = RequestMethod.POST)    
//	    public String update(@ModelAttribute("std") Student std){    
//		 stdDao.update(std);    
//		 System.out.println("im at update controller");
//	        return "redirect:/viewstudent";    
//	    }    
}
