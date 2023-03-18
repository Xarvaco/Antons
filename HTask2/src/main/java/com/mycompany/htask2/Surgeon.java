package com.mycompany.anton;

public class Surgeon extends Doctor {

    public Surgeon(int salary, int seniority, String doctorName) {
        super(salary, seniority, doctorName);
    }

    @Override
    public void writeRecipe(String recipe) {
        int recipeSize = recipe.length();
        if (recipeSize < 6) {
            System.out.println(recipe);
            return;
        }
        System.out.println(recipe.substring(0, recipeSize - 5));
    }

    @Override
    public String toString() {
        return "Surgeon [salary: " + this.getSalary() + ", seniority: " +
                this.getSeniority() + ", doctorName: " + this.getDoctorName() + "]";
    }
}
