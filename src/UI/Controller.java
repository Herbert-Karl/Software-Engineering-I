package UI;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private TextField commandInput;
    @FXML
    private TextArea commandHistory;

    private boolean isInteger(String input) {
        return input.matches("^\\d+$");
    }

    private boolean parseString(String input) {

        String[] splittedString = input.split(" ");
        if (!Objects.equals(splittedString[0], "execute")) {
            return false;
        }

        //import Airplane.Aircraft;
        //import Airplane.Aircraft.A350Configuration;
        //import Airplane.Aircraft.A380Configuration;
        if (Objects.equals(splittedString[1], "airplane")) {
            switch (splittedString[2]) {
                case "build":
                    if (splittedString.length == 4 && (Objects.equals(splittedString[3], "A380") || Objects.equals(splittedString[3], "A350"))) {
                        String airplaneType = splittedString[3];
                        //Configuration configuration = new A350Configuration();
                        //Configuration configuration = new A380Configuration();
                        //new Aircraft(configuration)
                        return true;
                    }
                    break;
                case "climbing":
                    if (splittedString.length == 3) {
                        //climbing()
                        return true;
                    }
                    break;
                case "left-turn":
                    if (splittedString.length == 3) {
                        //leftTurn()
                        return true;
                    }
                    break;
                case "pfd-show":
                    if (splittedString.length == 3) {
                        return true;
                        //
                    }
                    break;
                case "startup":
                    if (splittedString.length == 3) {
                        //startup()
                        return true;
                    }
                    break;
                case "take-off-normal":
                    if (splittedString.length == 3) {
                        //takeOff()
                        return true;
                    }
                    break;
                case "take-off-engine-fire":
                    if (splittedString.length == 3) {
                        //takeOff()
                        return true;
                    }
                    break;
                case "taxi":
                    if (splittedString.length == 3) {
                        //taxi();
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }

        //import Airport.Airport.GateID
        //import Airport.Airport;
        if (Objects.equals(splittedString[1], "airport")) {
            switch (splittedString[2]) {
                case "aircargo":
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //GateID aus GateID.id, z.B. GateID.A04
                        //return executeAircargo(gateID);
                        return true;
                    }
                    break;
                case "assign":
                    if (Objects.equals(splittedString[3], "airplane") && Objects.equals(splittedString[4], "to") && Objects.equals(splittedString[5], "gate") && isInteger(splittedString[6]) && splittedString.length == 7) {
                        String id = splittedString[6];
                        //Woher Airplane?
                        //return connectAirplane(Airplane airplane, Gate gate);
                        return true;
                    } else if (Objects.equals(splittedString[3], "airplane") && Objects.equals(splittedString[4], "to") && Objects.equals(splittedString[5], "gate") && Objects.equals(splittedString[6], "random") && splittedString.length == 7) {
                        //random GateID aus Enum GateID
                        return true;
                    }
                    //
                    break;
                case "baggage-sorting-unit":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //import Airport.Airport;
                        //return executeBaggageSortingUnit(gateID);
                        return true;
                    }
                    break;
                case "boarding-control":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String id = splittedString[5];
                        //return executeBoardingControl(id);
                        return true;
                    }
                    break;
                case "build":
                    if (splittedString.length == 3) {
                        //build();
                        return true;
                    }
                    break;
                case "bulky":
                    //baggage
                    if (Objects.equals(splittedString[3], "baggage") && splittedString.length == 4) {
                        //
                        return true;
                    }
                    break;
                case "check-in":
                    if (splittedString.length == 3) {
                        //return executeCheckIn(Flight flight); Woher flight?
                        return true;
                    }
                    break;
                case "customs":
                    if (splittedString.length == 3) {
                        //return executeCustoms();
                        return true;
                    }
                    break;
                case "groundops-logging":
                    if (splittedString.length == 3) {
                        //return executeGroundOperationsLogging();
                        return true;
                    }
                    break;
                case "passport":
                    //control
                    if (Objects.equals(splittedString[3], "control") && splittedString.length == 4) {
                        //
                        return true;
                    }
                    break;
                case "pushback":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //return executePushback(gateID);
                        return true;
                    }
                    break;
                case "security":
                    //check
                    if (Objects.equals(splittedString[3], "check") && splittedString.length == 4) {
                        //return executeSecurity();
                        return true;
                    }
                    break;
                case "service":
                    //waster water for gate <id>
                    if (Objects.equals(splittedString[3], "waster") && Objects.equals(splittedString[4], "water") && Objects.equals(splittedString[5], "for") && Objects.equals(splittedString[6], "gate") && isInteger(splittedString[7]) && splittedString.length == 8) {
                        String gateID = splittedString[7];
                        //return executeServiceWasteWater(gateID);
                        return true;
                    }
                    break;
                case "service-base":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //return executeServiceBase(gateID);
                        return true;
                    }
                    break;
                case "service-fresh-water":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //return executeServiceFreshWater(gateID);
                        return true;
                    }
                    break;
                case "service-nitrogen-oxygen":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //return executeServiceNitrogenOxygen(gateID);
                        return true;
                    }
                    break;
                case "sky-tanking":
                    //for gate <id>
                    if (Objects.equals(splittedString[3], "for") && Objects.equals(splittedString[4], "gate") && isInteger(splittedString[5]) && splittedString.length == 6) {
                        String gateID = splittedString[5];
                        //return executeSkyTanking(gateID);
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        }

        return false;
    }

    public void executePressed() {

        String input = commandInput.getText();

        if (parseString(input)) {
            addCommandToHistory(input);
            commandInput.setText("");
        } else {
            addCommandToHistory("input is no command");
        }
    }

    private void addCommandToHistory(String input) {
        commandHistory.appendText(commandHistory.getText().isEmpty() ? input : "\n" + input);
    }

    public void initialize(URL location, ResourceBundle resources) {
        String[] commands = {
                "execute airplane build [A350 | A380]\n",
                "execute airport build\n",
                "execute airport assign airplane to gate [random | <id>]\n",
                "execute airport service waster water for gate <id>\n",
                "execute airport check-in\n",
                "execute airport bulky baggage\n",
                "execute airport security check\n",
                "execute airport passport control\n",
                "execute airport customs\n",
                "execute airport aircargo for gate <id>\n",
                "execute airport baggage-sorting-unit for gate <id>\n",
                "execute airport service-base for gate <id>\n",
                "execute airport service-fresh-water for gate <id>\n",
                "execute airport service-nitrogen-oxygen for gate <id>\n",
                "execute airport sky-tanking for gate <id>\n",
                "execute airport boarding-control for gate <id>\n",
                "execute airport pushback for gate <id>\n",
                "execute airport groundops-logging\n",
                "execute airplane startup\n",
                "execute airplane taxi\n",
                "execute airplane take-off-[normal | engine-fire]\n",
                "execute airplane climbing\n",
                "execute airplane right-turn\n",
                "execute airplane left-turn\n",
                "execute airplane pfd-show"

        };
        TextFields.bindAutoCompletion(commandInput, commands).setPrefWidth(800);
    }

    public void closePressed() {

        try {
            if (isNotepadRunning()) {
                Runtime.getRuntime().exec("taskkill /F /IM " + "notepad++.exe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Platform.exit();
    }

    public void logfilePressed() {
        try {
            Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\notepad++.exe -ro C:\\Users\\janbe\\Documents\\ajax.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //TODO: MUELLER FRAGEN OB DAS AUCH SO AKTIVIERT WERDEN DARF ODER NICHT
    public void enterPressed() {
        executePressed();
    }

    //TODO: MUELLER FRAGEN OB DAS WIRKLICH WIEDER GESCHLOSSEN WERDEN MUSS
    private boolean isNotepadRunning() throws Exception {
        Process listTasksProcess = Runtime.getRuntime().exec("tasklist");
        BufferedReader tasksListReader = new BufferedReader(new InputStreamReader(listTasksProcess.getInputStream()));

        String tasksLine;

        while ((tasksLine = tasksListReader.readLine()) != null) {
            if (tasksLine.contains("notepad++.exe")) {
                return true;
            }
        }

        return false;
    }
}
