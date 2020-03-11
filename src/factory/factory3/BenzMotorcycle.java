package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BenzMotorcycle extends Motorcycle {
    @Override
    void ride() {
        System.out.println("骑奔驰摩托车。。。");
    }

    @Override
    void speed() {
        System.out.println("加速奔驰摩托车。。。");
    }
}
