// Classe principal para testar o exemplo
public class Main {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        speaker.setState(new StartState());
        speaker.request();

        speaker.setState(new PauseState());
        speaker.request();

        speaker.setState(new NextMusicState());
        speaker.request();

        speaker.setState(new StopState());
        speaker.request();
    }
}
