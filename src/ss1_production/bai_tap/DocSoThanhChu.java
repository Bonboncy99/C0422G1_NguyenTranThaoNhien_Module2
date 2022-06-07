package ss1_production.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển");
        number = sc.nextInt();
        String result = "";
        if (number >= 0 && number <= 9) {
            switch (number) {
                case 0:
                    result = "Zero";
                    break;
                case 1:
                    result = "One";
                    break;
                case 2:
                    result = "Two";
                    break;
                case 3:
                    result = "Three";
                    break;
                case 4:
                    result = "Four";
                    break;
                case 5:
                    result = "Five";
                    break;
                case 6:
                    result = "Six";
                    break;
                case 7:
                    result = "Seven";
                    break;
                case 8:
                    result = "Eight";
                    break;
                case 9:
                    result = "Nine";
                    break;
                default:
                    result = "out of ability";
            }
        } else if (number < 20) {
            switch (number) {
                case  10:
                result = "Ten";
                break;
                case  11:
                result = "Eleven";
                break;
                case  12:
                result = "Twelve";
                break;
                case  13:
                result = "Thirteen";
                break;
                case  14:
                result = "fourteen";
                break;
                case  15:
                result = "fifteen";
                break;
                case  16:
                result = "sixteen";
                break;
                case  17:
                result = "seventeen";
                break;
                case  18:
                result = "Eighteen";
                break;
                case  19:
                result = "nineteen";
                break;
            }
        } else if (number < 100){
            int dozens = number / 10;
            int units = number % 10;
            switch (dozens) {
                case 2:
                    result = "Twenty";
                    break;
                case 3:
                    result = "Thirty";
                    break;
                case 4:
                    result = "Fourty";
                    break;
                case 5:
                    result = "fifty";
                    break;
                case 6:
                    result = "Sixty";
                    break;
                case 7:
                    result = "Seventy";
                    break;
                case 8:
                    result = "Eighty";
                    break;
                case 9:
                    result = "Ninety";
                    break;
            }
            switch (units){
                case 1:
                    result += " One";
                    break;
                case 2:
                    result += " Two";
                    break;
                case 3:
                    result += " Three";
                    break;
                case 4:
                    result += " Four";
                    break;
                case 5:
                    result += " Five";
                    break;
                case 6:
                    result += " Six";
                    break;
                case 7:
                    result += " Seven";
                    break;
                case 8:
                    result += " Eight";
                    break;
                case 9:
                    result += " Nine";
                    break;
            }

        } else if (number <= 999){
            int hundred = number /100;
            int dozens = number / 10 % 10;
            int units = number % (hundred*100 + dozens*10);
            switch (hundred){
                case 1:
                    result = "One hundreds";
                    break;
                case 2:
                    result = "Two hundreds";
                    break;
                case 3:
                    result = "Three hundreds ";
                    break;
                case 4:
                    result = "Four hundreds";
                    break;
                case 5:
                    result = "Five hundreds";
                    break;
                case 6:
                    result = "Six hundreds";
                    break;
                case 7:
                    result = "Seven hundreds";
                    break;
                case 8:
                    result = "Eight hundreds";
                    break;
                case 9:
                    result = "Nine hundreds";
                    break;
            }
            if (dozens == 0) {
                switch (units) {
                    case 1:
                        result += " and One";
                        break;
                    case 2:
                        result += " and Two";
                        break;
                    case 3:
                        result += " and Three";
                        break;
                    case 4:
                        result += " and Four";
                        break;
                    case 5:
                        result += " and Five";
                        break;
                    case 6:
                        result += " and Six";
                        break;
                    case 7:
                        result += " and Seven";
                        break;
                    case 8:
                        result = " and Eight";
                        break;
                    case 9:
                        result = " and Nine";
                        break;
                }
            } else if (dozens == 1) {
                switch (units){
                    case 1: result += "Eleven"; break;
                    case 2:result += "Twelve"; break;
                    case 3:result += "thirteen"; break;
                    case 4:result += "fourteen"; break;
                    case 5:result += "fifteen"; break;
                    case 6:result += "sixteen"; break;
                    case 7:result += "seventeen"; break;
                    case 8:result += "eighteen"; break;
                    case 9:result += "nineteen"; break;
                }
            } else {
                switch (dozens) {
                    case 2:
                        result += " Twenty";
                        break;
                    case 3:
                        result += " Thirty";
                        break;
                    case 4:
                        result += " Fourty";
                        break;
                    case 5:
                        result += " fifty";
                        break;
                    case 6:
                        result += " Sixty";
                        break;
                    case 7:
                        result += " Seventy";
                        break;
                    case 8:
                        result += " Eighty";
                        break;
                    case 9:
                        result += " Ninety";
                        break;
                }
                switch (units){
                    case 1:
                        result += " One";
                        break;
                    case 2:
                        result += " Two";
                        break;
                    case 3:
                        result += " Three";
                        break;
                    case 4:
                        result += " Four";
                        break;
                    case 5:
                        result += " Five";
                        break;
                    case 6:
                        result += " Six";
                        break;
                    case 7:
                        result += " Seven";
                        break;
                    case 8:
                        result += " Eight";
                        break;
                    case 9:
                        result += " Nine";
                        break;
                }
            }


        }
        System.out.println(number + ": " + result);

    }
}
