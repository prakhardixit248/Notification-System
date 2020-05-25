package com.nagarro.impl;

import java.util.List;

import com.nagarro.service.Communication;
import com.nagarro.service.Notification;

public class Event implements Notification 
{
	boolean sms=true , noti , eportal=true;
	
	@Override
	public void notifyUsers(CommDeco comm) 
	{
		comm.eportal=this.eportal;
		comm.sms=this.sms;
		comm.noti=this.noti;
		comm.connect();
	}

}
