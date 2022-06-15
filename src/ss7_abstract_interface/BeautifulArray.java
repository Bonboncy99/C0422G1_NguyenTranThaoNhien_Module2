package ss7_abstract_interface;

public class BeautifulArray {
    boolean solution(int[] arr) {
        int first = arr[0];
        int last = arr[arr.length - 1];
        int j = arr.length - 2;
        for (int i = 1; i <= j; ) {
            if ((i == j) && (first == last)) {
                return true;
            } else {
                if (first < last) {
                    first = first + arr[i];
                    i++;
                } else {
                    last = last + arr[j];
                    j--;
                }
            }
        }
        return false;
    }
}
