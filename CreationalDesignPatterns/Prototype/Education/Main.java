// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    // Build a School Building
    School school = new School("School of Awesome");

    // Make Head Teacher
    Teacher headTeacher = new Teacher("Leena", 1, "Math");
    headTeacher.basicTraining(); // Trained Head Mistress!!

    try {
      // Build Other Teachers
      Teacher teacher1 = headTeacher.clone(); // Knowledge Shared
      teacher1.setId(2);
      teacher1.setName("Santosh");
      teacher1.setSubject("English");

      Teacher teacher2 = headTeacher.clone(); // Knowledge Shared
      teacher2.setId(3);
      teacher2.setName("Mina");
      teacher2.setSubject("Physics");

      // Add Teachers to School
      school.addTeacher(headTeacher);
      school.addTeacher(teacher1);
      school.addTeacher(teacher2);

      // Teach HeadMaster One extra Skill
      headTeacher.addBasicTraining("Management");
      
      System.out.println(school.toString());
    }

    catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}