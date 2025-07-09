class fibinocci{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int count=10;
        int temp=0;
        while(count>0){
            temp=a+b;
            a=b;
            b=temp;
            count--;
        }
        System.out.println(a);
    }
}