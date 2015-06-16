package ch7;

import java.io.*;
import java.security.MessageDigest;

public class MD5Checksum {

   public static byte[] createChecksum(String filename) throws Exception {
       InputStream fstream =  new FileInputStream(filename);

       byte[] buffer = new byte[1024];
       MessageDigest md = MessageDigest.getInstance("MD5");
       int count;

       do {
           count = fstream.read(buffer);
           if (count > 0) {
               md.update(buffer, 0, count);
           }
       } while (count != -1);

       fstream.close();
       return md.digest();
   }


   public static String getMD5Checksum(String filename) throws Exception {
       byte[] b = createChecksum(filename);
       String result = "";

       for (int i=0; i < b.length; i++) {
           result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
       }
       return result;
   }

   public static void main(String args[]) {
       try {
           System.out.println(getMD5Checksum("build_checkstyle.gradle"));
           //Output: 0ab330a98285de1678847fb39b35e945           
       }
       catch (Exception e) {
           e.printStackTrace();
       }
   }
}