package guessingGame;

public class Addition {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Adding Machine");
        frame.addRow("First Number");
        frame.addRow("Second Number");
        frame.setButtonText("Sum");
//        frame.setButtonText("Subtraction");
//        frame.setButtonText("Division");
//        frame.setButtonText("Multiplication");
        frame.go();
    }

    public static int calculate(int firstNumber, int secondNumber) {
       return firstNumber + secondNumber;
    }
}
