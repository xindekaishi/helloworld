class FuShuIndexException extends RuntimeException
{
      FuShuIndexException()
      {}
      FuShuIndexException(String msg)
      {
          super(msg);
       }
}


   class Demo
{
      public int method(int[] arr,int index)//throws FuShuIndexException
      {
              if(arr==null)
                
                throw new NullPointerException("��������ò���Ϊ��");

               if(index>=arr.length)
              {
                 throw  new ArrayIndexOutOfBoundsException("����Ľű�Խ����!");
               }

               if(index<0)
               {
                  throw new FuShuIndexException("����Ľű겻��Ϊ����!");
                }

               
                  

             return arr[index];
       }
}

class  ExceptionDemo2
{
       public static void main(String[] args)//throws FuShuIndexException
       {
            int[] arr = new int[3];
      
            Demo d = new Demo();
           int num = d.method(arr ,-30);
      //     System.out.println("num="+num);
      //     System.out.println("over");
         }
}