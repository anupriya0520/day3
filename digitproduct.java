class digitproduct{
    public static void main(String[] args) {
        int n=7814;
        int product=1;
        for(int i=0;i<n;i++){
            int digit=n%10;
            product*=digit;
            n/=10;
        }
        System.out.println(product);
    }
}