package chain.complex;

/**
 * @author wangzhiguo
 */
public class Main {
    public static void main(String[] args) {
        FilterChain chain = new FilterChain();
        //设置要执行的Servlet
        chain.setServlet(new Servlet());

        //根据url-pattern的匹配规则 向 FilterChain中添加过滤器
        //这些Filter
        chain.addFilter(new LogFilter());
        chain.addFilter(new EncodeFilter());

        //执行
        chain.doFilter(new Request(), new Response());
    }
}
