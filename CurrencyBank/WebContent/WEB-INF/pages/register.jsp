<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Registration</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="page-header">
  <h1>Registration Form</h1>
</div>
<form class="form-horizontal" role="form" action="register" method="post">
<div class="form-group">
  <label for="name">Name:</label>
  <input type="text" class="form-control" id="name" name="name">
 </div>
  
   <div class="form-group">
     <label for="gender">Gender:</label>
<div class="radio">
  <label class="radio-inline"><input type="radio" name="gender" >Female</label>
   <label class="radio-inline"><input type="radio" name="gender">Male</label>
</div>
  </div>
<div class="form-group">
  <label for="address">Address:</label>
  <input type="text" class="form-control" id="address" name="address">
 </div>
  <div class="form-group">
    <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" name="email">
  </div>
     <button type="submit" class="btn btn-default">Submit</button>

</form>
</div>

</body>
</html>