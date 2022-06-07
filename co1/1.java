import java.util.Scanner;
class prodect{
float price;
int pcode;
String pname;
        
	prodect(){
        System.out.println("");

	Scanner sc= new Scanner(System.in);
	System.out.println("prodect name");
	pname =sc.nextLine();
	System.out.println("prodect price");
	price =sc.nextFloat();
        System.out.println("prodect id");
	pcode =sc.nextInt();
	
	}
}


class run{
	
public static void main(String[] st){
        Scanner sc= new Scanner(System.in);

        System.out.print("number of prodect");
	int n = sc.nextInt();
	prodect p[] = new prodect[n];

	for(int t=0;t<n;t++) p[t]=new prodect();
  	
        int tmp=1;
    
	for(int i=0;i<(n-1);i++) if(p[tmp].price > p[i+1].price) tmp=i+1;

	System.out.println("prodect with minimum price");
	System.out.print(p[tmp].pname);
	System.out.print("its price is  ");
	System.out.println(p[tmp].price);
        System.out.print(p[tmp].pcode);
	
			
	
}
}