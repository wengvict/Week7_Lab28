<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Find the Weather for Your City</h1>

	<h3>Please enter six to seven decimals for the latitude and longitude.</h3>
	<form action="location-form">
	Latitude: <input type="number" step="any" name="lat" placeholder="Latitude">
	Longitude: <input type="number" step="any" name="lon" placeholder="Longitude">
	<input type="submit" value="Find Weather">
	</form>
 	
 	<br>
 	
	<table border="1">
		<thead>
			<tr>
				<td>Weather</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${forecast }" var="weather">
				<tr>
					<td>${weather}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>

</body>
</html>