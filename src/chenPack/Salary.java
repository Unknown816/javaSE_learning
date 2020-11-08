package chenPack;

public class Salary implements Income{
    private final double income;

    public Salary(double income){
        this.income=income;
    }

    public double getTax(){
        if(income<=5000){
            return 0;
        }
        return (income-5000)*0.2;
    }
}
