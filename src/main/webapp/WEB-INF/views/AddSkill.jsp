<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>

<head>
<title>Add Skill</title>
</head>
<h1>Add Skill</h1>
<body style="margin-left: 38%">
	<form:form action="SaveSkill" modelAttribute="skill">
	    ${id}
	    <input type="hidden" name="id" path="id" value="${id}">
	    <br>
	    <form:input type="hidden" path="skillId" name="skillId"/>
	    <label>Enter Skill Name      :</label>
	     <form:input type="text" path="skillName" name="skillName"/><br>
	    <label>Enter Skill Experience :</label>
	     <form:input type="text" path="skillExperience" name="skillExperience"/><br>
		<label>Enter Skill Version :</label>
		 <form:input type="text" path="skillVersion" name="skillVersion"/><br>
		<label>Enter Skill Certified (YES/NO) :</label>
		 <form:radiobutton path="skillCertification" name="skillCertification" value="YES"/>Yes
		 <form:radiobutton path="skillCertification" name="skillCertification" value="NO"/>No<br>
		<button type="submit">Add Trainee</button>
	</form:form>
</body>

</html>