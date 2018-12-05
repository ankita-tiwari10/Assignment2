import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Employee> empList=new ArrayList();

        addEmpData(empList);

        printAllEmps_DevelopersOnly(empList);

        printAllEmps_SingleOrg(empList);

        printAllEmps_2yrsDuration_AndDev(empList);

    }

    //2
    private static void addEmpData(ArrayList<Employee> empList) {
        Scanner scanner = new Scanner(System.in);

        Boolean flag=true;
        while(flag)
        {
            System.out.println("Enter Employee Name");
            String name= scanner.next();

            System.out.println("Enter Employee Age");
            String age= scanner.next();

            System.out.println("Enter Employee Degisgnation");
            String des= scanner.next();

            System.out.println("Enter Employee Type");
            String empType =scanner.next();

            /*switch (empType){
                case "Developer":
                    System.out.println("Developer");
                    break;
                case "Manager":
                    System.out.println("Manager");
                case "Admin":
                    System.out.println("Admin");
                case "Tester":
                    System.out.println("Tester");

                default:
                    System.out.println("Invalid Type");

            }*/
            System.out.println("Enter Employee Degree");
            String degree= scanner.next();
            System.out.println("Enter  Aggregate");
            String aggr= scanner.next();
            System.out.println("Enter Completion Date");
            String date= scanner.next();
            Boolean b=true;
           // String moreEdu;
            while (b){
            System.out.println("Do U want to add more education details press 1: yes, 2: No");
            String moreEdu=scanner.next();

            if(moreEdu.equals("1")) {
                System.out.println("Enter Employee Degree");
                degree = scanner.next();
                System.out.println("Enter  Aggregate");
                aggr = scanner.next();
                System.out.println("Enter Completion Date");
                date = scanner.next();

            }
                if(moreEdu.equals("2")){
                    b=false;
                }
            }


                System.out.println("Do u have any employement before press 1: yes, 2: No");
                String options1 = scanner.next();
                EmploymentHistory empH = new EmploymentHistory();

                if (options1.equals("1")) {
                    System.out.println("Enter Organization name");
                    String orgName = scanner.next();
                    System.out.println("Enter Duration");
                    String duration = scanner.next();
                    System.out.println("Enter Project");
                    String proj = scanner.next();
                    empH.setOrganizationName(orgName);
                    empH.setDuration(duration);
                    empH.setProject(proj);
                } else {
                    empH.setOrganizationName("");
                    empH.setDuration("");
                    empH.setProject("");
                }
            Boolean b1=true;
            while (b1 && (!options1.equals("2"))){
               // if(!options1.equals("2")){
            System.out.println("Do u want to add more employment press 1: yes, 2: No");
            String optionsMoreEmployment = scanner.next();
                if(optionsMoreEmployment.equals("1")) {
                    System.out.println("Enter Organization name");
                    String orgName = scanner.next();
                    System.out.println("Enter Duration");
                    String duration = scanner.next();
                    System.out.println("Enter Project");
                    String proj = scanner.next();
                    empH.setOrganizationName(orgName);
                    empH.setDuration(duration);
                    empH.setProject(proj);

                }
                if(optionsMoreEmployment.equals("2")){
                    b1=false;
                }
            }
            ArrayList<EmploymentHistory> empHist=new ArrayList();
            empHist.add(empH);
            Education education=new Education();
            education.setDegree(degree);
            education.setPercent(aggr);
            education.setDate(date);
            ArrayList<Education> edu=new ArrayList();
            edu.add(education);
            Employee employee=new Employee();
            employee.setName(name);
            employee.setAge(Integer.parseInt(age));
            employee.setDesignation(des);
            employee.setEmployeeType(empType);
            employee.setEducations(edu);
            employee.setEmployment(empHist);
            empList.add(employee);


            System.out.println("Do you want to add More Employee press 1: yes, 2: No");
            String options =  scanner.next();
            if(options.equals("2")){
                flag=false;
            }

        }
    }

    //3
    private static void printAllEmps_DevelopersOnly(ArrayList<Employee> empList) {

        System.out.print("All Employees who are Developer");


        for(int i=0;i<empList.size();i++) {
            Employee e=(Employee)empList.get(i);

            if(e.getEmployeeType().equals("Developer")) {

              //  System.out.print(e.getName()+"\n"+ e.getAge()+"\n"+e.getDesignation()+"\n"+e.getEmployeeType());
                System.out.print("\n Name:"+e.getName()+"\n Age:"+e.getAge()+"\n Designation:"+e.getDesignation()+"\n Employee Type:"+e.getEmployeeType());

                for(int j=0;j<e.getEducations().size();j++) {


                    System.out.print("\n Degree:"+e.getEducations().get(j).getDegree()
                            +"\n Aggregate:"+ e.getEducations().get(j).getPercent()
                            + "\n Completion Date:"+e.getEducations().get(j).getDate());

                }

                for(int k=0;k<e.getEmployment().size();k++) {

                    System.out.print("\n Organization Name:"+e.getEmployment().get(k).getOrganizationName()
                            + "\n Duration:"+e.getEmployment().get(k).getDuration()
                            + "\n Project:"+e.getEmployment().get(k).getProject());
                }

            }
        }

    }


    //4
    private static void printAllEmps_SingleOrg(ArrayList<Employee> empList) {

        System.out.print("All Employees who have not worked in another organization");

        for(int i=0;i<empList.size();i++) {
            Employee e=(Employee)empList.get(i);
            if(e.getEmployment().size()==1){

              //  System.out.print(e.getName()+"\n"+e.getAge()+"\n"+e.getDesignation()+"\n"+e.getEmployeeType());
                System.out.print("\n Name:"+e.getName()+"\n Age:"+e.getAge()+"\n Designation:"+e.getDesignation()+"\n Employee Type:"+e.getEmployeeType());

                for(int j=0;j<e.getEducations().size();j++) {


                    System.out.print("\n Degree:"+e.getEducations().get(j).getDegree()
                            +"\n Agregate:"+ e.getEducations().get(j).getPercent()
                            + "\n Completion Date:"+e.getEducations().get(j).getDate());

                }

                for(int k=0;k<e.getEmployment().size();k++) {

                    System.out.print("\n Organization Name:"+e.getEmployment().get(k).getOrganizationName()
                            + "\n Duration:"+e.getEmployment().get(k).getDuration()
                            + "\n Project:"+e.getEmployment().get(k).getProject());
                }
            }
        }

    }


    //5
    private static void printAllEmps_2yrsDuration_AndDev(ArrayList<Employee> empList) {

        System.out.print("All Employees having who worked in more than 1 oraganization and are Developers");

        for(int i=0;i<empList.size();i++) {
            Employee e = (Employee) empList.get(i);
            if (e.getEmployment().size() > 2 && e.getEmployeeType().equals("Developer")) {
                System.out.print("\n Name:"+e.getName()+"\n Age:"+e.getAge()+"\n Designation:"+e.getDesignation()+"\n Employee Type:"+e.getEmployeeType());

                for(int j=0;j<e.getEducations().size();j++) {


                    System.out.print("\n Degree:"+e.getEducations().get(j).getDegree()
                            +"\n Agregate:"+ e.getEducations().get(j).getPercent()
                            + "\n Completion Date:"+e.getEducations().get(j).getDate());

                }

                for(int k=0;k<e.getEmployment().size();k++) {

                    System.out.print("\n Organization Name:"+e.getEmployment().get(k).getOrganizationName()
                            + "\n Duration:"+e.getEmployment().get(k).getDuration()
                            + "\n Project:"+e.getEmployment().get(k).getProject());
                }

            }
        }
    }

}

