package P13;

public class TerimaKasih_29 {
    public static void UcapanTerimakasih() {
        System.out.println("Thank you for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like u could ask you anything.");
    }

public static void UcapanTamabahan(String ucapan){
    System.out.println(ucapan);
}

    public static void main(String[] args) {
        // Menggunkan fungsi
        UcapanTerimakasih();
        String ucapan="Terima Kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTamabahan(ucapan);
    }
}