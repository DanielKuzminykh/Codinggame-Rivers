import java.util.Scanner;

public class reka
{

    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in );
        long r1 = in.nextLong();
        long r2 = in.nextLong();
        long sum1 = 0;
        long sum2 = 0;
        while(r1 != r2)
        {
            sum1=0;
            sum2=0;
            long r1copy = r1;
            long r2copy = r2;
            if (r1 < r2)
            {

                while (r1copy > 0)
                {
                    sum1 = r1copy % 10 + sum1;
                    r1copy = r1copy / 10;
                }
                r1 = r1 + sum1;
            }
            else if (r1 > r2)
            {
                while (r2copy > 0)
                {
                    sum2 = r2copy % 10 + sum2;
                    r2copy = r2copy / 10;
                }
                r2 = r2 + sum2;
            }
        }
        System.out.println(r1);
    }
}
