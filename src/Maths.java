import java.util.Map;

public class Maths {

    public static char[] operators = {'+','-','/','*','^','!',};

    public static boolean isLetterOrNumber(String number)
    {
        try
        {   //just to se if we can convert the number into a float
            //if we cant we know it is not a number
            float tester = Float.parseFloat(number);

            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    //
    public static String switchVariable(String eq, Map<String, Float> vars)
    {
        char[] chars = eq.toCharArray();
        String newString = "";
        for(char c : chars)
        {
                if(vars.containsKey(Character.toString(c)))
                {
                    newString+= Float.toString(vars.get(Character.toString(c)));
                }
                else newString+=c;

        }
        return newString;
    }

    public static boolean isOperator(String number)
    {
        char[] chars = number.toCharArray();
        char g;
        for(char ch:chars)
        {
            for(char c:operators)
            {
                if(ch==c)
                    return true;
            }
        }
        return false;
    }
    public static boolean isOperator(char number)
    {
        for(char c:operators)
        {
            if(number==c)
                return true;
        }
        return false;
    }
}
