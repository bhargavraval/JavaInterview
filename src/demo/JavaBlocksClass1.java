package demo;

public class JavaBlocksClass1 {

	{
		System.out.println("Non static block 1");
	}

	static {
		System.out.println("Static block 1");
	}

	{
		System.out.println("Non static block 2");
	}

	static {
		System.out.println("Static block 2");
	}

}
