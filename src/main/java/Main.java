import java.util.*;

public class Main extends Thread {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<Integer, Double> p001 = new HashMap<Integer, Double>() {{
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
        put(31, 2.453);
        put(32, 2.449);
        put(33, 2.445);
        put(34, 2.441);
        put(35, 2.438);
        put(36, 2.434);
        put(37, 2.431);
        put(38, 2.429);
        put(39, 2.426);
        put(40, 2.423);
        put(41, 2.420); //guess
        put(42, 2.418);
        put(43, 2.416); //guess
        put(44, 2.414);
        put(45, 2.412); //guess
        put(46, 2.410);
        put(47, 2.408); //guess
        put(48, 2.407);
        put(49, 2.405); //guess
        put(50, 2.403);
        put(51, 2.402); //guess
        put(52, 2.400); //guess
        put(53, 2.399); //guess
        put(54, 2.398); //guess
        put(55, 2.396); //guess
        put(56, 2.395); //guess
        put(57, 2.393); //guess
        put(58, 2.392); //guess
        put(59, 2.391); //guess
        put(60, 2.390);
        put(70, 2.381);
        put(80, 2.374);
        put(90, 2.369);
        put(100, 2.364);
        put(120, 2.358);
        put(150, 2.351);
        put(200, 2.345);
        put(300, 2.339);
        put(500, 2.334);
        put(1000, 2.330);
    }};
    static HashMap<Integer, Double> p0025 = new HashMap<Integer, Double>() {{
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
        put(31, 2.040);
        put(32, 2.037);
        put(33, 2.035);
        put(34, 2.032);
        put(35, 2.030);
        put(36, 2.028);
        put(37, 2.026);
        put(38, 2.024);
        put(39, 2.023);
        put(40, 2.021);
        put(41, 2.020); //guess
        put(42, 2.018);
        put(43, 2.021); //guess
        put(44, 2.015);
        put(45, 2.014); //guess
        put(46, 2.013);
        put(47, 2.012); //guess
        put(48, 2.011);
        put(49, 2.010); //guess
        put(50, 2.009);
        put(51, 2.009); //guess
        put(52, 2.008); //guess
        put(53, 2.007); //guess
        put(54, 2.006); //guess
        put(55, 2.005); //guess
        put(56, 2.004); //guess
        put(57, 2.003); //guess
        put(58, 2.002); //guess
        put(59, 2.001); //guess
        put(60, 2.000);
        put(70, 1.994);
        put(80, 1.990);
        put(90, 1.987);
        put(100, 1.984);
        put(120, 1.980);
        put(150, 1.976);
        put(200, 1.972);
        put(300, 1.968);
        put(500, 1.965);
        put(1000, 1.962);
    }};
    static HashMap<Integer, Double> p005 = new HashMap<Integer, Double>() {{
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
        put(31, 1.695);
        put(32, 1.694);
        put(33, 1.692);
        put(34, 1.691);
        put(35, 1.690);
        put(36, 1.688);
        put(37, 1.687);
        put(38, 1.686);
        put(39, 1.685);
        put(40, 1.684);
        put(41, 1.683); //guess
        put(42, 1.682);
        put(43, 1.681); //guess
        put(44, 1.680);
        put(45, 1.680); //guess
        put(46, 1.679);
        put(47, 1.678); //guess
        put(48, 1.677);
        put(49, 1.677); //guess
        put(50, 1.676);
        put(51, 1.676); //guess
        put(52, 1.675); //guess
        put(53, 1.675); //guess
        put(54, 1.674); //guess
        put(55, 1.674); //guess
        put(56, 1.674); //guess
        put(57, 1.673); //guess
        put(58, 1.673); //guess
        put(59, 1.672); //guess
        put(60, 1.671);
        put(70, 1.667);
        put(80, 1.664);
        put(90, 1.662);
        put(100, 1.660);
        put(120, 1.658);
        put(150, 1.655);
        put(200, 1.652);
        put(300, 1.650);
        put(500, 1.648);
        put(1000, 1.646);
    }};
    static double mean1;
    static double mean2;
    static double standardDeviation1;
    static double standardDeviation2;
    static double variance1;
    static double variance2;
    static double critical = 0.0;
    static double p;

