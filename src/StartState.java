// Estado concreto: Tocando
class StartState implements SpeakerState {
    @Override
    public void handleRequest() {
        System.out.println("Music started.");
    }
}
