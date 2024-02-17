//Saya M Salman Kesuma NIM 2109276 mengerjakan Latihan 2 Praktikum mata kuliah DPBO 
//untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
//import library
#include <iostream>
#include <vector>
#include <string>
#include <list>
#include "kelas.cpp"

using namespace std;

int main(){

    list<Shirt> llist; //  list of shirts
    int n = 0; //variabel untuk pilihan menu
    int i = 0;

    //variable for input
    string idProduct;
    string name;
    int price;
    string brand;
    string size;
    string martial;
    string gender;
    string sleeve_type;
    string color;

    do{
        Shirt temp; //  tampungan
        //Tampilan Menu
        cout << "1. Add Shirt" << endl;
        cout << "2. Show Shirt" << endl;

        cout << "Choose Menu by type a number !!!  "<< endl;
        cin >> n;

        if(n == 1){ //  add shirt if n = 1

        //inputan data shirt
            cout << "Input ID Product : ";
            cin >> idProduct;
            cout << "Input Name : ";
            cin >> name;
            cout << "Input Price : ";
            cin >> price;
            cout << "Input Brand : ";
            cin >> brand;
            cout << "Input Size : ";
            cin >> size;
            cout << "Input Martial : ";
            cin >> martial;
            cout << "Input gender : ";
            cin>>gender;
            cout << "Input Sleeve Type : ";
            cin >> sleeve_type;
            cout<<"Input Color : ";
            cin>>color;

            //mengset atribut
            temp.setIdProduct(idProduct);
            temp.setName(name);
            temp.setPrice(price);
            temp.setBrand(brand);
            temp.setSize(size);
            temp.setMaterial(martial);
            temp.setGender(gender);
            temp.setSleeveType(sleeve_type);
            temp.setColor(color);

            llist.push_back(temp); //  menambahkan ke list'
            cout << "Shirt has been added" << endl;
        }
        else if(n == 2){//  show shirt if n = 2
            cout << "--------------Daftar Shirt----------------" << endl;
            i=0;
            for(list<Shirt>::iterator it = llist.begin(); it != llist.end(); it++){
                cout << "===================================="<< endl;
                cout << "|Shirt ke ===  " << i << endl;
                cout << "|ID Product   : " << it->getIdProduct() << endl;
                cout << "|Name         : " << it->getName() << endl;
                cout << "|Price        : " << it->getPrice() << endl;
                cout << "|Brand        : " << it->getBrand() << endl;
                cout << "|Size         : " << it->getSize() << endl;
                cout << "|Martial      : " << it->getMaterial() << endl;
                cout << "|Gender       : "<<it->getGender()<<endl;
                cout << "|Sleeve Type  : "<<it->getSleeveType()<<endl;
                cout << "|Color        : "<<it->getColor()<<endl;
                cout << "==================================\n"<< endl;
                i++;
            }
        }
    } while (n < 3);//  jika n < 3 maka akan terus melakukan perulangan
    

    return 0;//  mengembalikan nilai 0
}