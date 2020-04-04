import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.inference.TTest;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends Thread{
    public static void main(String[] args){
        CalculateTTest();

        //is the data two tailed or one tailed?
        //if we ask the difference between the two sets, we are talking about two tailed ttest
        //if we ask about one set significantly larger, we are talkin about one tailed ttest

        //is the data paired or unpaired?
        //unpaired: The two sets are not related to one another
        //paired: The two sets are related to each other, they line up

        //explaining: https://www.youtube.com/watch?v=qvPWQ-e03tQ
        //manual: https://commons.apache.org/proper/commons-math/javadocs/api-3.6/org/apache/commons/math3/stat/inference/TTest.html
    }

    private static void CalculateTTest() {
        HashMap<Integer, Double> p005 = new HashMap<Integer, Double>(){{
            put(1, 12.71);
            put(2, 4.3);
            put(3, 3.18);
            put(4, 2.78);
            put(5, 2.57);
            put(6, 2.45);
            put(7, 2.36);
            put(8, 2.31);
            put(9, 2.26);
            put(10, 2.23);
            put(11, 2.2);
            put(12, 2.18);
            put(13, 2.16);
            put(14, 2.14);
            put(15, 2.13);
            put(16, 2.12);
            put(17, 2.11);
            put(18, 2.10);
            put(19, 2.09);
            put(20, 2.09);
            put(21, 2.08);
            put(22, 2.07);
            put(23, 2.07);
            put(24, 2.06);
            put(25, 2.06);
            put(26, 2.06);
            put(27, 2.05);
            put(28, 2.05);
            put(29, 2.04);
            put(30, 2.04);
            put(40, 2.02);
            put(60, 2.0);
            put(120, 1.98);
            put(999, 1.96);
        }};
        HashMap<Integer, Double> p0025 = new HashMap<Integer, Double>(){{
            put(1, 25.45);
            put(2, 6.2);
            put(3, 4.17);
            put(4, 3.5);
            put(5, 3.16);
            put(6, 2.97);
            put(7, 2.84);
            put(8, 2.75);
            put(9, 2.68);
            put(10, 2.63);
            put(11, 2.59);
            put(12, 2.56);
            put(13, 2.53);
            put(14, 2.51);
            put(15, 2.49);
            put(16, 2.47);
            put(17, 2.46);
            put(18, 2.44);
            put(19, 2.43);
            put(20, 2.42);
            put(21, 2.41);
            put(22, 2.41);
            put(23, 2.4);
            put(24, 2.39);
            put(25, 2.38);
            put(26, 2.38);
            put(27, 2.37);
            put(28, 2.37);
            put(29, 2.36);
            put(30, 2.36);
            put(40, 2.33);
            put(60, 2.3);
            put(120, 2.27);
            put(999, 2.24);
        }};
        HashMap<Integer, Double> p001 = new HashMap<Integer, Double>(){{
            put(1, 63.66);
            put(2, 9.92);
            put(3, 5.84);
            put(4, 4.6);
            put(5, 4.03);
            put(6, 3.71);
            put(7, 3.5);
            put(8, 3.36);
            put(9, 3.25);
            put(10, 3.17);
            put(11, 3.11);
            put(12, 3.05);
            put(13, 3.01);
            put(14, 2.98);
            put(15, 2.95);
            put(16, 2.92);
            put(17, 2.9);
            put(18, 2.88);
            put(19, 2.86);
            put(20, 2.84);
            put(21, 2.83);
            put(22, 2.82);
            put(23, 2.81);
            put(24, 2.8);
            put(25, 2.79);
            put(26, 2.78);
            put(27, 2.77);
            put(28, 2.76);
            put(29, 2.76);
            put(30, 2.75);
            put(40, 2.02);
            put(60, 2.0);
            put(120, 1.98);
            put(999, 1.96);
        }};
        Scanner scanner = new Scanner(System.in);

        double mean1 = 0;
        double mean2 = 0;
        double standardDeviation1 = 0;
        double standardDeviation2 = 0;
        double variance1 = 0;
        double variance2 = 0;

        //set count of sets

        double[] dataset1;
        double[] dataset2;
//
//        //fist dataset
//        System.out.println("Type in the represented datas of the first set!");
//        for (int i = 0; i < dataset1.length; i++){
//            dataset1[i] = scanner.nextDouble();
//        }
//        System.out.println("First dataset completed\n------------\n");
//
//        //second dataset
//        System.out.println("Type in the represented datas of the second set!");
//        for (int i = 0; i < dataset2.length; i++){
//            dataset2[i] = scanner.nextDouble();
//        }
//        System.out.println("Second dataset completed\n------------\n");



        //for manual input and testing (https://www.youtube.com/watch?v=pTmLQvMM-1M&t=382s)
//        dataset1 = new double[]{15.2, 15.3, 16.0, 15.8, 15.6, 14.9, 15.0, 15.4, 15.6, 15.7, 15.5, 15.2, 15.5, 15.1, 15.3, 15.0};
//        dataset2 = new double[]{15.9, 15.9, 15.2, 16.6, 15.2, 15.8, 15.8, 16.2, 15.6, 15.6, 15.8, 15.5, 15.5, 15.5, 14.9, 15.9};

        //for another manual input and testing
        dataset1 = new double[]{935, 955, 967, 1002, 1000, 964, 952, 933};
        dataset2 = new double[]{978, 982, 1017, 973, 1006, 1017, 995, 1048};
        int count = dataset1.length;
        //calculate mean, standard deviation, variance
        mean1 = Mean(dataset1);
        mean2 = Mean(dataset2);
        System.out.println("Mean of the first set: " + mean1);
        System.out.println("Mean of the second set: " + mean2);
        standardDeviation1 = StandardDeviation(dataset1, mean1);
        standardDeviation2 = StandardDeviation(dataset2, mean2);
        System.out.println("Standard Deviation of the first set: " + standardDeviation1);
        System.out.println("Standard Deviation of the second set: " + standardDeviation2);
        variance1 = Variance(dataset1, mean1);
        variance2 = Variance(dataset1, mean2);
        System.out.println("Variance of the first set: " + variance1);
        System.out.println("Variance of the second set: " + variance2);

        //calculate the t-value
        double tValueStartTime = System.currentTimeMillis();
        final double finalMean = mean1;
        final double finalMean1 = mean2;
        final double finalVariance = variance1;
        final double finalVariance1 = variance2;
        Runnable runnable = () ->{
            double t_value =
                    Math.abs((finalMean - finalMean1))/(Math.sqrt((finalVariance /count)+(finalVariance1 /count)));
            System.out.println("T-value = " + String.format("%.1f", t_value));
        };
        Thread thread = new Thread(runnable);
        thread.start();

        double tValueEndTime = System.currentTimeMillis();

        double critical = 0.0;
        int degrees_of_freedom = count + count - 2;

        //significance level = chance of data being random
        System.out.println("Significance level is\n1) P = 0.05\n2) P = 0.025\n3) P = 0.01");
        int option = scanner.nextInt();
        double p = POption(option);

        if (p == 0.01) {
            //we want a critical value that is less, than 0.01
            //so we have less than 1% chance that the data is random
            critical = p001.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        } else if (p == 0.025) {
            //we want a critical value that is less, than 0.025
            //so we have less than 2.5% chance that the data is random
            critical = p0025.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        } else if (p == 0.05) {
            //we want a critical value that is less, than 0.05
            //so we have less than 5% chance that the data is random
            critical = p005.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        }

        double ttestTimeStart = System.currentTimeMillis();
        //calculate t-test value
        TTest ttest = new TTest();
        double t_statistic = 0.0;
        boolean isItSignificant = false;
        System.out.println("Are the sets (1) paired or (2) unpaired?");
        int paired = scanner.nextInt();
        if(paired == 1){
            //two tailed, paired
            t_statistic = ttest.pairedTTest(dataset1, dataset2);
            isItSignificant = ttest.pairedTTest(dataset1, dataset2, p);
            System.out.println("T Test: " + Double.toString(t_statistic) + ", only " + Math.round(t_statistic*100) + "%.");

            //the less the ttest value, the more significant it is
            if(isItSignificant){
                System.out.println("it is significant, the data is not likely random");
            }else{
                System.out.println("it is not significant, the data is likely random");
            }
        }else if(paired == 2){
            t_statistic = ttest.tTest(dataset1, dataset2);
            isItSignificant = ttest.tTest(dataset1, dataset2, p);
            System.out.println("T Test: " + Double.toString(t_statistic) + ", only " + Math.round(t_statistic*100) + "%.");

            //the less the ttest value, the more significant it is
            if(isItSignificant){
                System.out.println("it is significant, the data is not likely random");
            }else{
                System.out.println("it is not significant, the data is likely random");
            }
        }

        double ttestTimeEnd = System.currentTimeMillis();

        //timing results
        System.out.println("Sequential T-Test calculation Time: " + ((tValueEndTime-tValueStartTime) + (ttestTimeEnd-ttestTimeStart)) + "ms.");

    }

    private static double POption(int option) {
        double p = 0.0;
        switch(option){
            case 1:
                p = 0.05;
                break;
            case 2:
                p = 0.025;
                break;
            case 3:
                p = 0.01;
                break;
            default:
                System.out.println("This option is invalid, select the valid options!");
                POption(option);
        }
        return p;
    }
    private static double Variance(double[] dataset, double mean){
        double sqDiff = 0;
        for (int i = 0; i < dataset.length; i++) {
            sqDiff += (dataset[i] - mean) * (dataset[i] - mean);
        }
        return (double)sqDiff / dataset.length;
    }
    private static double StandardDeviation(double[] dataset, double mean){
        double newSum = 0;
        for (int j = 0; j < dataset.length; j++) {
            newSum = newSum + ((dataset[j] - mean) * (dataset[j] - mean));
        }
        double squaredDiffMean = (newSum) / (dataset.length);
        return (Math.sqrt(squaredDiffMean));
    }
    private static double Mean(double[] dataset1) {
        double sum = 0;
        for (int i = 0; i < dataset1.length; i++) {
            sum += dataset1[i];
        }
        return sum / dataset1.length;
    }
}
