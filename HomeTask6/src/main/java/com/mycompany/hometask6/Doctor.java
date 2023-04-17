/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hometask6;
import java.io.Serializable;

/**
 *
 * @author Anton
 */
public class Doctor implements Serializable{
    private String name;
    private String surname;
    private int age;
    private String education;
    private int experience;

    public Doctor(String name, String surname, int age, String education, int experience) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.education = education;
        this.experience = experience;
    }
    
}
