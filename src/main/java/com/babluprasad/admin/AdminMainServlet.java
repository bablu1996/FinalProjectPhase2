package com.babluprasad.admin;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.babluprasad.models.Student;
import com.babluprasad.models.Subject;
import com.babluprasad.models.Teacher;
import com.babluprasad.models.Class;
import com.babluprasad.models.ModifyClass;
import com.babluprasad.models.ModifyStudents;
import com.babluprasad.models.ModifySubjects;
import com.babluprasad.models.ModifyTeachers;


/**
 * Servlet implementation class AdminMainServlet
 */
@WebServlet("/AdminMainServlet")
public class AdminMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private FetchData dbRetrieve;

	@Resource(name = "jdbc_database")
	private DataSource datasource;

	@Override
	public void init() throws ServletException {

		super.init();

		// create instance of db util, to pass in conn pool object
		try {
			dbRetrieve = new FetchData(datasource);

		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminMainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			// read the "command" parameter
			String command = request.getParameter("command");
			
			
			
			if (command == null) {
				command = "MODIFY_CLASS";
			}
			
			
			// if no cookeies
			if (!getCookies(request, response) && (!command.equals("LOGIN"))) {

				response.sendRedirect("/LearnersAcademy/login.jsp");
			}

			else {

				// if there is no command, how to handle

				// route the data to the appropriate method
				switch (command) {

				case "STUDENTS":
					studentsList(request, response);
					break;

				case "TEACHERS":
					teachersList(request, response);
					break;

				case "SUBJECTS":
					subjectList(request, response);
					break;

				case "CLASSES":
					classestList(request, response);
					break;

				case "ST_LIST":
					classStudentsList(request, response);
					break;
				
				case "MODIFY_CLASS":
					modifyClassList(request,response);
					break;
				case "MODIFY_TEACHERS":
					modifyTeachersList(request,response);
					break;
				case "MODIFY_SUBJECTS":
					modifySubjectsList(request,response);
					break;
				case "MODIFY_STUDENTS":
					modifyStudentsList(request,response);
					break;
				case "ADD_STUDENTS_FORM":
					response.sendRedirect("/LearnersAcademy/add-students.jsp");
					break;

				case "LOGIN":
					login(request, response);
					break;

				default:
					classestList(request, response);

				}
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	private void modifyTeachersList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<ModifyTeachers> modifyteachers = dbRetrieve.getModifyTeachers();

		// add students to the request
		request.setAttribute("MODIFY_TEACHERS_LIST", modifyteachers);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/modify-teachers.jsp");
		dispatcher.forward(request, response);

	}
	private void modifySubjectsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<ModifySubjects> modifysubjects = dbRetrieve.getModifySubjects();

		// add students to the request
		request.setAttribute("MODIFY_SUBJECTS_LIST", modifysubjects);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/modify-subjects.jsp");
		dispatcher.forward(request, response);

	}
	private void modifyStudentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<ModifyStudents> modifystudents = dbRetrieve.getModifyStudents();

		// add students to the request
		request.setAttribute("MODIFY_STUDENT_LIST", modifystudents);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/modify-students.jsp");
		dispatcher.forward(request, response);

	}
	private void modifyClassList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<ModifyClass> modifyclass = dbRetrieve.getModifyClass();

		// add students to the request
		request.setAttribute("MODIFY_CLASS_LIST", modifyclass);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/modify-class.jsp");
		dispatcher.forward(request, response);

	}

	private void studentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<Student> students = dbRetrieve.getStudents();

		// add students to the request
		request.setAttribute("STUDENT_LIST", students);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);

	}

	private void teachersList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<Teacher> teachers = dbRetrieve.getTeachers();

		// add students to the request
		request.setAttribute("TEACHERS_LIST", teachers);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teachers-list.jsp");
		dispatcher.forward(request, response);

	}

	private void subjectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get subjects from db util
		List<Subject> subjects = dbRetrieve.getSubjects();

		// add subjects to the request
		request.setAttribute("SUBJECTS_LIST", subjects);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/subjects-list.jsp");
		dispatcher.forward(request, response);

	}

	private void classestList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get subjects from db util
		List<Class> classes = dbRetrieve.getClasses();

		// add subjects to the request
		request.setAttribute("CLASSES_LIST", classes);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/classes-list.jsp");
		dispatcher.forward(request, response);

	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.toLowerCase().equals("root") && password.toLowerCase().equals("root")) {

			Cookie cookie = new Cookie(username, password);

			// Setting the maximum age to 1 day
			cookie.setMaxAge(86400); // 86400 seconds in a day

			// Send the cookie to the client
			response.addCookie(cookie);
			classestList(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}

	}

	private void classStudentsList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int classId = Integer.parseInt(request.getParameter("classId"));
		String section = request.getParameter("section");
		String subject = request.getParameter("subject");

		// get subjects from db util
		List<Student> students = dbRetrieve.loadClassStudents(classId);

		// add subjects to the request
		request.setAttribute("STUDENTS_LIST", students);
		request.setAttribute("SECTION", section);
		request.setAttribute("SUBJECT", subject);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/class-students.jsp");
		dispatcher.forward(request, response);

	}

	private boolean getCookies(HttpServletRequest request, HttpServletResponse response) throws Exception {

		boolean check = false;
		Cookie[] cookies = request.getCookies();
		// Find the cookie of interest in arrays of cookies
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				 
				if (cookie.getName().equals("admin") && cookie.getValue().equals("admin")) {
					check = true;
					break;
				} 

			}
		}
		
		
		return check;

	}

}
