import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;
import org.apache.commons.math3.stat.inference.TTest;

import java.util.HashMap;
import java.util.Scanner;

public class Main extends Thread {
    public static void main(String[] args) {
        CalculateTTest();

        //is the data two tailed or one tailed?
        //TWO TAILED: if we ask the difference between the two sets
        //ONE TAILED: if we ask about one set significantly larger

        //is the data paired or unpaired?
        //unpaired: The two sets are not related to one another
        //paired: The two sets are related to each other, they line up

        //explaining: https://www.youtube.com/watch?v=qvPWQ-e03tQ
        //manual: https://commons.apache.org/proper/commons-math/javadocs/api-3.6/org/apache/commons/math3/stat/inference/TTest.html
        //testing: https://www.graphpad.com/quickcalcs/ttest1/
    }

    private static void CalculateTTest() {
        HashMap<Integer, Double> p005 = new HashMap<Integer, Double>() {{
            put(1, 6.314);
            put(2, 2.920);
            put(3, 2.353);
            put(4, 2.132);
            put(5, 2.015);
            put(6, 1.943);
            put(7, 1.895);
            put(8, 1.860);
            put(9, 1.833);
            put(10, 1.812);
            put(11, 1.796);
            put(12, 1.782);
            put(13, 1.771);
            put(14, 1.761);
            put(15, 1.753);
            put(16, 1.746);
            put(17, 1.740);
            put(18, 1.734);
            put(19, 1.729);
            put(20, 1.725);
            put(21, 1.721);
            put(22, 1.717);
            put(23, 1.714);
            put(24, 1.711);
            put(25, 1.708);
            put(26, 1.706);
            put(27, 1.703);
            put(28, 1.701);
            put(29, 1.699);
            put(30, 1.697);
            put(40, 1.684);
            put(60, 1.671);
            put(120, 1.658);
            put(999, 1.645);
        }};
        HashMap<Integer, Double> p0025 = new HashMap<Integer, Double>() {{
            put(1, 12.076);
            put(2, 4.303);
            put(3, 3.182);
            put(4, 2.776);
            put(5, 2.571);
            put(6, 2.447);
            put(7, 2.365);
            put(8, 2.306);
            put(9, 2.262);
            put(10, 2.228);
            put(11, 2.201);
            put(12, 2.179);
            put(13, 2.160);
            put(14, 2.145);
            put(15, 2.131);
            put(16, 2.120);
            put(17, 2.110);
            put(18, 2.101);
            put(19, 2.093);
            put(20, 2.086);
            put(21, 2.080);
            put(22, 2.074);
            put(23, 2.069);
            put(24, 2.064);
            put(25, 2.060);
            put(26, 2.056);
            put(27, 2.052);
            put(28, 2.048);
            put(29, 2.045);
            put(30, 2.042);
            put(40, 2.021);
            put(60, 2.000);
            put(120, 1.980);
            put(999, 1.960);
        }};
        HashMap<Integer, Double> p001 = new HashMap<Integer, Double>() {{
            put(1, 31.821);
            put(2, 6.965);
            put(3, 4.541);
            put(4, 3.747);
            put(5, 3.365);
            put(6, 3.143);
            put(7, 2.998);
            put(8, 2.896);
            put(9, 2.821);
            put(10, 2.764);
            put(11, 2.718);
            put(12, 2.681);
            put(13, 2.650);
            put(14, 2.624);
            put(15, 2.602);
            put(16, 2.583);
            put(17, 2.567);
            put(18, 2.552);
            put(19, 2.539);
            put(20, 2.528);
            put(21, 2.518);
            put(22, 2.508);
            put(23, 2.500);
            put(24, 2.492);
            put(25, 2.485);
            put(26, 2.479);
            put(27, 2.473);
            put(28, 2.467);
            put(29, 2.462);
            put(30, 2.457);
            put(40, 2.423);
            put(60, 2.390);
            put(120, 2.358);
            put(999, 2.326);
        }};
        Scanner scanner = new Scanner(System.in);

        double mean1;
        double mean2;
        double standardDeviation1;
        double standardDeviation2;
        double variance1;
        double variance2;
        double[] dataset1;
        double[] dataset2;
        double critical = 0.0;
        double p;
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
        dataset1 = new double[]{23, 25, 28, 30, 25, 25, 26, 25, 22, 30, 35, 40, 35, 30};
        dataset2 = new double[]{35, 40, 30, 35, 40, 45, 30, 30, 35, 40, 40, 35, 38, 41};
        int count = dataset1.length;
        int degrees_of_freedom = count - 1;

        //calculate differences
        double[] difference = new double[count];
        double[] difference_squared = new double[count];
        for (int i = 0; i < count; i++) {
            difference[i] = dataset1[i] - dataset2[i];
            difference_squared[i] = Math.pow(difference[i], 2);
        }
        double difference_sum = 0;
        double difference_squared_sum = 0;
        for (int i = 0; i < count; i++) {
            difference_sum += difference[i];
            difference_squared_sum += difference_squared[i];
        }


        //mean, standard deviation, variance
        mean1 = Mean(dataset1);
        mean2 = Mean(dataset2);
        standardDeviation1 = StandardDeviation(dataset1);
        standardDeviation2 = StandardDeviation(dataset2);
        variance1 = Variance(dataset1, mean1);
        variance2 = Variance(dataset1, mean2);
        System.out.println("Mean of the sets:\t\t\t\t\t\t" + String.format("%.3f", mean1)+ "\t" + String.format("%.3f", mean2));
        System.out.println("Standard Deviation of the sets:\t\t\t" + String.format("%.3f", standardDeviation1) + "\t" + String.format("%.3f", standardDeviation2));
        System.out.println("Variance of the sets:\t\t\t\t\t" + String.format("%.3f", variance1) + "\t" + String.format("%.3f", variance2));
        System.out.println("The mean of the difference of the sets:\t" + String.format("%.3f", difference_sum / count));
        System.out.println("Degrees of Freedom: " + degrees_of_freedom);

        //calculate the t-value
//        final double finalMean = mean1;
//        final double finalMean1 = mean2;
//        final double finalVariance = variance1;
//        final double finalVariance1 = variance2;
        double t_value;

        double tValueStartTime = System.currentTimeMillis();
//        t_value = (mean1 - mean2) /
//                (double) (Math.sqrt((standardDeviation1*standardDeviation2) /
//                        count + (standardDeviation1*standardDeviation2) / count));
        t_value = (difference_sum) /
                (Math.sqrt((count * difference_squared_sum - (Math.pow(difference_sum, 2))) / (count - 1)));
        System.out.println("T-value = " + String.format("%.3f", t_value));
        double tValueEndTime = System.currentTimeMillis();


        //significance level = chance of data being random
        System.out.println("\nSignificance level is:\n1) P = 0.05\n2) P = 0.025\n3) P = 0.01");
        int option = scanner.nextInt();


        //tail definition
        System.out.println("(1) Two tailed or (2) One tailed?");
        int tailOption = scanner.nextInt();
        if (tailOption == 1) {
            p = POption(option) / 2;
        } else {
            p = POption(option);
        }

        //we want a critical value that is less, than p
        //so we have less than p*100% chance that the data is random
        if (p == 0.01) {
            critical = p001.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        } else if (p == 0.025) {
            critical = p0025.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        } else if (p == 0.05) {
            critical = p005.get(degrees_of_freedom);
            System.out.println("Critical value is " + critical + ".");
        }


        //calculate t-test value
        double ttestTimeStart = System.currentTimeMillis();

        if (t_value < 0) {
            critical = critical * (-1);
            System.out.println("Left-tail, critical value becomes negative: " + critical);
        } else {
            System.out.println("Right-tail");
        }

        if (t_value < critical) {
            if (tailOption == 1) {
                System.out.print(100 - (p * 200) + "% confidence, that ");
            } else
                System.out.print(100 - (p * 100) + "% confidence, that ");
            System.out.println("it is significant, the data is not likely random, we reject null hypothesis.");
        } else
            System.out.println("it is not significant, the data is likely random, we accept null hypothesis.");

//        TTest ttest = new TTest();
//        double t_statistic = 0.0;
//        boolean isItSignificant = false;
//        System.out.println("Are the sets (1) paired or (2) unpaired?");
//        int paired = scanner.nextInt();
//        if (paired == 1) {
//            //two tailed, paired
//            t_statistic = ttest.pairedTTest(dataset1, dataset2);
//            isItSignificant = ttest.pairedTTest(dataset1, dataset2, p);
//            System.out.println("T Test: " + Double.toString(t_statistic) + ", only " + Math.round(t_statistic * 100) + "%.");
//
//            //the less the ttest value, the more significant it is
//            if (isItSignificant) {
//                System.out.println("it is significant, the data is not likely random, we reject null hypothesis");
//            } else {
//                System.out.println("it is not significant, the data is likely random, we accept null hypothesis");
//            }
//        } else if (paired == 2) {
//            t_statistic = ttest.tTest(dataset1, dataset2);
//            isItSignificant = ttest.tTest(dataset1, dataset2, p);
//            System.out.println("T Test: " + Double.toString(t_statistic) + ", only " + Math.round(t_statistic * 100) + "%.");
//
//            //the less the ttest value, the more significant it is
//            if (isItSignificant) {
//                System.out.println("it is significant, the data is not likely random, we reject null hypothesis");
//            } else {
//                System.out.println("it is not significant, the data is likely random, we accept null hypothesis");
//            }
//        }

        double ttestTimeEnd = System.currentTimeMillis();

        //timing results
        System.out.println("Sequential T-Test calculation Time: " + ((tValueEndTime - tValueStartTime) + (ttestTimeEnd - ttestTimeStart)) + "ms.");

    }

    private static double POption(int option) {
        double p = 0.0;
        switch (option) {
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

    private static double Variance(double[] dataset, double mean) {
        double sqDiff = 0;
        for (int i = 0; i < dataset.length; i++) {
            sqDiff += (dataset[i] - mean) * (dataset[i] - mean);
        }
        return (double) sqDiff / dataset.length;
    }

    private static double StandardDeviation(double[] dataset) {
        double sum = 0;
        for (int i = 0; i < dataset.length; i++) {
            sum = sum + ((dataset[i] - Mean(dataset)) * (dataset[i] - Mean(dataset)));
        }
        return (double) Math.sqrt(sum / (dataset.length - 1));
    }

    private static double Mean(double[] dataset1) {
        double sum = 0;
        for (int i = 0; i < dataset1.length; i++) {
            sum += dataset1[i];
        }
        return sum / dataset1.length;
    }
}
