package proxy.proxy01;

/**
 * 我是中介
 *
 * @author wangzhiguo
 */
public class Proxy implements Rent {

    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        otherMethod();
    }

    public void otherMethod(){
        System.out.println("这里我还可以做一些其他附加操作");
    }
}
