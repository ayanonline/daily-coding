public class AverageOfThreeNumbers {
    static void calcAverageOfThree(float num1, float num2, float num3) {
        float average = (num1 + num2 + num3) / 3;
        System.out.println("Sum of " + num1 + ", " + num2 + ", " + num3 + " is = " + average);
    }

    public static void main(String[] args) {
        calcAverageOfThree(2, 4, 8);
    }
}
