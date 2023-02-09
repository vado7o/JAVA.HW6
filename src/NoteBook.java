public class NoteBook {
    String brand;
    String ram;
    String hdd;
    String os;
    String color;

    @Override
    public String toString() {
        return brand + " " + color + " " + ram + " " + hdd + " " + os;
    }
}
