public class bitmani5 {
    public static long  moduluExpo(long a, long b, int n ) {
        long ans =1;
        while(b>0){
            if((b&1) != 0){
                ans = (ans*a%n)%n;
        }
        a= (a%n*a%n)%n;
        b=b>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(moduluExpo(3978432,5,1000000007));
    }
}
