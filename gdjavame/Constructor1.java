class Show{
	int a;
	int b;
	int c;
	String name;
	int d;
	Show(int a,int b){
		this.a=a;
		this.b=b;
	}
	Show(String a, int b){
		this.name=a;
		this.d=b;
	}
	void display(){
		System.out.println(d+ " my name is " +name);
		} 
	void add(){
		c=a+b;
		System.out.println(" Addition is : " +c);
		}
	}
class Constructor1{
	public static void main(String[]args){
	Show s1=new Show(50,50);
	Show s2=new Show(10,56);
	Show s3=s2;
	Show s4=new Show("gaju", 500);
	s1.add();
	s2.add();
	s3.add();
	s4.display();
	
	}
}