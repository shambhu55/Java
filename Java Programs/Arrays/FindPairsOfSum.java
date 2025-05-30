 
 // Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

public class FindPairsOfSum {
    public static void main(String[] args) {
        int a[] = {5,20,25,30,10,33,20,-40,70,40,-10,};
        int sum = 30;

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+" + "+a[j]+" = "+sum);
                }
            }
        }
    }
}
