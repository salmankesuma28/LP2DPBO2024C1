#Deklerasi kelas

class Produck:
    #private atribut
    __idProduck = ""
    __nama = ""
    __price = 0
    __brand = ""

    #konstruktor
    def __init__(self, idProduck="", nama="", price=0, brand=""):
        self.__idProduck = idProduck
        self.__nama = nama
        self.__price = price
        self.__brand = brand

    #getter dan setter
    def getIdProduck(self):
        return self.__idProduck
    def setIdProduck(self, idProduck):
        self.__idProduck = idProduck
    def getNama(self):
        return self.__nama
    def setNama(self, nama):
        self.__nama = nama
    def getPrice(self):
        return self.__price
    def setPrice(self, price):
        self.__price = price
    def getBrand(self):
        return self.__brand
    def setBrand(self, brand):
        self.__brand = brand


#deklarasi kelas turunan Produck
class Clothing (Produck):
    #private atribut
    __size = ""
    __gender = ""
    __material= ""

    #konstruktor
    def __init__(self, size="", gender="", material=""):
        self.__size = size
        self.__gender = gender
        self.__material = material

    #setter getter
    def getSize(self):
        return self.__size
    def setSize(self, size):
        self.__size = size

    def getGender(self):
        return self.__gender
    def setGender(self, gender):
        self.__gender = gender

    def getMaterial(self):
        return self.__material
    def setMaterial(self, material):
        self.__material = material


class Shirt(Clothing):
    __sleeve = ""
    __collar = ""

    def __init__(self, sleeve="", collar=""):
        self.__sleeve = sleeve
        self.__collar = collar

    def getSleeve(self):
        return self.__sleeve
    def setSleeve(self, sleeve):
        self.__sleeve = sleeve

    def getCollar(self):
        return self.__collar
    def setCollar(self, collar):
        self.__collar = collar