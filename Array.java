public class Array
{
	public static void main(String args[])
	{

		int a[]=new int[5];           //declaration and instantiation
		a[0]=5;                      //initialization
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;

		for(int i=0;i<a.length;i++)   //length is the property of array
		System.out.println(a[i]);

}
}
