import java.util.Scanner;

/**
 * livehack 3 practice 
 * @author Joshua Chan
 *
 */

// Basic Java Program

public class Main {
    public static void main(String[] args) {
        // make test calls to your methods here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sequence of letters: ");
        String inputStr = scanner.nextLine();

        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        String repeatedEnd = repeatEnd(inputStr, n);
        System.out.println("Result: " + repeatedEnd);

        scanner.close();
    }

    /**
     * 
     * @param you is your stlye rating
     * @param date is your dates style rating 
     * @return depending on you and your date's style rating, it will return a number from 0 - 2
     */

    public static int dateFashion(int you, int date) {
        if (you > 2 && date > 2) {
            if (you >= 8 || date >= 8) {
                return 2;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param a is the first int
     * @param b is the second int
     * @return returns the sum of the two integers, but if the sum is 10 or 19, it returns 20
     */
    public static int sortaSum(int a, int b) {
        
        if ((a + b) >= 10 && (a + b) <= 19) {
            return 20;
        } else {
            return (a + b);
        }
    } 
    
    /**
     * 
     * @param n the integer that is being determined to be within 10
     * @param outsideMode if you are allowed to go outside the 1 - 10 range
     * @return returns true or false depending on if the number is within 1 - 10 when outsideMode is false
     */
    public static boolean in1To10(int n, boolean outsideMode) {
        
        if (outsideMode == false) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10 ) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 
     * @param n the integer that is being examined 
     * @return true is the number is a multiple of 3 or 5 but not both
     */
    public static boolean old35(int n) {
        if (n%3 == 0 && n%5 == 0) {
            return false;
        } else if (n%3 == 0 || n%5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param a age of the first person
     * @param b age of the second person
     * @return the sum of the 2 ages unless one age is in the teens, then it returns 19
     */
    public static int teenSum(int a, int b){
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return (a + b);
        }
    }

    /**
     * 
     * @param str is the word that is being examined
     * @return fizz is it starts with f and buzz with it ends with buzz, fizbuzz if both are true
     */
    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        }
        else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else {
            return str;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @param c thrid interger
     * @param bOk allows to be true even if a is bigger then b
     * @return returns true if b is greater than a and c is greater than b, unless bOk is true, then only c needs to greater than b
     */
    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk == true) {
            if (c > b) {
                return true;
            } else {
                return false;
            }
        } else {
            if (c > b && b > a) {
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * 
     * @param a first integer 
     * @param b second integer
     * @param c thrid integer
     * @return return true if any of them is 10 over another, otherwise returns false
     */
    public static boolean lessBy10(int a, int b, int c) {
        if (a >= (b + 10) || a >= (c + 10)) {
            return true;
        } else if (b >= (a + 10) || b >= (c + 10)) {
            return true;
        } else if (c >= (b + 10) || c >= (a + 10)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return returns a number depending on if the numbers inputted are equal to each other or not
     */
    public static int redTicket(int a, int b, int c) {

        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && a == c && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return  1;
        } else {
            return 0;
        }
    }

    /**
     * 
     * @param a first integer
     * @param b second integer
     * @return returns true if they share a digit, otherwise it returns false
     */
    public static boolean shareDigit(int a, int b) {
        if (a/10 == b/10) {
            return true;
        } else if (a%10 == b%10) {
            return true;
        } else if (a/10 == b%10) {
            return true;
        } else if (a%10 == b/10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * @param str the word that is having their letters doubled
     * @return the word with their letters doubled
     */
    public static String doubleChar(String str) {
        
        String Word = "";

        for (int i = 0; i <= str.length() - 1; i++) {
           Word = Word + str.charAt(i) + str.charAt(i);
        }
        return Word;
    }

    /**
     * 
     * @param str the sequnce of letters 
     * @return if the CO, some random letter, and e are next to each other
     */
    public static int countCode(String str) {
        
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    /**
     * 
     * @param str the string that is being examined 
     * @return returns true if there is a letter sandwhiched by 2 b's
     */
    public static boolean bobThere(String str){
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && (str.charAt(i + 2) == 'b')) {
              return true;
            } 
        } return false;
    }

    /**
     * 
     * @param str sequcne of letters
     * @param n where to start repeating starting at the end of the string 
     * @return the nth ending letters n times
     */
    public static String repeatEnd (String str, int n) {

        String Word = "";
        String Result = "";

        for (int i = 0; i < n; i++) {
            Word = str.substring(str.length() - n);
            Result += Word;
        } return Result;
    }

    /**
     * 
     * @param str sequcne of letters
     * @param n where to start looking in the sequcne of letters
     * @return returns true if the first n letters are repeated again in the string 
     */
    public static boolean prefixAgain(String str, int n) {
        String Word = "";

        Word = str.substring(0, n);

       if (str.indexOf(Word, n) >= 1)  {
            return true;
        } else { 
            return false; 
        }
    }

    /**
     * 
     * @param str the sequcne of letters that is being examined to see if there is a star sandwhiched by 2 like letters
     * @return true if there is a star sandwhich, otherwise it returns false
     */
    public static boolean sameStarChar(String str) {
        
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
                return false;
            }
        } return true;

    }

    /**
     * 
     * @param str sequcne of letters that includes a star
     * @return returns the sequence of letters that excludes the star and the letter before and after it 
     */
    public static String starOut(String str) {

        String Result = "";
  
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != '*'){
                Result += str.charAt(i);
            } else if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*') {
                Result += str.charAt(i);
            } else if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*') {
                Result = Result.substring(0,Result.length()-1); 
            }
        } return Result;
    }
}