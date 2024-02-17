<?php
    include 'kelas.php';

    //membuar variabel untuk data shirt
    $dataShirt = new daftarShirt();

    //melakukan tambah data
    $dataShirt->tambahShirt("S001", "Kemeja", "Gucci", 1000000, "L", "Katun", "Pria", "Formal", "Putih");
    $dataShirt->tambahShirt("S002","Kaos", "Adidas", 500000, "M", "Spandek", "Wanita", "Casual", "Hitam");

    //menampilkan data
    $dataShirt->tampilShirt();
    echo "<br>";

?>