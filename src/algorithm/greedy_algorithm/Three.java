package algorithm.greedy_algorithm;

public class Three {
    double w; //重量
    double v; //价值
    double p; //性价比

    public Three(double w, double v) {
        this.w = w;
        this.v = v;
        this.p = v/w;
    }

    /**
     * @return the p
     */
    public double getP() {
        return p;
    }
}