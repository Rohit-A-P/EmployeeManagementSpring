<!DOCTYPE html>
<html>

<head>
	<title>INSERT TRAINER</title>
</head>
    <h1>INSERT TRAINER</h1>
<body style="margin-left: 38%"> 
	<form method="POST" action="/EmployeeManagement/SaveTrainer"> 
		<label>Enter Name                        :</label>
		<input type="text" path="name">
		<br>
        <label>Enter Blood Group                 :</label>
		<select path="bloodGroup" style="width:120px">
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
		<label for="dateOfBirth"> Date of birth   :</label>
		<input type="date" id="dateOfBirth" path="dateOfBirth">
		<br>
		<label>Enter Designation :</label>
		<input type="text" path="desgination">
		<br>
		<label>Select Gender :</label>
		<input type="radio" path="gender" value="MALE">MALE
		<input type="radio" path="gender" value="FEMALE">FEMALE
		<input type="radio" path="gender" value="OTHERS">OTHERS
		<br>		
		<label>Enter Phone number                 :</label>
		<input type="text" path="phoneNumber">
		<br>
		<label>Enter email                        :</label>
		<input type="text" path="email">
		<br>
        <label>Enter Training Since(Year)         :</label>  
		<input type="text" path="trainingSince">
		<br>
		<button type = "submit">Add Trainer</button>
	</form>
</body>

</html>