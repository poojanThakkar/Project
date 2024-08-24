import java.util.*;
class Javap{
	Scanner sc=new Scanner(System.in);
	double bill;
	double GST;
	
		void intro(){
			System.out.println();
			System.out.println("W     W    EEEEEEE   L        CCCCC    OOOO   M     M   EEEEEEE");
			System.out.println("W     W    E         L       C        O    O  MM   MM   E      ");
			System.out.println("W  W  W    EEEEE     L      C         O    O  M M M M   EEEEE  ");
			System.out.println("W  W  W    E         L       C        O    O  M  M  M   E      ");
			System.out.println("W  W  W    EEEEEEE   LLLLLL   CCCCC    OOOO   M     M   EEEEEEE");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			System.out.println();
			System.out.println("(*)-------WELCOME TO ONLINE SHOPPING-------(*)");
			System.out.println();
			System.out.println("----------------SIGN UP----------------");
			
		}
		
		void cate(){
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("          .Select the category from below.");
			System.out.println("");
			System.out.println();
			System.out.println("[1].Food");
			System.out.println("[2].Clothes");
			System.out.println("[3].Cosmetics");
			System.out.println("[4].Foot Wear");
			System.out.println("[5].Accessories");
			System.out.println("[6].Exit");
			System.out.println();
		}
		void food(){
			System.out.println("...............FOOD...............");
			System.out.println();
			System.out.println();
			System.out.println("[1].Snacks and beverages");
			System.out.println("[2].Instance food");
			System.out.println("[3].Bakery");
			System.out.println();
			System.out.println("Select one from the above category ");
			System.out.println();
		}
		void food1(){
			System.out.println("...............SNACKS AND BEVERAGES ...............");
			System.out.println();
			System.out.println("[1].Cookies");
			System.out.println("[2].Waffers");
			System.out.println("[3].Soft Drinks");
			System.out.println("[4].Chocolates");
			System.out.println("[5].Popcorn");
		}
		
