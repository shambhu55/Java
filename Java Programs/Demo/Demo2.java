//WORKING ON CHARACTERS AND WORDS
//---------------------------------

/*
WAP to shift First character of String at the end of String.
i/p : "India"
o/p : "ndiaI"


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(1));
		sb.append(s1.charAt(0));
		System.out.println(sb);
	}
}
*/


/*
WAP to shift Last character of String at the First of String.
i/p : "India"
o/p : "aIndi"
THIS PROBLE IS SOLVED USING 4 TYPES(Not using 1st one).


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(s1.length()-1));
		sb.append(s1.substring(0, s1.length()-1));
		System.out.println(sb);
	}
}
*/


/*
WAP to swap First and Last characters of String.
i/p : "India"
o/p : "andiI"


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "India";
		StringBuilder sb = new StringBuilder(s1.substring(s1.length()-1));
		sb.append(s1.substring(1,s1.length()-1));
		sb.append(s1.charAt(0));
		System.out.println(sb);		
	}
}
*/


/*
WAP to display
i/p : International
o/p : I13n12t11e10r9n8a7t6i5o4n3a2l1


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder(s1);
		int count = 0;
		for(int i=s1.length()-1; i>=0; i--)
			sb.insert(i+1, ++count);
		System.out.println(sb);
	}
}
*/



/*
WAP to display
i/p : International
o/p : 6


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		int count = 0;

		for(int i=0; i<s1.length(); i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))	//.contains() expects a String, but s1.charAt(i) returns a char.
				count++;
		System.out.println(count);
	}
}
*/



/*
WAP to replace vowels with count
i/p : International
o/p : 6nt5rn4t32n1l

class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder(s1);
		int count = 0;

		for(int i=s1.length()-1; i>=0; i--){
			if(s2.contains(String.valueOf(s1.charAt(i)))){
				sb.deleteCharAt(i);
				sb.insert(i, ++count);
			}
		}
		System.out.println(sb);
	}
}
*/



/*
WAP to display 
i/p : International
o/p : ntrntnlIeaioa

class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		StringBuilder sb = new StringBuilder();
		String s2 = "AEIOUaeiou";

		for(int i=0; i<s1.length(); i++)
			if(!(s2.contains(String.valueOf(s1.charAt(i)))))
				sb.append(s1.charAt(i));

		for(int i=0; i<s1.length(); i++)
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(s1.charAt(i));	
		
		System.out.println(sb);
	}
}
*/


/*
WAP to display the character in the ascending order
i/p : International
o/p : Iaaeilnnnortt


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		char c[] = s1.toCharArray();
		java.util.Arrays.sort(c);
		System.out.println(c);
	}
}
*/


/*
WAP to replace vowels with 1 and 2 alternately.
i/p : International
o/p : 1nt2rn1t21n2l


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "International";
		String s2 = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		int count = 0;

		for(int i=0; i<s1.length(); i++){
			if(s2.contains(String.valueOf(s1.charAt(i)))){
				if(count%2==0)
					sb.append(1);
				else
					sb.append(2);
				count++;
			}
			else
				sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}
*/

//=============================================================================

// WORKING ON SENTENCES		
// CONCEPTS USED : .splir(), temp, stringbuilder(), .length, .length()
//-------------------------

/*
WAP to display number of Strings in the Sentences.
i/p : Hello I am Java Developer
o/p : 5

class Demo2
{
	public static void main(String args[])
	{
		String s1 = "Hello I am Java Developer";
		String s2[] = s1.split(" ");

		int count = 0;
		for(int i=0; i<s2.length; i++)		//"System.out.println(s2.length);" can used
			if(s2[i].length()!=0)		// instead of 4 lines
				count++;
		System.out.println(count);
	}
}
*/


/*
WAP to find the longest word from the String.
i/p : Welcome to International Airport.
o/p : International


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "Welcome to International Airport";
		String s2[] = s1.split(" ");		//Splits the sentence into words.
		int size = 0;

		for(int i=0; i<s2.length; i++)		//Finds length of longest word & stored in size.
			if(s2[i].length()>size)
				size = s2[i].length();

		for(int i=0; i<s2.length; i++)
			if(s2[i].length()==size)	// compare highest size with word size.
				System.out.println(s2[i]);
	}
}
*/

