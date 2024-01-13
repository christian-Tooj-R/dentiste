<%-- 
    Document   : insertion
    Created on : 8 janv. 2024, 09:56:10
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    </head>
    <body>
    <form  action="Insertion" method="post">
    <div class="col">
        <h1 style="font-size: 31.880000000000006px;color: rgb(16,171,106);">Insertion</h1>
    </div>
        <div class="col" style="margin-top: 51px;"><label class="form-label">Nify: </label><input type="text"  name="dent"/></div>
    <div class="col" style="margin-top: 28px;"><label class="form-label">Note: </label><input type="text" name="valeur"/></div>
    <div class="col"><button class="btn btn-primary" type="submit" style="margin-top: 25px;">Valider</button></div>
    
    <div class="col"><a href="Chargepage"><button class="btn btn-primary" type="button" style="margin-top: 25px;">Proposition</button></a></div>
    
    </form>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
