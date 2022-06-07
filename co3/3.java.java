
interface A{
float aria(float n);
float perimeter(float c,float b);



}


class rectangle implements A{

public float perimeter(float a,float b){
return(2*(a+b));
}

public float aria(float a){
 return(a*a);
}

}


class circle implements A {

public float perimeter(float a,float b){ return 2*(3*a); }

public float aria(float a){ return (float)3.14*a*a ;}
}



class run {
public static void main (String[] a){
rectangle r = new rectangle(); 
circle c= new circle();
System.out.println(r.aria(20));
System.out.println(c.aria(20));
System.out.println(c.perimeter(20,40));
System.out.println(r.perimeter(20,40));

}}