
import java.util.ArrayList;

public class Lab11 
{
	public static void main(String args[])
	{
		//Read in the weights
		//Make sure you change the filename as appropriate!
		//This will only work if "c:\temp\1000 Primes.txt" exists!
		ArrayList<Double> w = CS2004.ReadNumberFile("C:\\Users\\Brandon\\eclipse-workspace\\CS2004_Lab11\\src\\1000_Primes.txt");
		//Set the weights
		ScalesChrome.SetWeights(w);
		
		//Run 10 repeats
		RunManyTimes(5);

	}
	public static void RunManyTimes (int x) {
		for(int i=0;i<x;++i)
		{
			//Reset the fitness count
			ScalesChrome.ClearFC();
			//The following parameters are not very good!
			//These are the ones you should try and optimise!
			int n = 1000;	
			int popsize = 100;
			double mrate = (double) 1/n;
			double crate = 0.40;		
			//You will not need to change the following
			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,n,mrate,crate);
			//Run the GA for 10,000 function calls
			double f = ga.RunSGA(10000,false,i+1).GetFitness();
			
			System.out.println(f);
		}
	}
	

}
