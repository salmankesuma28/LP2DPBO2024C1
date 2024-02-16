//Saya M Salman Kesuma NIM 2109276 mengerjakan Latihan 2 Praktikum mata kuliah DPBO 
//untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
//import library

import java.util.List;
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

    public Clothing(String size, String gender, String material) {
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

class Shirt extends Product{
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
        List<Product> products = new ArrayList<>();
        int n = 0;
        String idProduct;
        String name;
        int price;
        String brand;
        String size;
        String gender;
        String material;
        String sleeve_type;
        String color;

        do{
            Shirt temp = new Shirt();
            System.out.println("Masukan Perintah: ");

        } while (n < 3);
    }
}