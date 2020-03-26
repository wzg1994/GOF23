package chain.complex;

/**
 * @author wangzhiguo
 */
public interface Filter {
    void doFilter(Request req, Response res, FilterChain filterChain);
}
