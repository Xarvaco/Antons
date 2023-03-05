/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.htask2;
/**
 *
 * @author Anton
 */
public class Dantist extends MedCorp {
    private int experience;
    private int salary;
    private String range;
    private String dantist_name;
    public Dantist(int experience, int salary, String range, String dantist_name, String close_hours, String work_days, String hours) {
        super(close_hours, work_days, hours);
        this.experience = experience;
        this.salary = salary;
        this.range = range;
        this.dantist_name = dantist_name;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getRange() {
        return range;
    }
    public void setRange(String range) {
        this.range = range;
    }
   
    public String getDantist_name() {
        return dantist_name;
    }
    public void setDantist_name(String dantist_name) {
        this.dantist_name = dantist_name;
    }
    
    
    public void seasonalVacation (String seasonVac){
        System.out.println("Doctor doesnt work at season " + seasonVac);
    }
    public void DoctorsBigDays (String bdays) {
        System.out.println("high-entry " + bdays + " days");
    }
    public void lifeInsurance(int lifeInsurance ){
        System.out.println("MedCorp gives life insurance for " + lifeInsurance + " years");
    }
    @Override
    public String toString() {
        return "Experience = " + experience + " years , Amount of salary = " + salary + " rubles, Range of costs = " + range + " rubles, Dantist name = " + dantist_name +  ", open hours = " + getHours() + ", close hours = " + getClose_hours() + ", work days = "+ getWork_days();
    }
}