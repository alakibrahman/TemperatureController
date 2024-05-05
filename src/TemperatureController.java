public class TemperatureController {

    private int maxTemperature,minTemperature,CurrentTemperature;

    public TemperatureController(int min,int max){
        maxTemperature=max;
        minTemperature=min;
        calculation();
    }

    public TemperatureController(){
        maxTemperature=80;
        minTemperature=60;
        calculation();
    }

    private void calculation() {
        CurrentTemperature=(minTemperature+maxTemperature)/2;
    }

    public void up(){
        CurrentTemperature=Math.min(CurrentTemperature+1,maxTemperature);
    }

    public void down(){
        CurrentTemperature=Math.max(CurrentTemperature-1,min);
    }

    public int getCurrentTemperature() {
        return CurrentTemperature;
    }
}
