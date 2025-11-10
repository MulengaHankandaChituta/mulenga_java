import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double grade;
    
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }
    
    public double getGrade() {
        return grade;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.println("\n=== STUDENT MANAGER ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Find Top Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine(); // clear buffer
            
            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = input.nextLine();
                
                System.out.print("Enter age: ");
                int age = input.nextInt();
                
                System.out.print("Enter grade: ");
                double grade = input.nextDouble();
                
                students.add(new Student(name, age, grade));
                System.out.println("Student added!");
           
            } else if (choice == 2) {
                System.out.println("\n--- Student List ---");
                for (Student s : students) {
                    s.display();
                }
                
            } else if (choice == 3) {
                if (students.isEmpty()) {
                    System.out.println("No students added yet.");
                } else {
                    Student top = students.get(0);
                    for (Student s : students) {
                        if (s.getGrade() > top.getGrade()) {
                            top = s;
                        }
                    }
                    System.out.println("\nTop Student:");
                    top.display();
                }
                
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
                
            } else {
                System.out.println("Invalid choice!");
            }
        }
        
        input.close();
    }
}
