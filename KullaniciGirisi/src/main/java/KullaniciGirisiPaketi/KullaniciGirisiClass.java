package KullaniciGirisiPaketi;
import java.util.Scanner;
public class KullaniciGirisiClass {
    public static void main(String[] args) {
        String userName, password, newPassword = null, secim;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
        userName= input.nextLine();

        System.out.print("Lütfen Şifrenizi Giriniz:" );
        password= input.nextLine();

        if ( userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");}

        else {
            System.out.println( "Kullanıcı adınız veya şifreniz hatalı!\n Şifrenizi sıfırlamak ister misiniz? (Y/N)");}
        secim=input.nextLine();
        if (secim.equals("Y")){
            System.out.println("Yeni şifrenizi giriniz:");
            newPassword=input.nextLine();}
        System.out.println("Şifre Oluşturuldu");

        while (newPassword.equals("java123")){
            System.out.println("Yeni şifreniz eski şifreniz ile aynı olamanaz!!! " +
                    "\n Şifre oluşturulamadı, lütfen başka şifre giriniz:");

        newPassword=input.nextLine();}




        }
    }









