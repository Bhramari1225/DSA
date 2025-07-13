public class thirdLargest {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(thirdLargest(arr));
    }

    public static int thirdLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;
        int thirdLargest = -1;

        for(int i : arr){
            if(i > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            }
            else if(i < largest && i > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = i;
            }
            else if(i < secondLargest && i > thirdLargest){
                thirdLargest = i;
            }
        }
        return thirdLargest;
    }
}
