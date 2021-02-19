public class Account {
    private Integer banalce;

    public Account(Integer banalce) {
        this.banalce = banalce;
    }

    public  void transactionToTarget(Integer money, Account target) {
        Allocator.getInstance().apply(this, target);
        this.banalce -= money;
        //System.out.println("banalce = " + this.banalce);
        target.setBanalce(target.getBanalce() + money);
        Allocator.getInstance().release(this, target);
    }

    public  Integer getBanalce() {
        return banalce;
    }

    public  void setBanalce(Integer banalce) {
        this.banalce = banalce;
    }

}
