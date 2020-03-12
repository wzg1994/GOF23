package prototype;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * clone的条件：1.实现Cloneable接口 2.重写clone方法
 * 此克隆为浅拷贝，引用类型还是指向原来的对象
 *
 * 要实现深克隆可以使用序列化或者重写clone方法内容
 * @author wangzhiguo
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        ClassRoom classRoom = new ClassRoom(1, "一年三班", date);
        classRoom.setDate(new Date(114));
        System.out.println(classRoom);
        System.out.println("===============================================");
        ClassRoom cloneClassRoom = (ClassRoom) classRoom.clone();
        System.out.println(cloneClassRoom);
    }
}
