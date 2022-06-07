class shape{
float aria(float a,float b){ return a*b; }
float aria(float a){ return a*a; }
}

class run{
public static void main (String[] A){
shape s= new shape();
System.out.println(s.aria(10,30));
System.out.println(s.aria(20));
                                    }
}