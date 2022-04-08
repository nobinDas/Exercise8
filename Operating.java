public abstract class Operating implements State{
    CentralSystem centralSystem;

    public Operating(CentralSystem centralSystem){
        this.centralSystem = centralSystem;
    }
    @Override
    public void powerButtonPressed() {
        System.out.println("switch system off");
        centralSystem.setState(centralSystem.getStopped());
    }
}
