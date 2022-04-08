public class CentralSystem {
    State stopped;
    State operating;
    String name;
    String operation;

    State state;

    int temp;
    String humidifier;
    String deHumidifier;

    public CentralSystem(String name){
        stopped = new Stopped(this);
        operating = new HeatingState(this);

        operation = "heating";
        this.humidifier = "off";
        this.deHumidifier = "off";
        this.name = name;
        temp = 21;
        state = stopped;
    }
    public void powerButtonPressed(){
        state.powerButtonPressed();
    }
    public void changeModeButtonPressed(){
        state.changeModeButtonPressed();
    }
    public void increaseTempButtonPressed(){
        state.increaseTempButtonPressed();
    }
    public void decreaseTempButtonPressed(){
        state.decreaseTempButtonPressed();
    }

    void setState(State state){
        this.state = state;
    }
    void setOperating(State state){
        this.operating = state;
        this.state = operating;
    }

    public State getState(){
        return state;
    }

    public State getStopped(){
        return stopped;
    }
    public State getOperating(){
        return operating;
    }
    public String getName(){
        return name;
    }
    public String getOperation(){
        return operation;
    }
    void setTemp(int temp){
        this.temp = temp;
    }
    public int getTemp(){
        return temp;
    }
    void setHumidifier(String set){
        this.humidifier = set;
    }
    void setDeHumidifier(String set){
        this.deHumidifier = set;
    }



    public String toString() {
        if(state == stopped){
            return "A/C "+name+" in stopped mode";
        }else{
            return "A/C "+ name +" is on "+ getOperation() +" at "+ temp +" degrees and humidifier  is "+ humidifier +" and dehumidifier  is " + deHumidifier;
        }

    }

}
