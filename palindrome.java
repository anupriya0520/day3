class palindrome{
    public static void main(String[] args) {
        int n=12321;
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=reverse*10+digit;
             n/=10;
        }
        if(reverse==original){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}