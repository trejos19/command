package command;

import devices.ElectronicDevice;

public class VolumenUpTelevisor implements Command {
    private ElectronicDevice device;

    public VolumenUpTelevisor(ElectronicDevice device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
       device.volumeDown();
    }
}
