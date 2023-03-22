<!DOC TYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
<form action="registration" method="POST">
    Name: <input type="text" name="name" />
    <br><br>
    Number phone: <input type="text" placeholder="+375-29-111-11-11"
                                 pattern="\+375-\d{2}-\d{3}-\d{2}-\d{2}" name="phone" />
    <br><br>
    Email: <input type="email" placeholder="user@gmail.com" name="email" />
    <br><br>
    <input type="submit" value="Register" />
    <br><br>
</form>
</body>
</html>
