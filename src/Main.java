public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

//        Option 1
        int c = calc.devide.apply(a, b);

//        Option 2
//        int c;
//        try {
//            c = calc.devide.apply(a, b);
//        } catch (ArithmeticException exception){
//            c = 0;
//        }

        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(a);
        int f = calc.abs.apply(a);

        calc.println.accept(a);
        calc.println.accept(b);
        if (c == 0) {
            System.out.println("Деление на ноль");
        } else {
            calc.println.accept(c);
        }
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener error = System.out::println;
        Worker worker = new Worker(listener, error);
        worker.start();
    }
}