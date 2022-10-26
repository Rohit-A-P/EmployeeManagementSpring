<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>

<head>
<title>UPDATE TRAINER</title>
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
    <form:form action="UpdateTraineeById" modelAttribute="trainee">
        <div id="form">
        <h3>UPDATE TRAINEE</h3>
        <label>ID  : ${trainee.id}</label>
        <br>
        <form:input type="hidden" name="id" path="id" />
		<label>Enter Name :</label>
		 <form:input name="name" path="name" /><br>
		<label>Select Blood Group :</label><br>
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
		<label>Select Gender :</label><br>
		    <form:radiobutton path="gender" name="gender" value="MALE"/>MALE
		    <form:radiobutton path="gender" name="gender" value="FEMALE"/>FEMALE
		    <form:radiobutton path="gender" name="gender" value="OTHERS"/>OTHERS<br>
	    <label>Enter Phone number :</label>
	     <form:input name="phoneNumber" path="phoneNumber" /><br>
	    <label>Enter email :</label>
	     <form:input path="email" name="email" /><br>
        <label>Enter Date of joining         :</label>
        <form:input type="date" id="dateOfJoining" name="dateOfJoining" path="dateOfJoining"/><br>
		<button class="button-88" role="button" type="submit">Submit</button>
        </div>
		</form:form>
</body>

</html>