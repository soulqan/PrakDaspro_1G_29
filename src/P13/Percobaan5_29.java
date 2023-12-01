package P13;

public class Percobaan5_29 {
    static void tampil(String str, int... a){
        System.out.println("String: "+str);
        System.out.println("Jumlah argumen/parameter: "+ a.length);

        for (int i : a) {
            System.out.println(i+" ");
            }
System.out.println();
    }

    public static void main(String[] args) {
        tampil("Daspro 2019",100,200);
        tampil("Teknologi Informasi",1,2,3,4,5);
        tampil("Polinema");
    }
}
