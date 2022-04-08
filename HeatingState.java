public class HeatingState extends Operating{

    public HeatingState(CentralSystem centralSystem) {
        super(centralSystem);
    }

    public void powerButtonPressed() {
        System.out.println("switch system off");
        centralSystem.setState(centralSystem.getStopped());
    }

    @Override
    public void changeModeButtonPressed() {
        centralSystem.setTemp(23);
        centralSystem.operation = "cooling";
        System.out.println("switching "+centralSystem.getName()+" to "+ centralSystem.operation+" at "+centralSystem.getTemp()+" with both machines off");
        centralSystem.setOperating(new CoolingState(centralSystem));
    }

    @Override
    public void increaseTempButtonPressed() {
        centralSystem.setTemp(centralSystem.getTemp()+1);
        if(centralSystem.getTemp() >= 22){
            centralSystem.setHumidifier("on");
        }
        System.out.println("heating: new temp "+centralSystem.temp+" and humidifier is "+getHumidifier());
    }

    @Override
    public void decreaseTempButtonPressed() {
        centralSystem.setTemp(centralSystem.getTemp()-1);
        if(centralSystem.getTemp() <= 21){
            centralSystem.setHumidifier("off");
        }
        System.out.println("heating: new temp "+centralSystem.temp+" and humidifier is "+getHumidifier());
    }

    public String getHumidifier() {
        return centralSystem.humidifier;
    }

}
