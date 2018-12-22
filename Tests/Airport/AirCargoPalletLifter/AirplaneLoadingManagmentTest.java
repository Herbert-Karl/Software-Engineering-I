package Airport.AirCargoPalletLifter;

import Airplane.stowage_cargo.*;
import Airport.Base.AirCargoPallet;
import Airport.Base.BulkyBaggage;
import Airport.Base.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneLoadingManagmentTest
{
    private AirplaneLoadingManagment airplaneLoadingManagment;
    private LoadingStrategy loadingStrategy;
    private RearStowage rearStowage;

    @BeforeEach
    void setup() {
        rearStowage = new RearStowage();
        loadingStrategy = new LoadingStrategy(rearStowage, new ArrayList<String>());
        airplaneLoadingManagment = new AirplaneLoadingManagment(loadingStrategy);
    }

    /**
     * Done
     */
    @Test
    void optimizeBalancing()
    {
        AirCargoPallet airCargoPallet1 = new AirCargoPallet("uuid", "type", "id1");
        Item[] ItemList = airCargoPallet1.getItemList();
        for (int i = 0; i < 10; i++) {
            Item item = new Item(1, "content", 5);
            ItemList[i] = item;
        }

        AirCargoPallet airCargoPallet2 = new AirCargoPallet("uuid", "type", "id2");
        ItemList = airCargoPallet2.getItemList();
        for (int i = 0; i < 10; i++) {
            Item item = new Item(1, "content", 10);
            ItemList[i] = item;
        }

        AirCargoPallet airCargoPallet3 = new AirCargoPallet("uuid", "type", "id3");
        ItemList = airCargoPallet3.getItemList();
        for (int i = 0; i < 10; i++) {
            Item item = new Item(1, "content", 20);
            ItemList[i] = item;
        }

        rearStowage.add_to_positionList(new RearStowagePosition(RearStowagePositionID.SR07, airCargoPallet2));
        rearStowage.add_to_positionList(new RearStowagePosition(RearStowagePositionID.SR06, airCargoPallet1));
        rearStowage.add_to_positionList(new RearStowagePosition(RearStowagePositionID.SR05, airCargoPallet3));
        loadingStrategy.getContainerIDList().add(0, airCargoPallet2.getId());
        loadingStrategy.getContainerIDList().add(1, airCargoPallet1.getId());
        loadingStrategy.getContainerIDList().add(2, airCargoPallet3.getId());

        for (RearStowagePosition rearStowagePosition : rearStowage.getPositionList()) {
            if (rearStowagePosition.getId() == RearStowagePositionID.SR07)
                assertEquals(airCargoPallet1, rearStowagePosition.getAirCargoPallet());
            if (rearStowagePosition.getId() == RearStowagePositionID.SR06)
                assertEquals(airCargoPallet2, rearStowagePosition.getAirCargoPallet());
            if (rearStowagePosition.getId() == RearStowagePositionID.SR05)
                assertEquals(airCargoPallet3, rearStowagePosition.getAirCargoPallet());
        }
    }
}