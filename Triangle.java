package lesson_2;

public class Triangle 
{
    private Triangle()
    {
        // prevent user from creating Triangle object
    }
    
    public static boolean isATriangle(double sideA, double sideB, double sideC)
    {
        return  (sideA < sideB + sideC) && 
                (sideB < sideA + sideC) && 
                (sideC < sideA + sideB);
    }
    
}
