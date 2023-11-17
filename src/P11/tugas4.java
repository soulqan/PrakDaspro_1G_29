package P11;

public class tugas4 {
    public static void main(String[] args) {
        char[] karakter = {'A', 'l', 'b', 'e', 'r', 't', 'E', 'i', 'n', 's', 't', 'e', 'i', 'n'};

        int panjangNama = karakter.length;
        char[][] arrayDuaDimensi = new char[8][5];
        int indeks = 0;

        for (int i = 0; i < arrayDuaDimensi.length; i++) {
            for (int j = 0; j < arrayDuaDimensi[i].length; j++) {
                if (indeks < panjangNama) {
                    arrayDuaDimensi[i][j] = karakter[indeks];
                    indeks++;
                } else {
                    indeks = 0;
                    arrayDuaDimensi[i][j] = karakter[indeks];
                    indeks++;
                }
            }
        }

        // Menggunakan for loop untuk mencetak array dua dimensi
        for (int i = 0; i < arrayDuaDimensi.length; i++) {
            for (int j = 0; j < arrayDuaDimensi[i].length; j++) {
                System.out.print(arrayDuaDimensi[i][j] + " ");
            }
            System.out.println();
        }
    }
}

