public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    public String toString() {
        return "Student's name: " + name + ", Total fees paid: $" + feesPaid;
    }
}
