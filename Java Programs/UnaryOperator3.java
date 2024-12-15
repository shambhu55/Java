class UnaryOperator3
{
	public static void main(String args[])
	{
		int a = 10;
		int b = -20;
		System.out.println(++a - b-- + a++ + b++ - --a + b++ - a-- + ++b - ++a - ++b);
	}
}



/*
1. a++ + --b
   10 + -21 = -11

2. --b - a-- + --b
   -21 - 10 +  -22 = -53

3. --a + ++b - b-- - ++a
  9  +  -19  - -19  - 10 = -1

4. ++b - a-- - a++ + b++ - b--
   -19  - 10 - 9  +  -19 - -18 = -39

5. ++a + b-- - --a + b++ + ++a - ++b
  11   - 20  - 10  - 21 + 11  + 19 = -52

6. a++ + b-- - --b + a++ + b-- + --a - --b
  10  - 20  + 22 + 11   - 22 +  11 + 24 = 36

7. ++b - --a + ++b - a-- + ++b - a-- + b++ - --a
   -19 -  9  + -18 - 9 +  -17 - 8  + -17  -  6 = -103

8. b++ - a++ - --b - a++ + ++b - a-- - ++b + a++ + --b
   -20  - 10 - -20  - 11 +  -19 - 12 - -18  + 11 + -19 = -42

9. ++a - b-- + a++ + b++ - --a + b++ - a-- + ++b - ++a - ++b
  11  + 20 +  11    -21 - 11  -20 - 11  -18 -  11 + 17 = 59 - 92 =-33

*/