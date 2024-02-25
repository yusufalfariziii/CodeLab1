import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        String gender = scanner.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);

        System.out.println("Nama: " + name);

        if (gender.equalsIgnoreCase("P")) {
            System.out.println("Jenis Kelamin Perempuan");
        } else if (gender.equalsIgnoreCase("L")) {
            System.out.println("Jenis Kelamin Laki-laki");
        } else {
            System.out.println("Jenis Kelamin Tidak Valid");
        }

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        System.out.println("Umur Anda " + period.getYears() + " tahun " + period.getMonths() + " bulan");
    }
}