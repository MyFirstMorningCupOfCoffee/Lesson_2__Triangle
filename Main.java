import java.util.InputMismatchException;
import static OutputWorker.printlnToConsole;
import static OutputWorker.printToConsole;
import static InputWorker.readDoubleFromConsole;

public class Main 
{

    public static void main(String[] args) 
    {
        testTriangle();
    }
    
    public static void testTriangle()
    {
        printlnToConsole(
                "", "*** Triangle Checker by \"Miserable hobos Inc\" ***",
                "", "Greetings! This program can help you to check if triangle",
                "with given sides lengths can exist.", "");
        
        double sideA, sideB, sideC;
        
        try
        {
            printToConsole("Please, input side 1 length: ");
            sideA = readDoubleFromConsole();
            
            printToConsole("Please, input side 2 length: ");
            sideB = readDoubleFromConsole();
            
            printToConsole("Please, input side 3 length: ");
            sideC = readDoubleFromConsole();
        }
        catch(InputMismatchException ex)
        {
            printlnToConsole("", "Wrong parameter was given", "-> program will be terminated...");
            return;
        }
        
        if( Triangle.isATriangle(sideA, sideB, sideC) )
        {
            printlnToConsole("", "Congratulations!", "Triangle with given sides indeed can exist!");
        }
        else
        {
            printlnToConsole("", "Whoops!", "Triangle with given sides can NOT exist!", ":(");
        }

    }

}
