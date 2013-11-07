/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Steve
 */
public class Lab1 {

    public static void main(String[] args) {

        File file = new File("C:" + File.separatorChar + "temp" + File.separatorChar + "test.txt");
        int linecount = 1;

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                //                if(linecount<=6&&linecount >=4){  \\gets the 2nd record
                System.out.println(line);
                //               }
                line = in.readLine();
                linecount++;
            }

        } catch (IOException ioe) {
            System.out.println(ioe);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }

       PrintWriter out = null;
//       try{
//           out = new PrintWriter(new BufferedWriter(new FileWriter(file,ture)));
//           out.println("Jim Cox");
//           out.println("3354 Westbury Ln");
//           out.println("St. Paul MN, 58921");
//           out.close();
//       
//       }catch(IOException ioe){
//           System.out.println(ioe);
//       }
        
        
    }
}
