public class IntegerWithLIS {
    private int number;
    private int LIS;

    public IntegerWithLIS(int number, int LIS) {
        this.number = number;
        this.LIS = LIS;
    }

    public int getNumber() {
        return number;
    }

    public int getLIS() {
        return LIS;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLIS(int LIS) {
        this.LIS = LIS;
    }

    @Override
    public String toString(){
        return "Number: " + number + " LIS: " + LIS;
    }
}