    public static void main(String[] args) {
        //TWO TAILED: if we ask the difference between the two sets
        //ONE TAILED: if we ask about one set significantly larger

        //unpaired: The two sets are not related to one another
        //paired: The two sets are related to each other, they line up

        //one sample: in one set the mean is significantly different from an m value
        //two sample: there is a significant difference between the two sets' means

        menu();

        //explaining: https://www.youtube.com/watch?v=qvPWQ-e03tQ
        //manual: https://commons.apache.org/proper/commons-math/javadocs/api-3.6/org/apache/commons/math3/stat/inference/TTest.html
        //testing: https://www.graphpad.com/quickcalcs/ttest1/
    }

    private static void oneSampledTTest(HashMap<Integer, Double> p005, HashMap<Integer, Double> p0025, HashMap<Integer, Double> p001) {
        ArrayList<Double> dataset = new ArrayList<Double>();
        //fist dataset
        System.out.println("Type in the represented data of the set! Type '-1' to quit!");
        int i = 1;
        while (true) {
            System.out.print(i + ".: ");
            double userInput = scanner.nextDouble();
            if (userInput != -1) {
                dataset.add(userInput);
                i++;
            } else
                break;
        }
        int n = dataset.size();
        System.out.println("Dataset completed\n------------\n");

        int degrees_of_freedom = n - 1;
        System.out.println("Type in the value you want to examine!");
        double m = scanner.nextDouble();

        //mean, standard deviation, variance
        mean1 = mean(dataset);
        if (n < 30)
            standardDeviation1 = standardDeviation(dataset);
        else
            standardDeviation1 = Math.pow(standardDeviation(dataset), 2);
        variance1 = variance(dataset, mean1);
        System.out.println("Mean of the sets:\t\t\t\t\t\t" + String.format("%.3f", mean1));
        System.out.println("Standard Deviation of the sets:\t\t\t" + String.format("%.3f", standardDeviation1));
        System.out.println("Variance of the sets:\t\t\t\t\t" + String.format("%.3f", variance1));
        System.out.println("Degrees of Freedom: " + degrees_of_freedom);

        //calculate the t-value
        double t_value;

        double tValueStartTime = System.currentTimeMillis();
        t_value = (mean1 - m) / (standardDeviation1 / Math.sqrt(n));
        System.out.println("T-value = " + String.format("%.3f", t_value));
        double tValueEndTime = System.currentTimeMillis();

        //significance level = chance of data being random
        System.out.println("\nSignificance level is:\n1) P = 0.05\n2) P = 0.025\n3) P = 0.01");
        int option = scanner.nextInt();
        p = pOption(option);

        //we take a p*100% risk that we reject the null hypothesis while its true
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

        System.out.print(100 - (p * 100) + "% confidence, that ");
        if (Math.abs(t_value) > critical)
            System.out.println("the mean is significantly different from " + m + ", we reject null hypothesis.");
        else
            System.out.println("the mean is not significantly different from " + m + ", we accept null hypothesis.");

        double ttestTimeEnd = System.currentTimeMillis();

        //timing results
        System.out.println("Sequential T-Test calculation Time: " + ((tValueEndTime - tValueStartTime) + (ttestTimeEnd - ttestTimeStart)) + "ms.");
        exit();
    }

