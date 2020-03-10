package singleton;

/**
 * 通过静态内部类来实现
 * @author wangzhiguo
 */
public class Singleton6 {

    private static class InnerClass {
        private static Singleton6 INSTANCE = new Singleton6();
    }

    private Singleton6(){

    }

    public static Singleton6 getInstance() {
        return InnerClass.INSTANCE;
    }
}
