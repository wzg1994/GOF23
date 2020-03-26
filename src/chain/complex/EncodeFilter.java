package chain.complex;



/**
 * @author wangzhiguo
 */
public class EncodeFilter implements Filter {

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        //在 servlet 之前执行
        System.out.println("encode start ...");

        chain.doFilter(req, res);

        //在 servlet 之后执行
        System.out.println("encode end ...");
    }
}
