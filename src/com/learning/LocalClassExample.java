package com.learning;

/**
 * Created by  preeti on 3/27/22 at 7:32 PM.
 */
public class LocalClassExample {

    static String regularExpression = "[^0-9]";
    int a =1;


    public static void validatePhoneNumber(
            String phoneNumber1, String phoneNumber2) {
        int numberLength = 10;
        //static int numberLength = 10; //compiler error since scope of variable is inside the method block only
        // Valid in JDK 8 and later:
        // int numberLength = 10;

        class PhoneNumber {

            String formattedPhoneNumber = null;


           PhoneNumber(String phoneNumber){
                int anumberLength = 7;

                String currentNumber = phoneNumber.replaceAll(
                        regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }

            // Valid in JDK 8 and later:

//            public void printOriginalNumbers() {
//                System.out.println("Original numbers are " + phoneNumber1 +
//                    " and " + phoneNumber2);
//            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

        // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null)
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        LocalClassExample localClassExample = new LocalClassExample();
        localClassExample.validatePhoneNumber("123-456-7890", "");
    }
}
