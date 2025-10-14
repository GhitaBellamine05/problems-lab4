package instructor;

import student.Major;
import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    // Constructors
    public Instructor(){
        this("","","","","");
    }
    public Instructor(String nom, String prenom, String telephone, String email) {
        this(nom,prenom,telephone,email,"");

    }
    public Instructor(String nom, String prenom, String telephone, String email, String employeeNumber) {
        super(nom, prenom, telephone, email);
        this.employeeNumber = employeeNumber;

    }
    // trim the employee Number
    public void cleanEmployeeNumber(){
        this.employeeNumber = this.employeeNumber.trim();
    }
    // Summary line method
    public String summaryLine(){
        return String.format("Instructor [ employeeNumber = %s, LastName = %s, firstName = %s ]",employeeNumber,getSecondName(),getFirstName());
    }
    //
    public String toCard(){
        StringBuilder sb = new StringBuilder();
        sb.append("Instructor").append("\n")
                .append("-----------------\n")
                .append("Employee #: ").append(employeeNumber).append("\n")
                .append("Name      : ").append(getSecondName()).append(", ").append(getFirstName()).append("\n")
                .append("Email     : ").append(getEmail()).append("\n")
                .append("Phone     : ").append(getPhone()).append("\n");
        return sb.toString();
    }
    // display method
    public String displayName(){
        String firstName = getFirstName();
        String lastName = getSecondName();
        StringBuilder sb = new StringBuilder();
        if (lastName != null) sb.append(lastName);
        if (firstName != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstName);
        }
        return sb.toString().trim();
    }
    @Override
    public String toString() {
        return summaryLine();
    }

}
