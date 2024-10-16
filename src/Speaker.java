public class Speaker {
    private SpeakerState state;

    public void setState(SpeakerState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
