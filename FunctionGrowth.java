public class FunctionGrowth
{
public static void main(String[] args)
{
System.out.println("log n \tn \tn log n n^2 \tn^3");
for (long n = 2; n <= 2048; n *= 2)
{
long logn = (int) Math.log(n);
long nlogn = n * (int) Math.log(n);
long nsq = n * n;
long ncube = n * n * n;
System.out.println(logn +"\t"+ n +"\t"+ nlogn +"\t"+ nsq +"\t"+ ncube);
}
}
}