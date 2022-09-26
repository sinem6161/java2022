package java2022;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		int ogrenciSayisi=12;
//		String mesaj="Student number :";
//		System.out.println(mesaj + ogrenciSayisi);
//		
//		double sayi = 12.5;
//		sayi= -129;
//		char karakter = 'A';
//		boolean dogruMu = false;
//		
//		int number = 24;
//		if(number<20) {
//			System.out.println("Number is less than 20.");
//		}
//		else if(number>20) {
//			System.out.println("Number is greater than 20.");
//		}
//		else {
//			System.out.println("Number is equal to 20.");
//		}
//		
//		int number1=24;
//		int number2=25;
//		int number3=2;
//		
//		int theBiggest=number1;
//		if(theBiggest<number2) {
//			theBiggest = number2;
//		}
//		
//		if(theBiggest<number3) {
//			theBiggest = number3;
//		}
//		
//		System.out.println("The biggest = "+theBiggest);
//		
//		
//		char grade = 'L';
//		
//		switch (grade) {
//		case 'A' :
//			System.out.println("Perfect : You passed!");
//			break;
//		case 'B' :
//			System.out.println("Very good : You passed!");
//			break;
//		case 'C' :
//			System.out.println("Good : You passed!");
//			break;
//		case 'D' :
//			System.out.println("Not bad : You passed!");
//			break;
//		case 'F' :
//			System.out.println("Unfortunately : You failed'");
//			break;
//		default :
//			System.out.println("You entered an invalid note!");
//		}
//
//		
//		for(int i=2;i<10;i+=2) {
//			System.out.println(i);
//		}
//		System.out.println(" For Cycle is over!");
//		
//		int i=1;
//		while(i<10) {
//			System.out.println(i);
//			i+=2;
//		}
//		
//		System.out.println("While Cycle is over!");
//		
//		int j=1;
//		do {
//			System.out.println(j);
//			j+=2;
//		}while(j<10);
//		System.out.println("Do-while Cycle is over!");
//		
//		String[] students = new String[4];
//		students[0]="Engin";
//		students[1]="Derin";
//		students[2]="Salih";
//		students[3]="Ahmet";
//		
//		for(int a=0;a<students.length;a++) {
//			System.out.println(students[a]);
//		}
//		
//		System.out.println("---------------------------------------------------------");
//		for(String student:students) {
//			System.out.println(student);
//		}
//		
//		double[] myList = {1.2,6.3,4.3,5.6};
//		double total=0;
//		double max=myList[0];
//		for(double numbers:myList) {
//			if(max<numbers) {
//				max = numbers;
//			}
//			total=total + numbers;
//			System.out.println(numbers);
//		}
//		
//		System.out.println("Total =" + total);
//		System.out.println("Max ="+ max);
//		
//		String [][] sehirler = new String[3][3];
//		
//		sehirler[0][0]="İstanbul";
//		sehirler[0][1]="Bursa";
//		sehirler[0][2]="Bilecik";
//		sehirler[1][0]="Ankara";
//		sehirler[1][1]="Konya";
//		sehirler[1][2]="Kayseri";
//		sehirler[2][0]="Diyarbakır";
//		sehirler[2][1]="Şanlıurfa";
//		sehirler[2][2]="Gaziantep";
//		
//		for(int f=0; f<=2; f++) {
//			System.out.println("--------------------------");
//			for(int h=0;h<=2;h++) {
//				System.out.println(sehirler[f][h]);
//			}
//		}
//		
//		String message="The weather is very beautiful today!";
//		System.out.println(message);
//		
//		System.out.println("Number of elements: "+message.length());
//		System.out.println("Fifth element:"+message.charAt(4));
//		System.out.println(message.concat("Wonderful!"));
//		System.out.println(message.startsWith("T")); //true
//		System.out.println(message.endsWith(".")); //false
//		char[] characters = new char[5];
//		message.getChars(0, 5, characters, 0);
//		System.out.println(characters);
//		System.out.println(message.indexOf("a"));
//		System.out.println(message.lastIndexOf("o"));
//		
//		String newMessage = message.replace(' ', '-');
//		System.out.println(newMessage);
//		System.out.println(message.substring(2, 5));
//		
//		for(String word : message.split(" ")) {
//			System.out.println(word);
//		}
//		
//		System.out.println(message.toUpperCase());
//		System.out.println(message.toLowerCase());
//		System.out.println(message.trim());
//		
//		int number5=1;
//		int remainder = number % 2;
//		System.out.println(remainder);
//		boolean isPrime = true;
//		
//		if(number5==1) {
//			System.out.println("The number is not prime!");
//			return;
//		}
//		
//		if(number5<1) {
//			System.out.println("invalid number!");
//		}
//		
//		for(int s=2; s<number5; s++) {
//			if(number5 % s == 0) {
//				isPrime = false;
//			}
//		}
//		
//		if(isPrime) {
//			System.out.println("The number is prime!");
//		}
//		else {
//			System.out.println("The number is not prime!");
//		}
		
//		char harf='B';
//		switch(harf) {
//		case 'A':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("Kalın sesli harf!");
//			break;
//		default:
//			System.out.println("İnce sesli harf!");
//			
//		}
//		
//		int number=28;
//		int total=0;
//		
//		for(int i=1;i<number;i++) {
//			if(number % i == 0) {
//				total = total +i;
//			}
//		}
//		
//		if(total == number) {
//			System.out.println("Mükemmel sayıdır.");
//		}
//		else {
//			System.out.println("Mükemmel sayı değildir.");
//		}
		
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1= toplam1 +i;
			}
		}
		
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2=toplam2+i;
			}
		}
		
		if(sayi1==toplam2 && sayi2 ==toplam1) {
			System.out.println("bu iki sayı arkadaştır.");
		}else {
			System.out.println("bu iki sayı arkadaş değildir.");
		}
	}

	

}
