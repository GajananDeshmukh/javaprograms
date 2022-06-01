// program to print percentage of subject

import.java.io.*;
class TestBean  {
	private int eng, math, geo, sci, mar,total;
	private double percentage;
	public void setEng(int eng){
		this.eng=eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math){
		this.math=math;
	}
	public int getMath(){
		return math;
	}
	public void setGeo(int geo){
		this.geo=geo;
	}
	public int getGeo(){
		return geo;
	}
	public void setMar(int mar){
		this.mar=mar;
	}
	public int getMar(){
		return mar;
	}
	public void setSci(int sci){
		this.sci=sci;
	}
	public int getSci(){
		rerturn sci;
	}
	public void setTotal(){
		this.total= eng + math + geo + mar + sci;
	}
	public void setPercentage(){
		this.percentage=(((total)/500.0)*100)
	}
}
	public void display() {	
		System.out.println("marks in english is:"+eng);
		System.out.println("marks in math is :"+math);
		System.out.println("marks in geo is :"+geo);
		System.out.println("marks in sci is :"+sci);
		System.out.println("marks in marathi is :"+mar);
		System.out.println("total marks  is :"+total)
		System.out.println("percentage :"+percentage)
		}
class Final {
	public static void main(string[]args) {
	TestBean tb= new TestBean();
	tb.setEng(82);
	tb.getEng();
	tb.setMath(98);
	tb.getMath();
	tb.setGeo(98);
	tb.getGeo();
	tb.setSci(99);
	tb.getSci();
	tb.setMar(92);
	tb.getMar();
	tb.setTotal();
	tb.getTotal();
	tb.setPercentage();
	tb.getPercentage();
	tb.display();
	}
}
	
	