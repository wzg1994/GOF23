package proxy.proxy01;

/**
 *
 * 房东
 * @author wangzhiguo
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房屋。。。");
    }
}
