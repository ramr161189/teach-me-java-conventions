package powerpackage;


import org.junit.Test;

public class Powertest {
    @Test
    public void one_raised_to_one_is_onew() {
        Powerfinder obj=new Powerfinder();
        assert obj.power(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        Powerfinder obj=new Powerfinder();
        assert obj.power(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        Powerfinder obj=new Powerfinder();
        assert obj.power(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        Powerfinder obj=new Powerfinder();
        assert obj.power(3, 2) == 3*3;
    }
}
