import java.util.Scanner;
class ttt
 {
	public static void main(String args[])
	{
		entryByUser();
	}
	public static void entryByUser()
	{
		Scanner sc = new Scanner(System.in);
		String falsechoice1 = " ";
		System.out.println();
		System.out.println("                ~*~*~*~ 🔥 WELCOME TO THE ULTIMATE BATTLE OF \"TIC-TAC-TOE\" 🔥 ~*~*~*~");
		System.out.println();
		System.out.println("                              !!!!!!!! 🔥 LET THE GAME BEGIN 🔥!!!!!!!!");
		System.out.println();
		System.out.println("                                               🎊🎉🎊");
		System.out.println();
		System.out.println("• The Rules Of Classic TIC-TAC-TOE Are Already Known.");
		System.out.println();
		System.out.println("• And The Following Will Gonna Be The TIC-TAC-TOE Arena.");
		System.out.println();
		System.out.print("  ");
		for(int q = 1;q<=14;q++) //this loop is used to display a,b,c on top of box.
		{
			if(q==3)
			System.out.print("a");
			else if(q==7)
			System.out.print("b");
			else if(q==11)
			System.out.print("c");
			else
			System.out.print(" ");
		}
		System.out.println();
		for(int i = 1;i<=7;i++) //this loop is used to display 1,2,3 on left of box.
		{
			for(int n = 1;n<=4;n++)
			{
				if(i==((2*n)-1))
				{
					System.out.print("  ");
					for(int j = 1;j<=7;j++)
					{
						System.out.print("- ");
					}
					if(i<=7)
					{
						System.out.println();
					}
				}
				if(i==2*n)
				{
					System.out.print(i/2+" ");//this loop is used to display 1,2,3 on left of box and other things.
					for(int k = 1;k<=4;k++)
					{
						
							if(k<=3)
							{
								System.out.print("|   ");
							}
							else if(k==4)
								System.out.print("|");
					}
					if(i<=7)
					{
						System.out.println();
					}
				}
			}
		}
		System.out.println();
		System.out.println("• NOTE: TO ENTER YOUR RESPONSE IN A SQUARE ENTER IT'S ROW NUMBER FOLLOWED BY COLUMN'S LETTER, eg: TO ASSIGN (X/O) IN MIDDLE SQUARE ENTER 2b OR 2B.");
		System.out.println();
		System.out.print("- Legend Has It — “The first To Enter The Arena Never Loses”. Enter Your Name, Player 1 — And Rule The Arena!!!: ");
		String player1 = "...";
		for(int u = 0;u<1;u++)
		{
			player1 = sc.nextLine();
			if(player1.length()==0)
			{
				System.out.println();
				System.out.println("                     !!! ⚔️ Invalid Input Player 1. Try Again ⚔️ !!!");
				System.out.println();
				System.out.print("                             Player 1 — Enter Your Name Again.");
				u--;continue;
			}
		}
		System.out.println();
		System.out.print("- …But Legends Are Born Second. The Challenger Rises! Enter Your Name Player 2 — And Shake The Throne!!!!!: ");
		String player2 = "...";
		for(int u = 0;u<1;u++)
		{
			player2 = sc.nextLine();
			if(player2.length()==0)
			{
				System.out.println();
				System.out.println("                     !!! ⚔️ Invalid Input Player 2. Try Again ⚔️ !!!");
				System.out.println();
				System.out.print("                             Player 2 — Enter Your Name Again.");
				u--;continue;
			}
		}
		System.out.println();
		System.out.println("• Now Both Player Choose Your Weapon(X/O) And Let The War Begin!!!");
		System.out.println();
		System.out.print("• 1st Player Enter Your Choice: ");
		String player1Choice = " ";
		for(int i = 0;i<1;i++)
		{
			player1Choice = sc.nextLine();
			if(player1Choice.equals("x")==false&&player1Choice.equals("X")==false&&player1Choice.equals("o")==false&&player1Choice.equals("O")==false)
			{
				System.out.println();
				System.out.println("                       !!! ⚔️ Invalid Input Player 1. Try Again ⚔️ !!!");
				System.out.println();
				System.out.println("                    !!! ⚔️ (The More You Err, The Harder You Fall). ⚔️ !!!");
				System.out.println();
				System.out.print("• 1st Player Once More Enter Your Choice: ");
				i--;
				continue;
			}
			else if(player1Choice.equals("x")||player1Choice.equals("X"))
				player1Choice = "X";
			else if(player1Choice.equals("o")||player1Choice.equals("O"))
				player1Choice = "O";
		}
		System.out.println();
		System.out.print("• 2nd Player Enter Your Choice: ");
		String player2Choice = " ";
		for(int i = 0;i<1;i++)
		{
			player2Choice = sc.nextLine();
			if((player2Choice.equals("x")||player2Choice.equals("X"))&&(player1Choice.equals("X")))
			{
				System.out.println();
				System.out.println("           !!! ⚔️ Invalid Input Player 2. "+player1Choice+" Has Already Been Taken. Try Again ⚔️ !!!");
				System.out.println();
				System.out.println("                           !!! ⚔️ (The More You Err, The Harder You Fall). ⚔️ !!!");
				System.out.println();
				System.out.print("• 2nd Player Once More Enter Your Choice: ");
				i--;
				continue;
			}
			else if((player2Choice.equals("o")||player2Choice.equals("O"))&&(player1Choice.equals("O")))
			{
				System.out.println();
				System.out.println("           !!! ⚔️ Invalid Input Player 2. "+player1Choice+" Has Already Been Taken. Try Again ⚔️ !!!");
				System.out.println("                         !!! ⚔️ (The More You Err, The Harder You Fall). ⚔️ !!!");
				System.out.print("• 2nd Player Once More Enter Your Choice: ");
				i--;
				continue;
			}
			else if((player2Choice.equals("x")==false&&player2Choice.equals("X")==false&&player2Choice.equals("o")==false&&player2Choice.equals("O")==false))
			{
				System.out.println();
				System.out.println("           !!! ⚔️ Invalid Input Player 2. Try Again ⚔️ !!!");
				System.out.println();
				System.out.println("        !!! ⚔️ (The More You Err, The Harder You Fall). ⚔️ !!!");
				System.out.println();
				System.out.print("• 2nd Player Once More Enter Your Choice: ");
				i--;
				continue;
			}
			else if((player2Choice.equals("o")||player2Choice.equals("O"))&&(player1Choice.equals("O")==false))
			{
				player2Choice = "O";
			}
			else if((player2Choice.equals("x")||player2Choice.equals("X"))&&(player1Choice.equals("X")==false))
					player2Choice = "X";
			
		}
		System.out.println();
		for(int i = 0;i<1;i++)
		{
			System.out.print("• Who’s Gonna Make The First Move — X or O? Enter Your Choice(X/O): ");
			falsechoice1 = sc.nextLine();
			if(falsechoice1.equals("x")==false&&falsechoice1.equals("X")==false&&falsechoice1.equals("o")==false&&falsechoice1.equals("O")==false)
			{
				System.out.println();
				System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
				System.out.println();
				i--;
				continue;
			}
		}
		System.out.println();
		String choice1="";
		String choice2="";
		if(falsechoice1.equals("X")||falsechoice1.equals("x"))
			choice1 = "X";
		else if(falsechoice1.equals("O")||falsechoice1.equals("o"))
			choice1 = "O";
		if(choice1.equals("X"))
			choice2="O";
		else if(choice1.equals("O"))
			choice2="X";
		System.out.println("• The 1st To Move Is: \""+choice1+"\"!!!!!!!!!");
		System.out.println();
		System.out.println("• And So The 2nd One's:  \""+choice2+"\"!!!!!!!!!");
		System.out.println();
		System.out.print("                   ~*~*~ Press Enter, And Let The Ultimate Showdown Begin!!!!!!!! ~*~*~");
		String empty = sc.nextLine();
		System.out.println();
		String []O_X_resp = new String[9];		// this will decide and store O,X as per response.
		for(int g =1;g<=9;g++)
		{
			O_X_resp[g-1]=" ";
		}
		for(int w = 1;w<=9;w++)
		{
			String resp = " ";
			
			if(w==1)
			{
				System.out.println("* It's Turn For \""+choice1+"\" ");
			}
			else if(w%2==1)
			{
				System.out.println("* Now It's Turn For \""+choice1+"\" ");
			}
			else if(w%2==0)
			{
				System.out.println("* Now It's Turn For \""+choice2+"\" ");
			}
			System.out.print("* Enter Your Response : ");
			resp=sc.next();
			System.out.println();
			if(resp.equals("1a")==false&&resp.equals("1b")==false&&resp.equals("1c")==false&&resp.equals("1A")==false&&resp.equals("1B")==false&&resp.equals("1C")==false&&resp.equals("2a")==false&&resp.equals("2b")==false&&resp.equals("2c")==false&&resp.equals("2A")==false&&resp.equals("2B")==false&&resp.equals("2C")==false&&resp.equals("3a")==false&&resp.equals("3b")==false&&resp.equals("3c")==false&&resp.equals("3A")==false&&resp.equals("3B")==false&&resp.equals("3C")==false)
			{
				System.out.println("                        !!! It's Not An Input Bro. Try Again !!!");
				System.out.println();
				w--;
				continue;
			}
			// System.out.println();
			
// ***************** below if-else ladder from line 39 to 116 fixex the choices if its assigned.

			if(w%2==1)
			{
				if( (O_X_resp[0]==" ") && (resp.equals("1a") || resp.equals("1A")) )
				{
					O_X_resp[0]=choice1;
				}
				else if( (O_X_resp[0]!=" "||O_X_resp[0]!=" ") && (resp.equals("1a") || resp.equals("1A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[1]==" ") && (resp.equals("1b") || resp.equals("1B")) )
				{
					O_X_resp[1]=choice1;
				}
				else if( (O_X_resp[1]!=" "||O_X_resp[1]!=" ") && (resp.equals("1b") || resp.equals("1B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[2]==" ") && (resp.equals("1c") || resp.equals("1C")) )
				{
					O_X_resp[2]=choice1;
				}
				else if( (O_X_resp[2]!=" "||O_X_resp[2]!=" ") && (resp.equals("1c") || resp.equals("1C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[3]==" ") && (resp.equals("2a") || resp.equals("2A")) )
				{
					O_X_resp[3]=choice1;
				}
				else if( (O_X_resp[3]!=" "||O_X_resp[3]!=" ") && (resp.equals("2a") || resp.equals("2A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[4]==" ") && (resp.equals("2b") || resp.equals("2B")) )
				{
					O_X_resp[4]=choice1;
				}
				else if( (O_X_resp[4]!=" "||O_X_resp[4]!=" ") && (resp.equals("2b") || resp.equals("2B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[5]==" ") && (resp.equals("2c") || resp.equals("2C")) )
				{
					O_X_resp[5]=choice1;
				}
				else if( (O_X_resp[5]!=" "||O_X_resp[5]!=" ") && (resp.equals("2c") || resp.equals("2C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[6]==" ") && (resp.equals("3a") || resp.equals("3A")) )
				{
					O_X_resp[6]=choice1;
				}
				else if( (O_X_resp[6]!=" "||O_X_resp[6]!=" ") && (resp.equals("3a") || resp.equals("3A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[7]==" ") && (resp.equals("3b") || resp.equals("3B")) )
				{
					O_X_resp[7]=choice1;
				}
				else if( (O_X_resp[7]!=" "||O_X_resp[7]!=" ") && (resp.equals("3b") || resp.equals("3B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[8]==" ") && (resp.equals("3c") || resp.equals("3C")) )
				{
					O_X_resp[8]=choice1;
				}
				else if( (O_X_resp[8]!=" "||O_X_resp[8]!=" ") && (resp.equals("3c") || resp.equals("3C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
			}
			else if(w%2==0)
			{
				if( (O_X_resp[0]==" ") && (resp.equals("1a") || resp.equals("1A")) )
				{
					O_X_resp[0]=choice2;
				}
				else if( (O_X_resp[0]!=" "||O_X_resp[0]!=" ") && (resp.equals("1a") || resp.equals("1A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[1]==" ") && (resp.equals("1b") || resp.equals("1B")) )
				{
					O_X_resp[1]=choice2;
				}
				else if( (O_X_resp[1]!=" "||O_X_resp[1]!=" ") && (resp.equals("1b") || resp.equals("1B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[2]==" ") && (resp.equals("1c") || resp.equals("1C")) )
				{
					O_X_resp[2]=choice2;
				}
				else if( (O_X_resp[2]!=" "||O_X_resp[2]!=" ") && (resp.equals("1c") || resp.equals("1C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[3]==" ") && (resp.equals("2a") || resp.equals("2A")) )
				{
					O_X_resp[3]=choice2;
				}
				else if( (O_X_resp[3]!=" "||O_X_resp[3]!=" ") && (resp.equals("2a") || resp.equals("2A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[4]==" ") && (resp.equals("2b") || resp.equals("2B")) )
				{
					O_X_resp[4]=choice2;
				}
				else if( (O_X_resp[4]!=" "||O_X_resp[4]!=" ") && (resp.equals("2b") || resp.equals("2B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[5]==" ") && (resp.equals("2c") || resp.equals("2C")) )
				{
					O_X_resp[5]=choice2;
				}
				else if( (O_X_resp[5]!=" "||O_X_resp[5]!=" ") && (resp.equals("2c") || resp.equals("2C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[6]==" ") && (resp.equals("3a") || resp.equals("3A")) )
				{
					O_X_resp[6]=choice2;
				}
				else if( (O_X_resp[6]!=" "||O_X_resp[6]!=" ") && (resp.equals("3a") || resp.equals("3A")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[7]==" ") && (resp.equals("3b") || resp.equals("3B")) )
				{
					O_X_resp[7]=choice2;
				}
				else if( (O_X_resp[7]!=" "||O_X_resp[7]!=" ") && (resp.equals("3b") || resp.equals("3B")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
				if( (O_X_resp[8]==" ") && (resp.equals("3c") || resp.equals("3C")) )
				{
					O_X_resp[8]=choice2;
				}
				else if( (O_X_resp[8]!=" "||O_X_resp[8]!=" ") && (resp.equals("3c") || resp.equals("3C")) )
				{
					System.out.println("                    !!!The Square "+resp+"'s Occupied Already. Try Again!!!");
					System.out.println();
					w--;
					continue;
				}
			}
			
// ***************** now display of main game starts.
			
			System.out.print("  ");
			for(int q = 1;q<=14;q++) //this loop is used to display a,b,c on top of box.
			{
				if(q==3)
				System.out.print("a");
				else if(q==7)
				System.out.print("b");
				else if(q==11)
				System.out.print("c");
				else
				System.out.print(" ");
			}
			
			System.out.println();
			
			for(int i = 1;i<=7;i++) //this loop is used to display 1,2,3 on left of box.
			{
				for(int n = 1;n<=4;n++)
				{
					if(i==((2*n)-1))
					{
						System.out.print("  ");
						for(int j = 1;j<=7;j++)
						{
							System.out.print("- ");
						}
						if(i<=7)
						{
							System.out.println();
						}
					}
					if(i==2*n)
					{
						System.out.print(i/2+" ");//this loop is used to display 1,2,3 on left of box and other things.
						for(int k = 1;k<=4;k++)
						{
							if(i==2)
							{
								if(k<=3)
								{
									System.out.print("| "+O_X_resp[(k-1)]+" ");
								}
								else if(k==4)
									System.out.print("|");
							}
							else if(i==4)
							{
								if(k<=3)
								{
									System.out.print("| "+O_X_resp[(k+2)]+" ");
								}
								else if(k==4)
									System.out.print("|");
							}
							else if(i==6)
							{
								if(k<=3)
								{
									System.out.print("| "+O_X_resp[(k+5)]+" ");
								}
								else if(k==4)
									System.out.print("|");
							}
						}
						if(i<=7)
						{
							System.out.println();
						}
					}
				}
			}
			System.out.println();
			
			String[] C1result0={choice1,choice1,choice1,"#@$","#@$","#@$","#@$","#@$","#@$"};
			String[] C1result1={"#@$","#@$","#@$",choice1,choice1,choice1,"#@$","#@$","#@$"};
			String[] C1result2={"#@$","#@$","#@$","#@$","#@$","#@$",choice1,choice1,choice1};
			String[] C1result3={choice1,"#@$","#@$",choice1,"#@$","#@$",choice1,"#@$","#@$"};
			String[] C1result4={"#@$",choice1,"#@$","#@$",choice1,"#@$","#@$",choice1,"#@$"};
			String[] C1result5={"#@$","#@$",choice1,"#@$","#@$",choice1,"#@$","#@$",choice1};
			String[] C1result6={choice1,"#@$","#@$","#@$",choice1,"#@$","#@$","#@$",choice1};
			String[] C1result7={"#@$","#@$",choice1,"#@$",choice1,"#@$",choice1,"#@$","#@$"};
			
			String[] C2result0={choice2,choice2,choice2,"#@$","#@$","#@$","#@$","#@$","#@$"};
			String[] C2result1={"#@$","#@$","#@$",choice2,choice2,choice2,"#@$","#@$","#@$"};
			String[] C2result2={"#@$","#@$","#@$","#@$","#@$","#@$",choice2,choice2,choice2};
			String[] C2result3={choice2,"#@$","#@$",choice2,"#@$","#@$",choice2,"#@$","#@$"};
			String[] C2result4={"#@$",choice2,"#@$","#@$",choice2,"#@$","#@$",choice2,"#@$"};
			String[] C2result5={"#@$","#@$",choice2,"#@$","#@$",choice2,"#@$","#@$",choice2};
			String[] C2result6={choice2,"#@$","#@$","#@$",choice2,"#@$","#@$","#@$",choice2};
			String[] C2result7={"#@$","#@$",choice2,"#@$",choice2,"#@$",choice2,"#@$","#@$"};

			
			int count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result0[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
							    String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
						    	String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result1[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result2[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result3[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result4[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result5[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result6[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C1result7[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice1.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice1.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			//C2
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result0[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result1[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result2[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result3[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result4[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result5[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result6[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
			count = 0;
			for(int c = 0;c<=8;c++)
			{
				if(O_X_resp[c].equals(" ")==false)
				{
					if(C2result7[c]==O_X_resp[c])
					{
						count+=1;
					}
					if(count==3)
					{
						if(choice2.equals(player1Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player1+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
								
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						else if(choice2.equals(player2Choice)==true)
						{
							System.out.println("\n                    🎊🎊🎊 LADIES AND GENTLEMEN... WE HAVE OUR WINNERRRRR!!!!!! 🎊🎊🎊 \n                                               👑  "+player2+" 👑 ");
							String wantPlayAgain = "?";
							System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
								String falseStringPlayAgain1 = sc.nextLine();
							for(int v = 0;v<1;v++)
							{
								wantPlayAgain = sc.nextLine();
									if(wantPlayAgain.equals("Y")||wantPlayAgain.equals("y"))
										entryByUser();
									else if(wantPlayAgain.equals("N")||wantPlayAgain.equals("n"))
										System.exit(0);
									else if(wantPlayAgain.equals("Y")==false&&wantPlayAgain.equals("y")==false&&wantPlayAgain.equals("N")==false&&wantPlayAgain.equals("n")==false)
									{
										System.out.println();
										System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
										System.out.println();
										System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
										v--;continue;
									}
								
							}
						}
						
					}
				}
			}
		}
		
		
		
		System.out.println("               !!!!!And There It Is — The Crowd Saw It Coming… It’s A Draw!!!!!");
		System.out.println();
		System.out.println("                                  ⚔️ NO WINNER — NO LOSER ⚔️");
		System.out.println();
		System.out.println("                         ~_~_~ Want To Play One More Round And Decide A Champion? ~_~_~");
		System.out.println();
		String wantPlayAgain1 = "?";
		System.out.print("Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
		
		
		
		String falseStringPlayAgain2 = sc.nextLine();
		for(int v = 0;v<1;v++)
		{
			wantPlayAgain1 = sc.nextLine();
				if(wantPlayAgain1.equals("Y")||wantPlayAgain1.equals("y"))
					entryByUser();
				else if(wantPlayAgain1.equals("N")||wantPlayAgain1.equals("n"))
					System.exit(0);
				else if(wantPlayAgain1.equals("Y")==false&&wantPlayAgain1.equals("y")==false&&wantPlayAgain1.equals("N")==false&&wantPlayAgain1.equals("n")==false)
				{
					System.out.println();
					System.out.println("                    !!! ⚔️ Invalid Input. Try Again ⚔️ !!!");
					System.out.println();
					System.out.print("• Audience Waiting!!! Do You Want Another Round Of Fire, Players?. Enter Yes Or No As (y/n): ");
					v--;continue;
				}
			
		}
		sc.close();
	}
}