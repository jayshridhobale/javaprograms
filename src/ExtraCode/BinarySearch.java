package ExtraCode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 12};
        int search = 10;
        int l1 = 0;
        int h1 = arr.length - 1;
        int mid = (l1 + h1) / 2;
        while (l1 <= h1) {
            if (arr[mid] == search) {
                System.out.println("Element find at" + mid + "index position");
                break;
            } else if (arr[mid] < search) {
                l1 = mid + 1;
            } else {
                h1 = mid - 1;
            }
            mid = (l1 + h1) / 2;
        }
        if (l1>h1){
            System.out.println("Element not found");
        }
    }

    }

