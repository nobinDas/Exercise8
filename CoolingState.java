public class CoolingState extends Operating{

    public CoolingState(CentralSystem centralSystem) {
        super(centralSystem);
    }

    public void powerButtonPressed() {
        System.out.println("switch system off");
        centralSystem.setState(centralSystem.getStopped());
    }

    @Override
    public void changeModeButtonPressed() {
        centralSystem.operation = "heating";
        System.out.println("switching "+centralSystem.getName()+" to "+ centralSystem.operation+" at "+centralSystem.getTemp()+" with both machines off");
        centralSystem.setOperating(new HeatingState(centralSystem));
    }

    @Override
    public void increaseTempButtonPressed() {
        centralSystem.setTemp(centralSystem.getTemp()+1);
        if(centralSystem.getTemp() >= 23){
            centralSystem.setDeHumidifier("on");
        }
        System.out.println("cooling: new temp is "+centralSystem.temp+" and dehumidifier is "+getDehumidifier());
    }

    @Override
    public void decreaseTempButtonPressed() {
        centralSystem.setTemp(centralSystem.getTemp()-1);
        if(centralSystem.getTemp() <= 22){
            centralSystem.setDeHumidifier("off");
        }
        System.out.println("cooling: new temp is "+centralSystem.temp+" and dehumidifier is "+getDehumidifier());
    }

    public String getDehumidifier() {
        return centralSystem.deHumidifier;
    }


}
