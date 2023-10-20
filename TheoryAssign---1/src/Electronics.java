public class Electronics extends Product{
    double powerConsumption;
    double warranty;

    public Electronics(String name, double price,int stockQuantity, double tax,double powerConsumption,double warranty,ElectronicsCategory category){
        super(name,price,stockQuantity,tax,Category.ELECTRONICS);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWarranty() {
        return warranty;
    }

    public void setWarranty(double warranty) {
        this.warranty = warranty;
    }
    public String toString(){
        String res = super.toString();
        res += String.format(" \t %.2f \t %.2f",powerConsumption,warranty);
        return res;
    }
}
