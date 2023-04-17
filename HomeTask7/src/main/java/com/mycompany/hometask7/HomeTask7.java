/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hometask7;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class HomeTask7 {

    public static void main(String[] args) {
        System.out.println("HomeTask №7, Variant 3, Pogosyan A.S, Group RIBO-03-21\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();
        String[] numbers = input.split(","); 
        int[] seq = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            seq[i] = Integer.parseInt(numbers[i]); 
        }
        MinThread minThread = new MinThread(seq);
        MaxThread maxThread = new MaxThread(seq);
        minThread.start();
        maxThread.start();
        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println("Максимальное число: " + maxThread.getMaxValue());
        System.out.println("Минимальное число: " + minThread.getMinValue());
    }
}