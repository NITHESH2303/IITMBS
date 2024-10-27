import java.util.*;

// public class FClass{
//    public static void main(String[] arg){
//          System.out.println(Data.MAX);
//    }
// }

// public class FClass{
//     public static void main(String args[]){
//          A obj1 = new B(2.718);

//          A ptr1 = (A)obj1;
//          A ptr2 = (B)obj1;
//          B ptr3 = (B)obj1;

//          ptr1.show();
//          ptr2.show();
//          ptr3.show();
//     }
//  }

// public class FClass{
//     public static void main(String[] args){
//          Toppers t = new Toppers(30);
//          t.display();
//     }
// }

// public class Example{
//     public static void main(String args[]){
//             ArrayList<String> str=new ArrayList<String>();
//             str.add("Joker");
//             str.add("Locker");
//             for(String i:str){
//             System.out.println(i);
//             }
//     }
// }

// class A implements Runnable{
//     public void run(){
//               System.out.println("t2 thread");
//         }
// }
// public class Example{
//   public static void main(String args[]){
//           A obj=new A();
//           Thread t2=new Thread();
//           t2.start();
//           obj.run();
//           System.out.println("Hello");
//        }
// }

// public interface Statement{
//         abstract String display();
// }

// interface Areas{
//       void area(float a,float b);
// }
// class Triangle implements Areas{
//       public void area(float a,float b){
//              System.out.println("Triangle area is "+(0.5*a*b));
//       }
// }
// class Rect implements Areas{
//       public void area(float a,float b){
//              System.out.println("Rectangle area is "+(a*b));
//       }
// }
// public class Example{
//       public static void main(String[] args) {
//              Areas triangle=new Triangle();
//              Areas rectangle=new Rect();
//              triangle.area(1.3f,2.4f);
//              rectangle.area(5.4f,1.25f);
//       }
// }

// interface A{
//       public String getCoordinates();
// }
// interface B{
//       public String tellDirection();
// }
// public class C implements A,B {
//       public String getCoordinates(){
//             return "41 degrees, 56 minutes, 54.3732 seconds north.";
//       }
//       public String tellDirection(){
//             return "Start; Turn Left, walk: 100m.";
//       }
//       public static void main(String args[]){
//             System.out.println(new B().tellDirection());
//       }
// }

// interface A{
//       int a=0;
// }
// interface B{
//       int b=20;
// }
// class C implements B{
// }
// public class Example{
//       public static void main(String[] args) {
//            C oc=new C();
//            System.out.println(oc.b);
//       }
// }

// interface A{
//       int a=10;
// }
// interface B{
//       int b=20;
// }
// class C implements A,B{
// }
// public class Example{
//       @SuppressWarnings("static-access")
//       public static void main(String[] args){
//              C oc=new C();
//             //  oc.a=5;
//              System.out.println(oc.a);
//             //  oc.b=15;
//              System.out.println(oc.b);
//       }
// }

// interface Singable {
//     default void sing() {
//         System.out.println("Sings");
//     }

//     public void perform();
// }

// abstract class Musician implements Singable {
//     public void sing() {
//         System.out.println("Sings song");
//     }
// }

// class LeadSinger extends Musician {
//     public void perform() {
//         System.out.println("Leads group");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Singable obj1 = new LeadSinger(); // LINE 1
//         Musician obj2 = new LeadSinger();
//         obj2.sing();
//         obj2.perform(); // LINE 2
//     }
// }

// interface Iterator {
//     public boolean has_next();
//     public Object get_next();
// }

// abstract class Printable {
//     public abstract void print();
// }

// class BankAccount extends Printable {
//     private String accountName;
//     private double balance;

//     public BankAccount(String aN, double b) {
//         //initialize accountName and balance
//         this.accountName = aN;
//         this.balance = b;
//     }

//     public void print() {
//         System.out.println(accountName + "," + balance);
//     }
// }

// class BankAccountList {
//     private final int limit = 3;
//     private BankAccount[] list;

//     public BankAccountList(BankAccount[] accounts) {
//         this.list = accounts;
//     }

//     private class BankAccountIter implements Iterator {
//         private int indx;

//         public BankAccountIter() {
//             //constructor
//             this.indx = 0;
//         }

