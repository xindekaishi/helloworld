import java.util.Scanner;


class Demo
{
     public static void main(String[] args)
      {
           Scanner input = new Scanner(System.in);
           int n = input.nextInt();
           if(n<100)
           System.out.println("�����������100~999֮��:");
           else if(n>999)
           System.out.println("�����������100~999֮��:");
           else
           {
              int i,j,k;
              i = n%10;System.out.println(i);
              n = n/10;
              j = n%10;System.out.println(j);
              n = n/10;
              k = n%10;System.out.println(k);
             // n = n/10;
              
           }
       }
}