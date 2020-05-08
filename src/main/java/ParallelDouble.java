public class ParallelDouble extends Thread
{
    double first, second, result;
    String operand;

    ParallelDouble(double first, double second, String operand) {

        this.first = first;
        this.second = second;
        this.operand = operand;
    }

    @Override
    public void run()
    {
        double res = 0.0;

        switch (operand)
        {
            case "+":
                res = first + second;
                break;
            case "*":
                res = first * second;
                break;
            case "-":
                res = first - second;
                break;
            case "/":
                res = first / second;
                break;
        }

        result = res;
    }
}