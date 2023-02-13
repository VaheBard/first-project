public class Main {
    public static void main(String[] args) {
        long [] sales = {1, 2, 300, 200};

        SalesManager salesManager = new SalesManager(sales);

        long max = salesManager.max();
        long min = salesManager.min();
        long avrg = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(avrg);
    }
}
