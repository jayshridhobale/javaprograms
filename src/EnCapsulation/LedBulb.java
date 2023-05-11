package EnCapsulation;

public class LedBulb {
    private boolean status= Boolean.parseBoolean("true");
    public void operateBulb(){
        if(status){
            status=false;
            System.out.println("Led Bulb is Switch off");
        }
        else{
            status=true;
            System.out.println("Led Bulb switch on");
        }
    }
}