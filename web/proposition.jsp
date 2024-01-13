<%-- 
    Document   : Proposition
    Created on : 7 janv. 2024, 23:22:34
    Author     : Christian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Traitement" %>
<%@page import="model.Proposition" %>
<%@page import="java.util.List" %>
<%
    List<Proposition> hash = (List<Proposition>) request.getAttribute("donnee");
    Double budget = (Double) request.getAttribute("budget");
    double cout_totale = 0.0;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
    </head>
    <body style="color: var(--bs-dark);"><center>
    <div class="col">
        <h1 style="font-size: 34.88px;color: rgb(16,171,106);">Proposition</h1>
    </div>
        <label class="form-label" style="font-weight: bold;font-size: 22px;">Budget: <% out.print(budget); %></label>
    <%
        for (Proposition proposition : hash) {
            int key = proposition.getNumero_dent();
            List<Traitement> val = proposition.getAll();
            double totale = val.stream().mapToDouble(Traitement::getCout).sum();
            cout_totale += totale;
    %>
    <div class="col">
        <label class="col-form-label" style="text-decoration:  underline;">Dent numero: <% out.print(key); %></label>
    </div>
    <div class="col">
        <ul>
            <% for (Traitement trait : val) { %>
                <li><% out.print(trait.getNom()+"  -------  Cout: "+trait.getCout()); %></li>
            <% } %>
        </ul><br>
         <label class="form-label" style="font-weight: bold;">Totale: <% out.print(totale); %></label>
    <% } %>
    <br>
    
         <label class="form-label" style="font-weight: bold;font-size: 18px;">Reste: <input type="text" value="<% out.print(budget - cout_totale); %>" disabled></label>
    </center> 
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
