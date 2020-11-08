package chenPack;

import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {

        Person ming = new Person();
        Student wang = new Student("Xiao Wang", 20, 90);
        ming.setNames("Xiao Ming");
        ming.setBirth(1999);
        System.out.println(Arrays.toString(ming.getNames()) + ", " + ming.getAge());
        System.out.println(wang.getName() + " " + wang.getScore());
        System.out.println(Person.getCount());
        //==============
        Income[] incomes=new Income[]{
                new NormalIncome(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    public static double totalTax(Income... incomes){
        double total=0;
        for(Income income:incomes){
            total+=income.getTax();
        }
        return total;
    }
}