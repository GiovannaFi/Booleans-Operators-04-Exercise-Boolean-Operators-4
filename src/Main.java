public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = a * b; // 3
        int d = c;
        boolean boolean1 = (d / c + 2) >= b || !(c + b - c / a == 3);
        System.out.println(boolean1);

        int x = 5;
        int y = 6;
        boolean t = false;
        boolean f = true;
        boolean boolean2 = (x * x - y * y / 2 != 12) || !t && f;
        System.out.println(boolean2);
    }
}
/*[A]: considering that a=1, b=3, c=a*b, d=c: (d / c + 2) >= b || !(c + b - c / a == 3) TRUE
[B]: considering that x=5, y=6, t=false and f=true: (x * x - y * y / 2 != 12) || !t && f  TRUE*/