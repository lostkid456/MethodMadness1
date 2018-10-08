public class JZhaoLib {


    /**
     * Finds the solutions of a quadratic equation ax^2+bx+c
     * @param a the a-value for ax^2
     * @param b the b-value for bx
     * @param c the c-value for c
     * @return the solution
     */
    public static String quadSolver(double a, double b, double c) {

        if (((b * b) - (4 * a * c)) < 0) {
            String e = ("The root is imaginary because the discriminant is imaginary.");
            return e;
        } else {
            double z = ((b * -1) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            double x = ((b * -1) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            String u = Double.toString(z);
            String y = Double.toString(x);
            return u + ", " + y;
        }
    }

    /**
     * Finds the least common multiple of 3 numbers
     * @param num1 The first number
     * @param num2 The second number
     * @param num3 The third number
     * @return the least common multiple
     */
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int lcm=0;
        for(int i=2;i<num1*num2*num3;i++)
        {
            if(i%num1==0&&i%num2==0&&i%num3==0)
            {
                lcm=i;
                break;
            }

        }
        return lcm;
    }

    /**
     * Finds the sum of numbers from 0 to the chosen number
     * @param n the number you want to find the sum of from 0 to that value
     * @return the sum
     */
    public static int sumTo(int n)
    {
        int sum=0;
        for(int i=0; i<=n; i++)
        {
            sum+=i;
        }
        return sum;
    }

    /**
     * prints the numbers 1 - num1, replace multiples of 3 with “foo”, multiples of 5 with “bar”, and multiples of 3 and 5 with baz
     * @param num1 the number you enter
     */
    public static void fooBarBaz(int num1 )
    {
        for(int i=1;i<=num1;i++)
        {
            if(i%5!=0&&i%3!=0)
            {
                System.out.println(i);
            } else if(i%5==0&&i%3!=0)
            {
                System.out.println("bar");
            } else if(i%5!=0&&i%3==0)
            {
                System.out.println("bar");
            } else {
                System.out.println("baz");
            }
        }

    }

    /**
     *  Returns mainStr with the first occurrence of subStr removed
     * @param mainStr  The Main String you want
     * @param subStr the substring that you want to remove from the Main String
     * @return The main string with substring removes
     */
    public static String cutOut(String mainStr,String subStr)
    {
        String z="";
        String x=mainStr.substring(0,mainStr.indexOf(subStr));
        String y=mainStr.substring(mainStr.indexOf(subStr)+subStr.length(),mainStr.length());
        z=x+y;
        return z;
    }



}