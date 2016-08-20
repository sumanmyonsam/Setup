<?php
	$con = mysqli_connect("mysql8.000webhost.com","a5698947_user","User123","a5698947_setup");
	
	$name = $_POST["name"];
	$age = $_POST["age"];
	$username = $_POST["username"];
	$password = $_POST["password"];
	
	$statement = mysqli_prepare($con,"INSERT INTO user (name,age,username,password) VALUES(?, ?, ?, ?)");
	mysqli_stmt_bind_param($statement, "siss",$name,$age,$username,$password);
	mysqli_stmt_execute($statement);
	
	$response = array();
	$response["success"] = true;
	
	echo json_encode($response);
	
	mysqli_stmt_close($statement);
	mysqli_close($con);
	
?>