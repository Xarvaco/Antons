package com.mycompany.anton;

public class Nurse extends Doctor {

    private int workingHours;

    public Nurse(int salary, int seniority, String doctorName) {
        super(salary, seniority, doctorName);
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm Nurse");
    }

    @Override
    public void writeRecipe(String recipe) {
        System.out.println(new StringBuilder(recipe).reverse());
    }

    @Override
    public String toString() {
        return "Nurse [salary: " + this.getSalary() + ", seniority: " +
                this.getSeniority() + ", doctorName: " + this.getDoctorName() + "]";
    }

    public void method() {
        workingHours = 5;
    }
}
