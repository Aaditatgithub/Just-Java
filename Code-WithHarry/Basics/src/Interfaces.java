class CellPhone{
    void Callnumber(int phoneNumber){
        System.out.println("Calling... " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
interface Camera{
    void takeSnap();
    void recordVid();
    private void greet(){
        System.out.println("recording in progress...");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class SmartPhone extends CellPhone implements Wifi, Camera{
    public void takeSnap(){
        System.out.println("Taking Snap....Click...");
    }
    public void recordVid(){
        System.out.println("Lights camera and action.....");
    }

    public String[] getNetworks(){
        System.out.println("Getting Networks...");
        String[] NetworkList = {"TRF","1323","VIT_CAMPUS"};
        return NetworkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        String[] ar = nokia.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
    }
}
