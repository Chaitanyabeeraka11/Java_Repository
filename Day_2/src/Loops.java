public class Loops {
    public static void main(String[] args) {
        int i = 0;
        for(; i < 10;){
            System.out.println(i);
            i++;
        }
        int count = 10;
        System.out.println("While loop");

        while(count <= 20){
            
            System.out.println(count);
            count = count + 1;
        }
        System.out.println("Do while loop");
        int dowhile = 10;
        do { 
            System.out.println(dowhile);
            dowhile--;
        } while (dowhile > 0);
    }
}
