//JAVA TUTORIAL!!!

// A method is a block of code which only runs when it is called.

// You can pass data, known as parameters, into a method.

// Methods are used to perform certain actions, and they are also known as functions.

// Why use methods? To reuse code: define the code once, and use it many times.

public class JavaTutorialMethods {
    public static void main(String[] args) {
        myThirdMethod();
    }

    //Scope
    static String classScope = "Hi, im with the class";
    
    static void myThirdMethod(){
        String methodScope = "Hi, Im local to the method";
        System.out.println(classScope);
        System.out.println(methodScope);
    }

    static void myFirstMethod(){
        System.out.println("hello world!");
        //System.out.println(methodScope);
    }

    // //using Parameters
    // static void mySecondedMethod(String name) {
    //     System.out.println(name + ", was the parameter!");
    //   }

    // //OverLoaded
    // static void mySecondedMethod(int x) {
    //     for(;x<10;++x){
    //         System.out.println("OVERLOADED");
    //     }
    //   }

    //   static void mySecondedMethod(Double x) {
    //     for(;x<10;++x){
    //         System.out.println("OVERLOADED");
    //     }
    //   }
    
    



  }