/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import lab2.*;
import lab1.*;
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
public class Lab3 {

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
                    elements.put(lineCounter, line);//if you were to use an index of 0,  0 mod n will be 0 causing a logic error
                    line = in.readLine();           //possible workaround is to subtract 1 after the mod comparison
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
        
        Map<Integer, String> tempMap = new HashMap<>();
        System.out.println("The city in the 2nd record is....");
        tempMap = records.get(1);
        System.out.println(tempMap.get(4));
        
        
    }
}
