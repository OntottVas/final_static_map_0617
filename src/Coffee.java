public class Coffee {
    String beanType;
    int bitterness;
    String roast;

    static int counter = 0;

    public Coffee(String beanType, int bitterness, String roast) {
        this.beanType = beanType;
        this.bitterness = bitterness;
        this.roast = roast;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
