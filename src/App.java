import java.util.ArrayList;
import java.util.List;

import command.TurnOffAllDivices;
import command.TurnOffRadio;
import command.TurnOffTelevisor;
import command.TurnOnRadio;
import command.TurnOnTelevisor;
import command.VolumeUpRadio;
import command.VolumenUpTelevisor;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Televisor;

public class App {
    public static void main(String[] args) throws Exception {
        ElectronicDevice televisorOne= new Televisor("LG");

        TurnOnTelevisor onCommand = new TurnOnTelevisor(televisorOne);
        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        System.out.println("----Tv-----");
        onPressed.press();

        

        VolumenUpTelevisor volUpCommand = new VolumenUpTelevisor(televisorOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press(); 

        TurnOffTelevisor offCommand = new TurnOffTelevisor(televisorOne);
        onPressed= new DeviceButton(offCommand);
        onPressed.press();

        ElectronicDevice RadioOne= new Radio("Pionner");
        TurnOnRadio onAccion = new TurnOnRadio(RadioOne);
        DeviceButton onPresion;
        onPresion = new DeviceButton(onAccion);
        System.out.println("---- RADIO----");
        onPresion.press();

        VolumeUpRadio vUpCommnad = new VolumeUpRadio(RadioOne);
        onPresion = new DeviceButton(vUpCommnad);
        onPresion.press();
        onPresion.press();
        onPresion.press();
        onPresion.press();
        onPresion.press();
        
        TurnOffRadio offAccion = new TurnOffRadio(RadioOne);
        onPresion= new DeviceButton(offAccion);
        onPresion.press();

        Televisor Tv2 = new Televisor("Sony");
        Radio Radio2= new Radio("Beats");

        List<ElectronicDevice> allDevices = new ArrayList<>();
        
        allDevices.add(Tv2);
        allDevices.add(Radio2);
         
        TurnOffAllDivices turnOffDevices = new TurnOffAllDivices(allDevices);
         
         DeviceButton turnThenOff = new DeviceButton(turnOffDevices);
         
         System.out.println(" ");
         System.out.println("---Dispositivos Apagados---");
         turnThenOff.press();
         System.out.println(" ");
         System.out.println("---Prendiendo Dispositivos---");
         turnThenOff.pressUndo();
         
     }
}
