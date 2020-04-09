package listener.demo1;

/**
 * @author wangzhiguo
 */
public class MyPersonListener implements PersonListener {

    @Override
    public void doRun(Even even) {
        //拿到事件源
        Person person = even.getPerson();
        System.out.println("人在跑之前执行的动作");
    }

    @Override
    public void doEat(Even even) {
        System.out.println("人在吃之前执行的动作");
    }
}
