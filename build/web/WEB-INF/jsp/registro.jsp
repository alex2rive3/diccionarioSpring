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
            <form action="registroServlet" method="post">
                <div>
                    <label for="palabraEspañol">Palabra en Español</label><br>
                    <input type="text" name="palabraEspanol" id="palabraEspanol" required>
                </div>
                <div>
                    <label for="palabraIngles">Palabra en Ingles</label><br>
                    <input type="text" name="palabraIngles" id="palabraIngles" required>
                </div>
                <div>
                    <label for="defEspañol">Concepto</label><br>
                    <textarea required id="concepto" name="concepto" rows="4" cols="50" placeholder="Escriba el concepto de la palabra"></textarea>
                </div>
                <div>
                    <br><button type="submit" class="boton">Registrar</button>
                        <button type="reset" class="boton">Limpiar</button>
                </div>
            </form>
        </div>
    </body>
</html>
