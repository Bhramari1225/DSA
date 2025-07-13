public class secondLargest {
    public static int getSecondLargest(int[] arr){
        int Largest = -1;
        int secondLargest = -1;

        for(int i : arr){
            if(i > Largest){
                secondLargest = Largest;
                Largest = i;
            }
            else if(i < Largest && i > secondLargest){
                secondLargest = i;
            }
        }
        return secondLargest;


    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr));

    }
}
