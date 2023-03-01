public class Cube {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side >= 1) {
            this.side = side;
        }
        else {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

    public int getSurfaceArea() {
        int area = side*side*6;
        return area;
    }

    public int getVolume() {
        int volume = side*side*side;
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }

    public Cube() {
        side = 1;
    }

    public Cube(int side) {
        if (side >= 1) {
            this.side = side;
        }
        else {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }

}
