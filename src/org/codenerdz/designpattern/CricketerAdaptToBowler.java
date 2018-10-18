package org.codenerdz.designpattern;

import org.codenerdz.designpattern.Ball;
import org.codenerdz.designpattern.Cricketer;

public class CricketerAdaptToBowler implements Ball{

	Cricketer cricketer = new Cricketer();
	@Override
	public void inSwingBall() {		
		
	}

	@Override
	public void outSwingBall() {		
		
	}

	@Override
	public void shining() {		
		
	}

	@Override
	public void googly() {		
		cricketer.bawlingWrongUn();
	}

	@Override
	public void legBreak() {		
		
	}

	@Override
	public void offSpin() {		
		
	}

}
