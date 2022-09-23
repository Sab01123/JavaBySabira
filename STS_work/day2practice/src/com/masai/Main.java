package com.masai;

		public class Main {

			public static void main(String[] args) {
		//ex 1
				int a = 10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a);

		//ex 2
		int b = 5;
		System.out.println(++b - ++b);

		//ex 3
		int c = 5;
		System.out.println((--c + --c)*(++c - c--)+(--c +c--)*(++c + c++));

		//logical operators
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1&b1);
		System.out.println(b1&b2);
		System.out.println(b2&b1);
		System.out.println(b2&b2);

		System.out.println(b1|b1);
		System.out.println(b1|b2);
		System.out.println(b2|b1);
		System.out.println(b2|b2);

		System.out.println(b1^b1);
		System.out.println(b1^b2);
		System.out.println(b2^b1);
		System.out.println(b2^b2);

		//eg1
		int x = 10;
		int y = 2;
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		System.out.println(x<<y);
		System.out.println(x>>y);

		//short circuit operators
		int d = 10;
		int e = 10;
		if((d++ ==10)| (e++ ==10))
		{
			System.out.println(d+" "+e);
		}
		int f = 10;
		int g = 10;
		if((f++ == 10)|| (g++ ==10))
		{
			System.out.println(f+" "+g);
			
		}

		int h = 10;
		int i = 10;
		if((h++ !=10)&(i++ !=10))
		{
			
		}
			System.out.println(h+" "+i);
			
			int j = 10;
			int k = 10;
			if((j++ !=10)&&(k++ !=10))
			{
				
			}
				System.out.println(j+" "+k);
				//Min_VALUE and MAX_VALUE
				System.out.println(Byte.MIN_VALUE+"----->"+Byte.MAX_VALUE);
				System.out.println(Short.MIN_VALUE+"---->"+Short.MAX_VALUE);
				System.out.println(Integer.MIN_VALUE+"----->"+Integer.MAX_VALUE);
				System.out.println(Long.MIN_VALUE+"----->"+Long.MAX_VALUE);
				System.out.println(Float.MIN_VALUE+"----->"+Float.MAX_VALUE);
				System.out.println(Double.MIN_VALUE+"----->"+Double.MAX_VALUE);
				System.out.println(Character.MIN_VALUE+"----->"+Character.MAX_VALUE);
				//System.out.println(Boolean.MIN_VALUE+"----->"+Boolean.MAX_VALUE); Error
				
//				**Typecasting**
		//******1. Implicit Type Casting*****
				//ex1
				byte b_1 = 10;
				int i_1 = b;
				System.out.println(b_1+" "+i_1);
						
				/*int m=10;
				byte n=m;
				System.out.println(m+" "+n);
				Status: Compilation Error, Possible loss of precision.*/
				
				/*byte b=65;
				char c=b;
				System.out.println(b+" "+c);
			Status: Compilation Error*/

				char o = 'A';
				int p = o;
				System.out.println(o+" "+p);
				
				/*eg
				 * byte b1=60;
				byte b2=70;
				byte b=b1+b2;
				System.out.println(b);
Status: Compilation Error, Possible loss of precision.
				 */
//************2.Explicit Type Casting:hightolowdataconversion**********
				
				//eg1
			int in1 = 10;
			byte by1 = (byte)in1;
			System.out.println(in1+" "+by1);
			
			//eg2
			byte bb1 = 30;
			byte bb2 = 20;
			byte ans = (byte)(bb1+bb2);
			System.out.println(ans);
//			eg2
			int no  = 130;
			byte bb3 = 20;
			int anss = no+bb3;
			System.out.println(anss);
//			eg3
			int inty = 130;
			byte byty = (byte)inty;
			System.out.println(byty);
			
			
			
				
			}


		}


