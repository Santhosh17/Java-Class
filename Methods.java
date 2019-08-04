
public class Methods {
	
		public static int square(int num)
		{
System.out.println("print the number:"+num);
int result=num*num;
System.out.println("result is:"+result);
return result;
		}
		
		public static void main(String[] args) {
			System.out.println(square(5));
			@SuppressWarnings("unused")
			int fan = square(5)+square(6);
			System.out.println(fan);
			square(5);
			square(6);
			square(7);
			
	}

}
