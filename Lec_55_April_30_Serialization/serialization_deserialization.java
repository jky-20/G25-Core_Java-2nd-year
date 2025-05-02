package Lec_55_April_30_Serialization;

import java.io.*;

class Student implements Serializable{
    private  static  final long serialVersionUID = 3L;
    String name;
    transient int roll;
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class serialization_deserialization {
    public static void main(String[] args) {
        
        Student s1 = new Student("Jai", 12345);
        try {
            // serialization of object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lec_55_April_30_Serialization\\example.ser"));
            oos.writeObject(s1);

            // deserialization of objects
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lec_55_April_30_Serialization\\example.ser"));
            Student s2 = (Student)ois.readObject();
            System.out.println(s2.name);
            System.out.println(s2.roll);

        } catch (Exception e) {
        }
    }
}
