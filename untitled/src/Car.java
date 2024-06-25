import java.util.*;

class Car implements Cloneable {
    private String modelName;
    private ArrayList<String> owners = new ArrayList<String>();

    public String getModelName() { return this.modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }

    public ArrayList getOwners() { return this.owners; }
    public void setOwners(String ownerName) { this.owners.add(ownerName); }

    public Object clone() {
        try {
            Car clonedCar = (Car)super.clone();
            // clonedCar.owners = (ArrayList)owners.clone();
            return clonedCar;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}