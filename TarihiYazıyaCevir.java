import java.util.Scanner;

public class TarihiYazýyaCevir {
	
	    //kullanýcýnýn gireceði tarihi okuyup yazýyla geri döndürek fonksiyon "tarihOku"
	static void tarihOku(String tarih) {
		//okunuþu yazýlacak sayýnýn birler basamaðýndaki rakamýn okunuþunu tutacaðýmýz dizi "birler"
		String[] birler = {"", "bir", "iki", "üç", "dört", "beþ", "altý", "yedi", "sekiz", "dokuz"};
		
		//okunuþu yazýlacak sayýnýn onlar basamaðýndaki rakamýn okunuþunu tutacaðýmýz dizi "onlar"
		String[] onlar = {"", "on", "yirmi", "otuz", "kýrk", "elli", "altmýþ", "yetmiþ", "seksen", "doksan"};
		
		//aylarýn okunuþlarý
		String[] aylar = {"", "Ocak", "Þubat", "Mart", "Nisan", "Mayýs", "Haziran", "Temmuz", "Aðustos", "Eylül", "Ekim", "Kasým", "Aralýk"};
		
		
		/*
		 * kullanýcýn girdiði tarih üzerinde deðiþiklik yapmamak için fonksiyon içerisinde
		 * yeni bir String türünde deðiþken oluþturup tarih bilgisini "buTarih" deðiþkenine
		 * kopyaladým. Bu sayede tarih üstünde yaptýðým deðiþiklikler asýl tarihi deðiþtirmeyecek
		 */
		String buTarih = tarih;
		
		String gun = buTarih.substring(0, buTarih.indexOf("."));
		int sayiGun = Integer.parseInt(gun);
		buTarih = buTarih.substring(buTarih.indexOf(".")+1);
		String ay = buTarih.substring(0, buTarih.indexOf("."));
		int sayiAy = Integer.parseInt(ay);
		buTarih = buTarih.substring(buTarih.indexOf(".")+1);
		int yil = Integer.parseInt(buTarih);
		
		if(sayiGun < 10)
			System.out.print(birler[sayiGun]);
		if(sayiGun > 9 && sayiGun < 32) {
			int sayiGunBirler = sayiGun % 10;
			sayiGun = (sayiGun - sayiGunBirler) / 10; 
			System.out.print(onlar[sayiGun] + " " + birler[sayiGunBirler]);
		}
		
		if(sayiAy > 0 && sayiAy < 13)
			System.out.print(" " + aylar[sayiAy]);
		
		if(yil > 999 && yil < 10000) {
			
			int yilBirler, yilOnlar, yilYuzler, yilBinler;
			yilBirler = yil % 10;
			yil = (yil - yilBirler) / 10;
			yilOnlar = yil % 10;
			yil = (yil - yilOnlar) / 10;
			yilYuzler = yil % 10;
			yil = (yil - yilYuzler) / 10;
			yilBinler = yil % 10;
			yil = (yil - yilBinler) / 10;
			
			if(yilBinler == 1)
				System.out.print(" bin");
			else
				System.out.print(" " + birler[yilBinler] + " bin");
			
			if(yilYuzler == 1)
				System.out.print(" yüz");
			else if(yilYuzler == 0)
				System.out.print("");
			else
				System.out.print(" " + birler[yilYuzler] + " yüz");
			
			System.out.print(" " + onlar[yilOnlar] + " " + birler[yilBirler]);
			
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		System.out.print("Bir tarih giriniz (örneðin: 26.04.1995): ");
		Scanner input = new Scanner(System.in);
		String tarih = input.next();
		tarihOku(tarih);
		input.close();
		
	}
	
}
