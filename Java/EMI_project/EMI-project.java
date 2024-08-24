import java.util.*;

class emi{
	String name;
	double emi;
	Scanner sc = new Scanner(System.in);
	void intro(){
		System.out.println("HELLO, \n Welcome to EMI Platform. Where Your Dreams Come True.");
		System.out.println();
	}
	
	int info(){
		System.out.println("Enter Your Anual INCOME : ");
		int income = sc.nextInt();
		
		System.out.println("Enter Your Saving amount from income : ");
		int savings = sc.nextInt();
		
		if(income == 0 || savings == 0){
			return 0;
		}
		else{
			return 1;
		}	
	}
	
	void typesOfEMI(String name){
		System.out.println("Hey, " + name +". We have many types of catagory in EMI");
		System.out.println();
		System.out.println("[1]. EMI for Home");
		System.out.println("[2]. EMI for Gold");
		System.out.println("[3]. EMI for Vehicle");
		System.out.println("[4]. EMI for Business");
		System.out.println("[5]. EMI for Personal");
		System.out.println("[6]. Exit");
	}
	
	void emiForHome(int amntforEmi){
		System.out.println("Here, We have many types of banks.");
		System.out.println();
		System.out.println("[1]. HDFC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihhdfc  = 8.5;
		System.out.println(" -> Intrest Rate : " + roihhdfc);
		
		
		System.out.println();
		System.out.println("[2]. ICIC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihicic = 8.65;
		System.out.println(" -> Intrest Rate : " + roihicic);
		
		
		System.out.println();
		System.out.println("[3]. AXIS bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihaxis = 8.60;
		System.out.println(" -> Intrest Rate : " + roihaxis);
		
		
		System.out.println();
		System.out.println("[4]. SBI bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihsbi = 7.8;
		System.out.println(" -> Intrest Rate : " + roihsbi);
		
		
		System.out.println();
		System.out.println("[5]. BARODA bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihbaroda = 8.5;
		System.out.println(" -> Intrest Rate : " + roihbaroda);
		
		
		System.out.println();
		System.out.println("[6]. KOTAK bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roihkotak = 8.65;
		System.out.println(" -> Intrest Rate : " + roihkotak);
		
		
		System.out.print("What Rate of Interest do you want go with ?");
		int choose = sc.nextInt();
		
		switch(choose){
			case 1 : {
				System.out.println();
				System.out.println("HDFC Bank : ");
				System.out.println("Rate of interest : " + roihhdfc);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println();
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println();
						System.out.println("In the Rate of Intrest " + roihhdfc + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihhdfc/12)/100) * Math.pow((1 + (roihhdfc/12)/100), 84)) / (Math.pow((1 + (roihhdfc/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihhdfc + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihhdfc/12)/100) * Math.pow((1 + (roihhdfc/12)/100), 120)) / (Math.pow((1 + (roihhdfc/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihhdfc + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roihhdfc/12)/100) * Math.pow((1 + (roihhdfc/12)/100), 240)) / (Math.pow((1 + (roihhdfc/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihhdfc);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;
					}
				}
			break;	
			}
			
			case 2 : {
				System.out.println();
				System.out.println("ICIC Bank : ");
				System.out.println("Rate of interest : " + roihicic);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads; 

				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roihicic + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihicic/12)/100) * Math.pow((1 + (roihicic/12)/100), 84)) / (Math.pow((1 + (roihicic/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihicic + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihicic/12)/100) * Math.pow((1 + (roihicic/12)/100), 120)) / (Math.pow((1 + (roihhdfc/12)/100),84) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihicic + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roihicic/12)/100) * Math.pow((1 + (roihicic/12)/100), 240)) / (Math.pow((1 + (roihicic/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihicic);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;
					}
				}
			break;
			}
			
			case 3 :{
				System.out.println();
				System.out.println("AXIS Bank : ");
				System.out.println("Rate of interest : " + roihaxis);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roihaxis + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihaxis/12)/100) * Math.pow((1 + (roihaxis/12)/100), 84)) / (Math.pow((1 + (roihaxis/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihaxis + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihaxis/12)/100) * Math.pow((1 + (roihaxis/12)/100), 84)) / (Math.pow((1 + (roihaxis/12)/100),84) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihaxis + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						ads = (amntforEmi * ((roihaxis/12)/100) * Math.pow((1 + (roihaxis/12)/100), 84)) / (Math.pow((1 + (roihaxis/12)/100),84) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihaxis);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;	
			}
			
			case 4 : {
				System.out.println();
				System.out.println("SBI Bank : ");
				System.out.println("Rate of interest : " + roihsbi);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();

				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roihsbi + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihsbi/12)/100) * Math.pow((1 + (roihsbi/12)/100), 84)) / (Math.pow((1 + (roihsbi/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihsbi + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihsbi/12)/100) * Math.pow((1 + (roihsbi/12)/100), 120)) / (Math.pow((1 + (roihsbi/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihsbi + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roihsbi/12)/100) * Math.pow((1 + (roihsbi/12)/100), 240)) / (Math.pow((1 + (roihsbi/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihsbi);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break ;
			}
			
			case 5 : {
				System.out.println();
				System.out.println("BARODA Bank : ");
				System.out.println("Rate of interest : " + roihbaroda);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads; ;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roihbaroda + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihbaroda/12)/100) * Math.pow((1 + (roihbaroda/12)/100), 84)) / (Math.pow((1 + (roihbaroda/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihbaroda + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihbaroda/12)/100) * Math.pow((1 + (roihbaroda/12)/100), 120)) / (Math.pow((1 + (roihbaroda/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihbaroda + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roihbaroda/12)/100) * Math.pow((1 + (roihbaroda/12)/100), 240)) / (Math.pow((1 + (roihbaroda/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihbaroda);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;
			}
			
			case 6 : {
				System.out.println();
				System.out.println("KOTAK Bank : ");
				System.out.println("Rate of interest : " + roihkotak);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				
				double ads;;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roihkotak + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roihkotak/12)/100) * Math.pow((1 + (roihkotak/12)/100), 84)) / (Math.pow((1 + (roihkotak/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roihkotak + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roihkotak/12)/100) * Math.pow((1 + (roihkotak/12)/100), 120)) / (Math.pow((1 + (roihkotak/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roihkotak + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roihkotak/12)/100) * Math.pow((1 + (roihkotak/12)/100),240)) / (Math.pow((1 + (roihkotak/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roihkotak);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;	
			}
		}
	}
	
	void emiForJwellery(int amntforEmi){
		System.out.println("Here, We have many types of banks.");
		System.out.println();
		System.out.println("[1]. HDFC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijhdfc = 13;
		System.out.println(" -> Intrest Rate : " + roijhdfc);
		
		
		System.out.println();
		System.out.println("[2]. ICIC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijicic = 13.40;
		System.out.println(" -> Intrest Rate : " + roijicic);
		
		
		System.out.println();
		System.out.println("[3]. AXIS bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijaxis = 12.80;
		System.out.println(" -> Intrest Rate : " + roijaxis);
		
		
		System.out.println();
		System.out.println("[4]. SBI bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijsbi = 12.50;
		System.out.println(" -> Intrest Rate : " + roijsbi);
		
		
		System.out.println();
		System.out.println("[5]. BARODA bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijbaroda = 12.45;
		System.out.println(" -> Intrest Rate : " + roijbaroda);
		
		
		System.out.println();
		System.out.println("[6]. KOTAK bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roijkotak = 13.85;
		System.out.println(" -> Intrest Rate : " + roijkotak);
		
		System.out.print("What Rate of Interest do you want go with ?");
		int choose = sc.nextInt();
		
		switch(choose){
			case 1 : {
				System.out.println();
				System.out.println("HDFC Bank : ");
				System.out.println("Rate of interest : " + roijhdfc);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads; ;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijhdfc + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roijhdfc/12)/100) * Math.pow((1 + (roijhdfc/12)/100), 84)) / (Math.pow((1 + (roijhdfc/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijhdfc + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roijhdfc/12)/100) * Math.pow((1 + (roijhdfc/12)/100), 120)) / (Math.pow((1 + (roijhdfc/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijhdfc + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roijhdfc/12)/100) * Math.pow((1 + (roijhdfc/12)/100), 240)) / (Math.pow((1 + (roijhdfc/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijhdfc);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 2 : {
				System.out.println();
				System.out.println("ICIC Bank : ");
				System.out.println("Rate of interest : " + roijicic);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads; ;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijicic + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roijicic/12)/100) * Math.pow((1 + (roijicic/12)/100), 84)) / (Math.pow((1 + (roijicic/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijicic + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roijicic/12)/100) * Math.pow((1 + (roijicic/12)/100), 120)) / (Math.pow((1 + (roijicic/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijicic + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roijicic/12)/100) * Math.pow((1 + (roijicic/12)/100), 240)) / (Math.pow((1 + (roijicic/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijicic);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;
			}
			
			case 3 :{
				System.out.println();
				System.out.println("AXIS Bank : ");
				System.out.println("Rate of interest : " + roijaxis);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads;; 

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijaxis + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roijaxis/12)/100) * Math.pow((1 + (roijaxis/12)/100), 84)) / (Math.pow((1 + (roijaxis/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijaxis + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roijaxis/12)/100) * Math.pow((1 + (roijaxis/12)/100), 120)) / (Math.pow((1 + (roijaxis/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijaxis + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roijaxis/12)/100) * Math.pow((1 + (roijaxis/12)/100), 240)) / (Math.pow((1 + (roijaxis/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijaxis);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs."); 
							
						break;	
					}
				}
			break;	
			}
			
			case 4 : {
				System.out.println();
				System.out.println("SBI Bank : ");
				System.out.println("Rate of interest : " + roijsbi);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
								double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijsbi + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roijsbi/12)/100) * Math.pow((1 + (roijsbi/12)/100), 84)) / (Math.pow((1 + (roijsbi/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijsbi + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roijsbi/12)/100) * Math.pow((1 + (roijsbi/12)/100), 120)) / (Math.pow((1 + (roijsbi/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijsbi + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roijsbi/12)/100) * Math.pow((1 + (roijsbi/12)/100), 240)) / (Math.pow((1 + (roijsbi/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijsbi);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break ;
			}
			
			case 5 : {
				System.out.println();
				System.out.println("BARODA Bank : ");
				System.out.println("Rate of interest : " + roijbaroda);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
								double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijbaroda + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roijbaroda/12)/100) * Math.pow((1 + (roijbaroda/12)/100), 84)) / (Math.pow((1 + (roijbaroda/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");				
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijbaroda + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roijbaroda/12)/100) * Math.pow((1 + (roijbaroda/12)/100), 120)) / (Math.pow((1 + (roijbaroda/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijbaroda + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roijbaroda/12)/100) * Math.pow((1 + (roijbaroda/12)/100), 240)) / (Math.pow((1 + (roijbaroda/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						 System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijbaroda);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;
			}
			
			case 6 : {
				System.out.println();
				System.out.println("KOTAK Bank : ");
				System.out.println("Rate of interest : " + roijkotak);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
								double ads;;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roijkotak + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * (( roijkotak/12)/100) * Math.pow((1 + ( roijkotak/12)/100), 84)) / (Math.pow((1 + ( roijkotak/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roijkotak + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * (( roijkotak/12)/100) * Math.pow((1 + ( roijkotak/12)/100), 120)) / (Math.pow((1 + ( roijkotak/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roijkotak + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * (( roijkotak/12)/100) * Math.pow((1 + ( roijkotak/12)/100), 240)) / (Math.pow((1 + ( roijkotak/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roijkotak);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
		}	
	}
	
	void emiForVehicle(int amntforEmi){
		System.out.println("Here, We have many types of banks.");
		System.out.println();
		System.out.println("[1]. HDFC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivhdfc = 9.05;
		System.out.println(" -> Intrest Rate : " + roivhdfc);
		
		
		System.out.println();
		System.out.println("[2]. ICIC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivicic = 8.85;
		System.out.println(" -> Intrest Rate : " + roivicic);
		
		
		System.out.println();
		System.out.println("[3]. AXIS bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivaxis = 9.75;
		System.out.println(" -> Intrest Rate : " + roivaxis);
		
		
		System.out.println();
		System.out.println("[4]. SBI bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivsbi = 8.65;
		System.out.println(" -> Intrest Rate : " + roivsbi);
		
		
		System.out.println();
		System.out.println("[5]. BARODA bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivbaroda = 9.25;
		System.out.println(" -> Intrest Rate : " + roivbaroda);
		
		
		System.out.println();
		System.out.println("[6]. KOTAK bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roivkotak = 9.55;
		System.out.println(" -> Intrest Rate : " + roivkotak);
		
		System.out.print("What Rate of Interest do you want go with ?");
		int choose = sc.nextInt();
		
		switch(choose){
			case 1 : {
				System.out.println();
				System.out.println("HDFC Bank : ");
				System.out.println("Rate of interest : " + roivhdfc);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
								double ads;;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivhdfc + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivhdfc/12)/100) * Math.pow((1 + (roivhdfc/12)/100), 84)) / (Math.pow((1 + (roivhdfc/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivhdfc + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivhdfc/12)/100) * Math.pow((1 + (roivhdfc/12)/100), 120)) / (Math.pow((1 + (roivhdfc/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivhdfc + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivhdfc/12)/100) * Math.pow((1 + (roivhdfc/12)/100), 240)) / (Math.pow((1 + (roivhdfc/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roivhdfc);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 2 : {
				System.out.println();
				System.out.println("ICIC Bank : ");
				System.out.println("Rate of interest : " + roivicic);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
								double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivicic + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivicic/12)/100) * Math.pow((1 + (roivicic/12)/100), 84)) / (Math.pow((1 + (roivicic/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivicic + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivicic/12)/100) * Math.pow((1 + (roivicic/12)/100), 120)) / (Math.pow((1 + (roivicic/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivicic + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivicic/12)/100) * Math.pow((1 + (roivicic/12)/100), 240)) / (Math.pow((1 + (roivicic/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roivicic);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;
			}
			
			case 3 :{
				System.out.println();
				System.out.println("AXIS Bank : ");
				System.out.println("Rate of interest : " + roivaxis);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt();
				double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivaxis + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivaxis/12)/100) * Math.pow((1 + (roivaxis/12)/100), 84)) / (Math.pow((1 + (roivaxis/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivaxis + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivaxis/12)/100) * Math.pow((1 + (roivaxis/12)/100), 120)) / (Math.pow((1 + (roivaxis/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivaxis + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivaxis/12)/100) * Math.pow((1 + (roivaxis/12)/100), 240)) / (Math.pow((1 + (roivaxis/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
					 	System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roivaxis);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 4 : {
				System.out.println();
				System.out.println("SBI Bank : ");
				System.out.println("Rate of interest : " + roivsbi);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivsbi + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivsbi/12)/100) * Math.pow((1 + (roivsbi/12)/100), 84)) / (Math.pow((1 + (roivsbi/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivsbi + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivsbi/12)/100) * Math.pow((1 + (roivsbi/12)/100), 120)) / (Math.pow((1 + (roivsbi/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivsbi + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivsbi/12)/100) * Math.pow((1 + (roivsbi/12)/100), 240)) / (Math.pow((1 + (roivsbi/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + (amntforEmi * roivsbi);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break ;
			}
			
			case 5 : {
				System.out.println();
				System.out.println("BARODA Bank : ");
				System.out.println("Rate of interest : " + roivbaroda);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
								double ads;

				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivbaroda + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivbaroda/12)/100) * Math.pow((1 + (roivbaroda/12)/100), 84)) / (Math.pow((1 + (roivbaroda/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivbaroda + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivbaroda/12)/100) * Math.pow((1 + (roivbaroda/12)/100), 120)) / (Math.pow((1 + (roivbaroda/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivbaroda + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivbaroda/12)/100) * Math.pow((1 + (roivbaroda/12)/100), 240)) / (Math.pow((1 + (roivbaroda/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roivbaroda)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							 
						break;	
					}
				}
			break;
			}
			
			case 6 : {
				System.out.println();
				System.out.println("KOTAK Bank : ");
				System.out.println("Rate of interest : " + roivkotak);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roivkotak + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roivkotak/12)/100) * Math.pow((1 + (roivkotak/12)/100), 84)) / (Math.pow((1 + (roivkotak/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roivkotak + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roivkotak/12)/100) * Math.pow((1 + (roivkotak/12)/100), 120)) / (Math.pow((1 + (roivkotak/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roivkotak + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roivkotak/12)/100) * Math.pow((1 + (roivkotak/12)/100), 240)) / (Math.pow((1 + (roivkotak/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + emi + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much payment can you afford for monthly installment ?");
						double crises = sc.nextDouble();
						ads = amntforEmi + ((amntforEmi * roivkotak)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
		}
	}
	
	void emiForBusiness(int amntforEmi){
		System.out.println("Here, We have many types of banks.");
		System.out.println();
		System.out.println("[1]. HDFC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibhdfc = 14.25;
		System.out.println(" -> Intrest Rate : " + roibhdfc);
		
		
		System.out.println();
		System.out.println("[2]. ICIC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibicic = 14.65;
		System.out.println(" -> Intrest Rate : " + roibicic);
	
		
		System.out.println();
		System.out.println("[3]. AXIS bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibaxis = 14.80;
		System.out.println(" -> Intrest Rate : " + roibaxis);
		
		
		System.out.println();
		System.out.println("[4]. SBI bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibsbi = 13.55;
		System.out.println(" -> Intrest Rate : " + roibsbi);
		
		
		System.out.println();
		System.out.println("[5]. BARODA bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibbaroda = 13.45;
		System.out.println(" -> Intrest Rate : " + roibbaroda);
		
		
		System.out.println();
		System.out.println("[6]. KOTAK bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roibkotak = 14.95;
		System.out.println(" -> Intrest Rate : " + roibkotak);
		
		System.out.println("What Rate of Interest do you want go with ?");
		int choose = sc.nextInt();
		
		
		switch(choose){
			case 1 : {
				System.out.println();
				System.out.println("HDFC Bank : ");
				System.out.println("Rate of interest : " + roibhdfc);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibhdfc + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibhdfc/12)/100) * Math.pow((1 + (roibhdfc/12)/100), 84)) / (Math.pow((1 + (roibhdfc/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibhdfc + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibhdfc/12)/100) * Math.pow((1 + (roibhdfc/12)/100), 120)) / (Math.pow((1 + (roibhdfc/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibhdfc + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibhdfc/12)/100) * Math.pow((1 + (roibhdfc/12)/100), 240)) / (Math.pow((1 + (roibhdfc/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibhdfc)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 2 : {
				System.out.println();
				System.out.println("ICIC Bank : ");
				System.out.println("Rate of interest : " + roibicic);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibicic + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibicic/12)/100) * Math.pow((1 + (roibicic/12)/100), 84)) / (Math.pow((1 + (roibicic/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibicic + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibicic/12)/100) * Math.pow((1 + (roibicic/12)/100), 120)) / (Math.pow((1 + (roibicic/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibicic + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibicic/12)/100) * Math.pow((1 + (roibicic/12)/100), 240)) / (Math.pow((1 + (roibicic/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
					 	System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibicic)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;
			}
			
			case 3 :{
				System.out.println();
				System.out.println("AXIS Bank : ");
				System.out.println("Rate of interest : " + roibaxis);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibaxis + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibaxis/12)/100) * Math.pow((1 + (roibaxis/12)/100), 84)) / (Math.pow((1 + (roibaxis/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibaxis + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibaxis/12)/100) * Math.pow((1 + (roibaxis/12)/100), 120)) / (Math.pow((1 + (roibaxis/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibaxis + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibaxis/12)/100) * Math.pow((1 + (roibaxis/12)/100), 120)) / (Math.pow((1 + (roibaxis/12)/100),120) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibaxis)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 4 : {
				System.out.println();
				System.out.println("SBI Bank : ");
				System.out.println("Rate of interest : " + roibsbi);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibsbi + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibsbi/12)/100) * Math.pow((1 + (roibsbi/12)/100), 84)) / (Math.pow((1 + (roibsbi/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibsbi + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibsbi/12)/100) * Math.pow((1 + (roibsbi/12)/100), 120)) / (Math.pow((1 + (roibsbi/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibsbi + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibsbi/12)/100) * Math.pow((1 + (roibsbi/12)/100), 240)) / (Math.pow((1 + (roibsbi/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibsbi)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break ;
			}
			
			case 5 : {
				System.out.println();
				System.out.println("BARODA Bank : ");
				System.out.println("Rate of interest : " + roibbaroda);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibbaroda + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibbaroda/12)/100) * Math.pow((1 + (roibbaroda/12)/100), 84)) / (Math.pow((1 + (roibbaroda/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibbaroda + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibbaroda/12)/100) * Math.pow((1 + (roibbaroda/12)/100), 120)) / (Math.pow((1 + (roibbaroda/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibbaroda + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibbaroda/12)/100) * Math.pow((1 + (roibbaroda/12)/100), 240)) / (Math.pow((1 + (roibbaroda/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibbaroda)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;
			}
			
			case 6 : {
				System.out.println();
				System.out.println("KOTAK Bank : ");
				System.out.println("Rate of interest : " + roibkotak);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roibkotak + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roibkotak/12)/100) * Math.pow((1 + (roibkotak/12)/100), 84)) / (Math.pow((1 + (roibkotak/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roibkotak + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roibkotak/12)/100) * Math.pow((1 + (roibkotak/12)/100), 120)) / (Math.pow((1 + (roibkotak/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roibkotak + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roibkotak/12)/100) * Math.pow((1 + (roibkotak/12)/100), 240)) / (Math.pow((1 + (roibkotak/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						 System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roibkotak)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
		}
	}
	
	void emiForPersonal(int amntforEmi){
		System.out.println("Here, We have many types of banks.");
		System.out.println();
		System.out.println("[1]. HDFC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roiphdfc = 15.05;
		System.out.println(" -> Intrest Rate : " + roiphdfc);
		
		
		System.out.println();
		System.out.println("[2]. ICIC bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roipicic = 15.20;
		System.out.println(" -> Intrest Rate : " + roipicic);
		
		
		System.out.println();
		System.out.println("[3]. AXIS bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roipaxis = 15.25;
		System.out.println(" -> Intrest Rate : " + roipaxis);
		
		
		System.out.println();
		System.out.println("[4]. SBI bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roipsbi = 14.90;
		System.out.println(" -> Intrest Rate : " + roipsbi);
		
		
		System.out.println();
		System.out.println("[5]. BARODA bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roipbaroda = 14.85;
		System.out.println(" -> Intrest Rate : " + roipbaroda);
		
		
		System.out.println();
		System.out.println("[6]. Kotak bank ");
		System.out.println(" -> Your Requirement :" + amntforEmi);
		double roipkotak = 15.45;
		System.out.println(" -> Intrest Rate : " + roipkotak);
		
		System.out.print("What Rate of Interest do you want go with ?");
		int choose = sc.nextInt();
		
		switch(choose){
			case 1 : {
				System.out.println();
				System.out.println("HDFC Bank : ");
				System.out.println("Rate of interest : " + roiphdfc);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roiphdfc + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roiphdfc/12)/100) * Math.pow((1 + (roiphdfc/12)/100), 84)) / (Math.pow((1 + (roiphdfc/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roiphdfc + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roiphdfc/12)/100) * Math.pow((1 + (roiphdfc/12)/100), 120)) / (Math.pow((1 + (roiphdfc/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roiphdfc + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roiphdfc/12)/100) * Math.pow((1 + (roiphdfc/12)/100), 240)) / (Math.pow((1 + (roiphdfc/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roiphdfc)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 2 : {
				System.out.println();
				System.out.println("ICIC Bank : ");
				System.out.println("Rate of interest : " + roipicic);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roipicic + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roipicic/12)/100) * Math.pow((1 + (roipicic/12)/100), 84)) / (Math.pow((1 + (roipicic/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roipicic + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roipicic/12)/100) * Math.pow((1 + (roipicic/12)/100), 120)) / (Math.pow((1 + (roipicic/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roipicic + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roipicic/12)/100) * Math.pow((1 + (roipicic/12)/100), 240)) / (Math.pow((1 + (roipicic/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roipicic)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;
			}
			
			case 3 :{
				System.out.println();
				System.out.println("AXIS Bank : ");
				System.out.println("Rate of interest : " + roipaxis);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roipaxis + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roipaxis/12)/100) * Math.pow((1 + (roipaxis/12)/100), 84)) / (Math.pow((1 + (roipaxis/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roipaxis + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roipaxis/12)/100) * Math.pow((1 + (roipaxis/12)/100), 120)) / (Math.pow((1 + (roipaxis/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roipaxis + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roipaxis/12)/100) * Math.pow((1 + (roipaxis/12)/100), 240)) / (Math.pow((1 + (roipaxis/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roipaxis)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
			
			case 4 : {
				System.out.println();
				System.out.println("SBI Bank : ");
				System.out.println("Rate of interest : " + roipsbi);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roipsbi + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roipsbi/12)/100) * Math.pow((1 + (roipsbi/12)/100), 84)) / (Math.pow((1 + (roipsbi/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roipsbi + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roipsbi/12)/100) * Math.pow((1 + (roipsbi/12)/100), 120)) / (Math.pow((1 + (roipsbi/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roipsbi + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roipsbi/12)/100) * Math.pow((1 + (roipsbi/12)/100), 240)) / (Math.pow((1 + (roipsbi/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roipsbi)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break ;
			}
			
			case 5 : {
				System.out.println();
				System.out.println("BARODA Bank : ");
				System.out.println("Rate of interest : " + roipbaroda);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roipbaroda + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roipbaroda/12)/100) * Math.pow((1 + (roipbaroda/12)/100), 84)) / (Math.pow((1 + (roipbaroda/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roipbaroda + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roipbaroda/12)/100) * Math.pow((1 + (roipbaroda/12)/100), 120)) / (Math.pow((1 + (roipbaroda/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roipbaroda + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roipbaroda/12)/100) * Math.pow((1 + (roipbaroda/12)/100), 240)) / (Math.pow((1 + (roipbaroda/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roipbaroda)/100);
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;
			}
			
			case 6 : {
				System.out.println();
				System.out.println("KOTAK Bank : ");
				System.out.println("Rate of interest : " + roipkotak);
				System.out.println("[1] 7 years ");
				System.out.println("[2] 10 years ");
				System.out.println("[3] 20 years ");
				System.out.println("[4] Custmised Monthly Installment");
				
				System.out.println("Which time period would you like to select ?");
				int sel = sc.nextInt(); 
				double ads;
				
				switch(sel){
					case 1 : {
						System.out.println("In the Rate of Intrest " + roipkotak + " & 7 years of time period,\nYour total nomber of monthly payment is '84'" );
						
						ads = (amntforEmi * ((roipkotak/12)/100) * Math.pow((1 + (roipkotak/12)/100), 84)) / (Math.pow((1 + (roipkotak/12)/100),84) - 1);
						emi = ads*84;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 2 : {
						System.out.println("In the Rate of Intrest " + roipkotak + " & 10 years of time period,\nYour total nomber of monthly payment is '120'" );
						
						ads = (amntforEmi * ((roipkotak/12)/100) * Math.pow((1 + (roipkotak/12)/100), 120)) / (Math.pow((1 + (roipkotak/12)/100),120) - 1);
						emi = ads*120;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 3 : {
						System.out.println("In the Rate of Intrest " + roipkotak + " & 20 years of time period,\nYour total nomber of monthly payment is '240'" );
						
						ads = (amntforEmi * ((roipkotak/12)/100) * Math.pow((1 + (roipkotak/12)/100), 240)) / (Math.pow((1 + (roipkotak/12)/100),240) - 1);
						emi = ads*240;
						System.out.println();
						System.out.println("Your Total Payble Amount is : " + emi + " Rs. So,");
						System.out.println("Your Monthly Installment is : " + ads + " Rs.");
						break;
					}
					
					case 4 : {
						System.out.println();
						System.out.println("Please Fill up the Detail.");
						System.out.println();
						System.out.println("How much installment payment can you afford ?");
						double crises = sc.nextLong();
						ads = amntforEmi + ((amntforEmi * roipkotak)/100);
						
							double devid = ads / crises;
							double modul = ads % crises;
							if(modul == 0){								
							System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
							}
							else{
								if(modul > crises){
									devid = devid + 2;
									System.out.println("In Your affordable criteria,Your Time Period of Month is : " + (int)devid);
								}
								else{
									devid = devid + 1;
									System.out.println("In Your affordable criteria,Your period of Time is : " + (int)devid);
								}
							}
							System.out.println();
							System.out.println("Your Total Payble Amount is : " + ads + " Rs. So,");
							System.out.println("Your Monthly Installment is : " + crises + " Rs.");
							System.out.println("Your last Month Installment is : " + modul + " Rs.");
							
						break;	
					}
				}
			break;	
			}
		}	
	}
	
	void detail(String name){
		
		System.out.println();
		System.out.println("CONGRATULATION user,\nThe bank has applied your loan.");
		System.out.println();
		System.out.println("Let's fill up some details.");
		boolean haz = false;
		do{
		System.out.println("Enter Your 12 digits Adhaar Number :- ");
		long adhar = sc.nextLong();
		int cnt = 0;
		System.out.println();
			while(adhar>0){
				long xc = adhar%10;
				cnt++;
				adhar = adhar/10;
			}
			if(cnt==12){
				haz = true;
			}
			else{
				System.out.println("Enter valid Input.");
			}
		}while(haz != true);
		
		System.out.println("Enter Your PAN Number :- ");
		sc.nextLine();
		String pan = sc.nextLine();
		System.out.println();
		System.out.println("Upload Your 'Proof of Income' : ");
		System.out.println("Please Press '1' to Upload : ");
		boolean flag = false;
		
		do{	
			int up = sc.nextInt();
			if(up == 1){
				flag = true;
				System.out.println("Successfully Uploaded : ");
			}else{
				System.out.println("Please Entre valid Input : ");
			}
		}while(flag != true);
		
		System.out.println();
		System.out.println("In Which Bank do you have a bank account ?");
		System.out.println("[1]. HDFC Bank");
		System.out.println("[2]. ICICI Bank");
		System.out.println("[3]. AXIS Bank");
		System.out.println("[4]. SBI Bank");
		System.out.println("[5]. BARODA Bank");
		System.out.println("[6]. KOTAK Bank");
		System.out.println("[7]. Other");
		System.out.println();
		System.out.println("Select from Above : ");
		int chuse = sc.nextInt();
		
		if(chuse == 7){
			System.out.println("Enter Bank Name : ");
			String bank = sc.nextLine();
			System.out.println();
			System.out.println("Our Employee will Meet you in One Week.");
			System.out.println("Employee Name :- MUNNA TRIPATHI");
			System.out.println("Mobile No. :- 98765*****");
			System.out.println();
			System.out.println("THANK YOU, " + name + " for collaborate with us. :)");
			System.out.println();
			System.out.println("Please Enter Your FeedBack out of 10.");
			int feed = sc.nextInt();
			System.out.println("..........................THANK YOU....................................");
		}
		else{
			System.out.println("Employee or Manager of the Bank will meet you in One Week.");
			System.out.println("Employee Name :- TONY STARK");
			System.out.println("Mobile No. :- 98765*****");
			System.out.println();
			System.out.println("THANK YOU, " + name + " for collaborate with us. :)");
			System.out.println();
			System.out.println("Please Enter Your FeedBack out of 10.");
			int feed = sc.nextInt();
			System.out.println("..........................THANK YOU....................................");
		}
		
	}
}


class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		emi l = new emi();
		l.intro();
		
		System.out.println("..............SIGN UP................");
		
		System.out.print("Username : ");
		String name = sc.nextLine();
		
		System.out.println();
		
		System.out.println("INSTRUCTION FOR PASSWORD");
		System.out.println("1. At least one Upper case");
		System.out.println("2. At least one Lower case");
		System.out.println("3. At least one digit");
		System.out.println("4. At least 8 to 15 character");
		
		System.out.println();
		
		System.out.print("Enter Password : ");
		String pass = sc.nextLine();
		int lower_case = 0;
		int uper_case = 0;
		int digit_case = 0;
		int cnt=0;
		
		for(char j = 0 ;j<pass.length();j++){
			for(char i=65;i<=90;i++){
				
				if(pass.charAt(j) == i){
					uper_case = 1;
					break;
				}
			}
		}
			if(uper_case ==1){
				cnt++;
			}
			
		for(char j = 0 ;j<pass.length();j++){
			for(char i=97;i<=122;i++){
				
				if(pass.charAt(j) == i){
					lower_case = 1;
					break;
				}
				
			}
		}
			
			if(lower_case ==1){
				cnt++;
			}	
			
		for(char j = 0 ;j<pass.length();j++){
			for(char i=48;i<=57;i++){
				
				if(pass.charAt(j) == i){
					digit_case = 1;
					break;
				}
			}
		}
		
			if(digit_case ==1){
				cnt++;
			}
		
			if(pass.length() >= 8 && pass.length() <= 15 ){
				cnt++;
			}
			
			System.out.print("Confirm Password : ");
			String con_pass = sc.nextLine();
				
			if(pass.equals(con_pass) && cnt == 4){
				System.out.println("You have successfuly logged in ");
				int ans = l.info();	
				if(ans == 0){
					System.out.println("So Sorry,\nBecause of Your Savings are Zero(0) Rs.  Banks are not help you and pay you for EMI");
				}
				else{
					l.typesOfEMI(name);
					System.out.print("What would you like to choose from above ? ");
					int x = sc.nextInt();
					
					System.out.print("How many Rupees do you want to take for EMI ? ");
					int amntforEmi = sc.nextInt();
					
					switch(x){
						case 1 :{
							l.emiForHome(amntforEmi);
							l.detail(name);
							break;
						}
						
						case 2 :{
							l.emiForJwellery(amntforEmi);
							l.detail(name);
							break;
						}
						
						case 3 :{
							l.emiForVehicle(amntforEmi);
							l.detail(name);
							break;
						}
						
						case 4 :{
							l.emiForBusiness(amntforEmi);
							l.detail(name);
							break;
						}
						
						case 5 :{
							l.emiForPersonal(amntforEmi);
							l.detail(name);
							break;
						}
						
						default :{
							break;
						}
					}	
				}
			}else{
				System.out.println("Invalid Password");
			}
		{}	
	}
}