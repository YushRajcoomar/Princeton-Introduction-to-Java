public class Exp {
public static void main(String[] args) {
double x = Double.parseDouble(args[0]);
System.out.println(Math.exp(x));
boolean isnegative = false;
if (x<0) {
isnegative = true;
x = -x;
}
double sum = 0.0;
double term = 1.0;
for (int n = 1; sum != sum + term; n++) {
sum += term;
term *= x/n;
}
if (isnegative) {
sum = 1.0/sum;
}
System.out.println(sum);
}
}