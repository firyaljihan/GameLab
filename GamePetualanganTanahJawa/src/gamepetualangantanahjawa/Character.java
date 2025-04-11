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
public class Character { 
    private String name; // atribut nama karakter.
    private int health; // Poin kesehatan karakter.
    private int XP; // Poin yang didapat oleh pemain Ketika menyelesaikan tantangan
    private String item; //barang yang dimiliki karakter
    
    public Character(String name){ //Konstruktor untuk menginisialisasi atribut karakter
        this.name = name;
        this.health = 10;
        this.XP = 0;
        this.item = "";
    }
    
    public void takeDamage(int damage){ //Mengurangi poin kesehatan karakter
        if(damage > 0){ //cek apakah damagenya lebih dari 0?
            if (this.health <= damage) { //jika ya, maka cek lagi apa HP <= damage?
                System.out.println("Nyawamu habis!"); //jika iya maka game over
                System.out.println("====GAME OVER====");
            }else{ //jika tidak maka nyawa saat ini - damage
                this.health -= damage;
                System.out.println("GAWAT! nyawamu berkurang :  " + damage);
            }
        }else{
            System.out.println("Damage harus lebih dari 0");
        }
    }
    public void addHP(int additionalHP){ // Menambah poin kesehatan karakter
        if (additionalHP > 0) { //cek apakah poin HP lebih dari 0?
            this.health += additionalHP; //jika ya maka health akan bertambah
            System.out.println("YEAYY! nyawamu bertambah : " + additionalHP);
        }else{ //jika poin HP kurang dari 0 maka tampilkan output ini 
            System.out.println("HP yang ditambahkan harus lebih dari 0");
        }
    }
    public void addXP(int additionalXP){ //Menambahkan poin XP
        if (additionalXP > 0) { //cek apakah poin XP lebih dari 0?
            this.XP += additionalXP; //jika ya maka XP akan bertambah
            System.out.println("YEAYY! XP bertambah : " + additionalXP);
        }else{ //jika poin XP kurang dari 0 maka tampilkan output ini 
            System.out.println("XP yang ditambahkan harus lebih dari 0");
        }
    }
    public String getName() { //Mengembalikan nama karakter
        return name;
    }

    public int getHealth() { //Mengembalikan poin kesehatan karakter.
        return health;
    }
    
    public void setHealth(int health) { //Mengatur poin kesehatan karakter.
        this.health = health;
    }

    public String getItem() { //Mengembalikan item karakter
        return this.item;
    }

    public void setItem(String item) { //Mengatur item karakter
        this.item = item;
    }

    public int getXP() { //Mengembalikan poin XP karakter
        return XP;
    }
}
