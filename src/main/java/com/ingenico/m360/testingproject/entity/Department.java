package com.ingenico.m360.testingproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/*
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long department_id;
    @NotNull(message = "PLEASE ENTER NAME")//validations
//    @Length(max = 50,min = 20)//validations
//    @Size(max = 50)
//    @Email // also can add regex
//    @PositiveOrZero
//    @FutureOrPresent//for date validation
    private String departmentName;
    private String department_adress;
    private String department_code;

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {return departmentName;}

    public void setDepartment_name(String department_name) {
        this.departmentName = department_name;
    }

    public String getDepartment_adress() {
        return department_adress;
    }

    public void setDepartment_adress(String department_adress) {
        this.department_adress = department_adress;
    }

    public String getDepartment_code() {
        return department_code;
    }

    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    public Department(long department_id, String department_name, String department_adress, String department_code) {
        this.department_id = department_id;
        this.departmentName = department_name;
        this.department_adress = department_adress;
        this.department_code = department_code;
    }
    public Department() {}

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + departmentName + '\'' +
                ", department_adress='" + department_adress + '\'' +
                ", department_code='" + department_code + '\'' +
                '}';
    }
}
*/


//lets use lombok
@Entity
@Data//lombok
@AllArgsConstructor//constructor, with argument
@NoArgsConstructor //default constructor, no argument
@Builder // for builder pattern
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long department_id;
    @NotNull(message = "PLEASE ENTER NAME")//validations
//    @Length(max = 50,min = 20)//validations
//    @Size(max = 50)
//    @Email // also can add regex
//    @PositiveOrZero
//    @FutureOrPresent//for date validation
    private String departmentName;
    private String department_address;
    private String department_code;


}
