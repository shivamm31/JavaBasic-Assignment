package Ques19;

public class Conversion {
    private static String[] lessThanTwenty = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
            "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tens = new String[]{"", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"};

    public String numberToWords(int number) {
        if(number == 0) {
            return "Zero";
        }
        return helper(number);
    }

    private String helper(int number) {
        StringBuilder result = new StringBuilder();
        if(number >= 1000000000) {
            result.append(helper(number/1000000000)).append(" Billion ").append(helper(number%1000000000));
        } else if(number >= 1000000) {
            result.append(helper(number/1000000)).append(" Million ").append(helper(number%1000000));
        } else if( number >= 1000 ) {
            result.append(helper(number/1000)).append(" Thousand ").append(helper(number%1000));
        } else if(number >= 100) {
            result.append(helper(number/100)).append(" Hundred ").append(helper(number%100));
        } else if(number >=20) {
            result.append(tens[number/10-1]).append(" ").append(helper(number%10));
        } else {
            result.append(lessThanTwenty[number]);
        }

        return result.toString().trim();
    }

}