		void food10(){
			System.out.println();
			System.out.println("Select from the above category.");
			int q=sc.nextInt();
			
			switch(q){
				case 1 : {
					System.out.println("............... COOKIES...............");
					System.out.println();
					System.out.println("(1).Bour-bon-40/-");
					int bbon = 40;
					System.out.println("(2).Hide and seek-35/-");
					int hns = 35;
					System.out.println("(3).Meri Gold-45/-");
					int gold = 45;
					System.out.println("(4).Jim-jam-40/-");
					int jam = 40;
					System.out.println("(5).Milano-60/-");
					int milano = 60;
					System.out.println();
					
					System.out.println("What would you like to take ?");
					int wantfromCookies = sc.nextInt();
					
					switch(wantfromCookies){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntbbon = sc.nextInt();
							bill = bill + (bbon*cntbbon);
							break;
						}
						
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cnthns = sc.nextInt();
							bill = bill + (hns*cnthns);
							break;
						}
						
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntgold = sc.nextInt();
							bill = bill + (gold*cntgold);
							break;
						}
						
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntjam = sc.nextInt();
							bill = bill + (jam*cntjam);
							break;
						}
						
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmilano = sc.nextInt();
							bill = bill + (milano*cntmilano);
							break;
						}
						
					}
					break;
				}
				
				case 2:{
					System.out.println();
					System.out.println("............... WAFFERS...............");
					System.out.println();
						
					System.out.println("(1).Balaji masala wafer-20/-");
					int maW=20;
					System.out.println("(2).Balaji salted wafer-20/-");
					int salW=20;
					System.out.println("(3).Balaji tomato twist wafer-20/-");
					int tomW=20;
					System.out.println("(4).Kurkure Solid masti-20/-");
					int kurS=20;
					System.out.println("(5).Chataka pataka-20/-");
					int chata=20;
					System.out.println("(6).Pringles Desi masala-100/-");
					int priM=100;
					System.out.println("(7).Pringles Sour cream & onion-110/-");
					int priO=110;
						
					System.out.println("What would you like to take ?");
					int wantfromWafers = sc.nextInt();
					
					switch(wantfromWafers){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmaW = sc.nextInt();
							bill = bill + (maW*cntmaW);
							break;
						}
						
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsalW = sc.nextInt();
							bill = bill + (salW*cntsalW);
							break;
						}
						
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cnttomW = sc.nextInt();
							bill = bill + (tomW*cnttomW);
							break;
						}
						
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntkurS = sc.nextInt();
							bill = bill + (kurS*cntkurS);
							break;
						}
						
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntchata = sc.nextInt();
							bill = bill + (chata*cntchata);
							break;
						}
						
						case 6 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpriM = sc.nextInt();
							bill = bill + (priM*cntpriM);
							break;
						}
						
						case 7 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpriO = sc.nextInt();
							bill = bill + (priO*cntpriO);
							break;
						}
					}
					break;	
				
				}
				
				case 3:{
					System.out.println();
					System.out.println("............... SOFT DRINKS...............");
					System.out.println();
					
					System.out.println("(1).Thumps up : 80/-");
					int thum=80;
					System.out.println("(2).Pepsi : 70/-");
					int pep=70;
					System.out.println("(3).Coka cola : 80/-");
					int coke=80;
					System.out.println("(4).Fanta : 60/-");
					int fanta=60;
					System.out.println("(5).Maza : 50/-");
					int maza=50;
					System.out.println("(6).Jeera-masala : 20/-");
					int jeera=20;
					System.out.println("(7).Sting : 20/-");
					int sting=20;
					
					System.out.println("What would you like to take ?");
					int wantfromDrinks = sc.nextInt();
					
					switch(wantfromDrinks){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntthum = sc.nextInt();
							bill = bill + (thum*cntthum);
							break;
						}
						
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpep = sc.nextInt();
							bill = bill + (pep*cntpep);
							break;
						}
						
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntcoke = sc.nextInt();
							bill = bill + (coke*cntcoke);
							break;
						}
						
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntfanta = sc.nextInt();
							bill = bill + (fanta*cntfanta);
							break;
						}
						
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmaza = sc.nextInt();
							bill = bill + (maza*cntmaza);
							break;
						}
						
						case 6 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntjeera = sc.nextInt();
							bill = bill + (jeera*cntjeera);
							break;
						}
						
						case 7 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsting = sc.nextInt();
							bill = bill + (sting*cntsting);
							break;
						}
					}
					break;
				}
				
				case 4:{
					System.out.println();
					System.out.println("............... CHOCOLATES...............");
					System.out.println();
					
					System.out.println("(1).Amul Dark chocolates-100/-");
					int dark=100;
					System.out.println("(2).Dairy milk-10/-");
					int milk=10;
					System.out.println("(3).Kit Kat-40/-");
					int kitkat=40;
					System.out.println("(4).Gems-10/-");
					int gems=10;
					System.out.println("(5).Perk-10/-");
					int perk=10;
					System.out.println("(6).Munch-10/-");
					int munch=10;
					System.out.println("(7).5-Star-20/-");
					int star=20;
					
					System.out.println("What would you like to take ?");
					int wantfromChocos = sc.nextInt();
					
					switch(wantfromChocos){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntdark = sc.nextInt();
							bill = bill + (dark*cntdark);
							break;
						}
						
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmilk = sc.nextInt();
							bill = bill + (milk*cntmilk);
							break;
						}
						
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntkitkat = sc.nextInt();
							bill = bill + (kitkat*cntkitkat);
							break;
						}
						
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntgems = sc.nextInt();
							bill = bill + (gems*cntgems);
							break;
						}
						
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntperk = sc.nextInt();
							bill = bill + (perk*cntperk);
							break;
						}
						
						case 6 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmunch = sc.nextInt();
							bill = bill + (munch*cntmunch);
							break;
						}
						
						case 7 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntstar = sc.nextInt();
							bill = bill + (star*cntstar);
							break;
						}
					}
					break;
				}
				
				case 5:{
					System.out.println();
					System.out.println("...............POPCORN...............");
					System.out.println();
					System.out.println("(1).Salted popcorn : 70/-");
					int salted = 70;
					System.out.println("(2).Butter Popcorn : 90/-");
					int butter = 90;
					System.out.println("(3).Masala popcorn : 60/-");
					int masala=60;
					System.out.println("(4).Cheese popcorn : 100/-");
					int cheese=100;
					System.out.println("(5).Nachos popcorn : 120/-");
					int nachos=120;
					
					System.out.println("What would you like to take ?");
					int wantfromPopcorn = sc.nextInt();
					
					switch(wantfromPopcorn){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsalted = sc.nextInt();
							bill = bill + (salted*cntsalted);
							break;
						}
						
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntbutter = sc.nextInt();
							bill = bill + (butter*cntbutter);
							break;
						}
						
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmasala = sc.nextInt();
							bill = bill + (masala*cntmasala);
							break;
						}
						
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntcheese = sc.nextInt();
							bill = bill + (cheese*cntcheese);
							break;
						}
						
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntnachos = sc.nextInt();
							bill = bill + (nachos*cntnachos);
							break;
						}
					}
					break;	
				}
				
				default:{
					System.out.println("Enter valid input");
					break;
				}
			}
			
		}
		
		void food2(){
			
			System.out.println("...............INSTANCE FOOD...............");
			System.out.println();
			System.out.println();
			System.out.println("[1]. Instant Tea : 30/- ");
			int tea = 30;
			System.out.println("[2]. Instant Soup : 50/- ");
			int soup = 50;
			System.out.println("[3]. Instant Coffee : 40/- ");
			int coffee = 40;
			System.out.println("[4]. Instant Meggie Cup Noodles : 30/- ");
			int meggie = 30;
			System.out.println("[5]. Instant Rice : 50/- ");
			int rice = 50;
			
			System.out.println("What would you like to take ?");
			int wantfromCookies = sc.nextInt();
					
			switch(wantfromCookies){
				case 1 : {
					System.out.print("How many product do you want ? : 1 X ");
					int cnttea = sc.nextInt();
					bill = bill + (tea*cnttea);
					break;
				}
						
				case 2 : {
					System.out.print("How many product do you want ? : 1 X ");
					int cntsoup = sc.nextInt();
					bill = bill + (soup*cntsoup);
					break;
				}
						
				case 3 : {
					System.out.print("How many product do you want ? : 1 X ");
					int cntcoffee = sc.nextInt();
					bill = bill + (coffee*cntcoffee);
					break;
				}
						
				case 4 : {
					System.out.print("How many product do you want ? : 1 X ");
					int cntmeggie = sc.nextInt();
					bill = bill + (meggie*cntmeggie);
					break;
				}
						
				case 5 : {
					System.out.print("How many product do you want ? : 1 X ");
					int cntrice = sc.nextInt();
					bill = bill + (rice*cntrice);
					break;
				}
				
				default:{
					System.out.println("Enter valid input");
					break;
				}
			}
			
		}
		
		void food3(){
			
			System.out.println("..............BAKERY...............");
			System.out.println();
			System.out.println();
			System.out.println("[1]. Cakes-");
			System.out.println("[2]. Breads-");
			System.out.println("[3]. Donuts-");
			System.out.println();
			System.out.println("Select from the above category-");
			int z=sc.nextInt();
			
			switch(z){
				case 1:{
					System.out.println();
					System.out.println("..............CAKES...............");
					System.out.println();
					System.out.println("[1].Chocolate Cake-250/-");
					int choc=250;
					System.out.println("[2].Strawberry Cake-250/-");
					int strawc=250;
					System.out.println("[3].Vanila Cake-250/-");
					int vanic=250;
					System.out.println("[4].Red velvet Cake-400/-");
					int redc=400;
					System.out.println("[5].Black/white forest Cake-600/-");
					int forc=600;
					
					System.out.println("What would you like to take ?");
					int wantfromCakes = sc.nextInt();
							
					switch(wantfromCakes){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntchoc = sc.nextInt();
							bill = bill + (choc*cntchoc);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntstrawc = sc.nextInt();
							bill = bill + (strawc*cntstrawc);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntvanic = sc.nextInt();
							bill = bill + (vanic*cntvanic);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntredc = sc.nextInt();
							bill = bill + (redc*cntredc);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntforc = sc.nextInt();
							bill = bill + (forc*cntforc);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				
				case 2:{
					System.out.println();
					System.out.println("..............BREADS...............");
					System.out.println();
					
					System.out.println("[1].Regular bread : 50/-");
					int regb=50;
					System.out.println("[2].Wheat bread : 60/-");
					int wheatb=60;
					System.out.println("[3].Multi-Grain bread : 70/-");
					int multib=70;
					System.out.println("[4].Banana bread : 90/-");
					int banana=90;
					System.out.println("[5].Sprouted bread : 120/-");
					int sprouted=120;
					
					System.out.println("What would you like to take ?");
					int wantfromBreads = sc.nextInt();
							
					switch(wantfromBreads){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntregb = sc.nextInt();
							bill = bill + (regb*cntregb);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntwheatb = sc.nextInt();
							bill = bill + (wheatb*cntwheatb);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmultib = sc.nextInt();
							bill = bill + (multib*cntmultib);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntbanana = sc.nextInt();
							bill = bill + (banana*cntbanana);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsprouted = sc.nextInt();
							bill = bill + (sprouted*cntsprouted);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				
				case 3:{
					System.out.println();
					System.out.println("..............DONUTS...............");
					System.out.println();
					System.out.println("[1].Yeast Donuts : 70/-");
					int ydonuts = 70;
					System.out.println("[2].Cake Donuts : 60/-");
					int cdonets = 60;
					System.out.println("[3].Potato Donuts : 80/-");
					int pdonets=80;
					System.out.println("[4].Jelly Donuts : 60/-");
					int jdonets=60;
					System.out.println("[5].Boston Cream Donuts : 60/-");
					int bcdonets=60;
					
					System.out.println("What would you like to take ?");
					int wantfromDonuts = sc.nextInt();
							
					switch(wantfromDonuts){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntydonuts = sc.nextInt();
							bill = bill + (ydonuts*cntydonuts);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntcdonets = sc.nextInt();
							bill = bill + (cdonets*cntcdonets);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpdonets = sc.nextInt();
							bill = bill + (pdonets*cntpdonets);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntjdonets = sc.nextInt();
							bill = bill + (jdonets*cntjdonets);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntbcdonets = sc.nextInt();
							bill = bill + (bcdonets*cntbcdonets);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				
				default:{
				System.out.println("Enter valid input");
				break;
				}
			}	
			
		}	
		
		void clothes(){
			
			System.out.println();
			System.out.println("...............CLOTHES...............");
			System.out.println();
			System.out.println("[1].WOMEN CLOTHING");
			System.out.println("[2].MEN CLOTHING");
			System.out.println("[3].KIDZZZ CLOTHING");
			System.out.println();
			System.out.println("Select from above category...");
			System.out.println();
			int clot=sc.nextInt();
			
			switch(clot){
				case 1:{
					System.out.println();
					System.out.println("...............WOMEN CLOTHING...............");
					System.out.println();
					System.out.println("[1].Simple T-Shirts : 250/-");
					int tee=250;
					System.out.println("[2].Formal shirt : 500/-");
					int formalS=500;
					System.out.println("[3].Formal pants : 1500/-");
					int formalp=1500;
					System.out.println("[4].One piece dress: 2500/-");
					int dress=2500;
					System.out.println("[5].Denim shorts : 1250/-");
					int shorts=1250;
					
					System.out.println("What would you like to take ?");
					int wantfromWcloth = sc.nextInt();
							
					switch(wantfromWcloth){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cnttee = sc.nextInt();
							bill = bill + (tee*cnttee);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntformalS = sc.nextInt();
							bill = bill + (formalS*cntformalS);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntformalP = sc.nextInt();
							bill = bill + (formalp*cntformalP);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntjdress = sc.nextInt();
							bill = bill + (dress*cntjdress);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntshorts = sc.nextInt();
							bill = bill + (shorts*cntshorts);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				case 2:{
				System.out.println();
					System.out.println("...............MEN CLOTHING...............");
					System.out.println();
					System.out.println("[1].Simple T-Shirts : 250/-");
					int simtee=250;
					System.out.println("[2].Formal shirt : 500/-");
					int forS=500;
					System.out.println("[3].Formal pants : 1500/-");
					int forP=1500;
					System.out.println("[4].Printed T-Shirts: 300/-");
					int pridress=300;
					System.out.println("[5].Denim shorts : 1250/-");
					int denshorts=1250;
					
					System.out.println("What would you like to take ?");
					int wantfromMcloth = sc.nextInt();
							
					switch(wantfromMcloth){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsimtee = sc.nextInt();
							bill = bill + (simtee*cntsimtee);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntforS = sc.nextInt();
							bill = bill + (forS*cntforS);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntforP = sc.nextInt();
							bill = bill + (forP*cntforP);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpridress = sc.nextInt();
							bill = bill + (pridress*cntpridress);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntdenshorts = sc.nextInt();
							bill = bill + (denshorts*cntdenshorts);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				case 3:{
					System.out.println();
					System.out.println("...............KIDZZZ CLOTHING...............");
					System.out.println();
					System.out.println("[1].Simple T-Shirts : 250/-");
					int teek=250;
					System.out.println("[2].shirt : 500/-");
					int formalSk=500;
					System.out.println("[3].Denim pants : 1500/-");
					int formalpk=1500;
					System.out.println("[4].Frock dress: 2500/-");
					int dressk=2500;
					System.out.println("[5].Denim shorts : 1250/-");
					int shortsk=1250;
					
					System.out.println("What would you like to take ?");
					int wantfromWcloth = sc.nextInt();
							
					switch(wantfromWcloth){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntteek = sc.nextInt();
							bill = bill + (teek*cntteek);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntformalSk = sc.nextInt();
							bill = bill + (formalSk*cntformalSk);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntformalPk = sc.nextInt();
							bill = bill + (formalpk*cntformalPk);
							break;
						}
								
						case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntjdressk = sc.nextInt();
							bill = bill + (dressk*cntjdressk);
							break;
						}
								
						case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntshortsk = sc.nextInt();
							bill = bill + (shortsk*cntshortsk);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
			}
		}
		
		void cosmetics(){
			
			System.out.println();
			System.out.println("...............COSMETICS...............");
			System.out.println();
			System.out.println("[1].Moisturizer : 300/-");
			int moist=300;
			System.out.println("[2].Tonner : 275/-");
			int ton=275;
			System.out.println("[3].Sunscreen : 325/-");
			int sun=325;
			System.out.println("[4].Lip-Bam : 250/- ");
			int lip=250;
			System.out.println("[5].Foundation : 700/-");
			int found=700;
			System.out.println("[6].Under Eye Cream : 300/-");
			int eye=300;
			System.out.println("[7].Face Serum : 900");
			int face=900;
			System.out.println("[8].AlooVera : 150/-");
			int aloo=150;
	
			System.out.println();
			
			System.out.println("What would you like to take ?");
			int wantfromCosmetics = sc.nextInt();
							
			switch(wantfromCosmetics){
				case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntmoist = sc.nextInt();
							bill = bill + (moist*cntmoist);
							break;
				}
								
				case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntton = sc.nextInt();
							bill = bill + (ton*cntton);
							break;
				}
								
				case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsun = sc.nextInt();
							bill = bill + (sun*cntsun);
							break;
				}
								
				case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntlip = sc.nextInt();
							bill = bill + (lip*cntlip);
							break;
				}
								
				case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntfound = sc.nextInt();
							bill = bill + (found*cntfound);
							break;
				}
				
				case 6 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cnteye = sc.nextInt();
							bill = bill + (eye*cnteye);
							break;
				}
				
				case 7 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntface = sc.nextInt();
							bill = bill + (face*cntface);
							break;
				}
				
				case 8 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntaloo = sc.nextInt();
							bill = bill + (aloo*cntaloo);
							break;
				}
						
				default:{
							System.out.println("Enter valid input");
							break;
				}
			}	
		}
		
		
		void footwear(){

			System.out.println();
			System.out.println("...............FOOT-WEAR...............");
			System.out.println();
			System.out.println("[1].SHOES");
			System.out.println("[2].SANDELS");
			System.out.println("[3].SLIPPERS");
			System.out.println();
			System.out.println("Select from the above..");
			System.out.println();
			int foot=sc.nextInt();
			switch(foot){
				case 1:{
				System.out.println();
				System.out.println("...............SHOES...............");
				System.out.println();
				System.out.println("Enter your shoe size(IND)-");
				System.out.println();
				int shoeSize=sc.nextInt();
				System.out.println();
				System.out.println("[1].Sneakers : 2000/-");
				int sneak=2000;
				System.out.println("[2].Formal Shoes : 2500/-");
				int form=2500;
				System.out.println("[3].Loafer : 3300/-");
				int loafer=3300;
				
				System.out.println("What would you like to take ?");
				int wantfromShoes = sc.nextInt();
							
					switch(wantfromShoes){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsneak = sc.nextInt();
							bill = bill + (sneak*cntsneak);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntform = sc.nextInt();
							bill = bill + (form*cntform);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntloafer = sc.nextInt();
							bill = bill + (loafer*cntloafer);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}	
					break;
				}
				case 2 :{
					System.out.println();
					System.out.println("...............SANDELS..............");
					System.out.println();
					System.out.println("Enter your shoe size..");
					System.out.println();
					int shoeSize=sc.nextInt();
					System.out.println();
					System.out.println("[1].Strappy upper : 2000/-");
					int strappy=2000;
					System.out.println("[2].Espadrille style rope sole: 2500/-");
					int espa=2500;
					System.out.println("[3].A peep-toe upper : 3300/-");
					int peep=3300;
					
					System.out.println("What would you like to take ?");
					int wantfromShoes = sc.nextInt();
							
					switch(wantfromShoes){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntstrappy = sc.nextInt();
							bill = bill + (strappy*cntstrappy);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntespa = sc.nextInt();
							bill = bill + (espa*cntespa);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpeep = sc.nextInt();
							bill = bill + (peep*cntpeep);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				case 3 :{
					System.out.println();
					System.out.println("...............SLIPPERS..............");
					System.out.println();
					System.out.println("Enter your shoe size..");
					System.out.println();
					int shoeSize=sc.nextInt();
					System.out.println();
					System.out.println("[1].Classic slip-ons : 2000/-");
					int slipo=2000;
					System.out.println("[2].Sandal-style slippers: 2500/-");
					int san=2500;
					System.out.println("[3].Slides : 3300/-");
					int slides=3300;
				
					System.out.println("What would you like to take ?");
					int wantfromSlippers = sc.nextInt();
							
					switch(wantfromSlippers){
						case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntslipo = sc.nextInt();
							bill = bill + (slipo*cntslipo);
							break;
						}
								
						case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntsan = sc.nextInt();
							bill = bill + (san*cntsan);
							break;
						}
								
						case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntslides = sc.nextInt();
							bill = bill + (slides*cntslides);
							break;
						}
						
						default:{
							System.out.println("Enter valid input");
							break;
						}
					}
					break;
				}
				default :{
					System.out.println("Enter valid input");
					break;
				}
			
			}
			
		}
		

		
		void accessories(){
			System.out.println();
			System.out.println("...............ACCESSORIES...............");
			System.out.println();
			System.out.println("[1].Braclets :250/-");
			int brac=250;
			System.out.println("[2].Earring : 275/-");
			int ear=275;
			System.out.println("[3].Rings : 325/-");
			int ring=325;
			System.out.println("[4].Anklets : 250/-");
			int anklet=250;
			System.out.println("[5].Pendent : 700/-");
			int pend=700;
			System.out.println("[6].Chains : 300/-");
			int chain=300;
			System.out.println();
			
				System.out.println("What would you like to take ?");
				int wantfromShoes = sc.nextInt();
							
				switch(wantfromShoes){
					case 1 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntbrac = sc.nextInt();
							bill = bill + (brac*cntbrac);
							break;
					}
								
					case 2 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntear = sc.nextInt();
							bill = bill + (ear*cntear);
							break;
					}
								
					case 4 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntanclet = sc.nextInt();
							bill = bill + (anklet*cntanclet);
							break;
					}
					
					case 3 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntring = sc.nextInt();
							bill = bill + (ring*cntring);
							break;
					}
								
					case 5 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntpend = sc.nextInt();
							bill = bill + (pend*cntpend);
							break;
					}
								
					case 6 : {
							System.out.print("How many product do you want ? : 1 X ");
							int cntchain = sc.nextInt();
							bill = bill + (chain*cntchain);
							break;
					}
					
					default:{
							System.out.println("Enter valid input");
							break;
					}
				}
			{}	
		}
		
		void delivery(){
		boolean flag6 = false;
			do{
				System.out.println();
				System.out.println("Select delivery option from below..");
				System.out.println();
				System.out.println("[1].Home Delivery");
				System.out.println("[2].Ready Delivery(pick up point)");
				
				System.out.println();
				int pick=sc.nextInt();
				switch(pick){
					case 1: {
						flag6 = true;
						System.out.println();
						System.out.println("Select from the below area..");
						System.out.println();
						System.out.println("[1].Gota");
						System.out.println("[2].Vastrapur");
						System.out.println("[3].Gurukul");
						System.out.println("[4].Bopal");
						System.out.println("[5].Science city");
						System.out.println("[6].Satelite");
						System.out.println("[7].Paldi");
						System.out.println("[8].Maninagar");
						System.out.println();
						int area=sc.nextInt();
						System.out.println();
						System.out.println("The delivery charges are same for all areas that is 150/-");
						bill=bill+150;
						System.out.println();
						System.out.println("Enter your complete adress..");
						sc.nextLine();
						String adrs=sc.nextLine();
						System.out.println();
						break;
					}
					case 2:{
						flag6 = true;
						System.out.println();
						System.out.println("Some of our pick-up points are..");
						System.out.println();
						System.out.println("[1].Gota");
						System.out.println("[2].Paldi");
						System.out.println("[3].Science city");
						System.out.println("[4].Satelite");
						System.out.println("[5].Maninagar");
						System.out.println();
						System.out.println("Select from the above pick up point.");
						int pickup=sc.nextInt();
						System.out.println();
						System.out.println("Your order will be at the selected pick up point..");
						System.out.println();
						System.out.println("There are no extra charges.");
						break;
					}
					default : {
						System.out.println("Enter valid input");
						break;
					}
				}
			}while(flag6 != true);
		}
		
		void bill(){
			GST=(18*bill)/100 + bill;
			System.out.println();
			System.out.println("Your Bill Is : " + bill);	
			System.out.println();
			System.out.println("Your Total Bill With GST: " + GST);
			System.out.println();
			if(bill!=0){
				System.out.println();
				System.out.println("Payment Mathods.");
				System.out.println();
				System.out.println("[1]. Credit Card");
				System.out.println("[2]. Debit Card");
				System.out.println("[3]. UPI");
				System.out.println("[4]. Cash On Delivery");
				System.out.println();
				System.out.println("In Which payment mathod would you like choose ?");
				int chuse = sc.nextInt();
				
				switch(chuse){
					case 1 : {
						boolean flag1 = false;
						do{	
							System.out.print("Enter Your 16 digits Credit card no. ");
							long ccardno = sc.nextLong();
							int coun=0;
							while(ccardno>0){
								long asd=ccardno%10;
								coun++;
								ccardno=ccardno/10;
							}
							if(coun==16){
								System.out.println("");
								flag1 = true;
							}
							else{
								System.out.println("Enter valid input");
							}
						}while(flag1 != true);	
							if(flag1 == true){
								boolean flag2 = false;   
								do{
									System.out.print("Entre Your 3 digits CVV number : ");
									int ccvv = sc.nextInt();

									int count1=0;
									while(ccvv>0){
										int asdf=ccvv%10;
										count1++;
										ccvv=ccvv/10;
									}
									if(count1==3){
										System.out.println("------------------------------------------------------------------------------------------------------------");
										flag2 = true;
									}
									else{
										System.out.println("Invalid Intput");
									}
								}while(flag2 != true);
								if(flag2 == true){
									System.out.println("Payment successful");
									delivery();
								}
							}
							break;
							
					}
					
					case 2 : {
						boolean flag3 = false;
						do{
							System.out.print("Enter your 16 digits Debit card no. ");
							long dcardno = sc.nextLong();
							int coun1=0;
							while(dcardno>0){
								long k=dcardno%10;
								coun1++;
								dcardno=dcardno/10;
							}
							//System.out.println(coun1);
							if(coun1==16){
								
								flag3 = true; 
							}
							else{
								System.out.println("Enter valid input");
							}
						}while(flag3 != true);
						
						if(flag3 == true){
							boolean  flag4 = false; 
							do{
								System.out.print("Entre Your 3 digits CVV number : ");
								int dcvv = sc.nextInt();
								int x1=0;
								int countO=0;
								while(dcvv>0){
									long bnm=dcvv%10;
									countO++;
									dcvv=dcvv/10;
								}
								if(countO==3){
									
									System.out.println("------------------------------------------------------------------------------------------------------------");
									flag4 = true;
								}
								else{
									System.out.println("Invalid Intput");
								}
							}while(flag4 != true);	
							if(flag4 == true){
								System.out.println("Payment successful");
								delivery();
							}		
						}
					break;
					}
					
					case 3 : {
						boolean flag5 = false;
						do{
							System.out.println("Enter your 6 digits UPI ID : ");
							long number = sc.nextLong();
							int cntno = 0;
							while(number>0){
								long check = number%10;
								cntno++;
								number = number/10;
							}
							if(cntno==6){
								flag5 = true;
							}
							else{
								System.out.println("Enter valid UPI id.");
							}
						}while(flag5 != true);	
						if(flag5 == true){		
							System.out.print("Enter UPI Pin :");
							int pin = sc.nextInt();
							delivery();
							System.out.println();
							System.out.println("Payment Succesful");
						}
					break;
					}
					
					case 4 : {
						delivery();
						break;
					}
				}
			}
		}
		void billPay(){
			System.out.println();
			System.out.println("Your total bill is : "+(bill + GST));
			System.out.println();
			System.out.println("Thank you for Shopping with us  :)");
			
		}
}		
	
