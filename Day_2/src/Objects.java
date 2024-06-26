public class Objects {
    public String name(){
        return "Chaitanya";
    }
    public int sum(int num1, int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Objects obj = new Objects();
        System.out.println("name : "+obj.name());
        System.out.println("sum : "+obj.sum(5, 6));
    }
}

