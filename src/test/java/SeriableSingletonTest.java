
import designPattern.singleton.Lazy.LazySingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Tom.
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {

        LazySingleton s1 = null;
        LazySingleton s2 = LazySingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingletonTest.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();


            FileInputStream fis = new FileInputStream("SeriableSingletonTest.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (LazySingleton)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
