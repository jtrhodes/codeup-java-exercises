package Music;

abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }
}
