package org.edu;
public class Arts extends Education {
	public void bSC() {
		System.out.println("UG - B.Sc Available Seats : 43");
		System.out.println("PG - M.Sc Available Seats : 24");
	}
	public void bEd() {
		System.out.println("UG - B.Ed Available Seats : 56");
		System.out.println("PG - M.Ed Available Seats : 39");
	}
	public void bA() {
		System.out.println("UG - BA Available Seats	  : 22");
		System.out.println("PG - MA Available Seats   : 9");
	}
	public void bBA() {
		System.out.println("UG - BBA Available Seats  : 35");
		System.out.println("PG - MBA Available Seats  : 19");
	}
	@Override
	public void ug(int seatUG) {
		System.out.println("Total Filled Seats in UG  : "+seatUG);
		super.ug(156);
	}
	@Override
	public void pg(int seatPG) {
		System.out.println("Total Filled Seats in PG  : "+seatPG);
		super.pg(89);
	}
	
	public static void main(String[] args) {
		Arts ar = new Arts();
		ar.bA();
		ar.bBA();
		ar.bEd();
		ar.bSC();
		ar.ug(144);
		ar.pg(115);
	}
}
