class power {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int result=1;
        int i=1;
        while(i<=b){
            result*=a;
            i++;
        }
         System.out.println(result);
        System.out.println("using shift operator only for 2 ");
        i=1<<b;
     
        System.out.println(i);
    }
}