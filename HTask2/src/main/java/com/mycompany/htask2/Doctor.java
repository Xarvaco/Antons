package com.mycompany.anton;

import java.util.Scanner;

public class Doctor {
    private int salary;

    private int seniority;

    private String doctorName;

    public Doctor(int salary, int seniority, String doctorName) {
        this.salary = salary;
        this.seniority = seniority;
        this.doctorName = doctorName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void introduceYourself() {
        System.out.println("My name is " + this.doctorName + ". I work for company for " + this.seniority + " years. " +
                "My salary is $" + this.salary + ".");
    }

    public void writeRecipe(String recipe) {
        System.out.println(recipe);
    }

    public void cureClient(String disease) {
        System.out.println("Your disease " + "(" + disease + ") is now cured.");
    }

    @Override
    public String toString() {
        return "Doctor [salary: " + salary + ", seniority: " + seniority + ", doctorName: " + doctorName + "]";
    }
}
