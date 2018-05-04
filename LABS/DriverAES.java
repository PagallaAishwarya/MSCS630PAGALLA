
/**
file:AESCipher.java
author:Aishwarya Pagalla
assignment: Lab 5
course:MSCS630
assignment :05/04/2018
version:1.0 
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
