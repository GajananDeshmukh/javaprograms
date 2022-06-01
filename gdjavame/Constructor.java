class Show{
	int a;
	int b;
	int c;
	Show(int a,int b){
		this.a=a;
		this.b=b;
	}
	void display(){
		c=a+b;
		System.out.println(" Addition is : " +c);
		}
	}
class Constructor{
	public static void main(String[]args){
	Show s1=new Show(50,50);
	Show s2=new Show(10,56);
	Show s3=s2;
	s1.display();
	s2.display();
	s3.display();
	}
}