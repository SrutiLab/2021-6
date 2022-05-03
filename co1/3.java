
class complex{
    int real;
    int img;
    complex(int a,int b){ real =a; img=b;}
  
}



class run{

   public static complex sum(complex a,complex b){
    
    complex r=new complex(0,0);
    r.real=a.real+b.real;
    r.img=b.img+a.img;
    return r;
    
    }
         	public static void  main(String p[]){
         complex c1 =new complex(1,2);
         complex c2 =new complex(2,3);
         
            complex sum = sum(c1,c2);
            
            System.out.println(sum.real +"+"+ sum.img+"i");
          
            
           

        
	}}
