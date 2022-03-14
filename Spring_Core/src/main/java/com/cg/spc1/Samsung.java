package com.cg.spc1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobileprocessor
{
	@Autowired
	@Qualifier("mediatek")
	Mobileprocessor cpu;

	public Mobileprocessor getCpu()
	{
		return cpu;
	}

	public void setCpu(Mobileprocessor cpu) 
	{
		this.cpu = cpu;
	}
	public void config()
	{
		System.out.println("Octa core,4gb,12mp camera");
		cpu.process();
	}

	public void process() {
		// TODO Auto-generated method stub
		
	}
 
}
