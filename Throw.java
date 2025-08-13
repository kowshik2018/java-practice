class Hello
{
	void m1(int x)throws MuthuException
{
		if(x==1)
	{
		throw new NegativeArraySizeException();
	}
		else
		{
			throw new MuthuException();
			}
			}
}
class Main 
{
public static void main(String[] args)throws MuthuException {
Hello h1=new Hello();
h1.m1(5);
	}

}
class MuthuException extends Exception
{
	public MuthuException()
	{
		super();
	}

	}
