package com.nagarro.controller;

import java.util.Scanner;

import com.nagarro.factory.NotificationFactory;
import com.nagarro.impl.CommDeco;
import com.nagarro.service.Notification;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Type of Notification");
		String str=in.next();
		Notification notif=new NotificationFactory().getNotification(str);
		CommDeco comm =new CommDeco();
		notif.notifyUsers(comm);
	}
}
