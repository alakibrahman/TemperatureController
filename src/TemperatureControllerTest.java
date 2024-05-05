import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class TemperatureControllerTest{
TemperatureController passangerController1 , passangercontroller2 , passangerController3, driverController1 , driverController2;

    @beforeEach
    void setUp(){
        passangerController1=new TemperatureController(33 , 133);
        passangercontroller2=new TemperatureController(43 , 73);
        passangerController3=new TemperatureController();

        driverController1=new TemperatureController();
        driverController2=new TemperatureController(45,135);
    }
    @Test
    void getCurrentTemperatureForpassangerController1(){

    }
    @Test
    void up(){
    }

    @Test
    void down(){
    }

    @Test
    void getCurrentTemperature(){
    }
}