<!DOCTYPE html>
<html>

<head>
<title>INSERT TRAINEE</title>
</head>
<h1>INSERT TRAINEE</h1>
<body style="margin-left: 38%">
	<form method="POST" action="/EmployeeManagement/SaveTrainee">  
		<label>Enter Name :</label>
		 <input type="text" path="name">
		 <br>
		<label>Enter Blood Group :</label>
		 <select path="bloodGroup"
			style="width: 120px">
			<option>A+</option>
			<option>A-</option>
			<option>B+</option>
			<option>B+</option>
			<option>AB+</option>
			<option>AB-</option>
			<option>O+</option>
			<option>O</option>
		</select>
		 <br>
		<label for="dateOfBirth"> Date of birth :</label>
		 <input type="date" id="dateOfBirth" path="dateOfBirth">
		 <br>
	    <label>Enter Designation :</label>
	     <input type="text" path="designation">
	     <br>
		<label>Select Gender :</label>
		 <input type="radio" path="gender" value="MALE">MALE
	     <input type="radio" path="gender" value="FEMALE">FEMALE
	     <input type="radio" path="gender" value="OTHERS">OTHERS
		 <br>
	    <label>Enter Phone number :</label>
	     <input type="text" path="phoneNumber">
	     <br>
	    <label>Enter email :</label>
	     <input type="text" path="email">
	     <br>
	    <label>Enter Date of joining :</label>
	     <input type="date" id="dateOfJoining" path="dateOfJoining">
	     <br>
	    <label>Enter Skill Name      :</label>
	     <input type="text" path="skillName1">
	     <br>
	    <label>Enter Skill Experience :</label>
	     <input type="text" path="skillExperience1">
	     <br>
		<label>Enter Skill Version :</label>
		 <input type="text" path="skillVersion1">
		 <br>
		<label>Enter Skill Certified (YES/NO) :</label>
		<input type="radio" path="skillCertification1" value="YES">Yes
		<input type="radio" path="skillCertification1" value="NO">No
		<br>
		<label>Enter Skill Name :</label>
		 <input type="text" path="skillName2">
		 <br>
		<label>Enter Skill Experience :</label>
		 <input type="text" path="skillExperience2">
		 <br>
		<label>Enter Skill Version :</label> 
		 <input type="text" path="skillVersion2">
		 <br>
		<label>Enter Skill Certified(YES/NO) :</label>
		 <input type="radio" path="skillCertification2" value="YES">Yes
		 <input type="radio" name="skillCertification2" value="NO">No
		 <br>
		<button type="submit">Add Trainee</button>
	</form>
</body>

</html>