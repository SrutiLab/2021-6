import java.util.Scanner;
import java.util.Arrays;
class run{
 
public static void main(String[] arg){
Scanner in =new Scanner(System.in);
String a[] =new String[5];
String a2[] =new String[5];

System.out.println("enter 5 strings");
for(int i=0;i<5;i++) a[i]=in.nextLine();

a2=a;

Arrays.sort(a2);
System.out.println("sorted in alpabatic order");
for(int i=0;i<5;i++) System.out.println(a[i]);

System.out.println(" cddv");
System.out.println("string lengh");
String tmp;

for(int i=0;i<5;i++) for(int j=i+1;j<5;j++) if(a[i].length() < a[j].length()){ tmp=a[j]; a[j]=a[i]; a[i]=tmp; } 
 
for(int i=0;i<5;i++) System.out.println(a[i]);

}
}
