
public class Reverse {
    public int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
    public static void main(String[] args) {
        Reverse test=new Reverse();
        int a=test.reverse(54321);
        System.out.print(a);
    }
}
