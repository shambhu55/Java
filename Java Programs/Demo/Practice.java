
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
        int p, q;
        static int r;
        void display(){
            System.out.println("p="+p+" q="+q+" r="+r);
        }
        
        Practice(){ // def
            p=10;
            q=20;
            r=300;
            System.out.println("Def Constructor called");
        }

        Practice(int p, int q){
            this.p=p;   // para
            this.q=q;
            System.out.println("Para Constructor called");
        }
        {
            p=1000;
            q=2000;
            r=3000;
            System.out.println("INSTANCE BLOCK called");
        }
}