public class Handshakes {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numOfHandshakes=((n)*(n-1)/2);
        System.out.println("Number of possible handshakes are :"+numOfHandshakes);
    }
}

