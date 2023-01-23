import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String adress;
    private Cow[]cows;
    private Sheep[]sheep;
    private Horse[]horses;

    public Farm(String ownerName, String adress, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.ownerName = ownerName;
        this.adress = adress;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "ownerName='" + ownerName + '\'' +
                ", adress='" + adress + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}
