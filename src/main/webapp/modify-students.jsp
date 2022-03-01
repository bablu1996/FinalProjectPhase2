<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Modified Students</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
	<div id="page">
		<jsp:include page="left-list.jsp" />


		<div id="wrapper">

			<div id="header">
				<h3>Students</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Class</th>
						<th>Age</th>

					</tr>

					<c:forEach var="tempModifyStudent" items="${MODIFY_STUDENT_LIST }">
						<tr>
							<td>${tempModifyStudent.id}</td>
							<td>${tempModifyStudent.name}</td>
							<td>${tempModifyStudent.studentsclass}</td>
							<td>${tempModifyStudent.age}</td>

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
	
	

</body>
</html>