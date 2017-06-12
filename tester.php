<?php

ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
  //AASTAAEGADE KONTROLLIJA

  function checkValidity($season) {
    $seasons = array("kevad", "suvi", "sügis", "talv");
    $season = strtolower(htmlspecialchars(stripslashes($season)));
    $okay = false;
    for ($x = 0; $x < count($seasons); $x++) {

      if ($season == $seasons[$x]) {
        $okay = true;
      }
    }
    return $okay;
  }
 ?>
