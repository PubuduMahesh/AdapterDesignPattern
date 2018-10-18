package org.codenerdz.designpattern;

public class Main {

	public static void main(String[] args) {
		OffBreakBowler offBreakBowler = new OffBreakBowler();
		offBreakBowler.setBall(new CricketerAdaptToBowler());
		offBreakBowler.bawlingGoogly();
	}

}
