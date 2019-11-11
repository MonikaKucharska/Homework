package pl.itacademy.lesson10;

import java.time.LocalDate;

public class Student extends Person {
    private String Faculty;
    private int GraduateYear;

    public Student(String FirstName, String LastName, LocalDate BirthDate, String Faculty, int GraduateYear){
        super(FirstName,LastName,BirthDate);
        this.Faculty = Faculty;
        this.GraduateYear = GraduateYear;
    }

    public String getFaculty(){
        return Faculty;
    }
    public int getGraduateYear(){
        return GraduateYear;
    }
    public void setFaculty(String Faculty){
        this.Faculty = Faculty;
    }
    public void setGraduateYear(int GraduateYear){
        this.GraduateYear = GraduateYear;
    }
}
