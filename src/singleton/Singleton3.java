package singleton;

import singleton.instance.Instance;

/**
 * 懒汉式单例（线程不安全）
 * @author wangzhiguo
 */
public class Singleton3 {

    private Instance instance = null;

    public Instance getInstance(){
        //造成线程不安全的原因是这个if判断
        if (instance == null) {
            instance = new Instance();
        }

        return instance;
    }

    private Singleton3(){

    }
}
