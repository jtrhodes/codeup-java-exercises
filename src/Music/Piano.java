package Music;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{
private int numberOfKeys;

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {

    }

    @Override
    public void stopMusic() {

    }

    @Override
    public void tuneInstrument() {

    }

    @Override
    public void detuneInstrument() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
