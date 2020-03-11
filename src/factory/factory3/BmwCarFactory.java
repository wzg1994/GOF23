package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BmwCarFactory implements CarFactory {
    @Override
    public Car productCar() {

        return new BmwCar();
    }
}
