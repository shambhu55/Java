public class MOverloading {
    void m1(){
        System.out.println("Non param m1 method called");
    }

    void m1(int a){
        System.out.println("int param m1 method called");
    }

    void m1(int a, int b){
        System.out.println("int int param m1 method called");
    }
}
