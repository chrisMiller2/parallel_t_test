import java.util.ArrayList;

public class ParallelSum extends Thread {

    ArrayList<Double> array;
    int min_idx, max_idx;
    double partial;

    ParallelSum(ArrayList<Double> array, int min_idx, int max_idx)
    {
        this.array = array;
        this.min_idx = min_idx;
        this.max_idx = max_idx;
        partial = 0.0;
    }

    @Override
    public void run()
    {
        for(int i = min_idx; i < max_idx; i++)
        {
            partial += array.get(i);
        }
    }
}
