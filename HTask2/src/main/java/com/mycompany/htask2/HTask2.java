/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.htask2;
/**
 *
 * @author Anton
 */
import java.util.Scanner;
import java.lang.String;
        
public class HTask2 {
    public static void main(String[] args) {
        System.out.println("Home task 2, Variant 3, Group RIBO-03-21, Student Pogosyan A.S.");
        Scanner scan = new Scanner(System.in);
        System.out.println("MedCorp or Dantist or Surgeon ? ");
        String medcorpType = scan.nextLine();
        System.out.println("What are the work days? ");
        String work_days = scan.nextLine();
        System.out.println("When its start working ? ");
        String hours = scan.nextLine();
        System.out.println("when is the end of the shift? ");
        String close_hours = scan.nextLine();
        if (medcorpType.equals("MedCorp")){
        MedCorp mdc = new MedCorp(hours,work_days,close_hours);
        System.out.println(mdc.toString());
        }
    else if (medcorpType.equals("Dantist")){
        System.out.println("what is his experience in years ? ");
        int experience = Integer.parseInt(scan.nextLine());
        System.out.println("what is his salary ? ");
        int salary = Integer.parseInt(scan.nextLine());
        System.out.println("range of costs ? ");
        String range = scan.nextLine();
        
        System.out.println("What is his name ? ");
        String dantist_name = scan.nextLine();
        
        Dantist dantist = new Dantist(experience,salary,range,dantist_name,close_hours,work_days,hours);
        System.out.println(dantist.toString());
        } 
    else if (medcorpType.equals("Surgeon")){
        System.out.println("what is his experience in years ? ");
        int experience = Integer.parseInt(scan.nextLine());
        System.out.println("what is his salary ? ");
        int salary = Integer.parseInt(scan.nextLine());
        System.out.println("Range of costs ? ");
        String range = scan.nextLine();
        
        System.out.println("What is his name ? ");
        String surgeon_name = scan.nextLine();
        
        Surgeon surgeon = new Surgeon(experience,salary,range,surgeon_name,close_hours,work_days,hours);
        System.out.println(surgeon.toString());
        }
    }
}