import java.util.Scanner;
class Employ{
Scanner in1 = new Scanner(System.in);
int id=0;
String name = "asas";
int wage =0;
void input(){
 System.out.println("id");
   id=in1.nextInt();
 System.out.println("name");
   name = in1.next();
 System.out.println("wage");
   wage =in1.nextInt(); }

void output(){
     System.out.println(id);
     System.out.println(name);
     System.out.println(wage);}
}
class run{
public static void main (String[] A){
System.out.println("number of employe");
Scanner in = new Scanner(System.in);
int n =in.nextInt();
	Employ e[] =new Employ[n];
for(int i=0; i<n ;i++) {System.out.println("input "+i+" employ details");

e[i]=new Employ(); e[i].input();

}System.out.println("out puting employee detail");
for(int i=0; i<n ;i++)  {System.out.println("input "+i+" employ details");e[i].output();}
}
}