package com.nagarro.impl;

import com.nagarro.service.Communication;

public class CommDeco implements Communication
{
	
	public void setSms(boolean sms) {
		this.sms = sms;
	}
	public void setNoti(boolean noti) {
		this.noti = noti;
	}
	public void setEportal(boolean eportal) {
		this.eportal = eportal;
	}
	boolean sms , noti , eportal;
	@Override
	public void connect() 
	{
		
		if (sms)
		{
			System.out.println("Notified Via SMS");
		}
		
		if (noti)
		{
			System.out.println("Notified Via Notification");
		}
		
		if (eportal)
		{
			System.out.println("Notified Via Nagarro Employee Portal");
		}
	}

}
