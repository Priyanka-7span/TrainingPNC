package array;

public class Students {
    public static void main(String[] args) {
        int marks[] = {60,50,58};
        int sum=0;
        for (int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
