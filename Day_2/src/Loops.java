public class Loops {
    public static void main(String[] args) {
        int i;
        int j;
        int count = 0;
        for (i = 0; i < 10; i++) {
            System.err.println(i);
        }
        for(i =10; i>=0; i--){
            for(j=0;j<=i;j++){
                count = count + 1;
            }
            System.out.println(i + j);

        }
        System.out.println(count);
    }
}
