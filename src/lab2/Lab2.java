/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Steve
 */
public class Lab2 {

    public static void main(String[] args) {

        File file = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "test.txt");
        int lineCounter = 1;
        int recordCounter = 0;

        List<Map> records = new ArrayList<>();


        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();

            while (line != null) {
                Map<Integer, String> elements = new HashMap<>();
                while ((lineCounter % 9) != 0) { //set mod compare to 9 to allow the element indexs to begin at 1
                    elements.put(lineCounter, line);
                    line = in.readLine();
                    lineCounter++;
                }
                lineCounter = 1;

                records.add(recordCounter, elements);
                recordCounter++;




            }
            for (int x = 0; x < records.size(); x++) {
                System.out.println(records.get(x));
            }

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

        Scanner keyboard = new Scanner(System.in);

        int recordNum = 0;

        while (recordNum != -1) {
            System.out.println("Enter a record number(-1 to escape):");
            recordNum = keyboard.nextInt();
            if (recordNum != -1){
            if (recordNum >= 0 && recordNum < records.size()) {
                System.out.println(records.get(recordNum));
            } else {
                System.out.println("INVALID RECORD");
                System.out.println("Enter a record number(-1 to escape):");
                recordNum = keyboard.nextInt();
            }}
        }
    }
}
