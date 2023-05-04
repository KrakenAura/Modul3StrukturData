package Kegiatan2;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scan = new Scanner(System.in);
        String namaPelanggan;
        int pilih;

        do{
            System.out.println("=== MENU GAME STORE ===");
            System.out.println("[1] Tambah Antrian");
            System.out.println("[2] Hapus Antrian Terdepan");
            System.out.println("[3] Antrian Terdepan");
            System.out.println("[4] Cek Antrian");
            System.out.println("[5] Jumlah Antrian");
            System.out.println("[0] EXIT");
            System.out.print("\n"+"Pilihan Anda : ");
            pilih = scan.nextInt();

            switch (pilih){
                case 1: //Enqueue --> Add
                    scan.nextLine(); //Clear
                    System.out.println("Masukkan nama pelanggan");
                    namaPelanggan = scan.nextLine();
                    queue.enqueue(namaPelanggan);
                    System.out.println("Pelanggan Berhasil Ditambahkan ke Antrian");
                    break;
                case 2: //Dequeue -->Hapus Terdepan
                    namaPelanggan = queue.dequeue();
                    if(namaPelanggan==null){
                        System.out.println("Antrian Kosong");
                    }else{
                        System.out.println("Pelanggan Berhasil Dihapus dari Antrian");
                    }
                    break;
                case 3: // Pelanggan Terdepan
                    namaPelanggan = queue.peek();
                    if (namaPelanggan==null){
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println("Pelanggan Terdepan adalah : "+namaPelanggan);
                    }
                    break;
                case 4: //Cek Antrian Kosong
                    if(queue.isEmpty()){
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println("Masih Ada Antrian");
                    }
                    break;
                case 5:
                    System.out.println("Jumlah Pelanggan dalam Antrian : "+queue.size());
                    break;
                case 0:
                    System.out.println("Dah Kelar");
                    break;
                default:
                    System.out.println("Pilih yang ada aja");
                    break;
            }
        }while (pilih != 0);
    }
}
