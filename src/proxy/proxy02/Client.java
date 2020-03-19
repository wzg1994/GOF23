package proxy.proxy02;

public class Client {

    public static void main(String[] args) {
        Dog dog = new MyDog();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(dog);
        Dog proxy = (Dog) myInvocationHandler.getProxy();
        proxy.run();
    }
}
