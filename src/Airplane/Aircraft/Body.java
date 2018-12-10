package Airplane.Aircraft;

import Airplane.cockpit.ICockpit;

public class Body implements IBody {
    ICockpit cockpit;

    public Body(ICockpit cockpit) {
        this.cockpit = cockpit;
    }

    @Override
    public void build() {

    }
}
