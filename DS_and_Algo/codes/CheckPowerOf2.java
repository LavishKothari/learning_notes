public class CheckPowerOf2 {
    public static void main(String[] args) {
        System.out.println(new CheckPowerOf2().isPowerOf2(100));
        System.out.println(new CheckPowerOf2().isPowerOf2(1024));
    }
    public boolean isPowerOf2(long n) {
        return (n & (n-1)) == 0;
    }
}
