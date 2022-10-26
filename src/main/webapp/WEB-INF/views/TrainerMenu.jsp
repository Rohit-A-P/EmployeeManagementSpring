<!DOC TYPE html>
<html>

<head>
<title>Trainer Menu</title>
  <style>
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
</head>
<body style="background-color:#00989870; text-align: center">
    <div id="form">
    <h1>Trainer Menu</h1>
	<a href="SaveTrainer"><button class="button">Create Trainer Profile</button></a><br>
	<br>
	<a href="ViewTrainers"><button button>View All Trainer</button></a>

</body>

</html>