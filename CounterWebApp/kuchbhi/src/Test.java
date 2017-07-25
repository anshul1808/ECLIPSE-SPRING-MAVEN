public class Test
{
	void m1(Emp e1)
	{
		System.out.println("KUCH KARRR");
		
	}
	
	public static void main(String[] args) {
		
		String sss;
		int iii;
		Test t=new Test();
		Emp e=new Emp();
		t.m1(e);
		e.setName("Anshul");
		e.setage(22);
		
		sss=e.name;
		iii=e.age;
		
		System.out.println(sss+" "+iii);
		
	}
}