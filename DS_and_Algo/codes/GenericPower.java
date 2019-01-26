public class GenericPower {
    public static void main(String[] args) {
        System.out.println(new GenericPower().genericPower(1,324));
        System.out.println(new GenericPower().genericPower(345,1));
        System.out.println(new GenericPower().genericPower(1,-2));
        System.out.println(new GenericPower().genericPower(2,-4));
    }
    public double genericPower(double a, int b) {
        if(b==0) return 1;
        if(a==1) return 1;

        double temp = genericPower(a, b/2);
        if(b%2 == 0) {
            return temp*temp;
        } else {
            if(b<0) return temp*temp/a;
            else return temp*temp*a;
        }
    }
}
