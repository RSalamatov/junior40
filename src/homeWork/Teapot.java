package homeWork;

import lesson12.Coin;

import java.util.Objects;

public class Teapot implements Comparable<Teapot> {

    private String colour;
    private int price;
    private String manufacturer;
    private double volume;
    private int power;
    private boolean internalIllumination;


    public Teapot() {
    }

    public Teapot(String colour, int price, String manufacturer, double volume, int power, boolean internalIllumination) {
        this.colour = colour;
        this.price = price;
        this.manufacturer = manufacturer;
        this.volume = volume;
        this.power = power;
        this.internalIllumination = internalIllumination;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isInternalIllumination() {
        return internalIllumination;
    }

    public void setInternalIllumination(boolean internalIllumination) {
        this.internalIllumination = internalIllumination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teapot teapot = (Teapot) o;

        if (price != teapot.price) return false;
        if (Double.compare(teapot.volume, volume) != 0) return false;
        if (power != teapot.power) return false;
        if (internalIllumination != teapot.internalIllumination) return false;
        if (!Objects.equals(colour, teapot.colour)) return false;
        return Objects.equals(manufacturer, teapot.manufacturer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = colour != null ? colour.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + power;
        result = 31 * result + (internalIllumination ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Чайник {" +
                "Цвет = '" + colour + '\'' +
                ", Цена = " + price +
                ", Производитель = '" + manufacturer + '\'' +
                ", Объем =" + volume +
                ", Мощность = " + power +
                ", Внутренняя подсветка = " + internalIllumination +
                '}';
    }

    @Override
    public int compareTo(Teapot o) {
        if (this.power != o.power) {
            return this.power - o.power;
        }
        if (this.price != o.price) {
            return this.price - o.price;
        }
        if (this.volume != o.volume) {
            return Double.compare(this.volume, o.volume);
        }
        if (this.colour.equals(o.colour)) {
            return this.colour.compareTo(o.colour);

        }
        if (this.manufacturer.equals(o.manufacturer)) {
            return this.manufacturer.compareTo(o.manufacturer);
        }
        return Boolean.compare(this.internalIllumination, o.internalIllumination);
    }
}
