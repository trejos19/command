package devices;

public class Televisor implements ElectronicDevice {

    private int volume = 0;
    private String marca;

    public Televisor (String marca){
        this.marca=marca;
    }

    @Override
    public void on() {
        System.out.println( "Televisor: "  + marca + " " + "esta prendido");
    }

    @Override
    public void off() {
       System.out.println( "Televisor: " + marca + " "+ "esta apagado");
    }

    @Override
    public void volumeUp() {
        volume++;
        System.out.println( "El volumen del Televisor: "+ marca +" "+ "es de: "+ volume);
    }

    @Override
    public void volumeDown() {
        volume--;
       System.out.println( "El volumen del Televisor: "+ marca + " "+"es de: "+ volume);
    
}
    
}
