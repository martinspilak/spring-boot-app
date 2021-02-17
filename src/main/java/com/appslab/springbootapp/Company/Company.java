package com.appslab.springbootapp.Company;
import com.appslab.springbootapp.Address.Address;

import javax.persistence.*;

@Entity
public class Company{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
   private String name;

    public Company() {
    }

    public Company(Long id, String name){
       this.id = id;
       this.name = name;
   }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName(){

       return name;
   }
   public void setName(String name){

       this.name = name;
   }
}
