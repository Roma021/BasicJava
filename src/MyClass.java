
 // Create Class
/*public class MyClass {
    int x = 5;

    // Create an Object
     public static void main(String [] args) {
         MyClass myObj1 = new MyClass();
         MyClass myObj2 = new MyClass();

         System.out.println(myObj1.x);
         System.out.println(myObj2.x); */

 /*public class MyClass {
     String fname = "John";
     String lname = "Doe";
     int age = 24;

     public static void main(String[] args) {
         MyClass myObj = new MyClass();
         System.out.println("Name: " + myObj.fname + " " + myObj.lname);
         System.out.println("Age: " + myObj.age);*/

/* public class MyClass {
            // Create Method
        static void myMethod() {
            System.out.println("Hello world! ");
     }
           // Call method in Main
     public static void main(String [] args) {
           myMethod();*/
       /* public class MyClass {
            public void fullThrotle() {
                System.out.println("The car can go as fast as it can!");
                }
                public void speed(int maxSpeed){
                    System.out.println("Max speed is: " + maxSpeed);
                }
                public static void main(String [] args) {
                MyClass myObjt = new MyClass();
                myObjt.fullThrotle();
                myObjt.speed(180);*/

     /*  public class MyClass {
           int x;

           public MyClass() {
            x=5;
            }

            public static void main(String [] args) {
               MyClass myObj = new MyClass();
        System.out.println(myObj.x); */

     public class MyClass {
         int modelYear;
         String modelName;

         public MyClass (int year, String name) {
            modelYear = year;
            modelName = name;
    }
    public static void main(String [] args) {
             MyClass myCar = new MyClass(1969 , "Toyota");
        System.out.println(myCar.modelYear + "\t" + myCar.modelName);
    }
 }



