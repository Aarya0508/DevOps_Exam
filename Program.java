import java.io.*;
class Program {
static double sum(int x, int n) {
double i, total = 1.0;
for (i = 2; i <= n; i++)
total = total + (Math.pow(x, i) /i);
return total;
}
public static void main(String[] args) {
int x = Integer.parseInt(System.getenv("x"));
int n = Integer.parseInt(System.getenv("n"));
System.out.printf("%.2f", sum(x, n));
}
}
