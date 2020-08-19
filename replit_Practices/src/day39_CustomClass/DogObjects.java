package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan","Beagle","medium",2,"Mix");
        dog2.setDogInfo("Roofus","Afganistanian Dogo","large",1,"White");




        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kalle Paca");
        dog2.eat("Polo");

        dog2.drink("Cola");
        dog1.drink("Milk");

    }
}
