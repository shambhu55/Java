
class Practice{
    int reverseNum(int a){
        // Reverse Num
        int sum=0;
        while(a>0){
            sum*=10;
            sum=sum+(a%10);
            a/=10;
        }
        return sum;
    }


    // Method Overloading 
        void m1(){
            System.out.println("m1 called");
        }

        void m1(int a){
            System.out.println("m2 called");
        }


        int add(int x, int y){
            return x+y;
        }
        int add(int x, int y, int z){
            return x+y+z;
        }


        // Default const : called during obj creation
        Practice(){
            System.out.println("Constructor called");
        }
}