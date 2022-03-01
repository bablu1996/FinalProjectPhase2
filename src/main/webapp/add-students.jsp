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


	
	
	<form action="./InsertData" method="post">
		<p>ID:</p> 
        <input type="text" name="id"/>
        <br/>
        <p>Name:</p> 
        <input type="text" name="name"/>
        <br/>
        <p>Age:</p> 
        <input type="text" name="age"/>
        <br/>
        <p>Class:</p> 
        <input type="text" name="aclass"/>
        <br/>
        <br/>
        <input type="submit"/>
	</form> 
</div>
</body>
</html>