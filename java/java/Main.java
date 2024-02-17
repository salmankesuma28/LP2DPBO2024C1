//Saya M Salman Kesuma NIM 2109276 mengerjakan Latihan 2 Praktikum mata kuliah DPBO 
//untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
//import library

import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private String idProduct;
    private String name;
    private int price;
    private String brand;

    public Product() {
        this.idProduct = "";
        this.name = "";
        this.price = 0;
        this.brand = "";
      
    }

    public Product(String idProduct, String name, int price, String brand) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}


class Clothing extends Product{
    private String size;
    private String gender;
    private String material;

    public Clothing() {
        this.size = "";
        this.gender = "";
        this.material = "";
    }

    public Clothing(String size,  String material, String gender) {
        this.size = size;
        this.gender = gender;
        this.material = material;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

class Shirt extends Clothing{
    private String sleeve_type;
    private String color;

   public Shirt(){
         this.sleeve_type = "";
         this.color = "";
   }

   public Shirt(String sleeve_type, String color){
       this.sleeve_type = sleeve_type;
       this.color = color;
   }

   public void setSleeveType(String sleeve_type){
       this.sleeve_type = sleeve_type;
   }

    public String getSleeveType(){
         return sleeve_type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Shirt> products = new ArrayList<>();
        int n = 0;
        String idProduct;
        String name;
        int price;
        String brand;
        String size;
        String material;
        String gender;
        String sleeve_type;
        String color;

        do{
            Shirt temp = new Shirt();
            System.out.println("Masukan Perintah Berupa Angka !!: ");
            System.out.println("1. Tambahkan Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Edit Produk");
            System.out.println("4. Tampilkan Produk");
            System.out.println("5. Keluar");

            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            if(n == 1){
                System.out.println("Masukan ID Produk: ");
                idProduct = input.next();
                System.out.println("Masukan Nama Produk: ");
                name = input.next();
                System.out.println("Masukan Harga Produk: ");
                price = input.nextInt();
                System.out.println("Masukan Brand Produk: ");
                brand = input.next();
                System.out.println("Masukan Ukuran Produk: ");
                size = input.next();
                System.out.println("Masukan Material Produk: ");
                material = input.next();
                System.out.println("Masukan Kelamin Produk: ");
                gender = input.next();
                System.out.println("Masukan Tipe Lengan Produk: ");
                //List<Shirt> llist = new ArrayList<>();

                sleeve_type = input.next();
                System.out.println("Masukan Warna Produk: ");
                color = input.next();

                temp.setIdProduct(idProduct);
                temp.setName(name);
                temp.setPrice(price);
                temp.setBrand(brand);
                temp.setSize(size);
                temp.setMaterial(material);
                temp.setGender(gender);
                temp.setSleeveType(sleeve_type);
                temp.setColor(color);

                products.add(temp);

            }else if(n == 2){
                System.out.println("Masukan Id ");
                String hapusId = input.next();
                boolean found = false;
                for (Shirt shirt : products) {
                    if (hapusId.equals(shirt.getIdProduct())) {
                        found = true;
                        System.out.println("Produk dengan ID " + hapusId + " berhasil dihapus");
                        products.remove(shirt);
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Produk dengan ID " + hapusId + " tidak ditemukan");
                    
                }
            }
            else if (n == 3){
                System.out.println("Masukan Id Produck Yang Mau Diubah :");
                String editId = input.next();
                boolean found = false;
                for (Shirt shirt : products) {
                    if (editId.equals(shirt.getIdProduct())) {
                        found = true;
                        System.out.println("Masukan ID Produk: ");
                        idProduct = input.next();
                        System.out.println("Masukan Nama Produk: ");
                        name = input.next();
                        System.out.println("Masukan Harga Produk: ");
                        price = input.nextInt();
                        System.out.println("Masukan Brand Produk: ");
                        brand = input.next();
                        System.out.println("Masukan Ukuran Produk: ");
                        size = input.next();
                        System.out.println("Masukan Material Produk: ");
                        material = input.next();
                        System.out.println("Masukan Kelamin Produk: ");
                        gender = input.next();
                        System.out.println("Masukan Tipe Lengan Produk: ");
                        sleeve_type = input.next();
                        System.out.println("Masukan Warna Produk: ");
                        color = input.next();
                        
                        break;
                    }
                }
                if (found == false) {
                    System.out.println("Produk dengan ID " + editId + " tidak ditemukan");
                    
                }
            }
            else if ( n == 4){
                System.out.println("-----------     Daftar Produk     -----------");
                int stock = 0;
                int nomor = 1;
                for (Shirt shirt : products) {
                    System.out.println("-----------------------------------------");
                    System.out.println("|Produk ke         : " + nomor++);
                    System.out.println("|ID Produk         : " + shirt.getIdProduct());
                    System.out.println("|Nama Produk       : " + shirt.getName());
                    System.out.println("|Harga Produk      : " + shirt.getPrice());
                    System.out.println("|Brand Produk      : " + shirt.getBrand());
                    System.out.println("|Ukuran Produk     : " + shirt.getSize());
                    System.out.println("|Material Produk   : " + shirt.getMaterial());
                    System.out.println("|Kelamin Produk    : " + shirt.getGender());
                    System.out.println("|Tipe Lengan Produk: " + shirt.getSleeveType());
                    System.out.println("|Warna Produk      : " + shirt.getColor());
                    System.out.println("------------------------------------------\n");
                    stock++;
                }
                if (stock <= 0) {
                    System.out.println("Tidak ada produk yang tersedia!!\n");
                    
                }
            }   
        } while (n < 5);
    }

    
}