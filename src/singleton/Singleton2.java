package singleton;

/**
 * 饿汉式单例
 * 此单例利用静态代码块进行初始化
 * @author wangzhiguo
 */
public class Singleton2 {

    private static Singleton2 instance = null;

    static {
        instance = new Singleton2();
    }

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        return instance;
    }

}