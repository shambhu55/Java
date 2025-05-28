public class EqualityCheck {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {10,20,30,40};
        boolean check = true;

        if(a.length==b.length)
        {
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i])
                    check = false;
                else
                    check = true;
            }
        }
        else
            check = false;
        

        if(check)
            System.out.println("Equal Arrays");
        else
            System.out.println("Not Equal Arrays");
    }
}
