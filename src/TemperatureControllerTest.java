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
        passangerController1.up();
        passangerController1.up();
        passangerController1.up();
        passangerController1.up();
        passangerController1.down();
        passangerController1.down();
        passangerController1.up();
        passangerController1.down();
        assertEquals(102 , passangerController1.getCurrentTemperature());
    }

    @Test
    void getCurrentTemperatureForpassangerController2(){
        passangercontroller2.up();
        passangercontroller2.up();
        passangercontroller2.up();
        passangercontroller2.up();
        passangercontroller2.down();
        passangercontroller2.down();
        passangercontroller2.up();
        passangercontroller2.down();
        passangercontroller2.up();
        passangercontroller2.down();
        passangercontroller2.down();
        passangercontroller2.up();
        passangercontroller2.down();
        assertEquals(32 , passangercontroller2.getCurrentTemperature());
    }

    @Test
    void getCurrentTemperatureForpassangerController3(){
        passangerController3.up();
        passangerController3.down();
        passangerController3.up();
        passangerController3.down();
        passangerController3.down();
        passangerController3.up();
        passangerController3.down();
        passangerController3.getCurrentTemperature();
    }

    @Test
    void getCurrentTemperatureForDriverController1(){
        driverController1.up();
        driverController1.up();
        driverController1.up();
        driverController1.up();
        driverController1.down();
        driverController1.down();
        driverController1.up();
        driverController1.down();
        driverController1.getCurrentTemperature();
    }

    @Test
    void getCurrentTemperatureForDriverController2(){
        driverController2.up();
        driverController2.down();
        driverController2.down();
        driverController2.up();
        driverController2.down();
        driverController2.up();
        driverController2,up();
        driverController2.getCurrentTemperature();
    }

}