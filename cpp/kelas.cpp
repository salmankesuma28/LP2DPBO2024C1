// import library
#include <iostream>
#include <vector>
#include <string>

//using namespace std
using namespace std;


//class Product
class Product{
    private://atribut
        string idProduct;
        string name;
        int price;
        string brand;
    public://method
        Product(){//constructor
            this->idProduct = "";
            this->name = "";
            this->price = 0;
            this->brand = "";
        }

        Product(string idProduct, string name, int price, string brand){//constructor
            this->idProduct = idProduct;
            this->name = name;
            this->price = price;
            this->brand = brand;
        }

        string getIdProduct(){//getter
            return this->idProduct;
        }
        void setIdProduct(string idProduct){//setter
            this->idProduct = idProduct;
        }

        string getName(){
            return this->name;
        }
        void setName(string name){
            this->name = name;
        }

        int getPrice(){
            return this->price;
        }
        void setPrice(int price){
            this->price = price;
        }

        string getBrand(){
            return this->brand;
        }
        void setBrand(string brand){
            this->brand = brand;
        }

        ~Product(){
        }
};

//class Clothing
class Clothing : public Product{
    private://atribut
        string size;
        string gender;
        string material;
    public:
        Clothing(){//constructor
            this->size = "";
            this->gender = "";
            this->material = "";
        }

        Clothing(string size, string gender, string material){//constructor
            this->size = size;
            this->gender = gender;
            this->material = material;
        }

        string getSize(){//getter
            return this->size;
        }
        void setSize(string size){
            this->size = size;
        }

        string getGender(){
            return this->gender;
        }
        void setGender(string gender){
            this->gender = gender;
        }

        string getMaterial(){
            return this->material;
        }
        void setMaterial(string material){
            this->material = material;
        }
        ~Clothing(){//destructor
        }
};

//class Shirt
class Shirt : public Clothing{
    private://atribut
        string sleeve_type;
        string color;

    public:
        Shirt(){
            this->sleeve_type = "";
            this->color = "";
        }

        Shirt(string sleeve_type, string color){
            this->sleeve_type = sleeve_type;
            this->color = color;
        }

        string getSleeveType(){
            return this->sleeve_type;
        }
        void setSleeveType(string sleeve_type){
            this->sleeve_type = sleeve_type;
        }

        string getColor(){
            return this->color;
        }
        void setColor(string color){
            this->color = color;
        }

        ~Shirt(){       //destructor
        }
};
