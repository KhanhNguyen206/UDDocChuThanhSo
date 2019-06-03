import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String num = Integer.toString(number);
        System.out.println(num);

        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }

        if (number >= 10 && number < 20) {
            char q = num.charAt(1);
            switch (parseInt(Character.toString(q))) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }

        if (number >= 20 && number < 100) {
            String str1 = "";
            String str2 = "";
            char a = num.charAt(0);
            char b = num.charAt(1);
            switch (parseInt(Character.toString(a))) {
                case 2:
                    str1 = "Twenty";
                    break;
                case 3:
                    str1 = "Thirty";
                    break;
                case 4:
                    str1 = "Forty";
                    break;
                case 5:
                    str1 = "Fifty";
                    break;
                case 6:
                    str1 = "Sixty";
                    break;
                case 7:
                    str1 = "Seventy";
                    break;
                case 8:
                    str1 = "Eighty";
                    break;
                case 9:
                    str1 = "Ninety";
                    break;
            }
            switch (parseInt(Character.toString(b))) {
                case 1:
                    str2 = "one";
                    break;
                case 2:
                    str2 = "two";
                    break;
                case 3:
                    str2 = "three";
                    break;
                case 4:
                    str2 = "four";
                    break;
                case 5:
                    str2 = "five";
                    break;
                case 6:
                    str2 = "six";
                    break;
                case 7:
                    str2 = "seven";
                    break;
                case 8:
                    str2 = "eight";
                    break;
                case 9:
                    str2 = "nine";
                    break;
            }
            System.out.println(str1 + " " + str2);
        }

        if (number >= 100 && number < 110) {
            String str3 = "";
            String str4 = "";
            char c = num.charAt(0);
            char d = num.charAt(2);
            switch (parseInt(Character.toString(c))) {
                case 1:
                    str3 = "One hundred";
                    break;
                case 2:
                    str3 = "Two hundred";
                    break;
                case 3:
                    str3 = "Three hundred";
                    break;
                case 4:
                    str3 = "Four hundred";
                    break;
                case 5:
                    str3 = "Five hundred";
                    break;
                case 6:
                    str3 = "Six hundred";
                    break;
                case 7:
                    str3 = "Seven hundred";
                    break;
                case 8:
                    str3 = "Eight hundred";
                    break;
                case 9:
                    str3 = "Nine hundred";
                    break;
            }
            switch (parseInt(Character.toString(d))) {
                case 1:
                    str4 = "and one";
                    break;
                case 2:
                    str4 = "and two";
                    break;
                case 3:
                    str4 = "and three";
                    break;
                case 4:
                    str4 = "and four";
                    break;
                case 5:
                    str4 = "and five";
                    break;
                case 6:
                    str4 = "and six";
                    break;
                case 7:
                    str4 = "and seven";
                    break;
                case 8:
                    str4 = "and eight";
                    break;
                case 9:
                    str4 = "and nine";
                    break;
            }
            System.out.println(str3 + " " + str4);
        }

        if (number >= 110 && number < 120) {
            String str5 = "";
            String str6 = "";
            char e = num.charAt(0);
            char f = num.charAt(2);
            switch (parseInt(Character.toString(e))) {
                case 1:
                    str5 = "One hundred";
                    break;
                case 2:
                    str5 = "Two hundred";
                    break;
                case 3:
                    str5 = "Three hundred";
                    break;
                case 4:
                    str5 = "Four hundred";
                    break;
                case 5:
                    str5 = "Five hundred";
                    break;
                case 6:
                    str5 = "Six hundred";
                    break;
                case 7:
                    str5 = "Seven hundred";
                    break;
                case 8:
                    str5 = "Eight hundred";
                    break;
                case 9:
                    str5 = "Nine hundred";
                    break;
            }
            switch (parseInt(Character.toString(f))) {
                case 0:
                    str6 = "and ten";
                    break;
                case 1:
                    str6 = "and eleven";
                    break;
                case 2:
                    str6 = "and twelve";
                    break;
                case 3:
                    str6 = "and thirteen";
                    break;
                case 4:
                    str6 = "and fourteen";
                    break;
                case 5:
                    str6 = "and fifteen";
                    break;
                case 6:
                    str6 = "and sixteen";
                    break;
                case 7:
                    str6 = "and seventeen";
                    break;
                case 8:
                    str6 = "and eighteen";
                    break;
                case 9:
                    str6 = "and nineteen";
                    break;
            }
            System.out.println(str5 + " " + str6);
        }

        if (number >= 120 && number < 1000) {
            String str7 = "";
            String str8 = "";
            String str9 = "";
            char g = num.charAt(0);
            char h = num.charAt(1);
            char i = num.charAt(2);
            switch (parseInt(Character.toString(g))) {
                case 1:
                    str7 = "One hundred";
                    break;
                case 2:
                    str7 = "Two hundred";
                    break;
                case 3:
                    str7 = "Three hundred";
                    break;
                case 4:
                    str7 = "Four hundred";
                    break;
                case 5:
                    str7 = "Five hundred";
                    break;
                case 6:
                    str7 = "Six hundred";
                    break;
                case 7:
                    str7 = "Seven hundred";
                    break;
                case 8:
                    str7 = "Eight hundred";
                    break;
                case 9:
                    str7 = "Nine hundred";
                    break;
            }
            switch (parseInt(Character.toString(h))) {
                case 2:
                    str8 = "and twenty";
                    break;
                case 3:
                    str8 = "and thirty";
                    break;
                case 4:
                    str8 = "and forty";
                    break;
                case 5:
                    str8 = "and fifty";
                    break;
                case 6:
                    str8 = "and sixty";
                    break;
                case 7:
                    str8 = "and seventy";
                    break;
                case 8:
                    str8 = "and eighty";
                    break;
                case 9:
                    str8 = "and ninety";
                    break;
            }
            switch (parseInt(Character.toString(i))) {
                case 1:
                    str9 = "one";
                    break;
                case 2:
                    str9 = "two";
                    break;
                case 3:
                    str9 = "three";
                    break;
                case 4:
                    str9 = "four";
                    break;
                case 5:
                    str9 = "five";
                    break;
                case 6:
                    str9 = "six";
                    break;
                case 7:
                    str9 = "seven";
                    break;
                case 8:
                    str9 = "eight";
                    break;
                case 9:
                    str9 = "nine";
                    break;
            }
            System.out.println(str7 + " " + str8 + " " + str9);
        }
    }
}