public class MOverloadingObj {
    public static void main(String[] args) {
        MOverloading d1 = new MOverloading();
        d1.m1();

        MOverloading d2 = new MOverloading();
        d2.m1(10);

        MOverloading d3 = new MOverloading();
        d3.m1(10,20);
    }
}