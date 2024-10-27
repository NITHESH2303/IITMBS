// public class A{
//     public float g;

//     public A(){
//         g = 9.8f;
//     }
// public void show(){
//          System.out.println("g = "+g);
//     }
// }

// public class A {
//      public void display(){
//             System.out.print("Hii ");
//      }
// }

// public class Student{
//      public String sname;
//      public String sid;
//      public int sclass;

//      public Student(){}

//      public Student(String s_name,String s_id, int s_class){
//           this.sname = s_name;
//           this.sid =s_id;
//           this.sclass = s_class;
//      }
//      public void display() {
//           System.out.println("name:"+sname);
//           System.out.println("id:"+sid);
//           System.out.println("class:"+sclass);
//      }
// }
// abstract class Car{
//       abstract boolean isSedan();
//   }

// public class Alto extends Car{
//      public boolean isSedan(){
//            return false;
//      }
//      public static void main(String[] args){
//            Car car = (Car)new Alto();
//            System.out.println(car.isSedan());
//      } 
// }

// abstract class NewYear {
//       abstract String resolution();
// }
// public class Year_2022 extends NewYear{
//       public String resolution() {
//             return "Walk up early"+"\n"+"Do exercise"+"\n"+"Take shower everyday";
//       }
//       public static void main(String args[]) {
//             System.out.print(new Year_2022().resolution());
//       }
// }

// abstract class Arithmetic{
//       Arithmetic(){
//           System.out.println("Basic operators in Mathematics: "); 
//       }
//       abstract String operations();
// }
// public class Algebra extends Arithmetic{
//       public String operations(){
//             return "+, -, x, %";
//       }
//       public static void main(String args[]){
//             System.out.println(new Algebra().operations());
//       }
// }

// public class Example extends Fibo implements Statement{
//       public String display(){
//             return "The required fibonacci number is:";
//             }
//       public static void main(String args[]){
//             System.out.println(new Example().display()+" "+new Fibo().fibonacci(7));
//             }
// }

// public interface A{
//       default String goAhead(){
//           return "Started.";
//       }
//       abstract String stop();
// }

// interface Summable {
//     public Object twoSum(Object o1);
// }

// abstract class Printable implements Summable {
//     public abstract void print();
// }

// class ComplexNumber extends Printable {
//     double x, y;

//     public ComplexNumber() {
//     }

//     public ComplexNumber(double n1, double n2) {
//         x = n1;
//         y = n2;
//     }

//     // ------- CODE BLOCK
//     public ComplexNumber twoSum(Object obj){
//         ComplexNumber c = new ComplexNumber(this.x, this.y);
//         if(obj instanceof ComplexNumber){
//             ComplexNumber c1 = (ComplexNumber)obj;
//             c.x = c.x + c1.x;
//             c.y = c.y + c1.y;
//         }
//         return c;
//     }

//     public void print() {
//         System.out.println(x + "+i" + y);
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         ComplexNumber c = new ComplexNumber();
//         ComplexNumber c1 = new ComplexNumber(4, 3);
//         ComplexNumber c2 = new ComplexNumber(2.3, 4.5);
//         c = c1.twoSum(c2);
//         c.print();
//     }
// }

// public class Test {
//     public static void main(String args[]) {
//         String[] buffer = { "Item 0" };
//         Restaurant obj = new Restaurant(buffer);
//         Restaurant.Producer p = obj.new Producer();
//         p.produce();
//     }
// }

public class Test {
    public static int x = 20;

    public static void fun(int arr[], int[] x) {
        while (x[0] > arr.length) {
            x[0] = x[0] / 2;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = x[0];
        }
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 5, 7, 11 };
        int[] x = {100};

        fun(a, x);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(x[0]);
    }
}
