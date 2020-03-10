package factory.simple;

/**
 * @author wangzhiguo
 */
public class BmwCar extends Car {
    @Override
    void start() {
        System.out.println("宝马车启动。。。");
    }

    @Override
    void stop() {
        System.out.println("宝马车灭火。。。");
    }
}
