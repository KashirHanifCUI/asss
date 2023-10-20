public class Laptop extends Electronics{
    private String processorType;
    private String ramSize;
    private String screemDimmension;

    public Laptop(String name, double price,int stockQuantity, double tax,double powerConsumption,double warranty,String processorType,String ramSize,String screemDimmension){
        super(name,price,stockQuantity,tax,powerConsumption,warranty,ElectronicsCategory.LAPTOP);
        this.ramSize = ramSize;
        this.processorType = processorType;
        this.screemDimmension = screemDimmension;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getScreemDimmension() {
        return screemDimmension;
    }

    public void setScreemDimmension(String screemDimmension) {
        this.screemDimmension = screemDimmension;
    }
    public String toString(){
        String res = super.toString();
        res += String.format("\t %s \t %s \t %s",processorType,ramSize,screemDimmension);
        return res;
    }
}
