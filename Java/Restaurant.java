// public class B extends A{
//     public double e;

//     public B(double num){
//          e = num;
//     }
//     public void show(){
//           System.out.println("e = "+e);
//     }
//  }

// class B extends A{
//     public void display(String s){
//            super.display();
//            System.out.println(s);
//     }
// }

// public abstract class AbstractTest{
//         public static void main(String args[]) {
//                 System.out.println("Testing abstraction...");
//         }
//         abstract void getValue();
//         void setValue(){}
// }

// public class Toppers extends Student{
//     public int marks;

//     public Toppers(int marks){
//         this.marks = marks;
//     }

//     public void display() {
//         super.display();
//         System.out.println("marks:"+marks);
//     }
// }  

// abstract class Car{
//     abstract boolean isSedan();
// }

// public class Fibo{
//     int fibonacci(int x){
//          int a=0, b=1, c=0;
//          for(int i=1;i<=x-2;i++){
//              c=a+b;
//              a=b;
//              b=c;
//          }
//          return c;
//     }
// }

// public class B implements A{
//     public String stop(){
//           return "Break Pressed.";
//     }
//     public static void main(String args[]){
//           //Invoke the method here
//          System.out.println(new B().goAhead());
//     }
// }

class Restaurant {
      String[] arr;

      Restaurant(String[] a) {
            arr = a;
      }

      public class Producer {
            String[] buffer;
            Consumer obj;

            Producer() {
                  buffer = arr;
            }

            public void produce() {
                  if (buffer[0] == null) {
                        System.out.println("Consumer has finished consuming");
                        return;
                  }
                  buffer = new String[5];
                  for (int i = 0; i < buffer.length; i++) {
                        buffer[i] = "Item" + (i + 1);
                  }
                  System.out.println("Producer has finished producing");
                  new Consumer().consume(buffer);
            }
      }

      public class Consumer {
            public void consume(String[] buffer) {
                  for (int i = 0; i < buffer.length; i++) {
                        buffer[i] = null;
                  }
                  new Producer().produce();
            }
      }
}
