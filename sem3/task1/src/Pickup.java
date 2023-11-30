import java.awt.Color;

import Enams.TypeCar;
import Enams.TypeFuel;
import Enams.TypeGearBox;
import Interfaces.IFuelStation;
import Interfaces.IWip;

public class Pickup extends Car implements IFuelStation, IWip {
    private int loadCapacity;

    public Pickup(String make, String model, Color color, int wheelsNumber, TypeFuel fuel,
            TypeGearBox gearBox, float engineCap, int loadCapacity) {
        super(make, model, color, TypeCar.PICAP, wheelsNumber, fuel, gearBox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
    }

    @Override
    public void wipHeadlights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }

}
