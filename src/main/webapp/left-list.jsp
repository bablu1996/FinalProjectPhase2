<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="sidenav">
	<h3 id="logo">
		Learner's <br /> Academy Portal<br /> Admin Management
	</h3>
	<c:url var="classesLink" value="AdminMainServlet">
		<c:param name="command" value="CLASSES" />
	</c:url>

	<c:url var="subjectsLink" value="AdminMainServlet">
		<c:param name="command" value="SUBJECTS" />
	</c:url>

	<c:url var="teachersLink" value="AdminMainServlet">
		<c:param name="command" value="TEACHERS" />
	</c:url>

	<c:url var="studentsLink" value="AdminMainServlet">
		<c:param name="command" value="STUDENTS" />
	</c:url>
	
	
	<c:url var="modifyStudentsLink" value="AdminMainServlet">
		<c:param name="command" value="MODIFY_STUDENTS" />
	</c:url>
	
	<c:url var="modifyClassLink" value="AdminMainServlet">
		<c:param name="command" value="MODIFY_CLASS" />
	</c:url>
	
	<c:url var="modifyTeachersLink" value="AdminMainServlet">
		<c:param name="command" value="MODIFY_TEACHERS" />
	</c:url>
	
	<c:url var="modifySubjectsLink" value="AdminMainServlet">
		<c:param name="command" value="MODIFY_SUBJECTS" />
	</c:url>
	<c:url var="addStudentsLink" value="AdminMainServlet">
		<c:param name="command" value="ADD_STUDENTS_FORM" />
	</c:url>
 

 
 	 
	<%--
	<a class="bar-item" href="${classesLink}">Classes</a> 
		<a class="bar-item" href="${subjectsLink}">Subjects</a>
		<a class="bar-item" href="${teachersLink}">Teachers</a> 
		<a class="bar-item" href="${studentsLink}">Students</a>
	--%>
		
		<a class="bar-item" href="${modifyClassLink}">Class</a>
		<a class="bar-item" href="${modifyTeachersLink}">Teachers</a>
		<a class="bar-item" href="${modifySubjectsLink}">Subjects</a> 
		<a class="bar-item" href="${modifyStudentsLink}">Students</a>
		<a class="bar-item" href="${addStudentsLink}">Add Student</a>
		<a class="bar-item" href="login.jsp">Log out</a>

</div>

