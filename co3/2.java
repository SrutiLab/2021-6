
import java.util.Scanner;
class Person{
Scanner in = new Scanner(System.in);
String name;
 String gender;
String adress;
int age;

Person(int t){
System.out.println("enter name of "+t+ "person");
name=in.nextLine();
System.out.println("genter");
gender=in.nextLine();
System.out.println("address");
adress=in.nextLine();
System.out.println("age");
age=in.nextInt();}
}

class employee extends Person{
int id;
String email;
String companyname;
int salary;

employee(int b){
super(b);
System.out.println("email");
email=in.nextLine();
System.out.println("companyname");
companyname=in.nextLine();
System.out.println("salary");
salary=in.nextInt();
}
}

class teacher extends employee{
String subject;
String departement;
int teacherid;

teacher (int a){
super(a);
System.out.println("enter subject of teacher" );
subject=in.nextLine();
System.out.println("enter department of teacher" );
departement=in.nextLine();
System.out.println("enter teacher id of teacher ");
teacherid =in.nextInt(); }

}

class run{
public static void main(String[] A){
Scanner in1 = new Scanner(System.in);
System.out.println("number of teacher");
int n=in1.nextInt();

teacher t[] =new teacher[n];
for(int i=0;i<n;i++) t[i] = new teacher(i);
System.out.println(t[1].employee.companyname);
}
 


}

