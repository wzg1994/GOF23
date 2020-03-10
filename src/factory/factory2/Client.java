package factory.factory2;

/**
 * @author wangzhiguo
 */
public class Client {

    public static void main(String[] args) {
        CarFactory bmwFactory = new BmwCarFactory();
        Car bmw = bmwFactory.productCar();
        bmw.start();
        bmw.stop();

        CarFactory benzFactory = new BenzCarFactory();
        Car benz = benzFactory.productCar();
        benz.start();
        benz.start();
    }
}
