import java.util.Scanner;

public class KelimeSayisiBul {

	static void kacKelimeVar(String cumle) {

		int kelimeSayisi = 0;

		// cümlede 1'den fazla boþluk var ise bu boþluklarý tek boþluða indirir, art
		// arda 1'den fazla boþluk olmaz
		String buCumle = cumle;

		for (;;) {

			buCumle = buCumle.replaceAll("  ", " ");

			if (buCumle.indexOf("  ") == -1) {
				break;
			}

		}

		

		if (buCumle.charAt(0) == ' ') {
			buCumle = buCumle.substring(1);
		}
		if (buCumle.charAt(buCumle.length() - 1) == ' ') {
			buCumle = buCumle.substring(0, buCumle.length() - 1);
		}
		// burada boþluk ile ilgili iþlemler bitiyor
		
		// ---------------------

		// kelime sayýsýnýn hesaplandýðý yer

		if (buCumle.indexOf(" ") == -1 && buCumle.length() > 0) {
			kelimeSayisi++;
		}

		while (buCumle.indexOf(" ") != -1) {

			kelimeSayisi++;
			buCumle = buCumle.substring(buCumle.indexOf(" ") + 1);
			if (buCumle.indexOf(" ") == -1 && buCumle.length() > 0) {
				kelimeSayisi++;
			}

		}

		System.out.println("Kelime Sayýsý: " + kelimeSayisi);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir þeyler yazýnýz:");
		String metin = input.nextLine();

		kacKelimeVar(metin);
		
		input.close();

	}

}
