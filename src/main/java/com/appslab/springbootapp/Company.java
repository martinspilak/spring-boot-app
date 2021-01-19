package com.appslab.springbootapp;
import javax.persistence.*;

@Entity
public class Company{
    @Id
    private Long id;
   private String name;

   public Company(Long id, String name){
       this.id = id;
       this.name = name;
   }

   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name = name;
   }
}
