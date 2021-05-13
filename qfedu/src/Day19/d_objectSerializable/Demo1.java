package Day19.d_objectSerializable;

import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        writeObject();
        readObject();
    }

    private static void writeObject() {
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:/aaa/person.txt"));

            objectOutputStream.writeObject(new Person(1, "旺旺", 16));
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

    private static void readObject() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("D:/aaa/person.txt"));

            // 从保存字节序列化数据的文件中读取一个返回对象，返回值类型是Object类型
            // 但是我们知道，这里保存的实际是Person类型，可以进行强转操作
            Person p = (Person) objectInputStream.readObject();

            System.out.println(p);
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
}
