package src.odyssey.java.assignments.loops;

public class W3_Problem_22 {
    public static void main(String[] args) {
        String x,y;
        x="1";
        y="0";
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {

                if(j%2!=1){
                System.out.print(x);
            }else{
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }
}
