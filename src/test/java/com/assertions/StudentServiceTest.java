package com.assertions;

import com.Student;
import com.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudents() {

        StudentService studentService = new StudentService();
        Student student = new Student(1,"John");

        List<Student> listOfStudents = studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult = listOfStudents.isEmpty();

        // assertTrue(isListEmpty);  // assertTrue() --> Assert that the supplied condition is true.

        // assertTrue(() -> actualResult);

        // assertTrue(actualResult,"List of students is empty!"); //assertTrue() --> Assert that the boolean condition supplied by booleanSupplier is true.

        // assertTrue(() -> actualResult,  "List of students is empty!");

        // assertTrue(actualResult ,  () -> "List of students is  empty!");

        assertTrue(() -> actualResult , () -> "List of students is empty!");

    }

    @Test
    public void getStudentsTestUsingAssertFalse(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"John");

        List<Student> studentList = studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult = studentList.isEmpty();

       // assertFalse(actualResult);    // assertFalse() --> Assert that the supplied condition is false.

       // assertFalse(actualResult, "List of students is not empty");

      // assertFalse(() -> actualResult);

     //  assertFalse(() -> actualResult, "List of students is not empty");

     //  assertFalse(actualResult , () -> "List of students is not empty");

        assertFalse(() -> actualResult , () -> "List of students is not empty");
    }

    @Test
    public void getStudentsTestUsingAssertNull(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"John");

        studentService.addStudent(student);
        Student actualObject = studentService.getStudentById(1);

        // assertNull(actualObject);      // assertNull() --> Assert that actual is null.

        // assertNull(actualObject, "Student Object is not null");

        assertNull(actualObject, () -> "Student Object is not null");

    }

    @Test
    public void getStudentsTestUsingAssertNotNull(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"John");

        studentService.addStudent(student);
        Student actualObject = studentService.getStudentById(1);

       // assertNotNull(actualObject);      // assertNotNull() --> Assert that actual is not null.

       // assertNotNull(actualObject, "Student Object is null");

        assertNotNull(actualObject , () -> "Student Object is null");

    }

    @Test
    public void getStudentByIdTestUsingAssertEquals(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"John");

        studentService.addStudent(student);
        Student actualObject = studentService.getStudentById(1);

        assertEquals(1,actualObject.getId());
        assertEquals("John",actualObject.getName());
        assertEquals(student,actualObject);
        assertEquals(1,  actualObject.getId(), "Student Id is not equal to 1");
        assertEquals("John",  actualObject.getName(), () -> "Student name is not equal");

    }
}