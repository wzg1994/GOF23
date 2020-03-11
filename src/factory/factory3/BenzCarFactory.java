package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BenzCarFactory implements CarFactory {
    @Override
    public Car productCar() {
        return new BenzCar();
    }
}
