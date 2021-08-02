package com.school.dao;

import java.util.List;

import com.school.student.Student;

public interface StudentDao {
	public void saveStudent(Student student);

	public List<Student> getAllstudents();

	public void delete(int id);

	public void saveOrUpdate(Student std);

	public List<Student> getstudent(int id);

}
