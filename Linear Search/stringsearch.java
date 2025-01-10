import java.util.Scanner;

public class stringsearch {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        char a = in.next().charAt(0);
        for (int i : name.toCharArray()){
            if (a==i){
                System.out.println("Exists");
            }else {
                break;
            }
        }
    }
}
