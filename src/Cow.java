public class Cow extends DomesticAnimals{
    private int age;
    private int weigth;
    private String gender;
    private String nicName;
    private String color;

    public Cow(int age, int weigth, String gender, String nicName, String color) {
        this.age = age;
        this.weigth = weigth;
        this.gender = gender;
        this.nicName = nicName;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNicName() {
        return nicName;
    }

    public void setNicName(String nicName) {
        this.nicName = nicName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "age=" + age +
                ", weigth=" + weigth +
                ", gender='" + gender + '\'' +
                ", nicName='" + nicName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
