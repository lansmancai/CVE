import java.io.ObjectInputStream;
import java.io.Serializable;
public class user implements Serializable {
    public user() {
        System.out.println(this.getClass() + "�޲ι��췽��������");
    }

    public user(String name) {
        System.out.println(this.getClass() + "user(String name)���췽��������");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.println(this.getClass() + "��toString()������");
        return "userclass{name=" + getName() + "}";
    }

    private void readObject(ObjectInputStream in) throws Exception {
        //ִ��Ĭ�ϵ�readObject()����
        in.defaultReadObject();
        System.out.println(this.getClass() + "��readObject()������");
        //windows�ص�
        Runtime.getRuntime().exec(new String[]{"cmd", "/c", name});
    }

    private String name;
}