/*
WAP to reverse each word from the String.
i/p : Hello I am Java Debveloper
o/p : olleH I ma avaJ repolevbeD


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "Hello I am Java Debveloper";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++){
			String temp = s2[i];
			if(temp.length()!=0)
				sb.append(new StringBuilder(temp).reverse());
				
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/



/*
WAP to Shift First Char Of Each word at End of the String.
i/p : Hello I am Java Debveloper
o/p : elloH I ma avaJ ebveloperD



class Demo2
{
	public static void main(String args[])
	{
		String s1 = "Hello I am Java Debveloper";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++){
			String temp = s2[i];
			if(temp.length()>1){
				sb.append(temp.substring(1));
				sb.append(temp.charAt(0));
			}
			else
				sb.append(s2[i]);
			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/


/*
WAP to sort words laxicographically
i/p : hello i am java developer
o/p : am developer hello i java


class Demo2
{
	public static void main(String arg[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		java.util.Arrays.sort(s2);	//Sorts the words alphabetically.

		for(int i=0; i<s2.length; i++){
			sb.append(s2[i]);

			if(i<s2.length-1)	//Reconstructs sorted words into sentence with space
				sb.append(" ");
		}

		System.out.println(sb);
	}
}
*/



/*
WAP to sort words lengthwise.
i/p : hello i am java developer
o/p : i am java hello developer

-Splits the sentence into words.
-Sorts words by length using Bubble Sort.(compare and swap)
-Reconstructs the sentence using StringBuilder.


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length-1; i++)
			for(int j=i+1; j<s2.length; j++)
				if(s2[i].length()<s2[j].length()){
					String temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}

		for(int i=0; i<s2.length; i++){
			sb.append(s2[i]);
			if(i<s2.length-1);
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/




/*
WAP to shift first charactrer to last of the each word of string.
i/p : hello i am java developer
o/p : ellho i am avja evelopedr


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++){
			if(s2[i].length()>1){
				sb.append(s2[i].substring(1, s2[i].length()-1));
				sb.append(s2[i].charAt(0));
			}
			sb.append(s2[i].charAt(s2[i].length()-1));

			if(i<s2.length)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/


//=======================================================

// WORKING ON INDECES
//----------------------

/*
i/p : Engineer
o/p :
E
En
Eng
Engi
Engin
Engine
Enginee
Engineer


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "Engineer";
		for(int i=0; i<s1.length(); i++)
			System.out.println(s1.substring(0, i+1));
	}
}
*/



/*
WAP to sort each word lexicographically from string. 
i/p : hello i am java developer
o/p : ehllo i am aajv deeeloprv


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			String temp = s2[i];

			char c[] = temp.toCharArray();
			java.util.Arrays.sort(c);

			sb.append(c);

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/



/*
i/p : where is nayan and naman karan looking gor him
o/p : nayan
      naman


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "where is nayan and naman karan looking gor him";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			String temp = s2[i];
			if(temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString()))
				System.out.println(temp);
		}
	}
}
*/




/*
WAP to convert First letter uppercase of each word.
i/p : hello i am java developer
o/p : Hello I Am Java Developer



class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			sb.append(Character.toUpperCase(s2[i].charAt(0)));
			sb.append(s2[i].substring(1));

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/



/*
WAP to convert uppercase of vowels of each letter of the word.
i/p : hello i am java developer
o/p : hEllO I Am jAvA dEvElOpEr


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2 = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s2.contains(String.valueOf(s1.charAt(i))))
				sb.append(Character.toUpperCase(s1.charAt(i)));
			else
				sb.append(s1.charAt(i));
		}
		System.out.println(sb);
	}
}
*/


//=============================================================================

// WORKING ON NUMBERS OF STRINGS

/*
WAP to count Sum of Digits in the String.
i/p : welcome to 2025
o/p : 9


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "wlcome to 2025";
		int sum = 0;

		for(int i=0; i<s1.length(); i++)
			if(Character.isDigit(s1.charAt(i)))
				sum+=Character.getNumericValue(s1.charAt(i));
		System.out.println(sum);
	}	
}
*/


