package singleton;

/**
 * 懒汉式单例（线程不安全）
 * @author wangzhiguo
 */
public class Singleton3 {

    private static Singleton3 instance;

    public static Singleton3 getInstance(){
        //造成线程不安全的原因是这个if判断
        if (instance == null) {
            instance = new Singleton3();
        }

        return instance;
    }

    private Singleton3(){

    }
}
