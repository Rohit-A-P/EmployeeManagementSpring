<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOC TYPE html>
<html>
<head>
<title>Employee Management System</title>
</head>
  <style>
    label {
    width:500px;
    display:inline-block;
    }
    #form{
    display:block;
    margin:auto;
    border-radius:10px;
    background:blue;
    color:white;
    width:450;
    }

        button {
         padding: 15px 25px;
         border: unset;
         border-radius: 15px;
         color: #212121;
         z-index: 1;
         background: #e8e8e8;
         position: relative;
         font-weight: 1000;
         font-size: 17px;
         -webkit-box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
         box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
         transition: all 250ms;
         overflow: hidden;
        }

        button::before {
         content: "";
         position: absolute;
         top: 0;
         left: 0;
         height: 100%;
         width: 0;
         border-radius: 15px;
         background-color: #212121;
         z-index: -1;
         -webkit-box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
         box-shadow: 4px 8px 19px -3px rgba(0,0,0,0.27);
         transition: all 250ms
        }

        button:hover {
         color: #e8e8e8;
        }

        button:hover::before {
         width: 100%;
        }
    </style>
<body style="background-color:#00989870; background-img: url('file:///C:/Users/LENOVO/Downloads/man-04.svg')">
      <div class="intro" align="center">
          <div id="form">
		      <h1>Employee Management System</h1>
		          <a href="TrainerMenu"><button class="button">TrainerMenu</button></a>
		          <br>
		          <br>
		          <a href="TraineeMenu"><button class="button">TraineeMenu</button></a>
          </div>
      </div>
</body>
</html>