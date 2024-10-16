class PauseState implements SpeakerState {
    @Override
    public void handleRequest() {
        System.out.println("Music stopped.");
    }
}
