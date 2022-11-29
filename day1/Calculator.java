package week1.day1;

public class Calculator {
	public int add(int a,int b) {
		int c= a+b;
		return c;
	}
public int add1(int a,int b,int c)
{int d=a+b+c;
return d;
}
public int mul(int a,int b) {
	int e=a*b;
	return e;
}
public double mult(int a,double b) {
	double f=a*b;
	return a*b;
}
public int sub(int a,int b) {
	int g=a-b;
	return g;
} 
public double sub1(double a,double b) {
	double h=a-b;
	return h;
}
public int div(int a,int b) {
	int i=a/b;
	return i;
}
public double div1(double a,int b) {
	double j=a/b;
	return j;
}
public static void main(String[] args) {
		Calculator cal=new Calculator();
		int add=cal.add(10,20);
		int add1=cal.add1(5,5,5);
		int mul=cal.mul(2,5);
		double mult=cal.mult(11,123.1234);
		int sub=cal.sub(30, 10);
		double sub1=cal.sub1(123.1234,456.4567);
		int div=cal.div(10, 2);
		double div1=cal.div1(123.1234,10);
System.out.println(add);
System.out.println(add1);
System.out.println(mul);
System.out.println(mult);
System.out.println(sub);
System.out.println(sub1);
System.out.println(div);
System.out.println(div1);

	}

}
