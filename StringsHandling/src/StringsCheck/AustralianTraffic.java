package StringsCheck;



public class AustralianTraffic implements CentralTraffic,continentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CentralTraffic a = new AustralianTraffic();
		AustralianTraffic c = new AustralianTraffic();
		c.walkonSymbol();
		CentralTraffic w = new AustralianTraffic();
		
		
		continentalTraffic cunt = new AustralianTraffic();
		cunt.TrainSymbol();
		
		a.redStop();
		a.flashingYellow();
		a.greenGo();
		w.waitingAmber();
		
		
		
	}
    public void walkonSymbol() {
    	System.out.println("walking");
    	
    }
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop implementation");
		}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashing Yellow implementation");
	}
	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void waitingAmber() {
		// TODO Auto-generated method stub
		System.out.println("Waiting Amber will never diet");
		
	}

	
}
