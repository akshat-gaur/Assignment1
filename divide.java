public class divide{
    public static void main(String args[]){
        int a=5;
        int b=2;
        System.out.println(divide(a,b));
        System.out.println(mod(a,b));

    }

    public static double divide(int a,int b){
        double c=a/b;
        return c;
    }
    
    public static int mod(int a, int b){
        int c=a%b;
        return c;
    }
}