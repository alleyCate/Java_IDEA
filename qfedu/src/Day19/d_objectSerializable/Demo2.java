package Day19.d_objectSerializable;

import java.io.*;
import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {

    }

    private static void readList() {
        ObjectInputStream objectInputStream = null;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("D:/aaa/personList.txt"));

            ArrayList<Person> list = (ArrayList<Person>) objectInputStream.readObject();

            for (Person person : list) {
                System.out.println(person);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void wirteList() {
        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(1, "学生1", 60));
        arrayList.add(new Person(2, "学生2", 50));
        arrayList.add(new Person(3, "学生3", 40));
        arrayList.add(new Person(4, "学生4", 30));
        arrayList.add(new Person(5, "学生5", 20));
        arrayList.add(new Person(6, "学生6", 10));

        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/aaa/personList.txt"));

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
