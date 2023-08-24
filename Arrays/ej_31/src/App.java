import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);

        int nums [] = new int[3];
        int i;
        for (i = 0; i < nums.length; i++) {
            System.out.println("Mandame un num en la pos " + (i+1));
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Tus numeros son");
        for ( i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        } 

    }

}
