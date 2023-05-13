package sda.TestingAdvancedZDJAVApol135.testing.tdd;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        if (y > x) {
            throw new IllegalArgumentException("Y is greater than X");
        } else {
            return x - y;
        }

    }
}
