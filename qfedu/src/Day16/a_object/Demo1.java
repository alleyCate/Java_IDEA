package Day16.a_object;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "羊驼", 16, '男');
        Student student2 = new Student(1, "羊驼", 16, '男');

        System.out.println(student1);

        boolean rel = student1.equals(student2);
        System.out.println(rel);
    }


}
