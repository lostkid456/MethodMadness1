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
        for (int i = 2; i < num1 * num2 * num3; i++) {
            for (int z = 2; z < num1 * num2 * num3; z++) {
                for (int x = 2; x < num1 * num2 * num3; x++) {
                    if (num1 * x == num2 * i && num1 * x == num3 * z) {
                        return (num1 * x);
                    } else {
                        return num1 * num2 * num3;
                    }
                }
            }
        }
    }

    public static int stringUnion(String word1,String word2, String word3)
    {
        int count=0;
        for(int i=0;i<Math.max(Math.max(word1.length(),word2.length()),word3.length());i++) {
            if (word2.indexOf(word1.substring(i, i + 1)) != -1) ;
            {
                count += 1;
                if (word3.indexOf(word2.substring(i,i+1)) !=-1)
                {
                    count +=1;
                } else {
                    return count;
                }
            }
        }
    }

    public static String vigCipher(String Message,String Key)
    {
        String Alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ecrypt="";
        for(int i=0; i<Message.length(); i++)
        {
            ecrypt=Message.substring(Alpha.indexOf(Key.substring(i,i+1));
        }

    }
}
