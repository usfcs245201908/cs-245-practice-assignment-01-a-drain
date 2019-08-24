class Practice01MathIterative implements Practice01Math {

    public int fib(int n) throws Exception{
        if (n < 0) throw new Exception("Negative n");
        int first = 0;
        int second = 1;
        int sum = 0;

        if (n == 0) return first;

        for(int i = 2; i <= n; i++){
            sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    public int fact(int n) throws Exception {
        if (n < 0) throw new Exception("Negative n");

        int fact = 1;

        for(int i=1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args){
        Practice01MathIterative math = new Practice01MathIterative();
        System.out.println("Fib: " + math.fib(5));
        System.out.println("Fact: " + math.fact(5));
    }

}