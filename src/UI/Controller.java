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
import java.util.ResourceBundle;



public class Controller implements Initializable {

    @FXML private TextField commandInput;
    @FXML private TextArea commandHistory;

    private boolean parseString(String input) {



        //TODO: Write Parser
        return true;
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
        //TextFields.bindAutoCompletion(commandInput, commands);
    }

    public void closePressed() {

        try {
            if (isNotepadRunning())
            {
                Runtime.getRuntime().exec("taskkill /F /IM " + "notepad++.exe");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Platform.exit();
    }

    public void logfilePressed(){
        try {
            Runtime.getRuntime().exec("C:\\Program Files\\Notepad++\\notepad++.exe C:\\Users\\janbe\\Documents\\ajax.html");
        }
        catch (IOException e) {
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

        while ((tasksLine = tasksListReader.readLine()) != null)
        {
            if (tasksLine.contains("notepad++.exe"))
            {
                return true;
            }
        }

        return false;
    }
}
