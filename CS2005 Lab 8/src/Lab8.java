import java.util.ArrayList;

public class Lab8 
{
	
	public static void main(String args[])
	{
//		for(int i=0;i<10;++i)
//		{
//			int x = CS2004.UI(-1, 11);
//			System.out.println(x);
//		}
		ArrayList<Double> array = new ArrayList<Double>();	
		array.add(1.0);
		array.add(2.0);
		array.add(3.0);
		array.add(4.0);
		array.add(10.0);
		
		ScalesSolution INSTANCE = new ScalesSolution(5);
		//Generates a solution of n.
		System.out.println(INSTANCE.ScalesFitness(array));
	}
	
}