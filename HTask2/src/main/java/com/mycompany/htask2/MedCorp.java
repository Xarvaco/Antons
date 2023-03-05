/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.htask2;
/**
 *
 * @author Anton
 */
public class MedCorp {
    private String close_hours;
    private String work_days;
    private String hours;
    public MedCorp(String close_hours, String work_days, String hours) {
        this.close_hours = close_hours;
        this.work_days = work_days;
        this.hours = hours;
    }
    public String getClose_hours() {
        return close_hours;
    }
    public void setClose_hours(String close_hours) {
        this.close_hours = close_hours;
    }
    public String getHours() {
        return hours;
    }
    public void setHours(String hours) {
        this.hours = hours;
    }
    
    public String getWork_days() {
        return work_days;
    }
    public void setWork_days(String work_days) {
        this.work_days = work_days;
    }
    public void Privileges (int privileges){
        System.out.println("MedCorp gives " + privileges + " for old people");
    }
    public void OpenHours (int hours) {
        System.out.println("MedCorp works for " + hours + " hours");
    }
    public void department(int depart){
        System.out.println("MedCorp has " + depart + " departments");
    }
    
    @Override
    public String toString() {
        return "hours = " + hours + ", close hours = " + close_hours + ", work days = " + work_days;
    }
}