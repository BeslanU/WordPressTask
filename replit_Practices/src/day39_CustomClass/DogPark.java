package day39_CustomClass;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog[] dogPark = {new Dog(),new Dog(),new Dog(),new Dog()};
        dogPark[0].setDogInfo("Tucker","German","Mid",6,"Black");
        dogPark[1].setDogInfo("Coca","German","Small",5,"Black");
        dogPark[2].setDogInfo("Cola","Mastiff","Big",6,"Brown");
        for (int i = 0; i <= dogPark.length-1;i++){
            dogPark[i].getDogInfo();
        }
    }
}