class Main{
	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		Javap j1 = new Javap();
	
			j1.intro();
			System.out.println();
			System.out.print("Username : ");
			String name = sc.nextLine();
		
			System.out.println();
			
			System.out.println("INSTRUCTION FOR PASSWORD");
			System.out.println("1. At least one Upper case");
			System.out.println("2. At least one Lower case");
			System.out.println("3. At least one digit");
			System.out.println("4. At least 8 to 15 character");
		
			System.out.println();
			boolean flag=false;
			do{
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
					System.out.println();
					flag=true;
					System.out.print("You have successfuly logged in ");
				}
				else{
					System.out.println("Invalid Password");
				}	
			}while(flag!=true);
			
				System.out.println();
				j1.cate();
				System.out.println("Which product category would you like to explore for shopping.....");
				int select = sc.nextInt();
				switch(select){
					case 1 : {
						j1.food();
						int fselect = sc.nextInt();
						
						switch(fselect){
							case 1 : {
								j1.food1();
								j1.food10();
								break;
							}
							
							case 2 :{
								j1.food2();
								break;
							}
							
							case 3 : {
								j1.food3();
								break;
							}
						}
					
						
						System.out.println("Do you want to buy some more products ? If Yes then press 1 or press 0 to exit.");
						int ask = sc.nextInt();
						if(ask == 1){
									j1.cate();
									System.out.println("Which product category would you like to explore for shopping.....");
									int select1 = sc.nextInt();
							switch(select1){
								case 1 : {
									j1.food();
									int gselect = sc.nextInt();
									
									switch(gselect){
										case 1 : {
											j1.food1();
											j1.food10();
											break;
										}
										
										case 2 :{
											j1.food2();
											break;
										}
										
										case 3 : {
											j1.food3();
											break;
										}
									}
									break;
								}
								
								case 2 : {
									j1.clothes();
									break;
								}
								
								case 3 : {
									j1.cosmetics();
									break;
								}
								
								case 4 : {
									j1.footwear();
									break;
								}
								
								case 5 : {
									j1.accessories();
									break;
								}
								
								default : {
									System.out.println("Enter valid input");
									break;
								}
								
							}
						}
						break;
					}
					
					case 2 : {
						j1.clothes();
						
						System.out.println("Do you want to buy some more products ? If Yes then press 1 or press 0 to exit.");
						int ask = sc.nextInt();
						
						if(ask == 1){
									j1.cate();
									System.out.println("Which product category would you like to explore for shopping.....");
									int select2 = sc.nextInt();
							switch(select2){
								case 1 : {
									j1.food();
									int fselect = sc.nextInt();
									
									switch(fselect){
										case 1 : {
											j1.food1();
											j1.food10();
											break;
										}
										
										case 2 :{
											j1.food2();
											break;
										}
										
										case 3 : {
											j1.food3();
											break;
										}
									}
									break;
								}
								
								case 2 : {
									j1.clothes();
									break;
								}
								
								case 3 : {
									j1.cosmetics();
									break;
								}
								
								case 4 : {
									j1.footwear();
									break;
								}
								
								case 5 : {
									j1.accessories();
									break;
								}
								
								default : {
									System.out.println("Enter valid input");
									break;
								}
								
							}
						}
						break;
					}
					
					case 3 : {
						j1.cosmetics();
						System.out.println("Do you want to buy some more products ? If Yes then press 1 or press 0 to exit.");
								int ask = sc.nextInt();
						if(ask == 1){
									j1.cate();
									System.out.println("Which product category would you like to explore for shopping.....");
									int select3 = sc.nextInt();
							switch(select3){
								case 1 : {
									j1.food();
									int fselect = sc.nextInt();
									
									switch(fselect){
										case 1 : {
											j1.food1();
											j1.food10();
											break;
										}
										
										case 2 :{
											j1.food2();
											break;
										}
										
										case 3 : {
											j1.food3();
											break;
										}
									}
									break;
								}
								
								case 2 : {
									j1.clothes();
									break;
								}
								
								case 3 : {
									j1.cosmetics();
									break;
								}
								
								case 4 : {
									j1.footwear();
									break;
								}
								
								case 5 : {
									j1.accessories();
									break;
								}
								
								default : {
									System.out.println("Enter valid input");
									break;
								}
								
							}
						}
						break;
					}
					
					case 4 : {
						j1.footwear();
						
						System.out.println("Do you want to buy some more products ? If Yes then press 1 or press 0 to exit.");
								int ask = sc.nextInt();
						if(ask == 1){
									j1.cate();
									System.out.println("Which product category would you like to explore for shopping.....");
									int select4 = sc.nextInt();
							switch(select4){
								case 1 : {
									j1.food();
									int fselect = sc.nextInt();
									
									switch(fselect){
										case 1 : {
											j1.food1();
											j1.food10();
											break;
										}
										
										case 2 :{
											j1.food2();
											break;
										}
										
										case 3 : {
											j1.food3();
											break;
										}
									}
									break;
								}
								
								case 2 : {
									j1.clothes();
									break;
								}
								
								case 3 : {
									j1.cosmetics();
									break;
								}
								
								case 4 : {
									j1.footwear();
									break;
								}
								
								case 5 : {
									j1.accessories();
									break;
								}
								
								default : {
									System.out.println("Enter valid input");
									break;
								}
								
							}
						}
						break;
					}
					
					case 5 : {
						j1.accessories();
						
						System.out.println("Do you want to buy some more products ? If Yes then press 1 or press 0 to exit.");
								int ask = sc.nextInt();
						if(ask == 1){
									j1.cate();
									System.out.println("Which product category would you like to explore for shopping.....");
									int select5 = sc.nextInt();
							switch(select5){
								case 1 : {
									j1.food();
									int fselect = sc.nextInt();
									
									switch(fselect){
										case 1 : {
											j1.food1();
											j1.food10();
											break;
										}
										
										case 2 :{
											j1.food2();
											break;
										}
										
										case 3 : {
											j1.food3();
											break;
										}
									}
									break;
								}
								
								case 2 : {
									j1.clothes();
									break;
								}
								
								case 3 : {
									j1.cosmetics();
									break;
								}
								
								case 4 : {
									j1.footwear();
									break;
								}
								
								case 5 : {
									j1.accessories();
									break;
								}
								
								default : {
									System.out.println("Enter valid input");
									break;
								}
								
							}
						}
						break;
					}
					
					default : {
						System.out.println("Enter valid input");
						break;
					}
					
				}
				
				j1.bill();
				j1.billPay();
		{}	{}	
	}
}