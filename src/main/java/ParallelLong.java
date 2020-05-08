public class ParallelLong extends Thread
{
    long first, second, result;
    String operand;

    ParallelLong(long first, long second, String operand) {

        this.first = first;
        this.second = second;
        this.operand = operand;
    }

    @Override
    public void run()
    {
        long res = 0;

        switch (operand)
        {
            case "+":
                res = first + second;
                break;
            case "*":
                res = first * second;
                break;
        }

        result = res;
    }
}
