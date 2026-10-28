import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter a string:");
        String asg=a.nextLine();
        String rev="";
        for(int i=asg.length()-1;i>=0;i--){
            rev=rev+asg.charAt(i);
           }
          System.out.print("reversed string:"+rev);
        a.close();
    }
}