//         public boolean has_next() {
//             //if next element available in list return true; else false
//             return indx < list.length;
//         }

//         public Object get_next() {
//             //return next element from list
//             return list[indx++];
//         }
//     }

//     public Iterator getIterator() {
//         return new BankAccountIter();
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         BankAccount[] accounts = {
//             new BankAccount("Priya", 500),
//             new BankAccount("Ravi", 1000),
//             new BankAccount("Suresh", 1500)
//         };
//         BankAccountList bList = new BankAccountList(accounts);
//         Iterator iter = bList.getIterator();
//         while (iter.has_next()) {
//             ((BankAccount)iter.get_next()).print(); // LINE 1
//         }
//     }
// }


// class Coffee {
//     public void orderCoffee() {
//         CoffeeMaker m = new CoffeeMaker(this); // LINE 1
//         m.prepareCoffee();
//         System.out.println("Coffee served");
//     }

//     public void alarm() {
//         System.out.println("Collected coffee");
//     }
// }

// class CoffeeMaker {
//     Coffee c;

//     public CoffeeMaker(Coffee c) {
//         this.c = c;
//     }

//     public void prepareCoffee() {
//         System.out.println("Coffee prepared");
//         c.alarm(); // LINE 2
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Coffee c1 = new Coffee();
//         c1.orderCoffee();
//     }
// }
  
// interface Iterator {  
//     public boolean has_next();  
//     public Object get_next();  
// }  
  
// class Faculty {  
//     public class FacIter implements Iterator {  
//         public boolean has_next() {  
//             return false;  
//         }  
  
//         public Object get_next() {  
//             return null; // Placeholder for the actual implementation  
//         }  
//     }  
  
//     public Iterator getIterator() {  
//         return new FacIter();  
//     }  
// }  
  
// public class Test {  
//     public static void main(String[] args) {  
//         Faculty fList = new Faculty();  // Added line to obtain the iterator  
//         Iterator iter = fList.getIterator();
//         boolean hasNext = iter.has_next();
//     }  
// }

  
// class AsstDirector {  
//     String name;  
//     double salary;  
  
//     public AsstDirector(String name, double salary) {  
//         this.name = name;  
//         this.salary = salary;  
//     }  
  
//     public String toString() {  
//         return "name = " + name + " salary = " + salary + "";  
//     }  
// }  
  
// class Director extends AsstDirector {  
//     int asst_count;  
  
//     public Director(String n, AsstDirector a, int ac) {  
//         super(n, 1.5 * (a.salary));  
//         this.asst_count = ac;  
//     }  
  
//     public Director(Director d) {  
//         super(d.name, d.salary);  
//         this.asst_count = d.asst_count;  
//     }  
  
//     public String toString() {  
//         return super.toString() + " asst_count = " + asst_count;  
//     }  
// }  
  
// public class ConTest {  
//     public static void main(String args[]) {  
//         AsstDirector obj1 = new AsstDirector("ABC", 5000);  
//         AsstDirector obj2 = new Director("XYZ", obj1, 3);  
//         AsstDirector obj3 = new Director((Director) obj2);  
//         System.out.println(obj1);  
//         System.out.println(obj2);  
//         System.out.println(obj3);  
//     }  
// }


public class Student {  
    private String name;  
    private static String course;  
    private final int sems;  
  
    Student() {  
        name = null;  
        course = null;  
        sems = 8;  
    }  
  
    public String toString() {  
        return "name = " + name + ", course = " + course + ", sems = " + sems;  
    }  
  
    public static void main(String[] args) {  
        Student obj1 = new Student();  
        Student obj2 = new Student();  
        obj1.name = "ABC";  // Accessing private variable within the same class
        Student.course = "BTECH"; // LINE-1  
        obj2.name = "XYZ"; // LINE-2  
        System.out.println(obj1);  
        System.out.println(obj2);  
    }  
}

// class TestAccess {
//     public static void main(String[] args) {
//         Student student = new Student();
        
//         // Attempting to access the private variable 'name' directly
//         // This will cause a compilation error
//         student.name = "John";
        
//         // To show the error, you could use:
//         System.out.println(student.name); // This will also produce an error
//     }
// }