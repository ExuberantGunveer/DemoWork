public class Demo {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int z = ((a>b && a>c)?a:(b>a && b>c)?b:c);
        System.out.println(z);
    }
}
