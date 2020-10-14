/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;
import java.io.*;
/**
 *
 * @author Alf
 */
public class Percobaan2 {
 public static void main(String args[]) throws Exception {
     try{
      String line;
      String[] cmd = {"cmd.exe", "/c", "ipconfig /all"};
      Process p = Runtime.getRuntime().exec(cmd);
      BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
      
      while((line = input.readLine()) != null){
          System.out.println(line);
      }
      
      input.close();
              }
     catch(Exception e){
         e.printStackTrace();
     }
     }
}