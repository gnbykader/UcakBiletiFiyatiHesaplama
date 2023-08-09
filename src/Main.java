import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double mesafe,normalTutar,mesafeBasınaUcret = 0.10,yasIndirimi,IndirimliTutar = 0,gidisDonusIndirim = 0,toplamTutar = 0;
		int yas,yolculukTipi;
		Scanner inp = new Scanner(System.in);
		System.out.print("Mesafeyi km turunden giriniz: ");
		mesafe = inp.nextDouble();
		
		System.out.print("Yasinizi giriniz: ");
		yas = inp.nextInt();
		
		System.out.println("Yolculuk tipinizi giriniz(1 => Tek Yon, 2 => Gidis-Donus): ");
		yolculukTipi = inp.nextInt();
		
		normalTutar = mesafe*mesafeBasınaUcret;
		
		if ((mesafe > 0) && (yas > 0) && ((yolculukTipi>=1) && (yolculukTipi<=2))) {
			if (yas<12) {
				yasIndirimi = normalTutar*0.50;
				IndirimliTutar = normalTutar - yasIndirimi;
				if (yolculukTipi==2) {
					gidisDonusIndirim = IndirimliTutar*0.20;
					toplamTutar = (IndirimliTutar - gidisDonusIndirim)*2;
					System.out.println("Toplam tutar: "+toplamTutar);
				}
				else if(yolculukTipi==1) {
					System.out.println("Toplam tutar: "+IndirimliTutar);
				}
				
			}
			else if ((yas>=12) && (yas<=24)) {
				yasIndirimi = normalTutar*0.10;
				IndirimliTutar = normalTutar - yasIndirimi;
				if (yolculukTipi==2) {
					gidisDonusIndirim = IndirimliTutar*0.20;
					toplamTutar = (IndirimliTutar - gidisDonusIndirim)*2;
					System.out.println("Toplam tutar: "+toplamTutar);
				}
				else if(yolculukTipi==1) {
					System.out.println("Toplam tutar: "+IndirimliTutar);
				}
			}
			else if (yas>=65) {
				yasIndirimi = normalTutar*0.30;
				IndirimliTutar = normalTutar - yasIndirimi;
				if (yolculukTipi==2) {
					gidisDonusIndirim = IndirimliTutar*0.20;
					toplamTutar = (IndirimliTutar - gidisDonusIndirim)*2;
					System.out.println("Toplam tutar: "+toplamTutar);
				}
				else if(yolculukTipi==1) {
					System.out.println("Toplam tutar: "+IndirimliTutar);
					
				}
			   
			}
			else if ((yas>=25)||(yas<=64)) {
				if (yolculukTipi==2) {
					gidisDonusIndirim = normalTutar*0.20;
					toplamTutar = (IndirimliTutar - gidisDonusIndirim)*2;
					System.out.println("Toplam tutar: "+toplamTutar);
				}
				else if(yolculukTipi==1) {
					System.out.println("Toplam tutar: "+normalTutar);				
			
		}
		
					
	  }
    }
	else {
			System.out.println("Hatali Veri Girdiniz !");
		}	
  }
}



