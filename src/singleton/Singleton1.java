package singleton;

import singleton.instance.Instance;

/**
 *
 * 饿汉式单例模式
 * 不存在线程安全问题
 * @author wangzhiguo
 */
public class Singleton1 {

    /**
     * 私有成员变量
     */
    private static final Instance INSTANCE = new Instance();

    /**
     * 公有的get方法
     */
    public Instance getInstance(){
        return INSTANCE;
    }

    /**
     * 私有的构造函数
     */
    private Singleton1() {

    }
}
