<%@page import="com.ideas2it.model.Trainee"%>
<!DOCTYPE html>
<html>

<head>
<title>UPDATE TRAINEE</title>
</head>
<h1>UPDATE TRAINEE</h1>
<body style="margin-left: 38%">
    <form action="EmployeeController" method="post" >
    <input type="hidden" name="flag" value="updateTrainee">  
    <%  
      Trainee trainee = (Trainee)request.getAttribute("trainee");
     %> 
        <lable>ID  : <%=trainee.getId()%></label><br>  
        <input type="hidden" name="id" value="<%=trainee.getId()%>">  
		<label>Enter Name :</label>
		 <input type="text" name="name" value = "<%=trainee.getName()%>"><br>
		<label>Enter Blood Group :</label>
		 <select name="bloodGroup" value = "<%=trainee.getBloodGroup()%>"
			style="width: 120px">
			<option>A+</option>
			<option>A-</option>
			<option>B+</option>
			<option>B+</option>
			<option>AB+</option>
			<option>AB-</option>
			<option>O+</option>
			<option>O</option>
		</select><br> <label for="dateOfBirth"> Date of birth :</label>
		<input type="date" id="dateOfBirth" name="dateOfBirth" value = "<%=trainee.getDateOfBirth()%>"><br>
	    <label>Enter Designation :</label> <input type="text" name="designation" value = "<%=trainee.getDesignation()%>"><br>
		<label>Select Gender :</label> <input type="radio" name="gender"
			value="MALE">MALE <input type="radio" name="gender"
			value="FEMALE">FEMALE <input type="radio" name="gender"
			value="OTHERS">OTHERS<br>
	    <label>Enter Phone number :</label> <input type="text" name="phoneNumber" value = "<%=trainee.getPhoneNumber()%>"><br>
	    <label>Enter email :</label> <input type="text" name="email" value = "<%=trainee.getEmail()%>"><br>
        <label>Enter Date Of Joining         :</label>  
        <input type="date" id="dateOfJoining" name="dateOfJoining" value = "<%=trainee.getDateOfJoining()%>"><br>
        	    <label>Enter Skill Name      :</label> <input type="text" name="skillName1"><br>
	    <label>Enter Skill Experience :</label> <input type="text" name="skillExperience1"><br>
		<label>Enter Skill Version :</label> <input type="text" name="skillVersion1"><br>
		<label>Enter Skill Certified (YES/NO) :</label>
		<input type="radio" name="skillCertification1" value="YES">Yes
		<input type="radio" name="skillCertification1" value="NO">No<br>
		<label>Enter Skill Name :</label> <input type="text" name="skillName2"><br>
		<label>Enter Skill Experience :</label> <input type="text" name="skillExperience2"><br>
		<label>Enter Skill Version :</label> 
		<input type="text" name="skillVersion2"><br>
		<label>Enter Skill Certified(YES/NO) :</label>
		<input type="radio" name="skillCertification2" value="YES">Yes
		<input type="radio" name="skillCertification2" value="NO">No<br>
		<button type="submit">Update Trainer</button>
		</form>
</body>

</html>