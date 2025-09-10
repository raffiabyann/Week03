package week03.raffi.id.umn.ac;
import java.util.Scanner;
public class Tugas2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Masukkan Nama Anda: ");
	        String nama = scanner.nextLine();

	        int pilihan;
	        do {
	            System.out.println("\nString anda : " + nama);
	            System.out.println("Menu Pilihan:");
	            System.out.println("1. charAt");
	            System.out.println("2. length");
	            System.out.println("3. substring(n)");
	            System.out.println("4. substring(m,n)");
	            System.out.println("5. contains");
	            System.out.println("6. concat");
	            System.out.println("7. replace");
	            System.out.println("8. split");
	            System.out.println("9. toLowerCase");
	            System.out.println("10. toUpperCase");
	            System.out.println("0. Keluar");
	            System.out.print("Pilih menu: ");
	            pilihan = scanner.nextInt();
	            scanner.nextLine(); // buang enter

	            switch (pilihan) {
	                case 1:
	                    System.out.println("-----charAt-----");
	                    System.out.print("Input index : ");
	                    int idx = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.println("Hasil : " + nama.charAt(idx));
	                    break;

	                case 2:
	                    System.out.println("-----length-----");
	                    System.out.println("Hasil : " + nama.length());
	                    break;

	                case 3:
	                    System.out.println("-----substring(n)-----");
	                    System.out.print("Input index mulai : ");
	                    int mulai = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.println("Hasil : " + nama.substring(mulai));
	                    break;

	                case 4:
	                    System.out.println("-----substring(m,n)-----");
	                    System.out.print("Input mulai : ");
	                    int m = scanner.nextInt();
	                    System.out.print("Input akhir : ");
	                    int n = scanner.nextInt();
	                    scanner.nextLine();
	                    System.out.println("Hasil : " + nama.substring(m, n));
	                    break;

	                case 5:
	                    System.out.println("-----contains-----");
	                    System.out.print("Input kata : ");
	                    String kata = scanner.nextLine();
	                    System.out.println("Hasil : " + nama.contains(kata));
	                    break;

	                case 6:
	                    System.out.println("-----concat-----");
	                    System.out.print("Input tambahan : ");
	                    String tambahan = scanner.nextLine();
	                    System.out.println("Hasil : " + nama.concat(" " + tambahan));
	                    break;

	                case 7:
	                    System.out.println("-----replace-----");
	                    System.out.print("Input kata yang diganti : ");
	                    String lama = scanner.nextLine();
	                    System.out.print("Input kata pengganti : ");
	                    String baruStr = scanner.nextLine();
	                    System.out.println("Hasil : " + nama.replace(lama, baruStr));
	                    break;

	                case 8:
	                    System.out.println("-----split-----");
	                    String[] hasilSplit = nama.split(" ");
	                    for (String s : hasilSplit) {
	                        System.out.println(s);
	                    }
	                    break;

	                case 9:
	                    System.out.println("-----toLowerCase-----");
	                    System.out.println("Hasil : " + nama.toLowerCase());
	                    break;

	                case 10:
	                    System.out.println("-----toUpperCase-----");
	                    System.out.println("Hasil : " + nama.toUpperCase());
	                    break;

	                case 0:
	                    System.out.println("Program selesai.");
	                    break;

	                default:
	                    System.out.println("Pilihan tidak valid!");
	            }

	        } while (pilihan != 0);

	        scanner.close();
	    }
	}