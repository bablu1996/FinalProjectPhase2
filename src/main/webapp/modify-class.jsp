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
				<h3>Class</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>
						<th>ID</th>
						<th>Class Teacher</th>
						<th>Class Teacher's Subject</th>
						

					</tr>

					<c:forEach var="tempModifyClass" items="${MODIFY_CLASS_LIST }">
						<tr>
							<td>${tempModifyClass.id}</td>
							<td>${tempModifyClass.teacher}</td>
							<td>${tempModifyClass.subject}</td>

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
	
	

</body>
</html>