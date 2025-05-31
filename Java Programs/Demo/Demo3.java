// Question 1:
// Write a Java program to remove adjacent duplicate characters from a string. Only one character from each group of adjacent duplicates should be kept.
// Input: "abccba"
// Output: "abcba"


// class Demo3
// {
// 	public static void main(String args[])
// 	{
// 		String s1 = "abccba";
// 		StringBuilder sb = new StringBuilder();
// 		sb.append(s1.charAt(0));

// 		for(int i=1; i<s1.length(); i++)
// 			if(s1.charAt(i)!=s1.charAt(i-1))
// 				sb.append(s1.charAt(i));
// 		System.out.println(sb);
// 	}
// } 



//  Question 2:
// Write a Java program to find the missing number in an array containing n-1 distinct numbers from 1 to n.
// Input: n = 6, array = [1, 2, 4, 5, 6]
// Output: 3


//  Question 3:
// Write a Java program to swap every two adjacent elements in the array.
// Input: [1, 2, 3, 4]
// Output: [2, 1, 4, 3]


//  Question 4:
// write a program to implement a queue using 2 stacks in java

// Q. 5
// i/p : [12,45,23,67]
// o/p : 67452312

// class Demo3
// {
// 	public static void main(String[] args) {
// 		int a[] ={12,45,23,67};
// 		int sum=0;

// 		for(int i=0; i<a.length-1; i++){
// 			for(int j=i+1; j<a.length; j++){
// 				if(a[i]>a[j])
// 					sum+=a[i];
// 				else
// 					sum+=a[j];
// 			}
// 		}
// 	}
// }


/*
// Swap String Without third variable
class Demo3
{
	public static void main(String args[])
	{
		String s1 = "ABC";
        String s2 = "XYZ";

        s1 = s1+s2;

        s2 = s1.substring(0, s1.length()-s2.length());
        System.out.println("s2: "+s2);

        s1 = s1.substring(s2.length());
        System.out.println("s1: "+s1);
	}
}
*/ 


/*
Reverse a string without using any library function. 
class Demo3
{
	public static void main(String args[])
	{
		String s1 = "ABCDE";
        StringBuilder sb = new StringBuilder();
        for(int i=s1.length()-1; i>=0; i--){
            sb.append(s1.charAt(i));
        }
        System.out.println(sb);
	}
}
*/


class Demo3
{
	public static void main(String args[])
	{
		String s1 = "ABCDE";
        
	}
}