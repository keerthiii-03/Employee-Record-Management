package project.Src;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminLogin {
    public static ArrayList<AdminLogin> AdminList = new ArrayList<>();

    public static ArrayList<Employee> emplist = new ArrayList<>();

    Scanner sc= new Scanner(System.in);
    private String id;
    private String pass;

    public AdminLogin(String id,String pass){
        this.id= id;
        this.pass=pass;
    }
    public boolean AddAdmin() {
        System.out.println("Enter the Id: ");
        String pid = sc.nextLine();

        System.out.println("Enter the  password: ");
        String ppass = sc.nextLine();


        AdminList.add(new AdminLogin(pid, ppass));

        return true;
    }
    public static void Alogin() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter yes to login to Admin page");
        String loginIn = sc.nextLine();
        if (loginIn.equals("yes")) {
            System.out.println("**Welcome to Admin login**");
            System.out.println("Enter the Admin Id to login : ");
            String UId = sc.nextLine();
            boolean found=false;
            for (AdminLogin admin : AdminList) {
                if (UId.equals(admin.getid())) {
                    System.out.println("Enter the Admin Password login : ");
                    String Upass = sc.nextLine();
                    if (Upass.equals(admin.getpass())) {
                        found=true;


                    } else {
                        System.out.println("Invalid admin password!!!");
                    }

                } else {
                    System.out.println("Invalid admin Id!!!");
                }


            }
            if (!found) {
                System.out.println("Invalid user");
            }
        }

    }





    public void Afuction(){
        while(true) {
            System.out.println("Enter 1 to add Employee details:");
            System.out.println("Enter 2 to Update Employee :");
            System.out.println("Enter 3 to see Employee details:");
            System.out.println("Enter 4 to Delete Employee details:");
            System.out.println("Enter 5 to Exist");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter number of Employee details to add:");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nEnter Employee " + (i + 1) + " Details");

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Password: ");
                        String pass = sc.nextLine();

                        System.out.print("Enter name: ");
                        String name = sc.nextLine();


                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();


                        System.out.print("Enter Designation: ");
                        String des = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter gender: ");
                        String gender = sc.nextLine();


                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();


                        System.out.print("Enter Phone number: ");
                        String pnum = sc.nextLine();


                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id,pass, name, dept, des,
                                age, gender, email, pnum, salary);

                        emplist.add(emp);
                    }
                    System.out.println("Employees Added Successfully.");
                    break;
                case 2:
                    boolean found = false;
                    System.out.println("enter the employee id:");
                    int Uid = sc.nextInt();
                    for (Employee emp : emplist) {

                        if (Uid == emp.getId()) {
                            found = true;
                            System.out.println("enter what to update : ");
                            System.out.println("1. Name");
                            System.out.println("2. Department");
                            System.out.println("3. Designation");
                            System.out.println("4. Age");
                            System.out.println("5. Gender");
                            System.out.println("6. Email");
                            System.out.println("7. Phone Number");
                            System.out.println("8. Salary");

                            System.out.print("Enter your choice: ");
                            int Uch = sc.nextInt();
                            sc.nextLine();

                            switch (Uch) {
                                case 1:
                                    System.out.println("Enter the name : ");
                                    emp.setName(sc.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Enter New Department: ");
                                    emp.setDept(sc.nextLine());
                                    break;

                                case 3:
                                    System.out.print("Enter New Designation: ");
                                    emp.setDes(sc.nextLine());
                                    break;

                                case 4:
                                    System.out.print("Enter New Age: ");
                                    emp.setAge(sc.nextInt());
                                    break;

                                case 5:
                                    sc.nextLine();
                                    System.out.print("Enter New Gender: ");
                                    emp.setGender(sc.nextLine());
                                    break;

                                case 6:
                                    System.out.print("Enter New Email: ");
                                    emp.setEmail(sc.nextLine());
                                    break;

                                case 7:
                                    System.out.print("Enter New Phone Number: ");
                                    emp.setPnum(sc.nextLine());
                                    break;

                                case 8:
                                    System.out.print("Enter New Salary: ");
                                    emp.setSalary(sc.nextDouble());
                                    break;

                                default:
                                    System.out.println("Invalid Choice");

                            }


                        }

                    }
                    if (!found) {
                        System.out.println("Employee id not found");
                    }
                    break;
                case 3:
                    for (Employee emp : emplist) {
                        emp.display();
                    }
                    break;

                case 4:
                    System.out.println("Enter employee id to delete : ");
                    int Udelete = sc.nextInt();
                    Employee.deleteEmp(emplist, Udelete);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");

            }
        }

    }



        //getter
        public String getid () {
            return id;
        }
        public String getpass () {
            return pass;
        }

        //setter
        public void setid (String id){
            this.id = id;
        }
        public void setpass (String pass){
            this.pass = pass;
        }

    }
