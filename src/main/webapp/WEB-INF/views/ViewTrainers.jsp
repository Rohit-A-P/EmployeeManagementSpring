<%@page import="com.ideas2it.model.Trainer"%>
<%@page import="java.util.List"%>
<!DOC TYPE html>
<html>
<head>
<title>VIEW ALL TRAINER PROFILE</title>
</head>
<style>
    .content-table {
        border-collapse:collapse;
        margin:25px 0;
        font-size:0.9em;
        min-width:400px;
        border-radius:5px 5px 0 0;
        overflow: hidden;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    }

    .content-table thread tr {
        background-color: blue;
        color: red;
        text-align: left;
        font-weight: bold;
    }

    .content-table th,
    .content-table td {
        color: black;
        padding: 12px 15px;
    }

    .content-table tbody tr {
        border-bottom:1px solid #dddddd;
    }

    .content-table tbody tr:nth-of-type(even) {
        background-color: #f3f3d3;
    }

    .content-table tbody tr:last-of-type {
        border-bottom: 2px solid #009879;
    }

    .content-table tbody tr.active-row {
        font-weight: bold;
        color:#00989870;
}
     .buttonBlue {
         background-color:blue;
         border-color:black;
         color:white;
     }

     .buttonRed {
         background-color:red;
         border-color:black;
         color:white;
     }

     .buttonGreen {
         background-color:green;
         border-color:black;
         color:white;
     }
</style>
<body>
	<h1 style="text-align: center">VIEW TRAINERS PROFILE</h1>
    <a href="SaveTrainer"><button class="buttonGreen">Add Trainer</button></a>
	<table class="content-table">
		<tr class="active-row">
			<th>id</th>
			<th>Name</th>
			<th>bloodGroup</th>
			<th>dateOfBirth</th>
			<th>designation</th>
			<th>gender</th>
			<th>Phone Number</th>
			<th>email</th>
			<th>Training Since</th>
			<th>Age</th>
			<th>Update</th>
		    <th>Delete</th>
		</tr>
		<%
		List<Trainer> trainers = (List<Trainer>) request.getAttribute("trainerList");
		List<Integer> ageList = (List<Integer>)request.getAttribute("ageList");
		int index = 0;
		for (Trainer trainer : trainers) {
		%>
		<tr class="active-row">
			<td><%=trainer.getId()%></td>
			<td><%=trainer.getName()%></td>
			<td><%=trainer.getBloodGroup()%></td>
			<td><%=trainer.getDateOfBirth()%></td>
			<td><%=trainer.getDesignation()%></td>
			<td><%=trainer.getGender()%></td>
			<td><%=trainer.getPhoneNumber()%></td>
			<td><%=trainer.getEmail()%></td>
			<td><%=trainer.getTrainingSince()%></td>
			<td><%=ageList.get(index)%></td>
			<%
			index++;
			%>
			<td><a href="getTrainerById?id=<%=trainer.getId()%>"><button class="buttonBlue">Update</button></a></td>
			<td><a href="deleteTrainerById?id=<%=trainer.getId()%>"><button class="buttonRed">Delete</button></a></td>
		</tr>
		<% } %>
	</table>
	<br>
</body>
</html>