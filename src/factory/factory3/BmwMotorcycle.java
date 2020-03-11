package factory.factory3;

/**
 * @author wangzhiguo
 */
public class BmwMotorcycle extends Motorcycle {

    @Override
    void ride() {
        System.out.println("骑宝马摩托车。。。");
    }

    @Override
    void speed() {
        System.out.println("加速宝马摩托车。。。");
    }
}
