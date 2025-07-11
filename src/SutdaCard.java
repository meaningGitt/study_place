public class SutdaCard {
    int num = (int) (Math.random() * 10) + 1;
    boolean isKwang;

    public SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
        if (isKwang)
            System.out.println("광");
    }
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}
class Exercise6_2{
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
