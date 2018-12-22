package Airport.Baggage_Sorting_Unit.Loading;

import Airplane.stowage_cargo.FrontStowage;
import Airplane.stowage_cargo.FrontStowagePosition;
import Airplane.stowage_cargo.FrontStowagePositionID;
import Airport.Base.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneLoadingManagementTest {
    private FrontStowage frontStowage;
    private LoadingStrategy loadingStrategy;
    private AirplaneLoadingManagement airplaneLoadingManagement;

    @BeforeEach
    void setup() {
        frontStowage = new FrontStowage();
        loadingStrategy = new LoadingStrategy(new ArrayList<String>());
        loadingStrategy.setStowage(frontStowage);
        airplaneLoadingManagement = new AirplaneLoadingManagement(new ArrayList<Container>());
    }

    /**
     * Done
     */
    @Test
    void optimizeBalancing() {
        Stack<Baggage> baggages1 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(5);
            baggages1.add(normalBaggage);
        }
        Container container1 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages1);

        Stack<Baggage> baggages2 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(10);
            baggages2.add(normalBaggage);
        }
        Container container2 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages2);

        Stack<Baggage> baggages3 = new Stack<Baggage>();
        for (int i = 0; i < 10; i++) {
            NormalBaggage normalBaggage = new NormalBaggage("content");
            normalBaggage.setWeight(20);
            baggages3.add(normalBaggage);
        }
        Container container3 = new Container(ContainerType.AKE, "id", ContainerCategory.Normal, null,
                "barCodeIDCatagory", "qrCodeIDCatagory", baggages3);

        frontStowage.add_to_positionList(new FrontStowagePosition(FrontStowagePositionID.SFL07, container1));
        frontStowage.add_to_positionList(new FrontStowagePosition(FrontStowagePositionID.SFR07, container2));
        frontStowage.add_to_positionList(new FrontStowagePosition(FrontStowagePositionID.SFL06, container3));
        loadingStrategy.getContainerIDList().add(0, container1.getId());
        loadingStrategy.getContainerIDList().add(1, container2.getId());
        loadingStrategy.getContainerIDList().add(2, container3.getId());

        airplaneLoadingManagement.optimizeBalancing();

        ArrayList<FrontStowagePosition> frontStowagePositions = frontStowage.getPositionList();

        for (FrontStowagePosition frontStowagePosition : frontStowagePositions) {
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL07)
                assertEquals(container1, frontStowagePosition.getContainer());
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFL06)
                assertEquals(container2, frontStowagePosition.getContainer());
            if (frontStowagePosition.getId() == FrontStowagePositionID.SFR07)
                assertEquals(container3, frontStowagePosition.getContainer());
        }
    }
}