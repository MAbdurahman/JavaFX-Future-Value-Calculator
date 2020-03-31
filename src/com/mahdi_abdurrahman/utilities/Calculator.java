package com.mahdi_abdurrahman.utilities;

public class Calculator {
    //Instance Variables
    public static final int MONTHS_IN_YEAR = 12;

    /**
     * calculateFutureValue - calculates the future value
     * @param monthlyPayment - a double represents the monthly payment
     * @param yearlyInterestRate - a double represents the interest rate
     * @param years - an integer represents the number of years
     * @return double - returns a double representing the future value
     */
    public static double calculateFutureValue(double monthlyPayment,
                                              double yearlyInterestRate, int years) {
        int months = years * MONTHS_IN_YEAR;
        double monthlyInterestRate = yearlyInterestRate / MONTHS_IN_YEAR / 100;
        double futureValue = 0;

        for (int i = 1; i <= months; i++) {
            futureValue = (futureValue + monthlyPayment) * (1 + monthlyInterestRate);
        }

        return futureValue;

    }//end of the calculateFutureValue Method
}//end of the Calculator Class
