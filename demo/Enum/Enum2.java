package demo.Enum;

enum Season {
    Winter, Spring, Summer, fall
};

public class Enum2 {

    public static void main(String[] args) {
        for (Season S : Season.values()) {//FIXED TYPE VALUE ACCESS
            System.out.println(S);
        }
        System.out.println("value of winter is " + Season.valueOf("Winter"));
        System.out.println("index of winter is " + Season.valueOf("Winter").ordinal());
System.out.println("value of winter is " + Season.valueOf("Winter"));
        System.out.println("index of winter is " + Season.valueOf("Winter").ordinal());
        System.out.println("value of winter is " + Season.valueOf("Winter"));
        System.out.println("index of winter is " + Season.valueOf("Winter").ordinal());
    }
}
