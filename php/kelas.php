<?php

    //deklarasi kelas Product
    class Product{
        //private atribut
        private $idProduct;
        private $nama;
        private $brand;
        private $harga;
    
        //konstractor
        public function __construct()
        {
    
        }

        //setter dan getter
        public function setIdProduct($idProduct)
        {
            $this->idProduct = $idProduct;
        }
        public function getIdProduct()
        {
            return $this->idProduct;
        }

        public function setNama($nama)
        {
            $this->nama = $nama;
        }
        public function getNama()
        {
            return $this->nama;
        }

        public function setBrand($brand)
        {
            $this->brand = $brand;
        }
        public function getBrand()
        {
            return $this->brand;
        }

        public function setHarga($harga)
        {
            $this->harga = $harga;
        }
        public function getHarga()
        {
            return $this->harga;
        }

        //destroctor
        public function __destruct()
        {
    
        }
    }

    //deklarasi kelas Clothing
    class Clothing extends Product{
        //private atribut
        private $ukuran;
        private $gender;
        private $bahan;
    
        //konstractor
        public function __construct()
        {
    
        }

        //setter dan getter
        public function setUkuran($ukuran)
        {
            $this->ukuran = $ukuran;
        }
        public function getUkuran()
        {
            return $this->ukuran;
        }

        public function setGender($gender)
        {
            $this->gender = $gender;
        }
        public function getGender()
        {
            return $this->gender;
        }

        public function setBahan($bahan)
        {
            $this->bahan = $bahan;
        }
        public function getBahan()
        {
            return $this->bahan;
        }

        //destroctor
        public function __destruct()
        {
    
        }
    }

    //deklarasi kelas Shirt
    class Shirt extends Clothing{
        //private atribut
        private $tipe;
        private $warna;
    
        //konstractor
        public function __construct()
        {
    
        }

        //setter dan getter
        public function setTipe($tipe)
        {
            $this->tipe = $tipe;
        }
        public function getTipe()
        {
            return $this->tipe;
        }

        public function setWarna($warna)
        {
            $this->warna = $warna;
        }
        public function getWarna()
        {
            return $this->warna;
        }
        //destroctor
        public function __destruct()
        {
    
        }
    }

    //deklarasi kelas untuk daftar shirt
    class daftarShirt{
        private $shirt = array();
        //fungsi tambah data
        public function tambahShirt($idProduct, $nama, $brand, $harga, $ukuran,$bahan,  $gender,  $tipe, $warna){
            $shirt_baru = new Shirt();
            $shirt_baru->setIdProduct($idProduct);
            $shirt_baru->setNama($nama);
            $shirt_baru->setBrand($brand);
            $shirt_baru->setHarga($harga);
            $shirt_baru->setUkuran($ukuran);
            $shirt_baru->setBahan($bahan);
            $shirt_baru->setGender($gender);
            $shirt_baru->setTipe($tipe);
            $shirt_baru->setWarna($warna);
            $this->shirt[] = $shirt_baru;

        }

        //fungsi tampilkan data
        public function tampilShirt(){
            foreach($this->shirt as $shirt){
                echo "=========================<br>";
                echo "ID Product : ".$shirt->getIdProduct()."<br>";
                echo "Nama       : ".$shirt->getNama()."<br>";
                echo "Brand      : ".$shirt->getBrand()."<br>";
                echo "Harga      : ".$shirt->getHarga()."<br>";
                echo "Ukuran     : ".$shirt->getUkuran()."<br>";
                echo "Bahan      : ".$shirt->getBahan()."<br>";
                echo "Gender     : ".$shirt->getGender()."<br>";
                echo "Tipe       : ".$shirt->getTipe()."<br>";
                echo "Warna      : ".$shirt->getWarna()."<br>";
                echo "=========================<br>";
            }
        }
    }


?>