package functions;

public class overloading {
	public void add()
	{
		System.out.println("no parameters");
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
		System.out.println("integer parameters");
	}
	public void add(double f, double g)
	{
		double e=f+g;
		System.out.println(e);
		System.out.println("double parameters");
	}
	public void add(String h, String i)
	{
		String j=h+i;
		System.out.println(j);
		System.out.println("string parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading o = new overloading();
		o.add();
		o.add(10,20);
		o.add(10.2345,20.5678);
		o.add("vaishnavi","vaishu");

	}

}
