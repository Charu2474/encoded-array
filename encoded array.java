import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner u=new Scanner(System.in);
        int n=u.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            x[i]=u.nextInt();
        }
        y[n-1]=x[n-1];
        for(int i=n-2;i>=0;i--)
        {
                y[i]=x[i]-y[i+1];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(y[i]+" ");
            s+=y[i];
        }
        System.out.println("\n"+s);
    }
}
