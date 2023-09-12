package devices;

public class Radio implements ElectronicDevice {

    private int volume = 0;
    private String marca;

    public Radio (String marca){
        this.marca=marca;
    }

    @Override
    public void on() {
        System.out.println( "Radio: " + marca + " "+ "esta prendido");
    }

    @Override
    public void off() {
       System.out.println( "Radio: " + marca + " "+ "esta apagado");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println( "El volumen del radio: "+ marca +" "+ "es de: "+ volume);
    }

    @Override
    public void volumeDown() {
        volume--;
       System.out.println( "El volumen del radio: "+ marca +" "+ "es de: "+ volume);
    
}
}