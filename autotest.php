<?php
require("tester.php");

function pb($in) {
  if ($in === true) {
    return '<b>tõene</b>';
  } else {
    return '<b>väär</b>';
  }
}

function autoTest($entered, $expected) {
  $result = checkValidity($entered);

  if ($result == $entered) {
    $isOkay = true;
  } else {
    $isOkay = false;
  }
  echo "Sisend: ".$entered.", eeldatav väljund: ".pb($expected).", tulemus: ".pb($isOkay)."<br>";
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
   <h1>Aastaaegade kontrollija automaattest</h1>
   <p>Automaattest kontrollib, kas rakendus vastab nõuetele ning funktsiooni
     väljastatud tulemus on see, mis vastab tegelikkusele.</p>
     <h2>Testid</h2>
     <p>Need on testid, mille automaattest ära tegi ning siin on nende eeldatud tulemus ning reaalne tulemus.</p>
     <?php
     autoTest("Kevad", true);
     autoTest("suVi", true);
     autoTest("süGIS", true);
     autoTest("TALV", true);
     autoTest("?KEVAD", false);
     autoTest("Hammasratas", false);
     autoTest("Laev", false);
      ?>

      <br><br>
      <a href="index.php">Tagasi rakenduse juurde</a>
 </body>

 </html>
