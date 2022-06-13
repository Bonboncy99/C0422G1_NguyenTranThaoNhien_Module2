package lamlai.lamlai_1.baitap;

import java.util.Scanner;

public class DocChuThanhSo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = Integer.parseInt(scanner.nextLine());

        String result = "";
        if (number >= 0 && number < 10){
            switch (number){
                case 0: result = "zero"; break;
                case 1: result = "one"; break;
                case 2: result = "two"; break;
                case 3: result = "three"; break;
                case 4: result = "four"; break;
                case 5: result = "five"; break;
                case 6: result = "six"; break;
                case 7: result = "seven"; break;
                case 8: result = "eight"; break;
                case 9: result = "nine"; break;
                default: result = "out of ability";

            }
        } else if (number < 20){
            switch (number){
                case 10: result = "ten";break;
                case 11: result = "eleven";break;
                case 12: result = "twelve";break;
                case 13: result = "thirteen";break;
                case 14: result = "fourteen";break;
                case 15: result = "fifteen";break;
                case 16: result = "sixteen";break;
                case 17: result = "seventeen";break;
                case 18: result = "eighteen";break;
                case 19: result = "nineteen";break;
            }
        } else if (number < 100) {
            int dozens = number / 10;
            int units = number % 10;
            switch (dozens){
                case 2: result += " twenty"; break;
                case 3: result += " thirty"; break;
                case 4: result += " fourty"; break;
                case 5: result += " fifty"; break;
                case 6: result += " sixty"; break;
                case 7: result += " seventy"; break;
                case 8: result += " eighty"; break;
                case 9: result += " ninety"; break;
            }

            switch (units){
                case 1: result += " one"; break;
                case 2: result += " two"; break;
                case 3: result += " three"; break;
                case 4: result += " four"; break;
                case 5: result += " five"; break;
                case 6: result += " six"; break;
                case 7: result += " seven"; break;
                case 8: result += " eight"; break;
                case 9: result += " nine"; break;
            }
        } else if (number < 999){
            int hundreds = number / 100; //390 39
            int dozens = (number / 10) % 10;
            int x = number % 100;
            int units = x % 10;
            switch (hundreds){
                case 1: result = "one hundreds"; break;
                case 2: result = "two hundreds"; break;
                case 3: result = "three hundreds"; break;
                case 4: result = "four hundreds"; break;
                case 5: result = "five hundreds"; break;
                case 6: result = "six hundreds"; break;
                case 7: result = "seven hundreds"; break;
                case 8: result = "eight hundreds"; break;
                case 9: result = "nine hundreds"; break;
            }
            if (x < 20) {
                switch (x){
                    case 1: result += " and one"; break;
                    case 2: result += " and two"; break;
                    case 3: result += " and three"; break;
                    case 4: result += " and four"; break;
                    case 5: result += " and five"; break;
                    case 6: result += " and six"; break;
                    case 7: result += " and seven"; break;
                    case 8: result += " and eight"; break;
                    case 9: result += " and nine"; break;
                    case 10: result += " and ten"; break;
                    case 11: result += " and eleven";break;
                    case 12: result += " and twelve";break;
                    case 13: result += " and thirteen";break;
                    case 14: result += " and fourteen";break;
                    case 15: result += " and fifteen";break;
                    case 16: result += " and sixteen";break;
                    case 17: result += " and seventeen";break;
                    case 18: result += " and eighteen";break;
                    case 19: result += " and nineteen";break;
                }
            } else {
                switch (dozens){
                    case 2: result += " twenty"; break;
                    case 3: result += " thirty"; break;
                    case 4: result += " fourty"; break;
                    case 5: result += " fifty"; break;
                    case 6: result += " sixty"; break;
                    case 7: result += " seventy"; break;
                    case 8: result += " eighty"; break;
                    case 9: result += " ninety"; break;
                }

                switch (units){
                    case 1: result += " one"; break;
                    case 2: result += " two"; break;
                    case 3: result += " three"; break;
                    case 4: result += " four"; break;
                    case 5: result += " five"; break;
                    case 6: result += " six"; break;
                    case 7: result += " seven"; break;
                    case 8: result += " eight"; break;
                    case 9: result += " nine"; break;
                }
            }
        }
        System.out.println(number);
        System.out.println(result);

    }
}
