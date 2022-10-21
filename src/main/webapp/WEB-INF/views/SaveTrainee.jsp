<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<title>CREATE TRAINEE PROFILE</title>
</head>
<h1>CREATE TRAINEE PROFILE</h1>
<body style="margin-left: 38%">
	<form:form  modelAttribute="trainee" action="insertTrainee">
	    <form:input type="hidden" path="id" name="id" value="0"/>
		<label>Enter Name                        :</label>
		<form:input type="text" path="name" name="name"/>
		<br>
		<label>Select Blood Group :</label>
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A-"/>A
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A+"/>A+
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B+"/>B
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B-"/>B-
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O+"/>O+
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O-"/>O-
		<br>
		<label for="dateOfBirth"> Date of birth   :<label>
		<form:input type="date" path="dateOfBirth" name="dateOfBirth" />
		<br>
		<label>Enter Designation :</label>
		<form:input type="text" path="designation" name="designation" />
		<br>
		<label>Select Gender :</label>
		<form:radiobutton path="gender" name="gender" value="MALE"/>MALE
		<form:radiobutton path="gender" name="gender" value="FEMALE"/>FEMALE
		<form:radiobutton path="gender" name="gender" value="OTHERS"/>OTHERS
		<br>
		<label>Enter Phone number                 :</label>
		<form:input type="number" path="phoneNumber" name="phoneNumber"/>
		<br>
		<label>Enter email                        :</label>
		<form:input type="email" path="email" name="email"/>
		<br>
        <form:input type="hidden" path="traineeId" name="traineeId" value="0"/>
	    <label for="dateOfJoining"> Date of birth   :<label>
        <form:input type="date" path="dateOfJoining" name="dateOfJoining" />
	     <br>
		<button type="submit">Add Trainee</button>
	</form:form>
</body>

</html>