package com.anders.cphbusiness.Model.TestModel;

import com.anders.cphbusiness.Model.TestResultsModel.RunsTestResult;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
public class RunsTest {

    // FIELDS
    float median;
    float u;
    double z;
    double o;

    // CONTROLLER
    public RunsTest() {
    }

    // METHODS
    public RunsTestResult runsTester(ArrayList<Integer> numbers) {

        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
        ArrayList<Character> sortedRuns = new ArrayList<>();

        // find median.
        Collections.sort(sortedNumbers);
        // if even set of numbers.
        if (sortedNumbers.size() % 2 == 0) {
            median = ((sortedNumbers.get(sortedNumbers.size() / 2) + sortedNumbers.get((sortedNumbers.size() / 2) - 1)) / 2f);
        }
        // if odd set of numbers.
        else {
            median = (sortedNumbers.get(sortedNumbers.size() - 1) / 2) + 1f;
        }

        // sort into runs
        for (Integer number : numbers) {

            // numbers equal to median is omitted
            if (number > median) {
                sortedRuns.add('A'); // above median
            } else if (number < median) {
                sortedRuns.add('B'); // below median
            }
        }

        // count amount of runs
        int runsAmount = 1;

        char temp = sortedRuns.get(0);
        for (char ch : sortedRuns) {
            if (ch != temp) {
                runsAmount++;
                temp = ch;
            }
        }

        // find N1, N2 amounts
        int nONE;
        int nTWO;

        // divide set into A's and B's ((A)bove and (B)elow the median) - Values equal to the median is omitted
        // first value encountered equals n1
        if (sortedRuns.get(0) == 'A') {
            nONE = Collections.frequency(sortedRuns, 'A');
            nTWO = Collections.frequency(sortedRuns, 'B');
        } else {
            nONE = Collections.frequency(sortedRuns, 'B');
            nTWO = Collections.frequency(sortedRuns, 'A');
        }

        // calculate U, O and then Z for 'runs test' formula
        u = ((2f * nONE * nTWO) / (nONE + nTWO)) + 1f;
        o = Math.sqrt(((2d * nONE * nTWO) * (2d * nONE * nTWO - nONE - nTWO)) / (Math.pow(nONE + nTWO, 2d) * (nONE + nTWO - 1d)));

        z = (runsAmount - u) / o;

        System.out.println("z value : " + z);

        // conclusion from rejection region ( a = .05, rejection region = a / 2 = 0.025 = -1.96 ~ 1.96 )
        if (z > -1.96 && z < 1.96) {
            System.out.println("Success - Runs test can't reject that the stream of numbers is random");
            return new RunsTestResult(u, z, o, true);
        } else {
            System.out.println("Failure - Runs test can reject that the stream of numbers is random");
            return new RunsTestResult(u, z, o, false);
        }
    }
}



