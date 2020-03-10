package factory.simple;

/**
 * @author wangzhiguo
 */
public class Client {

    public static void main(String[] args) {
        Car bmw = CarFactory.productCar("BMW");
        bmw.start();
        bmw.stop();

        System.out.println("=======================");

        Car benz = CarFactory.productCar("BENZ");
        benz.start();
        benz.stop();
    }
}
