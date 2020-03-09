package singleton;

import singleton.instance.Instance;

/**
 * 饿汉式单例
 * 此单例利用静态代码块进行初始化
 * @author wangzhiguo
 */
public class Singleton2 {

    private static Instance instance = null;

    static {
        instance = new Instance();
    }

    private Singleton2(){

    }

    public Instance getInstance(){
        return instance;
    }

}