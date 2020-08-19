package day39_CustomClass;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo(String dogName, String dogBreed,String dogSize, int dogAge, String dogColor){
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
        name = dogName;
    }

    public void getDogInfo(){
        System.out.println("Name: " +name+", Breed: "+breed+", Size: " +size+", Color: "+color+", Age: "+age+" years old");

    }

    public void eat(String food){
        System.out.println(name+ " is eating " +food);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking " +drink);
    }


}
