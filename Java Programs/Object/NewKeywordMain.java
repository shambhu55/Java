public class NewKeywordMain {
    public static void main(String[] args) {
        
        // By New keyword
        NewKeyword n1 = new NewKeyword();
        NewKeyword n2 = new NewKeyword();
        n1.m1();        // a=10 b=20
        System.out.println(n1==n2);     // false
        System.out.println(n1.equals(n2));      // false
        n2.a=30;
        n2.b=50;
        n2.m1();        // a=30 b=40


        // By Reference
        NewKeyword n3 = new NewKeyword();
        NewKeyword n4 = n3;
        System.out.println("n3 code : "+ n3.hashCode());
        System.out.println("n4 code : "+ n4.hashCode());
        System.out.println(n3==n4);     // true
        System.out.println(n3.equals(n4)); // true
    }
}
