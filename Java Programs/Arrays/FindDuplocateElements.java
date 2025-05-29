// Write a Java program to find duplicate elements in an array?
// i/o : [20,30,20,10,50,20]
public class FindDuplocateElements {
    public static void main(String[] args) {
        int a[] = {20,30,10,50,20,30};

        for(int i=0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if(a[i]==a[j])
                {
                    System.out.println(a[j]);
                    break;
                }
    }
}
