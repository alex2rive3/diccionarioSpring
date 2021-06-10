<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>

    <body>
        <div>
           <h3>Traductor de Vocablos Tecnicos</h3>
           <div>
               <form action="leerServerlet" method="post"> 
                    <label>Palabra</label>
                    <input type="text" name="palabra"><br>
                    <input type="radio" id="es" name="idioma" value="es">
                    <label for="es">Español</label><br>
                    <input type="radio" id="eg" name="idioma" value="eg">
                    <label for="eg">Ingles</label><br>
                    <br><button type="submit">Traducir</button>
               </form>
           </div>
        </div>
    </body>
</html>
