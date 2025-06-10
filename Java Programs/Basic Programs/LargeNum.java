public class LargeNum {
    public static void main(String[] args) {
        int a=30;
        int b=30;
        int c=30;

        if((a>b && a>c) || (a>b || b==c)){
            System.out.println(a);
        }
        else if((b>a && b>c) || (b>c || a==c)){
            System.out.println(b);
        }
        else if((c>b && c>a) || (c>b || b==a)){
            System.out.println(c);
        }
        else{
            System.out.println("All Same");
        }
    }
}
