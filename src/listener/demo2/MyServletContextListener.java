package listener.demo2;

/**
 * @author wangzhiguo
 */
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void init() {
        System.out.println("init ...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy ...");
    }
}
