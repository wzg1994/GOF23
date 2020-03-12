package factory.factory3;

/**
 *
 * 抽象工厂，对工厂进行抽象
 * @author wangzhiguo
 */
public interface AbstractFactory {

    Car makeCar();

    Motorcycle makeMotorcycle();
}
