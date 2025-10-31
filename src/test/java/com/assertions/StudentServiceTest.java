package com.assertions;

import com.Student;
import com.StudentNotFoundException;
import com.StudentService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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

//        assertEquals(1,actualObject.getId());

//        assertEquals("John",actualObject.getName());

//        assertEquals(student,actualObject);

//        assertEquals(1,  actualObject.getId(), "Student Id is not equal to 1");

        assertEquals("John",  actualObject.getName(), () -> "Student name is not equal");

    }

    @Test
    public void getStudentByIdTestUsingAssertNotEquals(){

        StudentService studentService = new StudentService();

        Student student = new Student(1,"John");
        Student student2 = new Student(2,"Tom");

        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

      //   assertNotEquals(1,actualObject.getId());

     //   assertNotEquals("John",actualObject.getName());

     //   assertNotEquals(2,  actualObject.getId(), "Student Id is equal to 1");

     //     assertNotEquals("John",  actualObject.getName(), () -> "Student name is equal");

        assertNotEquals(student2,actualObject);

    }

    @Test
    public void getStudentNamesByDepartmentTestUsingAssertArrayEquals(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"Jimmy", "Science");
        Student student2 = new Student(2,"Tom" , "Commerce");
        Student student3 = new Student(3,"Jane", "Arts");
        Student student4 = new Student(4,"Roh", "Science");
        studentService.addStudent(student);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.addStudent(student4);

        String[] actualArray = studentService.getStudentNamesByDepartment("Science");
        String[] expectedArray = {"Jimmy", "Roh"};

        // assertArrayEquals(expectedArray,actualArray);

        // assertArrayEquals(expectedArray,actualArray,"Student names are not equal");

        // assertArrayEquals(expectedArray,actualArray, () -> "Student names are not equal");

        Integer[] actualStudentIds = studentService.getStudentIdsByDepartment("Science");
        Integer[] expectedStudentIds = {1,4};

        // assertArrayEquals(expectedStudentIds,actualStudentIds);

        // assertArrayEquals(expectedStudentIds,actualStudentIds, () -> "Student ids are not equal");

        assertArrayEquals(expectedStudentIds,actualStudentIds,"Student ids are not equal");

    }

    @Test
    public void getStudentNameListByDepartmentTestUsingAssertIterableEquals(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"Jimmy", "Science");
        Student student2 = new Student(2,"Tom" , "Commerce");
        Student student3 = new Student(3,"Jane", "Arts");
        Student student4 = new Student(4,"Roh", "Science");
        studentService.addStudent(student);
        studentService.addStudent(student2);
        studentService.addStudent(student3);
        studentService.addStudent(student4);

        List<String> actualStudentNameList = studentService.getStudentNameListByDepartment("Science");
        List<String> expectedStudentNameList = Arrays.asList("Jimmy","Roh");

        // assertIterableEquals(actualStudentNameList,expectedStudentNameList);

        // assertIterableEquals(expectedStudentNameList,actualStudentNameList, "Student names are not equal");

        // assertIterableEquals(expectedStudentNameList,actualStudentNameList, () -> "Student names are not equal");

        List<Integer> actualStudentIdList =  Arrays.asList(1,4);
        List<Integer> expectedStudentIdList = studentService.getStudentIdListByDepartment("Science");

        // assertIterableEquals(expectedStudentIdList,actualStudentIdList);

        // assertIterableEquals(expectedStudentIdList,actualStudentIdList, "Student ids are not equal");

        assertIterableEquals(expectedStudentIdList,actualStudentIdList, () -> "Student ids are not equal");

    }

    @Test
    public void getStudentByNameTestUsingAssertThrows(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"Jimmy", "Science");
        studentService.addStudent(student);

//        assertThrows(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Jimmy");
//        });

//        assertThrows(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Jimmy");
//        } , "StudentNotFoundException should be thrown, But, it was not");

        assertThrows(StudentNotFoundException.class, () -> {
            studentService.getStudentByName("Jimmy");
        } , () -> "StudentNotFoundException should be thrown, But, it was not");

        //assertThrows() -> Assert that execution of the supplied executable throws an exception of the expectedType and return the exception.

    }

    @Test
    public void getStudentByNameTestUsingAssertThrowsExactly(){

        StudentService studentService = new StudentService();
        Student student = new Student(1,"Jimmy", "Science");
        studentService.addStudent(student);

//        assertThrowsExactly(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Jimy");
//        });

//        assertThrowsExactly(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Jimmy");
//        } , "StudentNotFoundException should be thrown, But, it was not");

        assertThrowsExactly(StudentNotFoundException.class, () -> {
            studentService.getStudentByName("Jimmy");
        } , () -> "StudentNotFoundException should be thrown, But, it was not");

        //assertThrowsExactly() -> Assert that execution of the supplied executable throws an exception of exactly the expectedType and return the exception.

    }

}