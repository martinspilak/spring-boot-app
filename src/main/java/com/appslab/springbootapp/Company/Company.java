package com.appslab.springbootapp.Company;
import com.appslab.springbootapp.Address.Address;
import com.appslab.springbootapp.Employee.Employee;
import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.*;

@Entity
public class Company{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
   private String name;
    @OneToMany(mappedBy="company")
    private List<Employee> employee;

    public Company() {
    }

    public Company(Long id, String name){
       this.id = id;
       this.name = name;

   }
    @NotNull
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
