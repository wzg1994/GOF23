/**
 * @author wangzhiguo
 */
package proxy.proxy01;
//这里是静态代理模式，主要思想是要有一个代理对象和一个被代理对象，他俩要有一个共同的动作，也就是要实现同一个接口。
//静态代理总结:
//        优点：可以做到在不修改目标对象的功能前提下,对目标功能扩展.
//        缺点:
//
//        因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
//
//        而动态代理方式可以解决上面的问题