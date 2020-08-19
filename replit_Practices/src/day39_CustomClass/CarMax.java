package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        car1.seInfo("Mercury","Cougar",1999,"Red",124000,1350);
        car1.getInfo();
        car2.seInfo("Audi","200",2004,"White",148500,3500);
        car2.getInfo();
        car3.seInfo("Nissan","Titan",2017,"Metallic",38000,27850);
        car3.getInfo();
        car4.seInfo("Dodge","Charger",1979,"Black",0,78000);
        car4.getInfo();

        car1.start();
    }
}
