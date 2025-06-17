public class NewKeywordMain {
    public static void main(String[] args) {
        NewKeyword n1 = new NewKeyword();
        NewKeyword n2 = new NewKeyword();
        n1.m1();        // a=10 b=20
        System.out.println(n1==n2);     // false
        System.out.println(n1.equals(n2));      // false
        n2.a=30;
        n2.b=50;
        n2.m1();        // a=30 b=40
    }
}
