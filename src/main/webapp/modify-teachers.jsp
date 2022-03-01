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
				<h3>Teachers</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Age</th>
						<th>Subject</th>
						<th>Class</th>
						

					</tr>

					<c:forEach var="tempModifyTeachers" items="${MODIFY_TEACHERS_LIST }">
						<tr>
							<td>${tempModifyTeachers.id}</td>
							<td>${tempModifyTeachers.name}</td>
							<td>${tempModifyTeachers.age}</td>
							<td>${tempModifyTeachers.subject}</td>
							<td>${tempModifyTeachers.aclass}</td>

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
	
	

</body>
</html>