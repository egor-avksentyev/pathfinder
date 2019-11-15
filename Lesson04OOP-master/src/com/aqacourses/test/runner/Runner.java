package com.aqacourses.test.runner;

import com.aqacourses.test.student.Student;
import com.aqacourses.test.student.StudentMogilyanka;
import com.aqacourses.test.student.StudentNki;
import com.aqacourses.test.student.StudentPedin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    /**
     * Add some student to DBs
     *
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {

        StudentNki studentNki = new StudentNki();
        StudentPedin StudentPedin = new  StudentPedin();      // Imagine that GUI opens

        File pathToFile = new File("src/com/resources/Students.txt");


        StudentPedin.openGui();
        ArrayList data = StudentPedin.parse(pathToFile);
        StudentPedin.writeToDb(data);

        /**
        // Create instance of NKI student

        studentNki.openGui();

        // Parse data
        List<String> data = studentNki.parseData();

        // Write data to 'DB'
        studentNki.writeToDb(data);

        // Clear list for reusing
        data.clear();

        // Create instance of Mogilyanka student
        StudentMogilyanka studentMogilyanka = new StudentMogilyanka();

        // Imagine that GUI opens one more time
        studentMogilyanka.openGui();

        // Parse data again
        data = studentMogilyanka.parseData();

        // Write data to another 'DB'
        studentMogilyanka.writeToDb(data);

        // It's possible to create instance of class in that way
        // using inheritance
        Student student1 = new StudentMogilyanka();
        Student student2 = new StudentNki();
*/
    }

    // Overloading as is
    private void setId(int id) {

    }

    private void setId(String id) {

    }

    private void setId(String idString, int id) {

    }

    private void setId() {

    }

}
