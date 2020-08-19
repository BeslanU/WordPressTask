package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();

        /*
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2009;
        car1.color = "Red";
        car1.mileage = 121000.54;
        car1.price = 4500.0;
         */

        car1.seInfo("Toyota","Supra",1993,"Orange",4020.00,185000.00);

        car1.getInfo();

        System.out.println("===========================");

        Car car2 = new Car();
        car2.seInfo("Nissan","240SX",1998,"Purple",13755.00,14500.00);

        car2.getInfo();

        System.out.println("============================");

        Car car3 = new Car();
        car3.seInfo("Acura","TSX",2010,"Gray",103022.59,8900);

        car3.getInfo();



    }
}
