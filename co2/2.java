import java.util.Scanner;

class run{

public static void main(String[] a){
Scanner in = new Scanner(System.in);
System.out.println("input string to compaire");
String str = null;
try{ str =in.nextLine();}
catch(Exception e){System.out.println("input string");}
System.out.println(str.hashCode());
System.out.println(str.length());
System.out.println(str.replace("a","x"));
System.out.println(str.toLowerCase());
System.out.println(str.concat(" new string added"));	
System.out.println(str.trim());	

         }
}  