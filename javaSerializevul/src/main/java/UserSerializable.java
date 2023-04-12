import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;


public class UserSerializable {
    public static void main(String[] args) throws Exception {
        user user = new user("calc");
        user.setName("calc");
        //序列化对象
        serialize(user);
        //反序列化
        user user1 = unserialize();
        System.out.println(user1);
    }
    public static void serialize(user user) throws Exception {
        FileOutputStream fout = new FileOutputStream("user.ser");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(user);
        out.close();
        fout.close();
        System.out.println("序列化完成.");
    }
    public static user unserialize() throws Exception{

        FileInputStream fileIn = new FileInputStream("user.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user user = (user) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("反序列化完成.");
        return user;
    }
}