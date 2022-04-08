public class CentralAirSystem {

    public static void main(String[] args) {
        CentralSystem c1 = new CentralSystem("central1");
        System.out.println(c1);
        c1.changeModeButtonPressed();
        c1.increaseTempButtonPressed();
        c1.decreaseTempButtonPressed();

        c1.powerButtonPressed(); //default is heating at 21 both humidifier and dehumidifier are off
        c1.changeModeButtonPressed(); //switching to cooling
        c1.increaseTempButtonPressed();
        c1.increaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.changeModeButtonPressed(); //switching to heating
        c1.increaseTempButtonPressed();
        c1.increaseTempButtonPressed();
        c1.increaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.decreaseTempButtonPressed();
        c1.increaseTempButtonPressed();
        c1.increaseTempButtonPressed();

        c1.powerButtonPressed(); //switches to stopped
        c1.powerButtonPressed(); //switches to history

        CentralSystem c2 = new CentralSystem("central 2");
        c2.powerButtonPressed();
        c2.changeModeButtonPressed();
        System.out.println(c1);
        System.out.println(c2);

    }
}
