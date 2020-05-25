package com.nagarro.factory;

import com.nagarro.impl.Event;
import com.nagarro.impl.Holiday;
import com.nagarro.impl.News;
import com.nagarro.impl.Policy;
import com.nagarro.impl.Urgent;
import com.nagarro.service.Notification;

public class NotificationFactory 
{
	Notification notif;
	
	public Notification getNotification(String str)
	{
		if(str.equalsIgnoreCase("event")||str.equalsIgnoreCase("celebration"))
		{
			notif=new Event();
			
			return notif ;
		}
		else if(str.equalsIgnoreCase("urgent"))
		{
			notif=new Urgent();
			
			return notif ;
		}
		else if(str.equalsIgnoreCase("holiday"))
		{
			notif=new Holiday();
			
			return notif ;
			
		}
		else if(str.equalsIgnoreCase("news"))
		{
			notif=new News();
			
			return notif ;
			
		}
		else if(str.equalsIgnoreCase("policy"))
		{
			notif=new Policy();
			
			return notif ;
			
		}
		return null;
	}
}
