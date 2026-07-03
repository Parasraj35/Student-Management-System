package com.mycompany.studentmanagementsystem;
import java.util.Scanner;

public class StudentManagementSystem {

    class Person {
        String name;
        int age;
    }

    class student extends Person {
        int rollNumber;
        String department;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentManagementSystem sms = new StudentManagementSystem();
        student s1 = sms.new student();
        student s2 = sms.new student();
        student s3 = sms.new student();
        student s4 = sms.new student();
        student s5 = sms.new student();
        student s6 = sms.new student();
        
        s4.name = "Paras raj";
        s4.age = 22;
        s4.rollNumber = 2380176;
        s4.department = "BS Software Engineer";
                  
        s5.name = "Haseeb";
        s5.age = 21;
        s5.rollNumber = 2380171;
        s5.department = "BS Computer Sience";
                     
        s6.name = "Musaib";
        s6.age = 23;
        s6.rollNumber = 2380174;
        s6.department = "BS Computer Sience";

        student[] newStudents = {s1, s2, s3};  // ← moved here!
        
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Students");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("How many students to add? (1-3): ");
                    int count = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        System.out.println("\nEnter Student " + (i+1) + " data");
                        System.out.print("Enter Name: ");
                        newStudents[i].name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        newStudents[i].age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Roll Number: ");
                        newStudents[i].rollNumber = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Department: ");
                        newStudents[i].department = sc.nextLine();
                    }
                    System.out.println("Students Added!");
                    break;

                case 2:
                    System.out.println("\n--- Pre-stored Students ---");
                    System.out.println("Name:" + s4.name);
                    System.out.println("Age:" + s4.age);
                    System.out.println("Roll no:" + s4.rollNumber);
                    System.out.println("Department:" + s4.department);

                    System.out.println("Name:" + s5.name);
                    System.out.println("Age:" + s5.age);
                    System.out.println("Roll no:" + s5.rollNumber);
                    System.out.println("Department:" + s5.department);

                    System.out.println("Name:" + s6.name);
                    System.out.println("Age:" + s6.age);
                    System.out.println("Roll no:" + s6.rollNumber);
                    System.out.println("Department:" + s6.department);

                    System.out.println("\n--- New Students ---");
                    if (s1.name != null) {
                        System.out.println("Name:" + s1.name);
                        System.out.println("Age:" + s1.age);
                        System.out.println("Roll no:" + s1.rollNumber);
                        System.out.println("Department:" + s1.department);
                    }
                    if (s2.name != null) {
                        System.out.println("Name:" + s2.name);
                        System.out.println("Age:" + s2.age);
                        System.out.println("Roll no:" + s2.rollNumber);
                        System.out.println("Department:" + s2.department);
                    }
                    if (s3.name != null) {
                        System.out.println("Name:" + s3.name);
                        System.out.println("Age:" + s3.age);
                        System.out.println("Roll no:" + s3.rollNumber);
                        System.out.println("Department:" + s3.department);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;

                    if (searchName.equalsIgnoreCase(s4.name)) {
                        System.out.println("Name:" + s4.name);
                        System.out.println("Age:" + s4.age);
                        System.out.println("Roll no:" + s4.rollNumber);
                        System.out.println("Department:" + s4.department);
                        found = true;
                    } else if (searchName.equalsIgnoreCase(s5.name)) {
                        System.out.println("Name:" + s5.name);
                        System.out.println("Age:" + s5.age);
                        System.out.println("Roll no:" + s5.rollNumber);
                        System.out.println("Department:" + s5.department);
                        found = true;
                    } else if (searchName.equalsIgnoreCase(s6.name)) {
                        System.out.println("Name:" + s6.name);
                        System.out.println("Age:" + s6.age);
                        System.out.println("Roll no:" + s6.rollNumber);
                        System.out.println("Department:" + s6.department);
                        found = true;
                    } else {
                        for (int i = 0; i < newStudents.length; i++) {
                            if (newStudents[i].name != null && searchName.equalsIgnoreCase(newStudents[i].name)) {
                                System.out.println("Student Found!");
                                System.out.println("Name:" + newStudents[i].name);
                                System.out.println("Age:" + newStudents[i].age);
                                System.out.println("Roll no:" + newStudents[i].rollNumber);
                                System.out.println("Department:" + newStudents[i].department);
                                found = true;
                                break;
                            }
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to delete: ");
                    int deleterollno = sc.nextInt();
                    sc.nextLine();
                    
                    if (deleterollno == s4.rollNumber) {
                        s4.name = null;
                        s4.age = 0;
                        s4.rollNumber = 0;
                        s4.department = null;
                        System.out.println("Student Deleted!");
                    } else if (deleterollno == s5.rollNumber) {
                        s5.name = null;
                        s5.age = 0;
                        s5.rollNumber = 0;
                        s5.department = null;
                        System.out.println("Student Deleted!");
                    } else if (deleterollno == s6.rollNumber) {
                        s6.name = null;
                        s6.age = 0;
                        s6.rollNumber = 0;
                        s6.department = null;
                        System.out.println("Student Deleted!");
                    } else if (deleterollno == s1.rollNumber && s1.name != null) {
                        s1.name = null;
                        s1.age = 0;
                        s1.rollNumber = 0;
                        s1.department = null;
                        System.out.println("Student Deleted!");
                    } else if (deleterollno == s2.rollNumber && s2.name != null) {
                        s2.name = null;
                        s2.age = 0;
                        s2.rollNumber = 0;
                        s2.department = null;
                        System.out.println("Student Deleted!");
                    } else if (deleterollno == s3.rollNumber && s3.name != null) {
                        s3.name = null;
                        s3.age = 0;
                        s3.rollNumber = 0;
                        s3.department = null;
                        System.out.println("Student Deleted!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}