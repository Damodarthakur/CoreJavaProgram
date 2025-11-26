package Test;


public class CGI
{
     int a;
     CGI(int a)
     {
         a=a;
     }
    public static void main(String[] args) {
    	CGI obj= new CGI(10);
        System.out.println(obj.a);
    }
}
