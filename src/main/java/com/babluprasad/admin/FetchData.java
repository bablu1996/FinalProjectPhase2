package com.babluprasad.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.babluprasad.models.Class;
import com.babluprasad.models.ModifyClass;
import com.babluprasad.models.ModifyStudents;
import com.babluprasad.models.ModifySubjects;
import com.babluprasad.models.ModifyTeachers;
import com.babluprasad.models.Student;
import com.babluprasad.models.Subject;
import com.babluprasad.models.Teacher;

public class FetchData {
	
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/adminportal";
	String username="root";
	String password="12345root";

	private DataSource dataSource;

	public FetchData(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Student> getStudents() {

		List<Student> students = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM students";
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("fname");
				String lastName = myRs.getString("lname");
				int age = myRs.getInt("age");
				int aclass = myRs.getInt("class");

				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, age, aclass);

				// add it to the list of students
				students.add(tempStudent);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return students;

	}
	public List<ModifyStudents> getModifyStudents() {

		List<ModifyStudents> modifystudents = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM modifystudents";
			myStmt = myConn.createStatement();
			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("name");
				int aclass = myRs.getInt("aclass");
				int age = myRs.getInt("age");

				// create new student object
				ModifyStudents tempStudent = new ModifyStudents(id, firstName, aclass,age);

				// add it to the list of students
				modifystudents.add(tempStudent);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return modifystudents;

	}
	public List<ModifyTeachers> getModifyTeachers() {

		List<ModifyTeachers> modifyteachers = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM modifyteachers";
			myStmt = myConn.createStatement();
			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				int age = myRs.getInt("age");
				String subject = myRs.getString("subject");
				int aclass = myRs.getInt("aclass");
				

				// create new student object
				ModifyTeachers tempStudent = new ModifyTeachers(id, name, age, subject, aclass);

				// add it to the list of students
				modifyteachers.add(tempStudent);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return modifyteachers;

	}
	public List<ModifySubjects> getModifySubjects() {

		List<ModifySubjects> modifysubjects = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM modifysubjects";
			myStmt = myConn.createStatement();
			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				

				// create new student object
				ModifySubjects tempSubjects = new ModifySubjects(id, name);

				// add it to the list of students
				modifysubjects.add(tempSubjects);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return modifysubjects;

	}
	public List<ModifyClass> getModifyClass() {

		List<ModifyClass> modifyclass = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM modifyclasses";
			myStmt = myConn.createStatement();
			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				int teacher = myRs.getInt("teacher");
				int subject = myRs.getInt("subject");
				
				ModifyTeachers tempTeacher = loadModifyTeacher(teacher);
				ModifySubjects tempSubject = loadModifySubject(subject);
				String teacher_name = tempTeacher.getName() ;
				String subject_name = tempSubject.getName() ;

				// create new student object
				ModifyClass tempClass = new ModifyClass(id,teacher_name,subject_name);

				// add it to the list of students
				modifyclass.add(tempClass);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return modifyclass;

	}

	public List<Teacher> getTeachers() {

		List<Teacher> teachers = new ArrayList<>();

		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		

		try {
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//check if the conne
			// get a connection
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM teachers";
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("fname");
				String lastName = myRs.getString("lname");
				int age = myRs.getInt("age");

				// create new student object
				Teacher temp = new Teacher(id, firstName, lastName, age);

				// add it to the list of students
				teachers.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return teachers;

	}

	public List<Subject> getSubjects() {

		List<Subject> subjects = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// get a connection
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM subjects";
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				String shortcut = myRs.getString("shortcut");

				// create new student object
				Subject temp = new Subject(id, name,shortcut);

				// add it to the list of students
				subjects.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return subjects;

	}

	public List<Class> getClasses() {

		List<Class> classes = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			//myConn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM classes";
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				int section = myRs.getInt("section");
				int subject = myRs.getInt("subject");
				int teacher = myRs.getInt("teacher");
				String time = myRs.getString("time");

				Teacher tempTeacher = loadTeacher(teacher);
				Subject tempSubject = loadSubject(subject);

				String teacher_name = tempTeacher.getFname() + " " + tempTeacher.getLname();

				// create new student object
				Class temp = new Class(id, section, teacher_name, tempSubject.getName(), time);

				// add it to the list of students
				classes.add(temp);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return classes;

	}

	public ModifyTeachers loadModifyTeacher(int teacherId) {

		ModifyTeachers theTeacher = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM modifyteachers WHERE id = " + teacherId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				int age = myRs.getInt("age");
				String subject = myRs.getString("subject");
				int aclass = myRs.getInt("aclass");
				theTeacher = new ModifyTeachers(id, name, age, subject, aclass);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return theTeacher;

	}
	public Teacher loadTeacher(int teacherId) {

		Teacher theTeacher = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM teachers WHERE id = " + teacherId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String fname = myRs.getString("fname");
				String lname = myRs.getString("lname");
				int age = myRs.getInt("age");
				theTeacher = new Teacher(id, fname, lname, age);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return theTeacher;

	}
	public ModifySubjects loadModifySubject(int subjectId) {

		ModifySubjects theSubject = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM modifysubjects WHERE id = " + subjectId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");

				theSubject = new ModifySubjects(id, name);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return theSubject;

	}

	public Subject loadSubject(int subjectId) {

		Subject theSubject = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM subjects WHERE id = " + subjectId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");
				String shortcut = myRs.getString("shortcut");

				theSubject = new Subject(id, name,shortcut);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return theSubject;

	}

	public Class loadClass(int classId) {

		Class theClass = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM clasess WHERE id = " + classId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				int section = myRs.getInt("section");
				int subject = myRs.getInt("subject");
				int teacher = myRs.getInt("teacher");
				String time = myRs.getString("time");

				Teacher tempTeacher = loadTeacher(teacher);
				Subject tempSubject = loadSubject(subject);

				String teacher_name = tempTeacher.getFname() + " " + tempTeacher.getLname();

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return theClass;

	}

	public List<Student> loadClassStudents(int classId) {

		List<Student> students = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			//myConn = dataSource.getConnection();
			java.lang.Class.forName(driver);
			//get connection and store it in con object
			myConn= DriverManager.getConnection(url,username,password);
			// create sql stmt
			String sql = "SELECT * FROM students WHERE class = " + classId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String firstName = myRs.getString("fname");
				String lastName = myRs.getString("lname");
				int age = myRs.getInt("age");
				int aclass = myRs.getInt("class");

				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, age, aclass);
				students.add(tempStudent);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt, myRs);
		}
		return students;

	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myConn != null) {
				myConn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}



}
