package listener.demo1;

/**
 *
 * 事件对象
 * @author wangzhiguo
 */
public class Even {

    private Person person;

    public Even(Person person) {
        super();
        this.person = person;
    }

    public Even() {
        super();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
