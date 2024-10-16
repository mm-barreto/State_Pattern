// Estado concreto: Parado
class StopState implements SpeakerState {
    @Override
    public void handleRequest() {
        System.out.println("Music Stopped.");
    }
}
