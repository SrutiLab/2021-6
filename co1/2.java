import java.util.Scanner;
class run{
         	public static void  main(String p[]){
         	
         	Scanner in=new Scanner(System.in);
         	System.out.println(" ");
         	System.out.println("first matrix");
         	System.out.println("number of rows is first matrix");
            int r1=in.nextInt();            
            System.out.println("number of colms is first matrix");
            int c1=in.nextInt();
            
          
            
           
         	System.out.println(" ");
         	System.out.println("second matrix");
         	System.out.println("number of rows is second matrix");
            int r2=in.nextInt();            
            System.out.println("number of colms is second matrix");
            int c2=in.nextInt();
            
        int r3=r1;
		int c3=c1;
		if(r2>r1) r3=r2;
		if(c2>c1) c3=c2;
		int mx1[][]=new int[r3][c3];
		int mx2[][]=new int[r3][c3];
		int mx3[][]=new int[r3][c3];
    
            
        System.out.println(" enter elements of first matrix ");
		for(int i=0;i<r1;i++){ System.out.println("elements of "+i+" row");
		for(int j=0;j<c1;j++) mx1[i][j]=in.nextInt();   
		}System.out.println(" ");
		
		 System.out.println(" enter elements of second matrix ");
		for(int i=0;i<r2;i++){ System.out.println("elements of "+i+" row");
		for(int j=0;j<c2;j++) mx2[i][j]=in.nextInt();   
		}System.out.println(" ");
		
		
		System.out.println(" printing elements of first matrix ");
		for(int i=0;i<r1;i++){ System.out.print(" | ");
		for(int j=0;j<c1;j++) System.out.print(" , "+mx1[i][j]+" ");
		System.out.println(" | ");}System.out.println(" ");
		
		System.out.println(" printing elements of second matrix ");
		for(int i=0;i<r2;i++){ System.out.print(" | ");
		for(int j=0;j<c2;j++) System.out.print(" , "+mx2[i][j]+" ");
		System.out.println(" | ");}System.out.println(" ");

		
		for(int i=0;i<r3;i++) for(int j=0;j<c3;j++) mx3[i][j] = mx2[i][j]+mx1[i][j]; 
		
		System.out.println(" printing elements of added matrix ");
		for(int i=0;i<r3;i++){ System.out.print(" | ");
		for(int j=0;j<c3;j++) System.out.print(" , "+mx3[i][j]+" ");
		System.out.println(" | ");}System.out.println(" ");
		

        
	}}
