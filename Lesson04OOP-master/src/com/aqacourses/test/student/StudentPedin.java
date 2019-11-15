package com.aqacourses.test.student;

import com.aqacourses.test.interfaces.ParseFileInterface;
import com.aqacourses.test.interfaces.WriteToDbInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentPedin extends Student implements ParseFileInterface, WriteToDbInterface {

  //  File pathToFile = new File("C:\\Users\\pankaj\\Desktop\\test.txt");

    public ArrayList parse (File pathToFile) throws FileNotFoundException {
       ArrayList<String> data = new ArrayList<>();
       Scanner scanner = new Scanner(pathToFile);


       while (scanner.hasNextLine()) {
            System.out.println("reading name");
            String name = scanner.nextLine();
            if (isLineNotEmpty(name)) {
                data.add(name);
            }

            System.out.println("reading age");
            String age = scanner.nextLine();
            if (isLineNotEmpty(age)) {
                data.add(age);
            }

            System.out.println("reading sex");
            String sex = scanner.nextLine();
            if (isLineNotEmpty(sex)) {
                data.add(sex);
            }
       }
        return  data;
    }

    private FileWriter fileWriter;
    private PrintWriter printWriter;

    /**
     * Write student data to MSSQL Db
     *
     * @param data
     */

    public void writeToDb (List<String> data) {
        try {
            openConnectionToDb();

            for(int i = 0; i < data.size(); i += 3) {
                List<String> studentData = new ArrayList();
                studentData.add(data.get(i));
                studentData.add(data.get(i + 1));
                studentData.add(data.get(i + 2));
                if (isDataValid(studentData) && validateStudent(studentData)) {
                    System.out.println(studentData);
                    for (String datum : studentData) {
                        printWriter.println(getDate() + " - " + datum);
                    }
                    printWriter.println("=====================");
                    System.out.println("All data is written to MSSQL DB");
                }
            }
            closeConnectionToDb();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Open connection to MSSQL DB
     */
    private void openConnectionToDb() throws IOException {
        String path = "src/com/resources/MSSQL-DB.txt";
        fileWriter = new FileWriter(path);
        printWriter = new PrintWriter(fileWriter);
    }

    /**
     * CLose connection to MySQL DB
     */
    private void closeConnectionToDb() throws IOException {
        printWriter.close();
        fileWriter.close();
        System.out.println("Close connection to MSSQL DB");
    }


    @Override
    public ArrayList parse(String pathToFile) {
        return null;
    }
}
