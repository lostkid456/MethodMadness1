public class JZhaoLib {

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

    public static int leastCommonMultiple(int num1, int num2, int num3) {
        int count = 1;
        for (int i = 2; i < Math.max(Math.max(num1, num2), num3); i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 == 0) {
                count = i * count;
            } else {
                return count;
            }
        }
        return count;
    }

    public static int stringUnion(String word1,String word2, String word3)
    {
        int count=0;
        for(int i=0;i<word1.length();i++) {
            if (word2.indexOf(word1.substring(i, i + 1)) != -1) ;
            {
                count += 1;
            }
        }
    }

    public static String vigCipher(String Message,String Key)
    {
        String Alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    }
}
