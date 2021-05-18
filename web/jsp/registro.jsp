<%-- 
    Document   : registro
    Created on : 18 may. 2021, 14:25:02
    Author     : Ruben
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <h3>Registre el nuevo vocablo en el diccionario</h3>
        <div>
            <h3>Registrar Nuevo Usuario</h3>
            <form action="registroServlet" method="post">
                <div>
                    <label for="palabraEspañol">Palabra en Español</label><br>
                    <input type="text" name="palabraEspañol" id="palabraEspañol">
                </div>
                <div>
                    <label for="palabraIngles">Traduccion en Ingles</label><br>
                    <input type="text" name="palabraIngles" id="palabraIngles">
                </div>
                <div>
                    <label for="defEspañol">Significado en Español</label><br>
                    <input type="text" name="defEspañol" id="defEspañol">
                </div>
                <div>
                    <label for="defIngles">Significado en Ingles</label><br>
                    <input type="text" name="defIngles" id="defIngles">
                </div>
                <div>
                    <br><button type="submit" class="boton">Registrar</button>
                    <button type="reset" class="boton">Limpiar</button>
                </div>
            </form>
        </div>
    </body>
</html>
