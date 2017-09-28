import java.util.Scanner;
public class main
{
    Scanner input;
    public void InputReader()
    {
     input = new Scanner(System.in); 
    }
    
    public String getInput()    
    {
    	System.out.print("> ");                // print prompt
        String inputLine = input.nextLine();
        return inputLine;
        
    }
}
