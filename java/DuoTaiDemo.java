abstract class Animal
{
    abstract void eat();
}

class Dog extends Animal
{
     void eat()
     {
          System.out.println("�й�ͷ");
      }
     void lookHome()
      {
           System.out.println("���� ");
       }
}

class Cat extends Animal
{
      void eat()
      {
           System.out.println("����");
       }
       void catchMouse()
       {
            System.out.println("ץ����");
        }
}

class Pig extends Animal
{
       void eat()
       {
            System.out.println("����");
        }
        void gongDi()
        {
             System.out.println("����");
         }
}


class DuoTaiDemo
{
     public static void main(String[] args)
     {
          Cat c = new Cat();
          Dog d = new Dog();
          method(c);
          method(d);
          method(new Pig());
      }

      public static void method(Animal a)
      {
           a.eat();
       }
}
      