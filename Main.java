import java.util.*;
public class Main {

  
    public static void main(String[] args) {
        SinglyLinkList<Pegawai> linkedList = new SinglyLinkList<>("List pertama");
        
        while (1 > 0){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilihlah menu:");
        System.out.println("1. Input data");
        System.out.println("2. Hapus data");
        System.out.println("3. Cetak list pegawai");
        System.out.println("4. Keluar");
        int x = sc.nextInt();
        switch (x) {
            case 1:
               
                    System.out.println("Masukkan data");
                    System.out.println("Tuliskan nip, nama dan divisi pegawai");
                    int nip = sc.nextInt(); //hanya bisa menginput angka
                    String namaPegawai = sc.next();
                    String divisi = sc.next();

                    System.out.println("Tambahkan data di awal list? (y/n)");
                    String jawaban = sc.next();
                    if (jawaban.equals("y") == true){
                        linkedList.insertFront(new Pegawai(namaPegawai, nip, divisi));
                    } else if (jawaban.equals("n") == true){
                        linkedList.insertAtBack(new Pegawai(namaPegawai, nip, divisi));
                    }
                    System.out.println("Data berhasil diinput!");
                    break;


            case 2:
                System.out.println("Hapus data awal? (y/n)");
                String jawaban2 = sc.next();
                if (jawaban2.equals("y") == true){
                    linkedList.removeFromFront();
                } else if (jawaban2.equals("n") == true){
                    linkedList.removeFromBack();
                }
                System.out.println("Data berhasil dihapus!");
                break;

            case 3:
                System.out.println("Cetak list pegawai :");
                linkedList.print();
                break;

            case 4:
                System.out.println("Keluar? (y/n)");
                String jawaban3 = sc.next();
                if (jawaban3.equals("y") == true){
                    System.exit(0);
                } else if (jawaban3.equals("n") == true){
                    System.out.println("Terima kasih!");
                }
                break; 
            }
        }
        
    }
}
