import jdk.dynalink.linker.MethodHandleTransformer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();
        ArrayList<Student> age = new ArrayList<>();
        ArrayList<Student> name = new ArrayList<>();
        students.add(new Student("Matmusa", 21, Group.JAVA));
        students.add(new Student("Madina", 18, Group.JAVA));
        students.add(new Student("Marat", 26, Group.JS));
        students.add(new Student("Manas", 28, Group.JAVA));
        students.add(new Student("Momun", 23, Group.JAVA));
        students.add(new Student("Bakyt", 20, Group.JS));
        students.add(new Student("Baha", 19, Group.JAVA));
        students.add(new Student("Torogeldi", 17, Group.JAVA));
        students.add(new Student("Adilet", 23, Group.JS));
        //  System.out.println((students.toString()));
        Methods.sortWithGroup(students, java, js);
        // System.out.println(java.toString());
      //  System.out.println(js.toString());
        Methods.sortWithAge(students, age);
       // System.out.println(age.toString());
        Methods.sortWithName(students,name);
        System.out.println(name);

    }
}