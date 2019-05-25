import java.util.Scanner;

public class moneyCollector
{
    public static void main(String[] args)
    {
        int bucket = 0;
        Scanner money = new Scanner(System.in);

        while(bucket<100) {
            int m = money.nextInt();
            bucket = bucket + m;
            System.out.println(bucket);

        }
        bucket++;
    }
}
