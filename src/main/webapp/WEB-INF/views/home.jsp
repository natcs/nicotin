<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world! - 
</h1>
${controllerMessage}<br/>
<br/>
<br/>
<a href="person/list">Go to the person list</a><br>

<!--  <a href="amenity/test">Test Amenity</a>  -->

<c:set var="table">Amenity,Country,InquiryInfo,NewRental,Pics,PropertyUnit,PropertUnitAvailability,Region,UnitAmenity</c:set>
<c:forEach items="${table}" var="v_table">
<a href='<c:out value="${v_table}" />/test'><c:out value="${v_table}" /></a><br>
</c:forEach>


</body>
</html>
