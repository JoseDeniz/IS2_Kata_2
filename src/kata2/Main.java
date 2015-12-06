package kata2;

public class Main {

    public static void main(String[] args) {

        Integer[] numbers = {2, 2, 11, 4, 2, 6, 11, 2, 3, 5, 11, 5};
        String[] names = {"Ana", "Juan", "Pedro", "Lucia", "Ana", "Juan", "Pedro"};

        Histogram<Integer> numberHistogram = new HistogramBuilder<Integer>().build(numbers);
        Histogram<String> nameHistogram = new HistogramBuilder<String>().build(names);

        System.out.printf("%s\n%s", numberHistogram, nameHistogram);
    }

}
