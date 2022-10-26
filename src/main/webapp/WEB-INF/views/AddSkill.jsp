<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>
<head>
<title>Add Skill</title>
</head>
  <style type="text/css">
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
	<form:form action="SaveSkill" modelAttribute="skill">
	    <div id="form">
	    <h1>Add Skill</h1>
	    <input type="hidden" name="id" path="id" value="${id}">
	    <br>
	    <form:input type="hidden" path="skillId" name="skillId"/>
	    <label>Enter Skill Name      :</label>
	     <form:input type="text" path="skillName" name="skillName" required="required"/>
	     <br>
	    <label>Enter Skill Experience :</label>
	     <form:input type="text" path="skillExperience" name="skillExperience" required="required"/>
	     <br>
		<label>Enter Skill Version :</label>
		 <form:input type="text" path="skillVersion" name="skillVersion" required="required"/>
		 <br>
		<label>Enter Skill Certified (YES/NO):</label>
		 <br>
		 <form:radiobutton path="skillCertification" name="skillCertification" value="YES"/>Yes
		 <form:radiobutton path="skillCertification" name="skillCertification" value="NO"/>No<br>
		<button class="button-88" role="button" type="submit">SUBMIT</button>
		</div>
	</form:form>
</body>

</html>