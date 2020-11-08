package chenPack;

public class NormalIncome implements Income{
    private final double income;

    public NormalIncome(double income){
        this.income=income;
    }

    public double getTax() {
        return income * 0.1;
    }
}
