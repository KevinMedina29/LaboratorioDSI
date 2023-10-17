<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="/Guia5/ServletPrincipal?accion=Login" id="formLogin">
            <div id="resultLogin"></div>
            <div><h1>Bienvenido</h1></div>
            <%-- Insercion de codigo Java en HTML - comentario --%>
            
            <%-- Forma legible de imprimir la fecha usando Scriptlets --%>
            <%
                java.util.Date fechaActual = new java.util.Date();
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
                String fechaActualLegible = sdf.format(fechaActual);
            %>
            <p>Fecha actual: <strong><%= fechaActualLegible %></strong></p><br>

            <div><label>Usuario: </label></div>
            <div><input type="text" name="Usuario" id="idtfUsuario"></div><br>
            <div><label>Contraseña: </label></div>
            <div><input type="password" name="Contrasenia" id="idtfContraseña"></div><br>
            <div><input type="submit" value="Iniciar Sesión"></div><br>
        </form>
    </body>
</html>
