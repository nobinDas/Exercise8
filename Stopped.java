public class Stopped implements State{
    CentralSystem centralSystem;

    public Stopped(CentralSystem centralSystem){
        this.centralSystem = centralSystem;
    }

    @Override
    public void powerButtonPressed() {
        System.out.println("switch on A/C " +centralSystem.getName()+ " is on "+ centralSystem.getOperation() +" at "+ centralSystem.temp +" degrees and humidifier  is "+ centralSystem.humidifier +" and dehumidifier  is " + centralSystem.deHumidifier);
        centralSystem.setState(centralSystem.getOperating());
    }

    @Override
    public void changeModeButtonPressed() {
        System.out.println(centralSystem.getName()+":no change of mode since system is off");
    }

    @Override
    public void increaseTempButtonPressed() {
        System.out.println(centralSystem.getName()+":no increase of temp since system is off");
    }

    @Override
    public void decreaseTempButtonPressed() {
        System.out.println(centralSystem.getName()+":no decrease of temp since system is off");
    }
}
