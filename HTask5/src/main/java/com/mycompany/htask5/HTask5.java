/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.htask5;
import java.io.*; 
/**
 *
 * @author Anton
 */
public class HTask5 {
     

     private static byte[] hexStringToByteArray(String s) { 
         System.out.println("HomeTask №5, Variant 3, Pogosyan A.S. Group RIBO-03-21");
        int len = s.length(); 
        byte[] data = new byte[len / 2]; 
        for (int i = 0; i < len; i += 2) { 
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) 
                                 + Character.digit(s.charAt(i+1), 16)); 
        } 
        return data; 
    } 
    public static void main(String[] args) {
        try { 
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.print("Введите путь к файлу: "); 
            String filePath = reader.readLine(); 
            System.out.print("Введите гамму в шестнадцатеричном формате: "); 
            String gammaHex = reader.readLine(); 
            FileInputStream fis = new FileInputStream(filePath); 
            byte[] fileContent = new byte[fis.available()]; 
            fis.read(fileContent); 
            fis.close(); 
            byte[] gamma = hexStringToByteArray(gammaHex); 
            for (int i = 0; i < fileContent.length; i++) { 
                fileContent[i] ^= gamma[i % gamma.length]; 
            } 
            File outputFile = new File("output.bin"); 
            FileOutputStream fos = new FileOutputStream(outputFile); 
            fos.write(fileContent); 
            fos.close(); 
             
            System.out.println("Успешно выполнено, Результат записан в файл '" + outputFile.getAbsolutePath() + "'."); 
        } catch (IOException e) { 
            System.out.println("Ошибка: " + e.getMessage()); 
        } 
    } 
 
   
}
