/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?
    // yes the parameter names are bad. The reason being that a,b,c,d make it the code harder to read.

    /**
     *Worked on the calculate method after class whith Vinnie.
     */
    public static CompoundingResult calculate(float initialDeposit, float monthlyContribution, int lengthInYears, float annualInterestRate){

        CompoundingResult result = new CompoundingResult(); // which constructor does this call?

        if (annualInterestRate < -100 || annualInterestRate > 100) {
            // Handle invalid interest rate
            return result;
        }

        float monthlyInterestRate = annualInterestRate / 100 / MONTHS_PER_YEAR;
        float totalMonths = lengthInYears * MONTHS_PER_YEAR;

        float accumulated = initialDeposit;
        for (int month = 0; month < totalMonths; month++) {
            accumulated += monthlyContribution;
            accumulated = (1 + monthlyInterestRate);
        }

        result.setInvested(initialDeposit + monthlyContribution * totalMonths);
        result.setAccumulated(accumulated);

        return result;
    }
}
