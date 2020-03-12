package singleton;

/**
 * 双重检查
 * @author wangzhiguo
 */
public class Singleton4 {

    //volatile防止指令重排序

    private static volatile Singleton4 instance;

    private Singleton4(){

    }

    public static Singleton4 getInstance(){
        if (instance == null) {
            //第一层检查，检查是否有引用指向对象，高并发情况下会有多个线程同时进入
            synchronized (Singleton4.class) {
                //第一层锁，保证只有一个线程进入
                //双重检查，防止多个线程同时进入第一层检查(因单例模式只允许存在一个对象，故在创建对象之前无引用指向对象，所有线程均可进入第一层检查)
                //当某一线程获得锁创建一个Singleton对象时,即已有引用指向对象，singleton不为空，从而保证只会创建一个对象
                //假设没有第二层检查，那么第一个线程创建完对象释放锁后，后面进入对象也会创建对象，会产生多个对象
                if (instance == null) {
                    //instance = new Singleton4()语句为非原子性，实际上会执行以下内容：
                    //(1)在堆上开辟空间；(2)属性初始化;(3)引用指向对象
                    //假设以上三个内容为三条单独指令，因指令重排可能会导致执行顺序为1->3->2(正常为1->2->3),当单例模式中存在普通变量需
                    // 要在构造方法中进行初始化操作时，单线程情况下，顺序重排没有影响；但在多线程情况下，假如线程1执行instance = new Singleton4()
                    // 语句时先1再3，由于系统调度线程2的原因没来得及执行步骤2，但此时已有引用指向对象也就是singleton!=null，故线程2在第一次检查时
                    // 不满足条件直接返回singleton，此时singleton为null(即str值为null)
                    //volatile关键字可保证singleton=new Singleton()语句执行顺序为123，因其为非原子性依旧可能存在系统调度问题(即执行步骤时被打断)，但能
                    // 确保的是只要singleton!=0，就表明一定执行了属性初始化操作；而若在步骤3之前被打断，此时singleton依旧为null，其他线程可进入第一
                    // 层检查向下执行创建对象
                    instance = new Singleton4();
                }
            }
        }

        return instance;
    }
}
