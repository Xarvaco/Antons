/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hometask6;
import java.util.Scanner;

/**
 *
 * @author Anton
 */
public class HomeTask6 {

    public static void main(String[] args) {
    System.out.println("HomeTask №6, Variant 3, Pogosyan A.S. Group RIBO-03-21");
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("name = ");
    String name = scan.nextLine();
    if (name  == null) {name = "Anton";}
    System.out.print("surname = ");
    String surname = scan.nextLine();
    if (surname  == null) {name = "Pogosyan";}
    System.out.print("age = ");
    int age = scan.nextInt();
    System.out.print("education = ");
    String education = scan.nextLine();
    if (education  == null) {name = "Mirea";}
    System.out.print("experience = ");
    int experience = scan.nextInt();
    Doctor doctor = new Doctor(name, surname, age, education, experience);
    
    SaverRunnable sr = new SaverRunnable(doctor, "C:/doctor.txt");
    Thread th = new Thread(sr); 
    th.start();
    }
}
