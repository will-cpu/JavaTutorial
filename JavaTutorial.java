//Java Tutorial

public class JavaTutorial {
  
  // Every line of code that runs in Java must be inside a class.
  // In our example, we named the class JavaTutorial. A class should always start 
  // with an uppercase first letter.
  // Note: Java is case-sensitive: "JavaTutorial" and "javaTutorial"
  // has different meaning.
  // The name of the java file must match the class name.

  //Also, The class name and the file name must match!!
  public static void main(String[] args) {
    /*  
    System.out.println("Hello World");

      
      // Data types are divided into two groups:

      // Primitive data types - includes 
        // byte, short, int, long, float, double, boolean and char
      // Non-primitive data types -
        // such as String, Arrays and Classes 
        
      // String - stores text, such as "Hello". String 
      //values are surrounded by double quotes

      String dog = "Bob";

      // int - stores integers (whole numbers), without decimals,
      // such as 123 or -123
      
      int age = 100;

      age = 22;

      System.out.println(age);

      // float - stores floating point numbers, with decimals,
      // such as 19.99 or -19.99
      
      float balance = 100.01f;
      double purchase = 15.99;

      System.out.println(balance - purchase);

      // char - stores single characters, such as 'a' or 'B'.
      // Char values are surrounded by single quotes
      
      char firstInital = 'B';
      
      // boolean - stores values with two states: true or false
    
      boolean frozen = false;

      // byte	1 byte	Stores whole numbers from -128 to 127
      // short	2 bytes	Stores whole numbers from -32,768 to 32,767
      // int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
      // long	8 bytes	Stores whole numbers from
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
      // float	4 bytes	Stores fractional numbers. 
        //Sufficient for storing 6 to 7 decimal digits
      // double	8 bytes	Stores fractional numbers. 
        //Sufficient for storing 15 decimal digits
      // boolean	1 bit	Stores true or false values
      // char	2 bytes	Stores a single character/letter or ASCII values
      
      
      //--------------------------------------
      //Mathmatical Operators
      //--------------------------------------
      */
      /*
      double x = 10;
      double y = 5;

      double total = (int)x + (int)y;

      System.out.println("Addition: x+y = "+ total );

      total = (int)x - (int)y;
      System.out.println("Subtraction: x-y = "+ total );

      total = (int)x * (int)y;
      System.out.println("Multiply: x*y = "+ total );

      total = x / y;
      System.out.println("Division: x/y = "+ total );

      total = ++x;
      System.out.println("Increment: ++x = " + total);
      
      total = --x;
      System.out.println("Decrement: --x = " + total);
      */

      //----------------------------
      //Assignment Operators
      //----------------------------

      /*
        int x = 9;
          	
        x += 3;	//x = x + 3
        System.out.println("x += 3 : "+ x);
        
        x -= 3;	//x = x - 3	
        System.out.println("x -= 3 : "+ x);

        x *= 3;	//x = x * 3
        System.out.println("x *= 3 : "+ x);

        x /= 3;	//x = x / 3
        System.out.println("x /= 3 : "+ x);

        x %= 3;	//x = x % 3	
        System.out.println("x %= 3 : "+ x);
      */

      //----------------------------
      //Comparision Operators && Logical Operators
      //----------------------------
      /*
      // Equal to	x == y	
      // Not equal	x != y	
      // Greater than	x > y	
      // Less than	x < y	
      // Greater than or equal to	x >= y	
      // Less than or equal to	x <= y

      
      int x = 10;
      int y = 15;

      // && 	Logical and
      // || 	Logical or
      // !	  Logical not

      System.out.println((x > y));
      System.out.println((x > y) || (x < 100));
      
      */
      //----------------------------
      //If Statement
      //----------------------------

      /*
      int big = 214;
      int small = 214;

      if(big > small){
        System.out.println(big + "is greater than" + small);
      }else if(big == small){
        System.out.println(big + "is equal to" + small);
      }else{
        System.out.println(big + "is smaller than" + small);
      }
      
      */
      //----------------------------
      //Switch Statement
      //----------------------------

      /*
      int hour = 1800;
      switch (hour) {
        case 1200:
          System.out.println("Noon");
          break;
        case 1800:
          System.out.println("Dinner Time");
          break;
        default:
          System.out.println("The hour is " + hour);
        }
        
        */
        //----------------------------
        //While Loop
        //----------------------------

        /*
        int i = 0;
        while (i < 5) {
          System.out.println(i);
          i++;
        }
        */

        //----------------------------
        //For Loop
        //----------------------------

        /*
        for (int count = 5; count <= 10; count = count + 3) {
          System.out.println(count);
          for(int i = 0; i < 5; i++){
            System.out.println("Boom!");
          }
        }
        */

        //----------------------------
        //Array
        //----------------------------

        
        int[] myNum = {10, 20, 30, 40};

        System.out.println(myNum[0]);

        for(int num : myNum){
          System.out.println(num);
        }
        

    }
  }