/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5;

/**
 *
 * @author Anurag
 */
import java.io.BufferedInputStream;
import java.util.Scanner;

public class DriverAES {

  public static void main(String[] args) {
    
    Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    System.out.println("ENTER INPUT- KEY & PLAINTEXT");
    while (stdin.hasNext()) {
      String Key = stdin.nextLine();
      String plainText = stdin.nextLine();
      //System.out.println("ENTER INPUT -PLAINTEXT");
      if (Key.length() == 32 && plainText.length() == 32) {
        new AESCipher().AES(plainText, Key);
      }
      
    }
  }

}