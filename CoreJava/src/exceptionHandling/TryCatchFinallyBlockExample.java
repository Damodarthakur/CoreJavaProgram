package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinallyBlockExample {
	
	public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("source.txt");
            file.read();
        }
        
        catch(FileNotFoundException e) {
        	System.out.println("this  exception block");
            e.printStackTrace();
            
        }
        catch(Exception e) {
        	System.out.println("hhh");
            e.printStackTrace();
        }
//        finally {
//            file.close();
//        }
    }

}
