import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        int i = 0;
        while (true) {
            try {
                System.out.print("Masukkan nama ke-" + (i + 1) + " (ketik 'selesai' untuk mengakhiri): ");
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                } else if (input.equalsIgnoreCase("selesai")) {
                    break;
                } else {
                    namaMahasiswa.add(input);
                    i++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        if (namaMahasiswa.isEmpty()) {
            System.out.println("Tidak ada nama mahasiswa yang dimasukkan.");
        } else {
            System.out.println("Daftar mahasiswa yang diinputkan: ");
            for (String nama : namaMahasiswa) {
                System.out.println("- " + nama);
            }
        }
}
}