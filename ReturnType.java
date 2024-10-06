public class ReturnType {
 public static void main(String[] args) {

        boolean isNegative = isNegativeNumber(-10);
        System.out.println("Is the number negative: " + isNegative);

        byte smallValue = getSmallByte();
        System.out.println("Byte value: " + smallValue);

        int sum = addTwoIntegers(25, 75);
        System.out.println("Sum of two integers: " + sum);

        double temperature = getTemperatureInCelsius();
        System.out.println("Temperature in Celsius: " + temperature);

        float distance = getDistanceInKilometers();
        System.out.println("Distance in kilometers: " + distance);

        long population = getWorldPopulation();
        System.out.println("World population: " + population);

        char grade = getGrade();
        System.out.println("Grade: " + grade);

        String greeting = getGreetingMessage();
        System.out.println("Greeting message: " + greeting);
    }

    
    public static boolean isNegativeNumber(int number) {
        System.out.println("Checking if the number is negative");
        return number < 0;
    }

    
    public static byte getSmallByte() {
        System.out.println("Returning a byte value");
        byte value = 127; 
        return value;
    }

    
    public static int addTwoIntegers(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    
    public static double getTemperatureInCelsius() {
        System.out.println("Returning temperature value");
        double temperature = 36.6; 
        return temperature;
    }

    
    public static float getDistanceInKilometers() {
        System.out.println("Returning distance in kilometers");
        float distance = 10.5f; 
        return distance;
    }

    
    public static long getWorldPopulation() {
        System.out.println("Returning world population");
        long population = 8_000_000_000L; 
        return population;
    }

    
    public static char getGrade() {
        System.out.println("Returning a grade character");
        char grade = 'A'; 
        return grade;
    }

    
    public static String getGreetingMessage() {
        System.out.println("Returning greeting message");
        String message = "Hello, welcome to Java programming!";
        return message;
    }
}