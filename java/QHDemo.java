import java.util.Scanner;

class QHDemo
{
     public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       if(n<0)
      {
       System.out.println("����Ĳ���0~1000֮�������");
       }
       else if(n>=1000) 
      {
       System.out.println("����Ĳ���0~1000֮�������");
       }
       else
      {
         int i,j,k;
         i = n%10;n=n/10;
         j = n%10;n=n/10;
         k = n%10;n=n/10;
         System.out.println("�������ĸ�λ�����֮����:");
         System.out.println(i+j+k);
     }
   }
}