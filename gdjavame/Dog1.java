
class Dog1{
	String breed,colour;
	int age;
	
	public void setBreed(String breed){
		this.breed=breed;
	}
	public String getBreed(){
		return breed;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public String getColour(){
		return colour;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	void bark(){
		System.out.println(colour+  " the dog is barking and the age of dog is "  +age);
		}
	void type(){
		System.out.println(" the type of dog is "  +breed);
		}
		
		public static void main(String[]args){
			Dog1 d1=new Dog1();
			
			d1.setBreed("husky");
			d1.setColour("Black");
			d1.setAge(5);
			d1.bark();
			d1.type();
		
		}
}