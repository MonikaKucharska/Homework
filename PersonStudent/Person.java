package pl.itacademy.lesson10;

import java.time.LocalDate;

public class Person {
   private String FirstName;
   private String LastName;
   private LocalDate BirthDate;

   public Person(String FirstName, String LastName, LocalDate BirthDate){
       this.FirstName = FirstName;
       this.LastName = LastName;
       this.BirthDate = BirthDate;
   }

   public String getFirstName(){
       return FirstName;
   }

   public String getLastName(){
       return LastName;
   }

   public LocalDate getBirthDate(){
       return BirthDate;
   }

   public void setFirstName(String FirstName){
       this.FirstName = FirstName;
   }

   public void setLastName(String LastName){
       this.LastName = LastName;
   }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }
}
