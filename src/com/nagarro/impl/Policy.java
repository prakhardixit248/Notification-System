package com.nagarro.impl;

import com.nagarro.service.Communication;
import com.nagarro.service.Notification;

public class Policy implements Notification 
{
	boolean sms , noti=true , eportal=true;
	
	@Override
	public void notifyUsers(CommDeco comm) 
	{
		comm.eportal=this.eportal;
		comm.sms=this.sms;
		comm.noti=this.noti;
		comm.connect();
	}


}
