
class Dog{
	String breed="husky";
	String colour="white";
	int age=5;
	
	void bark(){
		System.out.println(colour+  " the dog is barking and the age of dog is "  +age);
		}
	void type(){
		System.out.println(" the type of dog is "  +breed);
		}
		
		public static void main(String[]args){
			Dog d1=new Dog();
			Dog d2=new Dog();
			Dog d3=new Dog();
			
			d1.bark();
			d2.type();
			d3.bark();
			d3.type();
		}
}
		
	