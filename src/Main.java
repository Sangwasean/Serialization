import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        User user1=new User();
        user1.name="sean";
        user1.password="Kdsean11@gmail.com";
        FileOutputStream fout=new FileOutputStream("object.ser");
        ObjectOutputStream obj=new ObjectOutputStream(fout);
        obj.writeObject(user1);
        obj.close();
        fout.close();
        System.out.println("Serialization done");
    }
}