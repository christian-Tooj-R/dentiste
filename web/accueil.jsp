<%
    String error = (String) request.getAttribute("error");
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <div>
        <div class="col">
            <section class="register-photo">
                <div class="form-container">
                    <form action="Proposition" method="post">
                        <h2 class="text-center"><strong>Selectionner</strong></h2>
                        <div class="mb-3">
                            <label class="form-label" style="font-size: 18px;margin-top: 30px;">Priorité:</label>
                            <select  name="priorite" class="form-select" style="background: rgb(247,249,252);">
                                    <option value="1">Beauté</option>
                                    <option value="2">Sanitaire</option>
                            </select>
                        </div>
                        <div class="mb-3"><label class="form-label" style="font-size: 18px;">Budget:</label>
                            <input class="form-control" type="text" name="budget" placeholder="Votre budget (en Ariary)">
                        </div>
                        <div class="mb-3">
                            <p style="color: red"><% out.print(error); %></p>
                        </div>
                        <div class="mb-3">
                            <button class="btn btn-primary d-block w-100" type="submit" style="background: rgb(16,171,106);">Valider</button>
                        </div>
                        <div class="mb-3">
                            <a style="text-decoration: none" href="Insertion"><button class="btn btn-primary d-block w-100" type="button" style="background: rgb(16,171,106);">Insertion</button></a>
                        </div>
                    </form>
                </div>
            </section>
        </div>
    </div>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    
</body>

</html>