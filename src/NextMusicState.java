// Estado concreto: Parado
class NextMusicState implements SpeakerState {
    @Override
    public void handleRequest() {
        System.out.println("Next Music.");
    }
}
