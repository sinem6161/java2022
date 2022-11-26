package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { //final kullanırsak ezemeyiz! Bu şekilde ezebiliriz.
		return tutar* 1.18;
	}

}
