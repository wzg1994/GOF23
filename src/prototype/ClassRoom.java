package prototype;

import java.util.Date;
import java.util.List;

/**
 * @author wangzhiguo
 */
public class ClassRoom implements Cloneable{

    private Integer id;

    private String name;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ClassRoom(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ClassRoom clone = (ClassRoom) super.clone();
        Date date1 = (Date) this.date.clone();
        clone.setDate(date1);
        return clone;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
