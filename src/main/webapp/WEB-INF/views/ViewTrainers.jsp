<%@page import="com.ideas2it.model.Trainer"%>
<%@page import="java.util.List"%>
<!DOC TYPE html>
<html>
<head>
<title>VIEW ALL TRAINER PROFILE</title>
</head>
<body>
	<h1 style="text-align: center">VIEW ALL TRAINER PROFILE</h1>
	<h1 style="text-align: center"><button href="SaveTrainer">Add Trainer</button></h1>
	<table border="1" width="90%">
		<tr>
			<th>id</th>
			<th>Name</th>
			<th>bloodGroup</th>
			<th>dateOfBirth</th>
			<th>designation</th>
			<th>gender</th>
			<th>Phone Number</th>
			<th>email</th>
			<th>Training Since</th>
			<th>Update</th>
		    <th>Delete</th>
		</tr>
		<%
		List<Trainer> trainers = (List<Trainer>) request.getAttribute("trainerList");
		for (Trainer trainer : trainers) {
		%>
		<tr>
			<td><%=trainer.getId()%></td>
			<td><%=trainer.getName()%></td>
			<td><%=trainer.getBloodGroup()%></td>
			<td><%=trainer.getDateOfBirth()%></td>
			<td><%=trainer.getDesignation()%></td>
			<td><%=trainer.getGender()%></td>
			<td><%=trainer.getPhoneNumber()%></td>
			<td><%=trainer.getEmail()%></td>
			<td><%=trainer.getTrainingSince()%></td>
			<td><a href="getTrainerById?id=<%=trainer.getId()%>">Update</a></td>
			<td><a href="deleteTrainerById?id=<%=trainer.getId()%>">Delete</a></td>
		</tr>
		<% } %>
	</table>
	<br />
</body>
</html>
