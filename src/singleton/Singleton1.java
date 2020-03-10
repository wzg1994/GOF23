package singleton;

/**
 *
 * 饿汉式单例模式
 * 不存在线程安全问题
 * @author wangzhiguo
 */
public class Singleton1 {

    /**
     * 私有成员变量
     * 利用静态变量来记录Singleton的唯一实例
     * 直接初始化静态变量，这样就可以确保线程安全了
     */
    private static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 公有的get方法
     */
    public Singleton1 getInstance(){
        return INSTANCE;
    }

    /**
     * 私有的构造函数
     */
    private Singleton1() {

    }
}
