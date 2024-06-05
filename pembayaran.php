<?php
$koneksi = new mysqli("localhost", "root", "", "keziaputri1");

//buat query
$query = "select * from pemnayaran";
//jalankan query dan simpan dalam variable
//siapkan variable untuk menampung data dalam bentuk aray
$buku = [];
    // isi data buku dari database


; ?>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Dashboard</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col">
            <h3> PEMBAYARAN</h3>
                <div class="row">
                    <d class="col-4">
                        <form action="" method="">
                            <label for="tanggal">Nis </label>
                            <input type="" id="" class="form-control" disabled value="<?= (""); ?>">
                        </form>
                        <form action="" method="">
                            <label for="tanggal">Tahun </label>
                            <input type="date" id="date" class="form-control" disabled value="<?= date("Y-m-d"); ?>">
                            <button> kirim </button>
                        </form>
                        <div>
                            <form action="">
                                <label for="Total">Total </label>
                            </form>
                        </div>
                        <div>
                            <form action="">
                                <label for="Total">Nama_lengkap </label>
                            </form>
                        </div>
                </div>
            </div>
        </div>
               
    </div>



    <table class="table table-bordered">
        <thead>
            <tr>
                <th scope="col">Bulan</th>
                <th scope="col">Status</th>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td> Lunas</td>
              </tr>  
        </tbody>
    </table>



    <Script>



    </Script>;