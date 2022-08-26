public class bitmani6 {
    //swapping 2 nos. using XOR operator.
    public static void main(String[] args) {
        int x =2, y=3;
        System.out.println("Before swapping : x = "+ x   +"and y ="+ y);
        //after swapping 
        x = x^y; //convert both nos.to binary and evaluate
        y = x^y;
        x = x^y;
        System.out.println("After swapping : x = "+ x   +"and y ="+ y);
    }
}
