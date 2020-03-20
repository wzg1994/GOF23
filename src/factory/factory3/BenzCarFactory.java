package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BenzCarFactory  {
    public Car productCar() {
        return new BenzCar();
    }
}
