class c1{
	public void m1(){
		System.out.println("m1 i1");
	}
}
class c2{
	public void m1(){
		System.out.println("m2 i2");
	}
}
class test extends c1{
	public  void m1(){
		System.out.println("hioi");
	}
	public static void main(String[] args) {
		test t1=new test();
		t1.m1();
	}
}