/*
WAP to sort Digits in the String.
i/p : welcome to 2025
o/p : 9


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "welcome to 2025";
		String s2[] = s1.split(" ");
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s2.length; i++)
		{
			if(Character.isDigit(s2[i].charAt(0))){
				char c[] = s2[i].toCharArray();
				java.util.Arrays.sort(c);
				sb.append(c);
			}
			else
				sb.append(s2[i]);

			if(i<s2.length-1)
				sb.append(" ");
		}
		System.out.println(sb);
	}
}
*/



/*
WAP to count special characters from the strings.
i/o : hello naman,,. where is nikhil?? karthik is lookking for him!!!
o/p : 8


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello naman,,. where is nikhil?? karthik is lookking for him!!!";
		int count = 0;

		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(!(Character.isLetterOrDigit(c) || Character.isWhitespace(c)))
				count++;
		}
		System.out.println(count);
	}
}
*/


/*
WAP to Remove special characters from the strings.
i/o : hello naman,,. where is nikhil?? karthik is lookking for him!!!
o/p : hello naman where is nikhil karthik is lookking for him


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "hello naman,,. where is nikhil?? karthik is lookking for him!!!";
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s1.length(); i++){
			char c = s1.charAt(i);
			if(Character.isLetterOrDigit(c) || Character.isWhitespace(c))
				sb.append(c);
		}
		System.out.println(sb);
	}
}
*/


/*
i/p : never odd or even
o/p : Palindrome String.


class Demo2
{
	public static void main(String args[])
	{
		String s1 = "never odd or even";
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s1.length(); i++)
		{
			if(Character.isLetterOrDigit(s1.charAt(i)))
				sb.append(s1.charAt(i));

			if(sb.toString().equalsIgnoreCase(sb.reverse().toString()))
				System.out.println("Palindrome String!");
		}
	}
}
*/

/*
 WAP to find first non reapeating char from string.
 i/p : "Swiss"
 o/p : w

 
class Demo2{
    public static void main(String[] args) {
        String s1 = "Swiss";
        String s2 = s1.toLowerCase();
       
        for(int i=0; i<s2.length()-1; i++){
            int count = 0;
            for(int j=i+1; j<s2.length(); j++){
                if(s2.charAt(i)==s2.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println(s2.charAt(i));
                break;
            }
        }
    }
}


class Demo2
{
	public static void main(String args[])
	{
		int n=21412;
		int sum=0, temp=n;
		while(temp>0){
			sum=(sum*10)+temp%10;
			temp/=10;
		}
		if(n==sum)
			System.out.println("Palindrome");
		else
			System.out.println("non pal");
	}
}
*/


// class Demo2
// {
// 	public static void main(String args[])
// 	{
// 		int n=2141;
// 		int temp=0;
// 		while(n!=0){
// 			temp*=10;
// 			temp+=n%10;
// 			n/=10;
// 		}
// 		System.out.println(temp);	//reverse
// 	}
// }

// class Demo2
// {
// 	public static void main(String args[])
// 	{
// 		String s1 = "Shaaaaaa";
// 		String s2 = "AEIOUaeiou";
// 		boolean b=false;
// 		for(int i=0; i<s1.length(); i++){
// 			if(s2.contains(String.valueOf(s1.charAt(i)))){
// 				b=true;
// 				System.out.println(b);
// 				break;
// 			}
// 		}
// 		System.out.println(b);	//contain vowels or not
// 	}
// }


// public class Demo2 {

// 	public static void main(String[] args) {
// 		System.out.println(isPrime(10));
// 		System.out.println(isPrime(13));
// 	}

// 	public static boolean isPrime(int n){
// 		if(n==0 || n==1)
// 			return false;
// 		if(n==2)
// 			return true;
// 		for(int i=2; i<=n/2; i++)
// 			if(n%i==0)
// 				return false;
// 		return true;
// 	}
// }



public class Demo2 {
 public static void printFibonacciSequence(int count) {
  int a = 0;
  int b = 1;
  int c = 1;
  for (int i = 1; i <= count; i++) {
   System.out.print(a + ", ");

        a = b;
   		b = c;
   		c = a + b;
  }
 }
 public static void main(String[] args) {
     printFibonacciSequence(10);
 }
}
























