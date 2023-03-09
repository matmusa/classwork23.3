import java.util.ArrayList;

public interface Methods {

    static void sortWithGroup(ArrayList<Student> students, ArrayList<Student> java, ArrayList<Student> js) {
        for (Student s : students
        ) {
            if (s.getGroup().equals(Group.JAVA)) {
                java.add(s);
            } else if (s.getGroup().equals(Group.JS)) {
                js.add(s);
            }

        }
    }

    static void sortWithAge(ArrayList<Student> students, ArrayList<Student> age) {
        for (Student s : students
        ) {
            if (s.getAge() <= 23 && s.getAge() >= 19) {
                age.add(s);
            }

        }

    }

    static void sortWithName(ArrayList<Student> students, ArrayList<Student> name) {
        for (Student s : students
        ) {
            char first = 'M';
            if (s.getName().charAt(0) == first) {
                name.add(s);
            }

        }


    }


}
