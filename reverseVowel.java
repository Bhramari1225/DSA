public class reverseVowel {
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)>=0;
    }
    public static String reverseVowel(String s){
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while(left <= right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;

            }
        }return new String(arr);
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        String result = reverseVowel(s);
        System.out.println(result);
    }
}
