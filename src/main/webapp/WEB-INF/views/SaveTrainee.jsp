<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>
<head>
<title>CREATE TRAINEE PROFILE</title>
</head>
  <style>
    label {
    width:210px;
    display:inline-block;
    }
    body{
    background-color: #f3f3d3;
    }
    #form{
    display:block;
    margin:auto;
    border-radius:10px;
    background: blue;
    color:white;
    width:265;
    padding:40px;
    }
    h2{
        text-align: center;
    }
    .button-88 {
      display: flex;
      align-items: center;
      font-family: inherit;
      font-weight: 500;
      font-size: 16px;
      padding: 0.7em 1.4em 0.7em 1.1em;
      color: white;
      background: #ad5389;
      background: linear-gradient(0deg, rgba(20,167,62,1) 0%, rgba(102,247,113,1) 100%);
      border: none;
      box-shadow: 0 0.7em 1.5em -0.5em #14a73e98;
      letter-spacing: 0.05em;
      border-radius: 20em;
      cursor: pointer;
      user-select: none;
      -webkit-user-select: none;
      touch-action: manipulation;
    }

    .button-88:hover {
      box-shadow: 0 0.5em 1.5em -0.5em #14a73e98;
    }

    .button-88:active {
      box-shadow: 0 0.3em 1em -0.5em #14a73e98;
    }
    </style>
    <body>
	<form:form modelAttribute="trainee" action="insertTrainee">
	    <div id="form">
	    <h3>CREATE TRAINEE PROFILE</h3>
	    <form:input type="hidden" path="id" name="id" value="0"/>
		<label>Enter Name :</label>
		<br>
		<form:input path="name" name="name" required="required"/>
		<br>
		<label>Select Blood Group :</label>
		<br>
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A-"/>A
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="A+"/>A+
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B+"/>B
		<form:radiobutton path="bloodGroup" name="bloodGroup" value="B-"/>B-
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O+"/>O+
        <form:radiobutton path="bloodGroup" name="bloodGroup" value="O-"/>O-
		<br>
		<label for="dateOfBirth"> Date of birth :</label>
		<br>
		<form:input type="date" path="dateOfBirth" name="dateOfBirth" required="required"/>
		<br>
		<label>Enter Designation :</label>
		<br>
		<form:input path="designation" name="designation" required="required"/>
		<br>
		<label>Select Gender :</label>
		<br>
		<form:radiobutton path="gender" name="gender" value="MALE"/>MALE
		<form:radiobutton path="gender" name="gender" value="FEMALE"/>FEMALE
		<form:radiobutton path="gender" name="gender" value="OTHERS"/>OTHERS
		<br>
		<label>Enter Phone number :</label>
		<br>
		<form:input path="phoneNumber" name="phoneNumber" required="required"/>
		<br>
		<label>Enter email                        :</label>
		<br>
		<form:input type="email" path="email" name="email" required="required"/>
		<br>
        <form:input type="hidden" path="traineeId" name="traineeId" value="0"/>
	    <label for="dateOfJoining"> Date of Joining :</label>
        <br>
        <form:input type="date" path="dateOfJoining" name="dateOfJoining" required="required"/>
	     <br>
	     <br>
		<button class="button-88" role="button" type="submit">SUBMIT</button>
		</div>
	</form:form>
</body>

</html>