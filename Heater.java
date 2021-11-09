/**
 * @walidnoor
 * @version 1.0
 */
public class Heater
{
    private double temperature;
    private double increment;
    private double min;
    private double max;

    public Heater(double temperatureSet,double setMin,double setMax)
    {
        
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
