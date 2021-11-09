
/**
 * Write a description of class Heater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private double temperature;
    private double increment;
    private double min;
    private double max;
    /**
     * Constructor for objects of class Heater
     */
    public Heater(double temperatureSet,double setMin,double setMax)
    {
        // initialise instance variables
        temperature = temperatureSet;
        increment = 5;
        min = setMin;
        max = setMax;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temperatureSet)
    {
        temperature = temperatureSet;
    }

    public String printTemperature()
    {
        return "The temperature is " + " " + temperature + " " + "degrees";
    }

    public void warmer()
    {

        if(temperature + increment <= max) {
            temperature += increment;
        }
        
    }

    public void cooler()
    {

        if(temperature - increment >= min) {
            temperature -= increment; 
        }
        
    }

    public void setIncrement(double newIncrement)
    {

        if(newIncrement > 0) {
            increment = newIncrement;
        }
    }
}

