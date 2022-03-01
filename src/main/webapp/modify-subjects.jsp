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
				<h3>Subjects</h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>
						<th>ID</th>
						<th>Name</th>
						

					</tr>

					<c:forEach var="tempModifySubjects" items="${MODIFY_SUBJECTS_LIST }">
						<tr>
							<td>${tempModifySubjects.id}</td>
							<td>${tempModifySubjects.name}</td>

						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>
	
	

</body>
</html>