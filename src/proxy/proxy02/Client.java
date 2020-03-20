package proxy.proxy02;

public class Client {

    public static void main(String[] args) {
        Dog dog = new MyDog();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(dog);
        Dog proxy = (Dog) myInvocationHandler.getProxy();
        proxy.run();

        Dog dog1 = new YourDog();
        MyInvocationHandler myInvocationHandler1 = new MyInvocationHandler();
        myInvocationHandler1.setTarget(dog1);
        Dog proxy1 = (Dog) myInvocationHandler.getProxy();
        proxy1.run();
    }
}
