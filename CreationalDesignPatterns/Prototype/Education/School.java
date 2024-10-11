import java.util.*;

public class School {
  String name;
  List<Teacher> teachers;

  public School(String name) {
    this.name = name;
    teachers = new ArrayList<Teacher>();
  }

  public void addTeacher(Teacher teacher) {
    teachers.add(teacher);
  }

  public String toString() {
    System.out.println("School Name: " + name);
    for (Teacher teacher : teachers) {
      System.out.println("---------------------------------");
      System.out.println(teacher.toString());
    }
    return "--------------------END-----------------------";
  }
}