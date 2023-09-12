package command;

import devices.ElectronicDevice;

public class VolumenDownTelevisor implements Command {

    private ElectronicDevice device;

    public VolumenDownTelevisor(ElectronicDevice device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
       device.volumeUp();
    }
    
}
