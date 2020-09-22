package Day2.assignment;

public class Gun {
    String type;
    String name;
    int totalBullet;
    int weight;
    String color;

    public Gun() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalBullet() {
        return totalBullet;
    }

    public void setTotalBullet(int totalBullet) {
        this.totalBullet = totalBullet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        // TODO: 8/13/2020 format sentence
        return "\n              Gun" +
                "\n-----------------------------" +
                "\nType         : " + type +
                "\nName         : " + name +
                "\nTotal Bullet : " + totalBullet +
                "\nWeight       : " + weight + " gram" +
                "\nColor        : " + color;
    }
}
