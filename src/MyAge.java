import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

 
public class MyAge {
    
    public static void main(String[] args) throws Exception{
    	
   
    Scanner scanner = new Scanner(System.in);
    
    Date date = new Date();
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	Calendar c = new GregorianCalendar();
		
	System.out.println(" Enter your Birthday Below");
	String input_bday = scanner.nextLine();
	Date bday = format.parse(input_bday);
	
	int y = c.get(Calendar.YEAR);
	c.setTime(bday);
	int by = c.get(Calendar.YEAR);
	

	int age = y - by;
	System.out.println("My Age is " + age);

    if ( age>17 ) {
    	System.out.print(" You may Pass to the Sacred Log In Page.");
    	}
    if ( age<18 ) {
    		System.out.print("Don't Even Think about it. Shoo!");
    		}
    	
   
    
    
    }
}
