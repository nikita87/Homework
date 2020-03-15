package by.teachmeskills.rakhubovskiy.doplessons.lesson8.abstractclasseshomework;

public abstract class AirTransport extends Transport {

    private Double spread; //размах крыльев(м)
    private  Integer minLengthOfRunaway; //минимальная длина взлетно-посадочной полосы для взлета(м)


    public AirTransport(String brand, Integer enginePower, Integer maxSpeed, Double mass, Double spread, Integer minLengthOfRunaway) {
        super(brand, enginePower, maxSpeed, mass);
        this.spread = spread;
        this.minLengthOfRunaway = minLengthOfRunaway;
    }

    public Double getSpread() {
        return spread;
    }

    public Integer getMinLengthOfRunaway() {
        return minLengthOfRunaway;
    }

    public abstract void description();


}
