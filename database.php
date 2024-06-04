<?php 
$koneksi =  new mysqli("localhost","root","","uprak_web keziaputri");
if ($koneksi->connect_error){
die ("".$koneksi->connect_error);

  
};
?>