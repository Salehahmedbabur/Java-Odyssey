package src.odyssey.java.assignments.loops;

public class W3_Problem_17 {
    public static void main(String[]args){
        for(int i=1; i<=5;i++){
            for(int sp =5; sp>=i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
