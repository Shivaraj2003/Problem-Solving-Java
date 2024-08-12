import java.util.Scanner;

class distinctDigits{

    static int distinct(int n1, int n2)
    {
        int count = 0;

        for(int i = n1; i<=n2; i++)
        {
            int temp = i;
            boolean visited[] = new boolean[10];

            while(temp!=0){

            if(visited[temp%10] == true)
            {
                break;
            }
            visited[temp%10] = true;
            temp/=10;
            }
    if(temp == 0)
        count++;

        }
        return count;
    }

    public static void main(String args[])
    {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower limit");
        n1 = sc.nextInt();

        System.out.println("Enter upper limit");
        n2 = sc.nextInt();

        System.out.println("Total numbers with distinct digits:" + distinct(n1,n2));
    }
}