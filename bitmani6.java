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
        //Now if we want to add 1 to an integer using bitwise not operator
        int z=6;
        System.out.println(z+" + "+ 1 +" is "+-~z);
        z= -4;
        System.out.println(z+" + "+1+" is "+-~z);
        z=0;
        System.out.println(z+" + "+1+" is "+-~z);
       // Convert uppercase character to lowercase
        for (char ch='A';ch<='Z';ch++) {
            System.out.println( (char) (ch|' ') );
        }
        // Convert  lowercase character to uppercase
       /*  for(char ch='a';ch<='z';ch++) {
            System.out.println( (char) (ch&' ') );
        }*/
    }
}
