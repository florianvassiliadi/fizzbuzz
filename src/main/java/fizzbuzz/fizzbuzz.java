package fizzbuzz;

public class fizzbuzz {
	public String test;
	public fizzbuzz(){
		
	}
	public boolean isBuzz(int _nb)
	{
		boolean isBuzz=false;
		if(_nb%5==0)
		{
			isBuzz=true;
		}
		return isBuzz;
	}
	public boolean isFizz(int _nb)
	{
		boolean isFizz=false;
		if(_nb%5==0)
		{
			isFizz=true;
		}
		return isFizz;
	}
}
