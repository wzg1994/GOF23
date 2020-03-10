package factory.factory2;

/**
 * @author wangzhiguo
 */
public class BenzCar extends Car {
    @Override
    void start() {
        System.out.println("奔驰车启动。。。");
    }

    @Override
    void stop() {
        System.out.println("奔驰车灭火。。。");
    }
}
