public class PracticeMain {
    public static void main(String[] args) {
        
        Practice p = new Practice();

        //reverse num
        System.out.println("Reverse of 1234 : "+p.reverseNum(1234));

        // Method overloading
        p.m1();
        p.m1(10);

        System.out.println("add 2 Num :"+p.add(10,20));
        System.out.println("add 3 Num :"+p.add(10,20,30));

        // constructor
        Practice p1 = new Practice();
        Practice p2 = new Practice(60,70);
        p1.display();   // def
        p2.display();   // Param
    }
}