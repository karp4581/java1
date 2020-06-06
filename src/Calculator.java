public class Calculator {
    private int result;
    public Calculator() {
        this.result = 0;
    }
    public int set(int num) {
        this.result = num;
        return result;
    }
    public int add(int num) {
        this.result = result + num;
        return result;
    }
    public int sub(int num) {
        this.result = result - num;
        return result;
    }

    public int getResult() {
        return result;
    }
}
