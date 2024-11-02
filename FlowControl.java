public class FlowControl {
    public static void main(String[] args) {
        int num = 6;
        if (num == 5){
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
            }
        }

        
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
        if (num == 5){ 
            System.out.println();
        }



        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println(i);
            }
        }
        System.out.println("Done");
    }
}
