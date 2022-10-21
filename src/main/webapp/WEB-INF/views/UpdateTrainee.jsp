<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>

<head>
<title>UPDATE TRAINER</title>
</head>
<h1>UPDATE TRAINER</h1>
<body style="margin-left: 38%">
    <form:form action="UpdateTraineeById" modelAttribute="trainee" method="post">
        ID  : ${trainee.id}
        <br>
		<label>Enter Name :</label>
		 <form:input name="name" path="name" /><br>
		<label>Select Blood Group :</label>
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A-"/>A-
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A+"/>A+
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B+"/>B+
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B-"/>B-
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O+"/>O+
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O-"/>O-
		<br>
	   <label for="dateOfBirth"> Date of birth :</label>
		<form:input type="date" id="dateOfBirth" name="dateOfBirth" path="dateOfBirth" /><br>
	    <label>Enter Designation :</label>
	     <form:input name="designation" path="designation"/><br>
		<label>Select Gender :</label>
		    <form:radiobutton path="gender" name="gender" value="MALE"/>MALE
		    <form:radiobutton path="gender" name="gender" value="FEMALE"/>FEMALE
		    <form:radiobutton path="gender" name="gender" value="OTHERS"/>OTHERS<br>
	    <label>Enter Phone number :</label>
	     <form:input name="phoneNumber" path="phoneNumber" /><br>
	    <label>Enter email :</label>
	     <form:input path="email" name="email" /><br>
        <label>Enter Date of joining         :</label>
        <form:input type="date" id="dateOfJoining" name="dateOfJoining" path="dateOfJoining"><br>
		<button type="submit">Update Trainer</button>
		</form:form>
</body>

</html>