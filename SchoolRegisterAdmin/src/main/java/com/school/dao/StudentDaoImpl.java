package com.school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.school.dao.StudentDao;
import com.school.student.Student;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("im at entering values");
		String sql = "insert into studentres(id,fname,lname,age,city) values(?,?,?,?,?)";
		jdbcTemplate.update(sql, student.getId(),student.getFname(), student.getLname(), student.getAge(), student.getCity());
	}
//	public int save(Emp p){    
//	    String sql="insert into Emp92(id,name1,salary,designation) values('"+p.getId()+"','"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
//	    return template.update(sql);
	
	// Getting all the Employees
    	
//	@Override
//	public List<Student> getAllstudents() {
//		List<Student> studentlist=new ArrayList<Student>();
//		String s="select * from studentres";
//		List<Map<String, Object>> student=jdbcTemplate.queryForList(s);
//		for(int i =0;i<student.size();i++) {
//			System.out.println(student.get(i).get("fname"));
//			studentlist.add(new Student((Integer)student.get(i).get("id"),(String)student.get(i).get("fname"),(String)student.get(i).get("lname"),(Integer)student.get(i).get("age"),(String)student.get(i).get("city") ));
//			//System.out.println(student);
//			}
//		System.out.println(studentlist);
//		return studentlist;

	@Override
	public List<Student> getAllstudents() {
		String sql = "select * from studentres";
        List<Student> studentlist = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>()
        {
			@Override
			public List<Student> extractData(ResultSet rs) throws 
			SQLException, DataAccessException {
				 List<Student> list = new ArrayList<Student>();
	                while (rs.next())
	                {
	                   Student student = new Student();
	                   student.setId(rs.getInt(1));
	                   student.setFname(rs.getString(2));
	                   student.setLname(rs.getString(3));
	                   student.setAge(rs.getInt(4));
	                   student.setCity(rs.getString(5));
	                    list.add(student);
	                }
				return list;
			}    
        });
        System.out.println(studentlist);
        return studentlist;
	}

	@Override
	public void delete(int id){    
	    String sql="delete from studentres where id="+id+"";    
	    jdbcTemplate.update(sql);   		
	}
	
	@Override
	public void saveOrUpdate(Student student) {
	    System.out.println("IM AT SVAE OR UPDATE dao impl");
	        String sql = "UPDATE studentres SET id=?,fname=?, lname=?, age=?, city=? WHERE id=?";
	        jdbcTemplate.update(sql, student.getId(),student.getFname(), student.getLname(), student.getAge(), student.getCity(), student.getId());
	}

	@Override
	public List<Student> getstudent(int id) {
		System.out.println("at getstudent dao impl");
		String sql = "select * from studentres where id="+id+"";
        List<Student> studentlist = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>()
        {
			@Override
			public List<Student> extractData(ResultSet rs) throws 
			SQLException, DataAccessException {
				 List<Student> list = new ArrayList<Student>();
	                while (rs.next())
	                {
	                   Student student = new Student();
	                   student.setId(rs.getInt(1));
	                   student.setFname(rs.getString(2));
	                   student.setLname(rs.getString(3));
	                   student.setAge(rs.getInt(4));
	                   student.setCity(rs.getString(5));	                   
	                    list.add(student);
	                }
				return list;
			}                
        });
        System.out.println(studentlist);
        return studentlist;
	}	
	}	
	

	
	


