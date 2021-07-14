package itec3030.assignments.a2;

import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;


public class OldTempSensorAdapter implements TemperatureSensor {

    protected ControllerInterface c;
    OldTempSensor oldTempSensor;
    protected String iD;
    protected boolean enabled;
    int temp;

    /**constructor
     * Set oldTempSensor*/
    public OldTempSensorAdapter(OldTempSensor sensor)
    {
        oldTempSensor = sensor;
    }


     /**store new temperature
      * @param i temperature value*/
    public void newTemperature(int i)
    {
        temp = i;
        float t = oldTempSensor.getTemperature();
        oldTempSensor.newTemperature(temp);
    }


    /**get the controllerInterface reference*/
    public ControllerInterface getController() {
        return this.c;
    }


    /**set the controllerInterface reference*/
    public void setController(ControllerInterface c) {
        this.c = c;
    }


    /**get an id*/
    public String getID() {
        return this.iD;
    }


    /**set an id*/
    public void setID(String s) {
        this.iD = s;
    }

    /***/
    public void enable() {
        System.out.println("old temp adapter enabled");
    }

    /***/
    public void disable() {
        System.out.println("old temp adapter disabled");
    }

    /***/
    public boolean enabled() {
        return false;
    }

    /**get temperature*/
    public int getReading() {
        return temp;
    }
}
