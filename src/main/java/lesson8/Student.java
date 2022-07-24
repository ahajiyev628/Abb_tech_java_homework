package lesson8;

public class Student {

  String name;
  static int count;

  // once and before all constructors
  // because it's running during on the class loading phase
  // loading .class files to the memory
  static {
    System.out.println("called once");
    count = 0;
  }

  public Student(String name) {
    this.name = name;
    System.out.println("new student is created");
  }

  public static void main(String[] args) {
    new Student("alex");
    new Student("jim");
    new Student("bim");
  }

}
