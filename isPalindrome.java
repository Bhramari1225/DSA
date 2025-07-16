public class isPalindrome{
    public static boolean isPalindrome(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char charLeft = s.charAt(left);
            char charRight = s.charAt(right);

            if(!Character.isLetterOrDigit(charLeft)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(charRight)){
                right--;
                continue;
            }
            if(Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}