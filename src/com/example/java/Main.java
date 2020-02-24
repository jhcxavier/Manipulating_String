package com.example.java;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Welcome");
//        sb.append(" to Florida");
//        sb.toString();
//        String result = sb.toString();
//        System.out.println(result);
        StringBuilder b = new StringBuilder();
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter Value 1: ");
        String input1 = scanner1.nextLine();

        System.out.print("Enter Value 2: ");
        String input2 = scanner1.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);


        System.out.println(b.toString());

        // ____________________________________________________
        // Compare Strings in Java
        String s1 = "Hello";
        String s2 = "Hello";

//       Remember that strings are objects, not primitives. So the variables are references to those objects.
//       They refer to an object in memory. When you assign a string like this using a literal,
//       the runtime looks up that value in a table it maintains in memory.
//       If it finds an existing object that represents that same string value, it assigns the new variable as a reference to that object.
//       And so it saves an object. If it's a value that isn't already stored somewhere, then a new object is created.
        if(s1 == s2){
            System.out.println("They match");
        }else{
            System.out.println("They don't match");
        }

        String s3 = new String("Hello");
        String s4 = new String("HELLO");
//        When you use the standard object creation syntax though, as I'm doing in the second example,
//        you're forcing the creation of a new reference variable.
//        Even though the two values match, the two variables aren't pointing to the same object.

        if(s3 == s4){
            System.out.println("They match");
        }else{
            System.out.println("They don't match");
        }
//        The correct way of comparing Strings in Java is using the equals method
//        The two values match. You may have noticed, that there's also a method that allows you to do a case insensitive comparison.
        if(s3.equalsIgnoreCase(s4)){
            System.out.println("They match");
        }else{
            System.out.println("They don't match");
        }

// ________________________________________________________________________________________________________
// FORMAT NUMERIC VALUES AS A STRING 
        double doubleValue = 1_234_567.89;

//     Get a number with commas separating the digits before the period,
//     and a period representing the decimal value.
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.format(doubleValue));

//      With the number instance of the formatter, I get the entire value. But with the integer formatter instance,
//      the fractional value is lost. And notice that it's rounding up.
        NumberFormat intFormat = NumberFormat.getIntegerInstance();
        System.out.println(intFormat.format(doubleValue));

//      To get rid of those separator characters
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(doubleValue));

//      The use of commas and periods is different in different countries.
//      And you can control this using something called a locale object.
//      A locale represents a particular language in a particular country.
//      There are a few different versions of this, I'm going to use the version that takes two arguments.
//      For a language and a country. These are both strings. The first string is in lowercase. I'll type in de for German,
//      and then for the country, I'll put in DE all uppercase, and that's for Germany.
        Locale locale = new Locale("de", "DE");
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(doubleValue));

//      Get reference with NumberFormat.getCurrencyinstance.
//      I'll make a copy of that bit of code and use the currency format object and in my locale,
//      in the United States where I am, I get the dollar sign at the beginning,
//      commas for the separators, and the dot for the decimal
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(doubleValue));

        DecimalFormat df = new DecimalFormat("$000.00");
        System.out.println(df.format(1));

        DecimalFormat df2 = new DecimalFormat("$#0.00##");
        System.out.println(df2.format(5.754));

        // ============================================================
        // Simple Counter
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value 1: ");
        String input11 = scanner.nextLine();
        int i = Integer.parseInt(input11);

        System.out.println("Enter value 2: ");
        String input22 = scanner.nextLine();
        int i2 = Integer.parseInt(input22);

        int result = i + i2;
        System.out.println(result);

        // ============================================================
        // Starting Conditional

        int monthNumber = 6;

        if (monthNumber >= 0 && monthNumber <= 2){
            System.out.println("It's the first Quarter");
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("It's the second Quarter");
        } else {
            System.out.println("You are in the second half of the year");
        }
    }
}
