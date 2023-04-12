import java.io.ObjectInputStream;
import java.io.Serializable;
public class user implements Serializable {
    public user() {
        System.out.println(this.getClass() + "无参构造方法被调用");
    }

    public user(String name) {
        System.out.println(this.getClass() + "user(String name)构造方法被调用");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.println(this.getClass() + "的toString()被调用");
        return "userclass{name=" + getName() + "}";
    }

    private void readObject(ObjectInputStream in) throws Exception {
        //执行默认的readObject()方法
        in.defaultReadObject();
        System.out.println(this.getClass() + "的readObject()被调用");
        //windows重点
        Runtime.getRuntime().exec(new String[]{"cmd", "/c", name});
    }

    private String name;
}