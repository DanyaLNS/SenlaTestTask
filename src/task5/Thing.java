package task5;

public class Thing {
    private int volume;
    private int value;
    private double worth;
    public Thing(int value, int volume){
        this.value = value;
        this.volume = volume;
        // коэффициент, который содержит в себе отношение стоимости на единицу веса
        // преобразование типа нужно для корректного расчета
        worth =  (double) value/volume;
    }

    public double getWorth() {
        return worth;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return worth + " ";
    }
}
