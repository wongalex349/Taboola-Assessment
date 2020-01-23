public class question1and2 {
    public static int toInt(String word)
    {
        int x = 1;
        if(word.charAt(0) == '-')
        {
            x = x * -1;
            word = word.substring(1,word.length());
        }
        int ans = 0;
        for(int i = 0; i < word.length(); i++)
        {
            ans *= 10;
            ans = ans + (word.charAt(i) - 48);

        }
        ans = ans * x;
        return ans;
    }
    public static boolean hasInteger(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) > 47 && word.charAt(i) <= 57)
                return true;
        }
        return false;
    }
    public static void main(String arg[])
    {
        System.out.println(toInt("-123"));
        System.out.println(toInt("123"));
        System.out.println(toInt("0"));
        System.out.println(toInt("-1"));
        System.out.println(hasInteger("sa3fe"));
        System.out.println(hasInteger("safe"));
        System.out.println(hasInteger("sa:fe"));
        System.out.println(hasInteger("3safe"));
    }
}
