package command;

import devices.ElectronicDevice;

public class VolumenDownRadio implements Command {

    private ElectronicDevice device;

    public VolumenDownRadio(ElectronicDevice device){
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
