<%@page import="com.ideas2it.model.Trainee"%>
<%@page import="com.ideas2it.model.Skill"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<!DOC TYPE html>
<html>
<head>
<title>View Trainees</title>
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
	<h1 style="text-align: center">VIEW TRAINEES PROFILE</h1>
	<a href="SaveTrainee"><button class="buttonGreen">Add Trainee</button></a>
	<table class="content-table">
		<tr class="active-row">
			<th>ID</th>
			<th>Name</th>
			<th>Blood Group</th>
			<th>Date Of Birth</th>
			<th>Designation</th>
			<th>Gender</th>
			<th>Phone Number</th>
			<th>Email</th>
			<th>Age</th>
			<th>Date Of Joining</th>
			<th>Skill Name</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<%
        List<Trainee> trainees = (List<Trainee>) request.getAttribute("traineeList");
		List<Integer> age = (List<Integer>)request.getAttribute("ageList");
		int index = 0;
		for (Trainee trainee : trainees) {
		%>
		<tr class="active-row">
			<td><%=trainee.getId()%></td>
			<td><%=trainee.getName()%></td>
			<td><%=trainee.getBloodGroup()%></td>
			<td><%=trainee.getDateOfBirth()%></td>
			<td><%=trainee.getDesignation()%></td>
			<td><%=trainee.getGender()%></td>
			<td><%=trainee.getPhoneNumber()%></td>
			<td><%=trainee.getEmail()%></td>
			<td><%=age.get(index)%></td>
			<td><%=trainee.getDateOfJoining()%></td>
			<%
		    Set<Skill> skills = trainee.getSkills();
		    for (Skill skill : skills) {
		    %>
			<td><%=skill.getSkillName()%></td>
			<%
            index++;
            %>
			<% } %>
			<td><a href="getTraineeById?id=<%=trainee.getId()%>"><button class="buttonBlue">Update</button></a></td>
			<td><a href="deleteTraineeById?id=<%=trainee.getId()%>"><button class="buttonRed">Delete</button></a></td>
		</tr>
		<% } %>
	</table>
	<br>
</body>
</html>
