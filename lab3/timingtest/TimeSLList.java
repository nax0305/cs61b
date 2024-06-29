package timingtest;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
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
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE
        AList<Integer> n = new AList<>();
        AList<Double> t = new AList<>();
        AList<Integer> oc = new AList<>();

        SLList<Integer> slList = new SLList<>();
        for (int i = 1; i <= 128000; i++) {
            slList.addLast(i);
            if (i == 1000){
                n.addLast(1000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 2000){
                n.addLast(2000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 4000){
                n.addLast(4000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 8000){
                n.addLast(8000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 16000){
                n.addLast(16000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 32000){
                n.addLast(32000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 64000){
                n.addLast(64000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
            else if (i == 128000){
                n.addLast(128000);
                oc.addLast(10000);
                t.addLast(timeCostMOprations(slList, 10000));
            }
        }
        printTimingTable(n, t, oc);
    }

    public static Double timeCostMOprations(SLList<Integer> slList, int m){
        Stopwatch sw = new Stopwatch();
        for (int i = 0; i < m; i++) {
            // 获取最后一个元素要从头遍历，所以getLast runtime会随着队列的size变大而变长
            slList.getLast();
        }
        return sw.elapsedTime();
    }

}
