#import librari
from kelas import Shirt

#program utama

class Main:
    llist =[]#list

    #Tampilan Menu
    while True:
        print("Ketik Perintah Berupa Angka");
        print("1. Tambah Data");
        print("2. Tampilkan Data");
        print("3. Keluar");

        n = int(input())

        if n == 1 : #Tambahkan dara Baju
            idProcuk = input("Masukan ID Produk : ")
            nama = input("Masukan Nama : ")
            price = int(input("Masukan Harga : "))
            brand = input("Masukan Brand : ")
            size = input("Masukan Ukuran : ")
            material = input("Masukan Bahan : ")
            gender =input("Masukan Jenis Kelamin : ")
            sleeve = input("Masukan Panjang Lengan : ")
            color = input("Masukan Warna : ")

            #mengset atribut
            temp =Shirt()
            temp.setIdProduck(idProcuk)
            temp.setNama(nama)
            temp.setPrice(price)
            temp.setBrand(brand)
            temp.setSize(size)
            temp.setMaterial(material)
            temp.setGender(gender)
            temp.setSleeve(sleeve)
            temp.setCollar(color)

            llist.append(temp)

        elif n == 2 : #Tampilkan Data
            print("Daftar Baju");

            for i, data in enumerate(llist):
                print("==================================")
                print("Data ke-", i)
                print("ID Produk      : ", data.getIdProduck())
                print("Nama           : ", data.getNama())
                print("Harga          : ", data.getPrice())
                print("Brand          : ", data.getBrand())
                print("Ukuran         : ", data.getSize())
                print("Bahan          : ", data.getMaterial())
                print("Jenis Kelamin  : ", data.getGender())
                print("Panjang Lengan : ", data.getSleeve())
                print("Warna          : ", data.getCollar())
                print("==================================")
                print("\n")

        elif n == 3 :
            print("Terima Kasih, Sampai jumpa kembali")
            break
        else:  # perintah tidak valid dengan menu
            print("Perintah tidak valid")
