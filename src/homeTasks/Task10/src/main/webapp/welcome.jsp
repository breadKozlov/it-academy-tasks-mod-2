<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Hello user</title>
    </head>
    <body>
        <h2>Hello user. This is your data:</h2>
        <p>Name: ${name}</p>
        <p>Number phone: ${phone}</p>
        <p>Email: <%= request.getParameter("email") %></p>
        <p><a href="./index.jsp">Go to form</a></p>
    </body>
</html>