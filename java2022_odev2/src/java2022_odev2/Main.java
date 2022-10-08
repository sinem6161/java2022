package java2022_odev2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);	
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
//		sayiBulmaca();
//		sayiBulmaca();
//		sayiBulmaca();
//		sayiBulmaca();
		
		

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
//	public static void sayiBulmaca() {
//		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
//		int aranacak = 8;
//		boolean varMi = false;
//
//		for (int sayi : sayilar) {
//			if (sayi == aranacak) {
//				varMi = true;
//				break;
//			}
//		}
//
//		if (varMi) {
//			mesajVer("Sayı mevcuttur: "+ aranacak);
//		} else {
//			mesajVer("Sayı mevcut değildir: "+ aranacak);
//		}
//	}
//	
//	public static void mesajVer(String mesaj) {
//		System.out.println(mesaj);
//		
//	}

}
