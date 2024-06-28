package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        AList<Integer> ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts = new AList<>();
        AList<Integer> timing = new AList<>();
        Stopwatch sw = new Stopwatch();
        for (int i = 1; i <= 128000; i++) {
            timing.addLast(i);
            if (i == 1000){
                ns.addLast(1000);
                opCounts.addLast(1000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 2000){
                ns.addLast(2000);
                opCounts.addLast(2000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 4000) {
                ns.addLast(4000);
                opCounts.addLast(4000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 8000) {
                ns.addLast(8000);
                opCounts.addLast(8000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 16000) {
                ns.addLast(16000);
                opCounts.addLast(16000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 32000) {
                ns.addLast(32000);
                opCounts.addLast(32000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 64000) {
                ns.addLast(64000);
                opCounts.addLast(64000);
                times.addLast(sw.elapsedTime());
            }
            else if (i == 128000) {
                ns.addLast(128000);
                opCounts.addLast(128000);
                times.addLast(sw.elapsedTime());
            }
        }
        printTimingTable(ns, times, opCounts);
    }
}
