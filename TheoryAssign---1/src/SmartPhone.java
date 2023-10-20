public class SmartPhone extends Electronics{
    private String operatingSystem;
    private String storageCapacity;
    private String cameraResolution;
    public SmartPhone(String name, double price,int stockQuantity, double tax,double powerConsumption,double warranty,String operatingSystem,String storageCapacity,String cameraResolution){
        super(name,price,stockQuantity,tax,powerConsumption,warranty,ElectronicsCategory.SMARTPHONE);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public String toString(){
        String res = super.toString();
        res += String.format("\t %s \t %s \t %s",operatingSystem,storageCapacity,cameraResolution);
        return res;
    }
}
