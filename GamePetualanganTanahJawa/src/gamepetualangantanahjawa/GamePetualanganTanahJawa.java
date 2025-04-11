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
public class GamePetualanganTanahJawa {
    /**NAMA ANGGOTA KELOMPOK :
     * FIRYAL JIHAN HAURA_102062400119_IS_07-04
     * BERLIAN SEPASYA REKARDIAN_10206240088_IS-07-04 
     **/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //objek scanner untuk membaca input dari user
        
        System.out.println("===================================");
        System.out.println("Selamat Datang di Game Petualangan Tanah Jawa!");
        System.out.println("Perjalanan seru menantimu...");
        System.out.println("===================================");
        System.out.print("Masukkan nama karaktermu: ");
        String name = scanner.nextLine(); // membaca input nama dari user

        Character player = new Character(name); //instance dari kelas Character untuk merepresentasikan karakter pemain
       
        // loop menu utama game
        boolean gameRunning = true; 
        while (gameRunning) {
            System.out.println("Kamu adalah "+player.getName()+ ", mahasiswa antropologi yang sedang melakukan penelitian"
                    + "\nbudaya di sebuah desa terpencil di Jawa Timur. "
                    + "\nNamun, risetmu berubah menjadi petualangan spiritual saat "
                    + "\nkamu menemukan pusaka leluhur yang membangkitkan kekuatan gaib dan membuka tabir misteri masa lalu.");
            System.out.println("1. Mulai Petualangan");
            System.out.println("2. Keluar");
            System.out.print("Pilih (1/2): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    // instance dari kelas Scene untuk setiap adegan dalam permainan
                    Scene scene10 = new Scene(
                            "Tanpa disadari kamu sudah berada di akhir perjalanan, namun pintu dua dunia terbuka sebagian. Cepat ambil langkah yang tepat!", //description
                            "Gunakan pusaka untuk menutup", null, 0, 20, 0,  "",  //option,scene,damage,xp,hp,item
                            "Biarkan terbuka", null, 1, 1, 0, "",  //option,scene,damage,xp,hp,item
                            "Korbankan diri", null, 0, 10, 0,  ""  //option,scene,damage,xp,hp,item
                    );

                    Scene scene9 = new Scene(
                            "Pusaka ada di depan matamuu", //description
                            "Ambil dengan restu", scene10, 0, 100, 0, "",  //option,scene,damage,xp,hp,item
                            "Ambil paksa", scene10, 0, 4, 0, "", //option,scene,damage,xp,hp,item
                            "Tinggalkan", scene10, 1, 1, 0, ""  //option,scene,damage,xp,hp,item
                    );

                    Scene scene8 = new Scene(
                            "Penjaga pusaka akan menguji niatmu datang kesana. Teka-teki dan niat jadi kunci", //description
                            "Jawab jujur", scene9, 0, 9, 0, "",  //option,scene,damage,xp,hp,item
                            "Bohong aja deh", scene9, 0, 2, 0, "",  //option,scene,damage,xp,hp,item
                            "Aku gamau ujian", scene9, 1, 1, 0,  ""  //option,scene,damage,xp,hp,item
                    );
                    
                    Scene scene7 = new Scene(
                            "Gerbang terbuka, namun didalam sana terdapat penjaga yang akan menguji niatmu", //description
                            "Tujukkan tanda lahir di tanganmu", scene8, 0, 10, 1, "", //option,scene,damage,xp,hp,item
                            "Mengaku pewaris", scene8, 0, 2, 0, "",  //option,scene,damage,xp,hp,item
                            "Berbohong", scene8, 1, 1, 0, ""  //option,scene,damage,xp,hp,item
                    );
                    
                    Scene scene6 = new Scene(
                            "Secara tidak sengaja kamu sudah sampai di depan gerbang ghaib, yang konon katanya bisa dibuka menggunakan mantra", //description
                            "Baca mantra", scene7, 0, 6, 0, "Item sudah digunakan", //option,scene,damage,xp,hp,item
                            "Buka tanpa mantra", scene7, 1, 2, 0, "",  //option,scene,damage,xp,hp,item
                            "Pelajari dahulu", scene7, 0, 3, 0, "Kunci cadangan"  //option,scene,damage,xp,hp,item
                    );

                    Scene scene5 = new Scene(
                            "Disana kamu bertemu dengan nenek penjual jamu gendong dan ia menawarimu minum jamu terlebih dahulu ", //description
                            "Minum jamu", scene6, 0, 4, 2, "Mantra",//option,scene,damage,xp,hp,item
                            "Tolak baik-baik", scene6, 0, 2, 0, "",  //option,scene,damage,xp,hp,item
                            "Lanjutkan perjalanan", scene6, 1, 1, 0, ""  //option,scene,damage,xp,hp,item
                    );
                    
                     Scene scene4 = new Scene(
                            "Tanpa disadari kamu menemukan jalur rahasia menuju hutan", //description
                            "Masuk sekarang", scene5, 0, 5, 0, "Lampu penerangan",//option,scene,damage,xp,hp,item
                            "Tandai lokasi", scene5, 0, 2, 0, "",  //option,scene,damage,xp,hp,item
                            "Foto lalu kabur", scene5, 0, 1, 0,  ""  //option,scene,damage,xp,hp,item
                    );
                    
                     Scene scene3 = new Scene(
                            "Saat sedang mengelilingi desa kamu menemukan hutan misterius yang memiliki aura mistis (terdengar lirih suara gamelan). \nKonon katanya ini merupakan tempat batu pusaka berada", //description
                            "Ikuti suara gamelan ", scene4, 1, 5, 0, "",//option,scene,damage,xp,hp,item
                            "Gunakan peta", scene4, 0, 3, 0, "Item sudah digunakan",  //option,scene,damage,xp,hp,item
                            "Lari ke arah lain", scene4, 0, 1, 0,  ""  //option,scene,damage,xp,hp,item
                    );

                    Scene scene2 = new Scene(
                            "Saat tidur kamu mengalami mimpi buruk, di dalam mimpi datang seorang wanita berkebaya dan menyebut batu pusaka", //description
                            "Cerita ke Kepala Desa", scene3, 1, 3, 0, "Peta", //option,scene,damage,xp,hp,item
                            "Catat", scene3, 0, 5, 0, "",  //option,scene,damage,xp,hp,item
                            "Abaikan", scene3, 0, 1, 0,  ""  //option,scene,damage,xp,hp,item
                    );

                    Scene scene1 = new Scene(
                            player.getName()+", kamu tiba di desa terpencil yang disebut Alas Jathilan \ndengan Kepala desa yang sudah bersiap dan menyambutmu dengan senyuman misterius", //description
                            "Menyapa dan bertanya tentang sejarah desa", scene2, 0, 1, 0, "", //option,scene,damage,xp,hp,item
                            "Langsung ke penginapan", scene2, 0, 0, 0, "",  //option,scene,damage,xp,hp,item
                            "Keliling desa sendirian", scene2, 0, 1, 0, "Peta"  //option,scene,damage,xp,hp,item
                    );
                    
                    Story story = new Story(scene1, player); //instance dari kelas Story, memberikan objek startScene dan player sebagai argumen.
                    story.start(); //Memanggil metode start() pada objek Story untuk memulai alur permainan
                    break;


                case "2":
                    System.out.println(player.getName() + " Left the game!");
                    gameRunning = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }
        }

        scanner.close();
    }
    
}
