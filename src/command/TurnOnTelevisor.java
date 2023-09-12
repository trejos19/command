package command;

import devices.ElectronicDevice;

public class TurnOnTelevisor implements Command {

    private ElectronicDevice device;

    public TurnOnTelevisor(ElectronicDevice device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
    
}
