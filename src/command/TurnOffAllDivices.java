package command;
import java.util.List;
import devices.ElectronicDevice;

public class TurnOffAllDivices implements Command {

    List<ElectronicDevice>allDevices;

    public TurnOffAllDivices(List<ElectronicDevice>newDevices){
        allDevices=newDevices;
    }


    @Override
    public void execute() {
        for (ElectronicDevice device : allDevices){
            device.off();
        }
    }

    @Override
    public void undo() {
       for (ElectronicDevice device : allDevices){
            device.on();
        }
    }
    
}
