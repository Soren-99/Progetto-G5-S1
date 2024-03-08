//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        elementoMultimediale[] elementi = new elementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento: 1-Audio, 2-Video, 3-Immagine:");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo){
                case 1:
                    System.out.println("Inserisci la durata");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = scanner.nextInt();
                    elementi[i] = new registrazioneAudio(titolo, durataAudio, volumeAudio);
                    break;
                case 2:
                    System.out.println("Inserisci la durata");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosita");
                    int luminositaVideo = scanner.nextInt();
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case 3:
                    System.out.println("Inserisci la luminosita");
                    int luminositaImmagine = scanner.nextInt();
                    elementi[i] = new immagine (titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido!!");
            }
        }

        int scelta;
        do {
            System.out.println("Inserisci il numero dell'elemento che deve eseguire (da 1 a 5), 0 se vuoi uscire:");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5){
                elementi[scelta -1].show();
            }else if(scelta != 0) {
                System.out.println("Scelta non ideonea!");
            }
        }while (scelta != 0);

    }
}