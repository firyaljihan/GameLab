/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamepetualangantanahjawa;
import java.util.Scanner;
/**
 *
 * @author FAM COMPUTINDO
 */
/**NAMA ANGGOTA KELOMPOK :
     * FIRYAL JIHAN HAURA_102062400119_IS_07-04
     * BERLIAN SEPASYA REKARDIAN_10206240088_IS-07-04 
     **/
public class Story {
    private Scene startScene;     // Adegan awal permainan
    private Character player;     // Objek karakter pemain
    private Scanner scanner;      // Objek untuk menerima input dari pemain

    // Konstruktor: Menginisialisasi startScene dan player
    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    //Memulai permainan dengan memanggil metode play()
    public void start() {
        play();
    }

    // Metode utama untuk memainkan cerita
    public void play() {
        Scene currentScene = startScene; //Menetapkan currentScene ke startScene

        // Loop utama permainan
        while (currentScene != null) {
            currentScene.displayScene(); // Tampilkan deskripsi dan pilihan
            String input = scanner.nextLine().trim(); // Ambil input pemain
            //.trim() berguna untuk menangani spasi kosong
            // Tangani input "INFO"
            if (input.equalsIgnoreCase("INFO")) { //equalsIgnoreCase berguna untuk cocokkan dua string tanpa peduli besar-kecil huruf
                System.out.println("========== STATUS ==========");
                System.out.println("Nama: " + player.getName());
                System.out.println("Health: " + player.getHealth());
                System.out.println("XP: " + player.getXP());
                System.out.println("Item: " + player.getItem());
                System.out.println("============================");
                continue; // Tampilkan ulang scene saat ini
            }

            // Ambil scene selanjutnya berdasarkan pilihan pemain
            Scene nextScene = currentScene.makeChoice(input, player);

            // Jika input tidak valid, ulangi
            if (nextScene == currentScene) {
                continue;  //tampilkan scene yang sama lagi
            }

            currentScene = nextScene; // Update scene
        }

        System.out.println("\n=== Cerita Selesai ===");
        System.out.println("Terima kasih sudah bermain, " + player.getName() + "!");
        System.out.println("\n========== STATUS AKHIR ==========");
        System.out.println("Health: " + player.getHealth());
        System.out.println("XP: " + player.getXP());
        System.out.println("Item: " + player.getItem());
        System.out.println("==================================");
    }
}
