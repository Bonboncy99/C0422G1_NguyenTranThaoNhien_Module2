//package ss7_abstract_interface.thuc_hanh;
//
//public class BeautifulArray1 {
//
////    public static void main(String[] args) {
////        int [] arr = new ;
////        int sum1 = 0;
////        int sum2 = 0;
////        for (int i = 2; i < arr.length-1; i++) {
////            for (int j = 0; j < i; j++) {
////                sum1 += j;
////            }
////            for (int j = arr.length-1;j > i; j--) {
////                sum2 += j;
////            }
////            if (sum1 == sum2) {
////                System.out.println("Mảng đpẹ");
////                break;
////            }
////        }
////    }
//public class BeautifulArray {
//    boolean solution(int[] arr) {
//        int first = arr[0];
//        int last = arr[arr.length - 1];
//        int j = arr.length - 2;
//        for (int i = 1; i <= j; ) {
//            if ((i == j) && (first == last)) {
//                return true;
//            } else {
//                if (first < last) {
//                    first = first + arr[i];
//                    i++;
//                } else {
//                    b = b + arr[j];
//                    j--;
//                }
//            }
//        }
//        return false;
//    }
//}
//
//}
