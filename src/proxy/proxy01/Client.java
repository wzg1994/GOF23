package proxy.proxy01;

/**
 * @author wangzhiguo
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.setHost(new Host());
        proxy.rent();
    }
}
