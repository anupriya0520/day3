class digitcount{
    public static void main(String[] args) {
        int n=1234567784;
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}