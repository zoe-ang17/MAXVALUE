public class MAXVALUE {
    public static void main(String[] args) {
    int[] numbers = {100, 80, 60, 40, 20};
    int max = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
    }
}

System.out.println("MAXIMUM VALUE: " + max);

    }
}