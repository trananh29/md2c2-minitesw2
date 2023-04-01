import java.time.LocalDate;
import java.util.Date;

public class Meat extends Material implements MaterialManagement.Discount{
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*getWeight();
    }

    @Override
    public LocalDate getExxpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        long daysBetween= getManufacturingDate().toEpochDay()-LocalDate.now().toEpochDay();
        if(daysBetween <=5 && daysBetween > 0) {
            return getAmount()*0.7;
           //Nếu thịt còn 5 ngày hết hạn thì giảm 30%
        } else if (daysBetween <0 ) return 0;
        // hết hạn thì cho
        else return getAmount()*0.9;
        // còn lại thì giảm 10%.
    }
}
