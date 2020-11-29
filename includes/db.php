<?php 
    $dsn = "mysql:host=localhost;dbname=players"; //Data Sourse Name

    try {
        $pdo = new PDO($dsn, 'root', ''); #
    }
    catch(PDOException $e) {
        echo $e->getMessage();
    }
?>