package LW_04;

public class Q_06 {
    public static void main(String[] args) {
        int i;
        for(i=10; i<50; i++){
            System.out.printf(i + " ");
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
