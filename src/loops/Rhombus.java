package loops;

public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            for (int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}