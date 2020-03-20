package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BmwCarFactory   {
    public Car productCar() {

        return new BmwCar();
    }
}
