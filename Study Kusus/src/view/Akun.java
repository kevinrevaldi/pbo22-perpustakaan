//package view;
//
//import controller.AllObjectModel;
//import model.DaftarAkunModel;
//
//import java.util.Scanner;
//
//public class Akun {
//
//    private static Scanner input = new Scanner(System.in);
//
//    public static void Daftar(){
//        String idakun;
//        String nama , alamat , notlp , pw;
//        int indexkursus = 0;
//        System.out.print("ID : ");
//        idakun = input.nextLine();
//        System.out.print("Nama : ");
//        nama = input.nextLine();
//        System.out.print("Alamat : ");
//        alamat = input.nextLine();
//        System.out.print("Nomer telephone : ");
//        notlp = input.nextLine();
//        System.out.print("password : ");
//        pw = input.nextLine();
//        System.out.println("Menu Kursus : ");
//        System.out.println("- Matematika ");
//        System.out.println("- Biologi ");
//        System.out.println("- Fisika  ");
//        System.out.print("Pilih Kursus : ");
//        String kursus = input.next();
//        AllObjectController.akunController.daftarKursus(idakun,nama,alamat,notlp,pw,kursus);
////        AllObjectController.kursusController.dataKursus(kursus);
//
//    }
//
//    public static void login(){
//        System.out.print("id : ");
//        String idakun = input.next();
//        System.out.print("Passowrd : ");
//        String pw = input.next();
//        try{
//            AllObjectController.akunController.login(idakun, pw);
//            menudalam();
//        } catch (Exception e){
//            System.out.println("Daftar Kursus tidak ada");
//        }
//
//    }
//    public static void menu(){
//        int pilih;
//        do {
//            System.out.println("Menu Pilihan");
//            System.out.println("1. Daftar Akun");
//            System.out.println("2. Login ");
//            System.out.println("3. Exit");
//            System.out.print("pilih : ");
//            pilih = input.nextInt();
//            input.nextLine();
//            switch (pilih){
//                case 1:
//                    Daftar();
//                    break;
//                case 2:
//                    login();
//                    break;
//            }
//        } while (pilih != 3);
//    }
//
//    public static void menudalam(){
//        int pilih;
//        do {
//            System.out.println("Menu Pilihan");
//            System.out.println("1. Edit ");
//            System.out.println("2. Hapus");
//            System.out.println("3. lihat ");
//            System.out.println("4. Exit");
//            System.out.print("pilih : ");
//            pilih = input.nextInt();
//            input.nextLine();
//            switch (pilih){
//                case 1:
//                    editkursus();
//                    break;
//                case 2:
//                    deletekursus();
//                    break;
//                case 3:
//                    AllObjectController.akunController.viewAkun();
//                    break;
//            }
//        } while (pilih != 4);
//    }
//
//    public static void deletekursus(){
//        AllObjectController.akunController.viewAkun();
//        System.out.println("Masukkan nomor akun yang ingin di hapus : ");
//        int nomor = input.nextInt();
//                input.nextLine();
//        AllObjectController.akunController.hapusbuku(nomor);
//   }
//   public static void editkursus(){
//        int pilih;
//
//                System.out.print("nomor : ");
//                int nomor = input.nextInt();
//                input.nextLine();
//                System.out.println("Menu Pilihan");
//                System.out.println("1. ID Akun  ");
//                System.out.println("2. Nama");
//                System.out.println("3. alamat");
//                System.out.println("4. nomer telephone ");
//                System.out.println("5. password");
//                System.out.println("6. Kursus");
//                System.out.print("pilih : ");
//                pilih = input.nextInt();
//                input.nextLine();
//                System.out.println("Masukan Data Baru");
//                String data = input.nextLine();
//                switch (pilih){
//                   case 1:
//                       AllObjectController.akunController.editakun(nomor,1,data);
//                       break;
//                   case 2:
//                       AllObjectController.akunController.editakun(nomor,2,data);
//                       break;
//                   case 3:
//                       AllObjectController.akunController.editakun(nomor,3,data);
//                       break;
//                    case 4:
//                        AllObjectController.akunController.editakun(nomor,4,data);
//                        break;
//                    case 5:
//                        AllObjectController.akunController.editakun(nomor,5,data);
//                        break;
//                    case 6:
//                        AllObjectController.akunController.editakun(nomor,6,data);
//                    default:
//
//
//                }
//
//
//   }
//}
