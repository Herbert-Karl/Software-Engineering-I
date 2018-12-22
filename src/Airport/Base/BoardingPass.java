package Airport.Base;

import Airport.Airport.GateID;

import java.util.ArrayList;
import java.util.UUID;

public class BoardingPass{
        private String uuid;
        private Carrier carrier;
        private String flight;
        private Passenger passenger;
        private TicketClass ticketClass;
        private Source source;
        private Destination destination;
        private String date;
        private GateID gate;
        private String boardingTime;
        private String seat;
        private ArrayList<BaggageIdentificationTag> baggageIdentificationTagList;

        public BoardingPass (Carrier carrier, String flight, Passenger passenger, TicketClass ticketClass, Source source, Destination destination,
                                String date, GateID gate, String boardingTime, String seat, ArrayList<BaggageIdentificationTag> baggageIdentificationTagList){
                UUID uuid = UUID.randomUUID();
                this.uuid = uuid.toString();
                this.carrier = carrier;
                this.flight = flight;
                this.passenger = passenger;
                this.ticketClass = ticketClass;
                this.source = source;
                this.destination = destination;
                this.date = date;
                this.gate = gate;
                this.boardingTime = boardingTime;
                this.seat = seat;
                this.baggageIdentificationTagList = baggageIdentificationTagList;
        }

        ///
        /// Getter:
        ///


        public String getUuid() {
                return uuid;
        }

        public Carrier getCarrier() {
                return carrier;
        }

        public Destination getDestination() {
                return destination;
        }

        public Passenger getPassenger() {
                return passenger;
        }

        public Source getSource() {
                return source;
        }

        public String getFlight() {
                return flight;
        }

        public String getDate() {
                return date;
        }

        public String getBoardingTime() {
                return boardingTime;
        }

        public String getSeat() {
                return seat;
        }

        public TicketClass getTicketClass() {
                return ticketClass;
        }

        public GateID getGate() {
                return gate;
        }

        public ArrayList<BaggageIdentificationTag> getBaggageIdentificationTagList() {
                return baggageIdentificationTagList;
        }

        ///
        /// Setter:
        ///


        public void setPassenger(Passenger passenger) {
                this.passenger = passenger;
        }

        public void setFlight(String flight) {
                this.flight = flight;
        }

        public void setGate(GateID gate) {
                this.gate = gate;
        }

        public void setSeat(String seat) {
                this.seat = seat;
        }

        public void setTicketClass(TicketClass ticketClass) {
                this.ticketClass = ticketClass;
        }

        public void setBaggageIdentificationTagList(ArrayList<BaggageIdentificationTag> baggageIdentificationTagList) {
                this.baggageIdentificationTagList = baggageIdentificationTagList;
        }
}
