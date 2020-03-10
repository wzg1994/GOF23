package factory.simple;

/**
 * @author wangzhiguo
 */
public class CarFactory {

    public static Car productCar(String name) {
        if ("BMW".equals(name)) {
            return new BmwCar();
        } else if ("BENZ".equals(name)) {
            return new BenzCar();
        }

        return null;
    }
}
