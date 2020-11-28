
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <link rel="stylesheet" href="css/instyle.css">
        <link rel="stylesheet" href="css/instyleplus.css">
        <title>Agregar Un jugador</title>
        <%@page import="Services.listar1"%>
        <%
            String x = listar1.traerTodos();
        %>
        <script >
            function cargarcontenido(){
               document.getElementById("table-body").innerHTML="<%=x%>";
            }
           
        </script>
    </head>
    <body onLoad="cargarcontenido()">
        <header>
            <div class="contenedor">
                <div class="logo" >
                    <img src="img/logo.png" alt="">
                </div>
                <div class="encabezado">
                    <h2>Listado de Jugadores</h2>
                </div>
            </div>
        </header>
        <div class="navegacion contenedor">
            <nav>
                <ul>
                    <li><a href="index.html">volver al inicio</a> <p>click para regresar ir a la pantalla de inicio</p> </li>
                    <li><a href="newPlayer.html">crear un nuevo jugador</a><p>click para ver una lista con todos los jugadores inscritos</p></li>
                    
                </ul>
            </nav>
        </div>
        <main>
            <input type="text" id="busqueda">
            <input type="button" id="buscar" onclick="query()" value="Buscar">
            <input type="button" id="limpiar" value="Limpiar">
            <div class="contenedor">
                <table class="tabla" id="mi-tabla">
                <thead>
                    <tr >
                        <th >Nombre</th>
                        <th >Id</th>
                        <th >Perfil</th>
                    </tr>
                </thead>
                <tbody id="table-body">
                    <tr>
                        <td >Mark</td>
                        <td >Otto</td>
                        <td >@mdo</td>
                    </tr>
                </tbody>
            </table>
            </div>
            
            
            
            
        </main>
    </body>

</html>
