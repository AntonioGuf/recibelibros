<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Regisro de libros</h1>
         <form action="ProcesaRegistro" method="post">
            <table>
                <tr>
            <td>Titulo:</td>
            <td><input type="text" name="titulo" value=""></td>
                </tr>
                <tr>
            <td>Autor:</td>
            <td><input type="text" name="autor" value=""></td>
               </tr>
               <tr>
            <td>Resumen:</td>
            <td><textarea id="resumen" name="resumen" rows="5" cols="22"></textarea></td>
              </tr> 
              <tr>
            <td>Medio:</td>
            <td><input type="radio" name="medio" value="">Fisico
                <input type="radio" name="medio" value="">Magnetico</td>
              </tr> 
              <tr>
                  <td><input type="submit" value="Registrar"></td>
              </tr>
            </table>
        </form>
    </body>
</html>
