package com.anders.cphbusiness.testModel;

import com.anders.cphbusiness.numbersModel.runsTestResult;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
public class runsTest {

    // FIELDS
    float median;
    float u;
    double z;
    double o;

    // CONTROLLER
    public runsTest() {
    }

    // METHODS
    public runsTestResult runsTester(ArrayList<Integer> numbers) {

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


        /* TEST ~ from example. **************************************

        ArrayList<Character> testRunsArray = new ArrayList<>();

        String runsTesterSuccess = "AAABAABABBAABBBAAAABBABBAAABBBAAAABBAABBBABBAABBBBBAAABABBAAABAAAABBBABBAAABAABBABAABBBABBAAAABBBAAA";

        for (int i = 0; i < runsTesterSuccess.length(); i++) {
            testRunsArray.add(runsTesterSuccess.charAt(i));
        }

        sortedRuns = testRunsArray;

        *************************************************************/

        // sort into runs
        for (Integer number : numbers) {

            // numbers equal to median is omitted
            if (number > median) {
                sortedRuns.add('A'); // above median
            } else if (number < median) {
                sortedRuns.add('B'); // below median
            }
        }

        System.out.println(median);

        // count amount of runs
        int runsAmount = 1;

        char temp = sortedRuns.get(0);
        for (char ch : sortedRuns) {
            if (ch != temp) {
                runsAmount++;
                temp = ch;
            }
        }

        System.out.println(sortedRuns);
        System.out.println(runsAmount);

        // find N1, N2 amounts
        int nONE;
        int nTWO;

        // divide into A's and B's (bove and below the median)
        // first value encountered = n1
        if (sortedRuns.get(0) == 'A') {
            nONE = Collections.frequency(sortedRuns, 'A');
            nTWO = Collections.frequency(sortedRuns, 'B');
        } else {
            nONE = Collections.frequency(sortedRuns, 'B');
            nTWO = Collections.frequency(sortedRuns, 'A');
        }

        System.out.println("n1 = " + nONE + " n2 = " + nTWO + " amount of runs : " + runsAmount);

        // calculate U, O and then Z for 'runs test' formula
        u = ((2f * nONE * nTWO) / (nONE + nTWO)) + 1f;
        o = Math.sqrt(((2d * nONE * nTWO) * (2d * nONE * nTWO - nONE - nTWO)) / (Math.pow(nONE + nTWO, 2d) * (nONE + nTWO - 1d)));
        z = (runsAmount - u) / o;


        System.out.println(u);
        System.out.println(o);
        System.out.println(z);


        // conclusion from rejection region ( a = .05, rejection region = a / 2 = 0.025 = -1.96 ~ 1.96 )
        if (z > -1.96 && z < 1.96) {
            System.out.println("Runs test can't reject that the stream of numbers is random");
            return new runsTestResult(median, u, z, o, true);
        } else {
            System.out.println("Runs test can reject that the stream of numbers is random");
            return new runsTestResult(median, u, z, o, false);
        }
    }
}



