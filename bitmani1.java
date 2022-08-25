public class bitmani1 {
    public static void oddOreven(int n) { //if a no. is odd or even
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("Even no.");
        }else{
            System.out.println("Odd no.");
        }
        
    }
    public static int getIthBit(int n, int i) { // get ith bit
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }
        
    }
    public static int setIthBit(int n, int i) { // set ith bit( make ith 1).
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i) { // clear ith bit (make ith 0).
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i,int newBit) { // update ith bit 
        if(newBit ==0) {
            return  clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
       /* another method
       n= clearIthBit(n,i);
       int BitMask = newBit<<i;
       return n| BitMask;
    }*/
    }
     public static int clearIBit(int n, int i) { //make i bit from last 0. 
        int bitMask = (-1) << i;
        return n & bitMask;
        
    }
    public static void main(String[] args) {
       // oddOreven(4);
        //oddOreven(11);
        //oddOreven(3);
        //oddOreven(98);
        //oddOreven(55);
       // System.out.println(getIthBit(5,3));
       //System.out.println(setIthBit(5,3));
       //System.out.println(clearIthBit(5,3));
      // System.out.println(updateIthBit(5,3,1));
      System.out.println(clearIBit(15,2));
    }
}
