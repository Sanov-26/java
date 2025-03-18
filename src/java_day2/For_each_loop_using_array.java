package java_day2;
public class For_each_loop_using_array {
	public static void main(String[]args) {
	int[] numbers = {40,10,30,20,50};
	for(int i=1;i<=numbers.length;i++)
	{
		System.out.println(i);
	}
	for(int num : numbers)
	{
		System.out.println(num);
	}
}
}