    private static void twoSampledTTest(HashMap<Integer, Double> p005, HashMap<Integer, Double> p0025, HashMap<Integer, Double> p001) {
        ArrayList<Double> dataset1 = new ArrayList<Double>();
        ArrayList<Double> dataset2 = new ArrayList<Double>();
        double arrayElement = 0;

        //random datasets
        double min = 10;
        double max = 20;

        Random r = new Random();
        for (int i = 0; i < 30; i++) {
            double randomValue = min + (max - min) * r.nextDouble();
            dataset1.add(randomValue);
        }
        int n = dataset1.size();

        for (int i = 0; i < 30; i++) {
            double randomValue = min + (max - min) * r.nextDouble();
            dataset2.add(randomValue);
        }
        int m = dataset2.size();

        //fist dataset
//        int i = 1;
//        System.out.println("Type in the represented data of the first set! Type '-1' to quit!");
//        while (true) {
//            System.out.print(i + ".: ");
//            double userInput = scanner.nextDouble();
//            if (userInput != -1) {
//                dataset1.add(userInput);
//                i++;
//            }else
//                break;
//        }
//        int n = dataset1.size();
//        System.out.println("First dataset completed\n------------\n");
//
//        //second dataset
//        i = 1;
//        System.out.println("Type in the represented data of the second set! Type '-1' to quit!");
//        while (true) {
//            System.out.print(i + ".: ");
//            double userInput = scanner.nextDouble();
//            if (userInput != -1) {
//                dataset2.add(userInput);
//                i++;
//            }else
//                break;
//        }
//        int m = dataset2.size();
//        System.out.println("Second dataset completed\n------------\n");


        int degrees_of_freedom = n + m - 2;

        //mean, standard deviation, variance
        double tValueStartTime = System.currentTimeMillis();

        mean1 = mean(dataset1);
        mean2 = mean(dataset2);
        standardDeviation1 = Math.pow(standardDeviation(dataset1), 2);
        standardDeviation2 = Math.pow(standardDeviation(dataset2), 2);
        variance1 = variance(dataset1, mean1);
        variance2 = variance(dataset1, mean2);
        System.out.println("Mean of the sets:\t\t\t\t\t\t" + String.format("%.3f", mean1) + "\t" + String.format("%.3f", mean2));
        System.out.println("Standard Deviation of the sets:\t\t\t" + String.format("%.3f", standardDeviation1) + "\t" + String.format("%.3f", standardDeviation2));
        System.out.println("Variance of the sets:\t\t\t\t\t" + String.format("%.3f", variance1) + "\t" + String.format("%.3f", variance2));
        System.out.println("Degrees of Freedom: " + degrees_of_freedom);

        //calculate the t-value
        double t_value;
        t_value = ((mean1 - mean2) / (Math.sqrt((n - 1) * standardDeviation1 +
                (m - 1) * standardDeviation2))) *
                (Math.sqrt((n * m * (double) (degrees_of_freedom)) / (n + m)));

        System.out.println("T-value = " + String.format("%.3f", t_value));
        double tValueEndTime = System.currentTimeMillis();


        //significance level = chance of data being random
        System.out.println("\nSignificance level is:\n1) P = 0.05\n2) P = 0.025\n3) P = 0.01");
        int option = scanner.nextInt();
        p = pOption(option);

        //tail definition
//        System.out.println("(1) Two tailed or (2) One tailed?");
//        int tailOption = scanner.nextInt();
//        if (tailOption == 1) {
//            p = POption(option) / 2;
//        } else {
//            p = POption(option);
//        }

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

        //calculate tail
        if (t_value < 0) {
            critical = critical * (-1);
            System.out.println("Left-tail, critical value becomes negative: " + critical);
        } else {
            System.out.println("Right-tail");
        }

        System.out.print(100 - (p * 100) + "% confidence, that ");
        if (t_value > critical) {
//            if (tailOption == 1) {
//                System.out.print(100 - (p * 200) + "% confidence, that ");
//            } else
//                System.out.print(100 - (p * 100) + "% confidence, that ");
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
        System.out.println("Sequential T-Test calculation Time: " + String.format("%.5f", ((tValueEndTime - tValueStartTime) + (ttestTimeEnd - ttestTimeStart))) + "ms.");
        exit();
    }

    private static void exit() {
        System.out.println("\nAnother measure? (1) Yes, (2) No");
        int thereIsAnother = scanner.nextInt();
        if (thereIsAnother == 1) {
            menu();
        } else if (thereIsAnother == 2) {
            System.out.println("See ya");
            System.exit(0);
        }
    }

    private static void menu() {
        System.out.println("*****Welcome to the T-TEST*****");
        System.out.println("(1) One sampled or (2) Two sampled T-Test?");
        int option = scanner.nextInt();
        if (option == 1) {
            //one sampled t-test
            oneSampledTTest(p005, p0025, p001);
        } else if (option == 2) {
            //two sampled t-test
            twoSampledTTest(p005, p0025, p001);
        } else {
            System.out.println("This option is not valid!");
            menu();
        }
    }

    private static double pOption(int option) {
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
                pOption(option);
        }
        return p;
    }

    private static double variance(ArrayList<Double> dataset, double mean) {
        double sqDiff = 0;
        for (int i = 0; i < dataset.size(); i++) {
            sqDiff += (dataset.get(i) - mean) * (dataset.get(i) - mean);
        }
        return (double) sqDiff / dataset.size();
    }

    private static double standardDeviation(ArrayList<Double> dataset) {
        double sum = 0;
        for (int i = 0; i < dataset.size(); i++) {
            sum = sum + ((dataset.get(i) - mean(dataset)) * (dataset.get(i) - mean(dataset)));
        }
        return (double) Math.sqrt(sum / (dataset.size() - 1));
    }

    private static double mean(ArrayList<Double> dataset) {
        double sum = 0;
        for (Double aDouble : dataset) {
            sum += aDouble;
        }
        return sum / dataset.size();
    }
}
