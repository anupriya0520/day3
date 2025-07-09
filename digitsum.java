class digitsum{
    public static void main(String[] args) {
        int n=7814;
        int sum=0;
        for(int i=0;i<n;i++){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println(sum);
    }
}