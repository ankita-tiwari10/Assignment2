import java.util.ArrayList;
import java.util.List;

public class Employee {

    String Name;
    int Age;
    String Designation;
    String employeeType;
    ArrayList<Education> educations;
    ArrayList<EmploymentHistory> employment;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }





    /*public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }*/

    public ArrayList<Education> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<Education> educations) {
        this.educations = educations;
    }

    public ArrayList<EmploymentHistory> getEmployment() {
        return employment;
    }

    public void setEmployment(ArrayList<EmploymentHistory> employment) {
        this.employment = employment;
    }
}
