import java.util.*;
import java.lang.Cloneable;

public class Teacher implements Cloneable {
  String name;
  int id;
  String subject;
  ArrayList<String> basiclearnings;

  public Teacher() {
    basiclearnings = new ArrayList<String>();
  }

  public Teacher(String name, int id, String subject) {
    this.name = name;
    this.id = id;
    this.subject = subject;
    basiclearnings = new ArrayList<String>();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public void addLearning(String subject) {
    basiclearnings.add(subject);
  }

  public void basicTraining() {
    // Assume this are fetched from DB & Complex Logic
    basiclearnings.add("Basic Training");
    basiclearnings.add("Communication");
    basiclearnings.add("Teaching");

  }

  public void addBasicTraining(String learn) {
    // Assume this are fetched from DB & Complex Logic
    basiclearnings.add(learn);

  }

  public String toString() {
    System.out.println("BASICS");
    System.out.println("");
    for (String basic : basiclearnings) {
      System.out.println(basic);
    }
    System.out.println("");
    return "Teacher name: " + name + "\nTeacher subject: " + subject;
  }

  // shallow cloning
  // @override
  // protected Object clone() throws CloneNotSupportedException {
  // return super.clone();
  // }

  @Override
  protected Teacher clone() throws CloneNotSupportedException {
    Teacher newTeacher = new Teacher();

    // Sharing Knowledge
    for (String sub : this.basiclearnings) {
      newTeacher.addLearning(sub);
    }

    return newTeacher;

  }
}