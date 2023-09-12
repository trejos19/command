package command;

import devices.ElectronicDevice;

public class TurnOffTelevisor implements Command {

    private ElectronicDevice device;

    public TurnOffTelevisor(ElectronicDevice device){
        this.device=device;
    }

    @Override
    public void execute() {
       device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
    
}
