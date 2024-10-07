package org.example.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Administrador extends Persona{

    private String startDate;
    private String department;
    private String jobTitle;
    private float salary;
    private String user;
    private String password;



    public Administrador(String birthDate) {
        super(birthDate);
    }

    public Administrador(String id, String name, String lastName, String birthDate, String address, String telephoneType, String telephone, String email, String startDate, String department, String jobTitle, float salary, String user, String password) {
        super(id, name, lastName, birthDate, address, telephoneType, telephone, email);
        this.startDate = startDate;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrador{" + super.toString() +
                "startDate='" + startDate + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                "}";
    }
}
