package Day19.d_objectSerializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

    }

    private static void wirteList() {
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(1, "学生1", 60));
        arrayList.add(new Person(1, "学生2", 50));
        arrayList.add(new Person(1, "学生3", 40));
        arrayList.add(new Person(1, "学生4", 30));
        arrayList.add(new Person(1, "学生5", 20));
        arrayList.add(new Person(1, "学生6", 10));

        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/aaa/personlist.txt"));

            objectOutputStream.writeObject(arrayList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
