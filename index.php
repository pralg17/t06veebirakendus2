<?php
require("tester.php");
$season = "";
if (isset($_GET["season"])) {
  $season = $_GET["season"];
  if (checkValidity($_GET["season"])) {
    $seasonIsValid = true;
  } else {$seasonIsValid = false;}
}
 ?>
<!DOCTYPE html>
 <html>
 <head>
   <title>Aastaaegade kontrollija</title>
   <style>
   html {
     margin: 0;
     padding: 0;
     overflow-y: hidden;
   }
   body {
     max-width: 800px;
     margin: 0 auto;
     border-right: 2px solid gray;
     border-left: 2px solid gray;
     height: 100vh;
     padding: 10px;
   }
   </style>
 </head>
 <body>

 <h1>Aastaaegade kontrollija</h1>
 <p>Pane sisse aastaaeg (ükskõik millises formaadis, kuid <b>eesti keeles</b>),
   ning me kontrollime, kas see on <i>reaalselt</i> eksisteeriv aastaaeg.</p>
   <form method="GET">
     <input type="text" name="season" placeholder="nt. TALV" value="<?=$season?>">
     <br>
     <input type="submit" value="Kontrolli">
   </form>
   <br>
   <?php
   if (isset($seasonIsValid)) {
     if ($seasonIsValid) {
       echo "Teie sisestatud aastaaeg on korrektne ning eksisteeriv.";
     } else {
       echo "Kahjuks ei ole teie sisestatud aastaaeg korrektne.";
     }
   } else {
     echo "Siia tekivad testi tulemused.";
   }
    ?>
   <br>
   <a href="autotest.php">Automaattest ning selle tulemused on siin.</a>
   </body>
 </html>
