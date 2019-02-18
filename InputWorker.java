import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;


public class InputWorker 
{
    public static String readStringFromConsole()
    {
        return new Scanner(System.in).nextLine();
    }
    
    
    public static Double readDoubleFromConsole() throws InputMismatchException
    {
        String src = readStringFromConsole();
        
        /// bypass delimeter locales problems
        src = src.replaceFirst(",", ".");
        Scanner sc = new Scanner(src);
        sc.useLocale(Locale.UK);
        /// /// /// /// /// /// /// ///
        
        return sc.nextDouble();  
    }
    

    
    
}
