import java.util.Scanner;


class Demo2
{
     public static void main(String[] args)
      {
           Scanner input = new Scanner(System.in);
           int n = input.nextInt();
           if(n<4)
           System.out.println("�����������4~7֮��:");
           else if(n>7)
           System.out.println("�����������4~7֮��:");
           else
           {
             
              System.out.println(n%2);
              n = n/2;
              System.out.println(n%2);
              n = n/2;
              System.out.println(n%2);
             // n = n/10;
              
           }
       }
}