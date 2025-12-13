import java.util.*;
public class AreaOfCircle {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius of a Circle->");
        int rad=sc.nextInt();
        System.out.println("Area=>"+ 3.14*rad*rad);
        sc.close();
    }
}
