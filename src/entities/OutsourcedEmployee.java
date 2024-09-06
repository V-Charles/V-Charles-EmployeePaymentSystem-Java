
package entities;

public class OutsourcedEmployee extends Employee{
    
    private Double additionalCharge;
    
    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(Double additionalCharge, String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
