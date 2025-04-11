/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamepetualangantanahjawa;

/**
 *
 * @author FAM COMPUTINDO
 */
/**NAMA ANGGOTA KELOMPOK :
     * FIRYAL JIHAN HAURA_102062400119_IS_07-04
     * BERLIAN SEPASYA REKARDIAN_10206240088_IS-07-04 
     **/
public class Scene {
    private String description; // Deskripsi adegan
    private String choiceA, choiceB, choiceC; // Deskripsi pilihan

    private Scene nextSceneA, nextSceneB, nextSceneC; // Adegan selanjutnya untuk setiap pilihan

    private int damageA, damageB, damageC; // Damage point untuk setiap pilihan
    private int xpA, xpB, xpC; // XP untuk setiap pilihan
    private int hpA, hpB, hpC; // HP untuk setiap pilihan

    private String itemA, itemB, itemC; // Item yang didapat dari setiap pilihan

    // Menginisialisasi deskripsi dan pilihan adegan
    public Scene(String description,
            String choiceA, Scene nextSceneA, int damageA, int xpA, int hpA, String itemA,
            String choiceB, Scene nextSceneB, int damageB, int xpB, int hpB, String itemB,
            String choiceC, Scene nextSceneC, int damageC, int xpC, int hpC,String itemC) {
        
        this.description = description;
        this.choiceA = choiceA;
        this.nextSceneA = nextSceneA;
        this.damageA = damageA;
        this.xpA = xpA;
        this.hpA = hpA;
        this.itemA = itemA;

        this.choiceB = choiceB;
        this.nextSceneB = nextSceneB;
        this.damageB = damageB;
        this.xpB = xpB;
        this.hpB = hpB;
        this.itemB = itemB;

        this.choiceC = choiceC;
        this.nextSceneC = nextSceneC;
        this.damageC = damageC;
        this.xpC = xpC;
        this.hpC = hpC;
        this.itemC = itemC;
    }
    
    // Menampilkan deskripsi dan pilihan adegan
    public void displayScene() {
        System.out.println("\n------------------------------");
        System.out.println(description);
        System.out.println("A. " + choiceA);
        System.out.println("B. " + choiceB);
        System.out.println("C. " + choiceC);
        System.out.print("Pilih A, B, C, atau INFO : ");
    }

    // Mengembalikan nextSceneA untuk "A" (atau "a"), nextSceneB untuk "B" (atau "b"), dan null untuk input yang tidak valid
    public Scene makeChoice(String choice, Character player) {
        switch (choice.toUpperCase()) {
            case "A":
                if (damageA > 0) {
                    player.takeDamage(damageA);
                }
                if (xpA > 0) {
                    player.addXP(xpA);
                }
                if (hpA > 0) {
                    player.addHP(hpA);
                }
                if (!itemA.isEmpty()) {
                    player.setItem(itemA);
                    System.out.println("Kamu mendapatkan item: " + itemA);
                }
                return nextSceneA;
            case "B":
                if (damageB > 0) {
                    player.takeDamage(damageB);
                }
                if (xpB > 0) {
                    player.addXP(xpB);
                }
                if (hpB > 0) {
                    player.addHP(hpB);
                }
                if (!itemB.isEmpty()) {
                    player.setItem(itemB);
                    System.out.println("Kamu mendapatkan item: " + itemB);
                }
                return nextSceneB;
            case "C":
                if (damageC > 0) {
                    player.takeDamage(damageC);
                }
                if (xpC > 0) {
                    player.addXP(xpC);
                }
                if (hpC > 0) {
                    player.addHP(hpC);
                }
                if (!itemC.isEmpty()) {
                    player.setItem(itemC);
                    System.out.println("Kamu mendapatkan item: " + itemC);
                }
                return nextSceneC;
            default:
                System.out.println("Pilihan tidak valid. Coba lagi.");
                return null;
        }
    }
}
