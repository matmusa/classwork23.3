import java.util.ArrayList;

public class Student implements Methods {
    private String name;
    private int age;
    private Group group;

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }



    @Override
    public String toString() {
        return "Student :" +
                "\nname='" + name +
                "\n age=" + age +
                "\ngroup='" +group
                ;
    }
}
