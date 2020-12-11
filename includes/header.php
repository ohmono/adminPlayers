<?php require_once("./includes/db.php") ?> 

<!DOCTYPE html>
<html lang="en">
<head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content />
        <meta name="author" content />
        <title>AdminPlayers</title>
        <link href="css/styles.css" rel="stylesheet" />
        <link rel="icon" type="image/x-icon" href="img/favicon.png" />
    </head>
    <body>
    <nav class="navbar navbar-marketing navbar-expand-lg bg-white navbar-light">
        <div class="container">
            <a class="navbar-brand text-dark" href="index.php">AdminPlayers</a><button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><img src="img/menu.png" style="height:20px;width:25px" /><i data-feather="menu"></i></button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
            </br>
            <input class="form-control form-control-solid rounded-pill " type="text" placeholder="Search keyword..."/></input>
            </br>
            <button class="btn-teal btn rounded-pill" type="submit">Search</button>
                <ul class="navbar-nav ml-auto mr-lg-5">
                    <li class="nav-item">
                        <a class="nav-link" href="index.php">Home </a>
                    </li>
                    <li class="nav-item dropdown no-caret">
                        <a class="nav-link" href="contact.php">Contact</a>
                    </li>
                    <li class="nav-item dropdown no-caret">
                        <a class="nav-link" href="about.php">About</a>
                    </li>
                    <a class="btn-teal btn rounded-pill px-4 ml-lg-4" href="backend/signin.html">Signin<i class="fas fa-arrow-right ml-1"></i></a>
                </ul>


            </div>
        </div>
    </nav>