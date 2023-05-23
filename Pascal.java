package telusko.day1;

import java.util.*;

public class Pascal {
	
	private static Map<Integer, Integer> cahce = new HashMap<>();
	
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        
        if(cahce.containsKey(i))
        	return cahce.get(i);
        
        int result = i * factorial(i - 1);
        cahce.put(i, result);
        return result;
    }
    public static void main(String[] args)
    {
        int n = 5, i, j;
        
        Pascal g = new Pascal();
        
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                //Left Spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                System.out.print(
                    " "
                    + g.factorial(i)/(g.factorial(i - j)* g.factorial(j))  );
            }
            //New Line
            System.out.println();
        }
    }
}