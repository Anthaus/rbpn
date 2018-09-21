package math;

public class Misc {
	
	static void tourne() {
		double mise = 1;
		double miseT = 0;
		double gain = 0;
		double miseMax = 0;
		for (int i=0;i<1000000;i++) {
			miseT += mise;
			if (Math.random() < 0.35) {
				mise += 1;
				if (mise > miseMax) {
					miseMax = mise;
				}
			}
			else {
				gain += 1.5 * mise;
				mise = 1;	
			}
		}
		System.out.println("Mise Totale : "+miseT);
		System.out.println("Gain Total : "+gain);
		System.out.println();
		System.out.println("Bénéfice net : "+ (gain-miseT));
		System.out.println("ROI : "+(100.*(gain-miseT)/miseT));
		System.out.println("Mise Max : "+ miseMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Misc.tourne();
	}

}
