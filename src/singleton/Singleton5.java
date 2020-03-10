package singleton;

/**
 * 枚举是天然的单例，可以防止反射攻击
 * @author wangzhiguo
 */
public enum Singleton5 {

    INSTANCE;

    public Singleton5 getInstance(){
        return INSTANCE;
    }

}
