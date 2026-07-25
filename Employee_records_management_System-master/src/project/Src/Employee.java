package project.Src;

import java.util.ArrayList;

public class Employee {



        ArrayList<Employee> emplist =new ArrayList<Employee>();
        private int id;
        private String pass;
        private String name;
        private String dept;
        private String des;
        private int age;
        private String gender;
        private String email;
        private String pnum;
        private double salary;
        public Employee(int id,String pass,String name,String dept,String des,int age, String gender,String email,String pnum,double salary){
            this.id=id;
            this.pass=pass;
            this.name=name;
            this.dept=dept;
            this.des=des;
            this.age=age;
            this.gender=gender;
            this.email=email;
            this.pnum=pnum;
            this.salary=salary;
        }
        //getter
        public int getId(){
            return id;
        }
        public String getPass() {
             return pass;
        }
        public String getName(){
            return name;
        }
        public String getDept(){
            return dept;
        }
        public String getDes() {
            return des;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public String getEmail() {
            return email;
        }

        public String getPnum() {
            return pnum;
        }

        public double getSalary() {
            return salary;
        }

        //setter
        public void setId(int id){
            this.id=id;
        }
        public void setPass(String pass) {
            this.pass = pass;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPnum(String pnum) {
            this.pnum = pnum;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public void update(int id,String pass,String name,String dept,String des,int age, String gender,String email,String pnum,double salary){
            this.id=id;
            this.pass=pass;
            this.name=name;
            this.dept=dept;
            this.des=des;
            this.age=age;
            this.gender=gender;
            this.email=email;
            this.pnum=pnum;
            this.salary=salary;

        }
        public static void deleteEmp(ArrayList<Employee> emplist, int id){
            boolean found=false;
            for(int i=0;i<emplist.size();i++){
                if(emplist.get(i).id==id){
                    emplist.remove(i);
                    System.out.println("Employee deleted ");
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Employee Id no found to delete");
            }
        }

        public void display(){
            System.out.println("Id : "+id);
            System.out.println("PASSWORD :"+pass);
            System.out.println("NAME : "+name);
            System.out.println("DEPARTMENT : "+dept);
            System.out.println("DESIGNATION : "+des);
            System.out.println("AGE: "+age);
            System.out.println("GENDER : "+gender);
            System.out.println("EMAIL : "+email);
            System.out.println("PHONE NUMBER : "+pnum);
            System.out.println("SALARY : "+salary);

        }

    }




