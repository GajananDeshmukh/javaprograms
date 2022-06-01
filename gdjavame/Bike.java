class Bike{
	String colour="black";
	String type="Gear";
	int average=75;
	
	void Colour(){
		System.out.println(" colour of bike is : " +colour);
		}
	void Type(){
		System.out.println( " type of bike is: " +type); 
		}
	void Average(){
		System.out.println(" average of bike is: " +average);
		}
		static public void main(String[] args){
		Bike b1=new Bike();
		b1.Colour();
		b1.Type();
		b1.Average();
		}
}