import java.io.*;
import java.util.*;

public class number1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean college = true;
		boolean firstTime = true;
		boolean fail = false;
		boolean startOver = false;

		int choice = 0;
		int x = 50;


		while (college){

			if (firstTime){
				//welcome to college
				System.out.println("You are a freshman in college.\nMake good choices, and try your best to stay in school.\n");
			}
			if (fail){
				//try again
				System.out.println("You are once again a freshman in college.\nTry harder this time.\n");
			}

			//start situation 1

			System.out.println("You are sitting in a room with 200 other freshman taking a mandatory general ed course, 'The History of the Jarls of Whiterun.'\nIt is extremely boring. Do you:\n1. Use laptop to take notes\n2. Play The Elder Scrolls V: Skyrim\n3. Go on Facebook");

			choice = in.nextInt();
			x = 50;

			if (choice == 1){

				//take notes +35%

				x += 35;
			}
			if (choice == 2){

				//skyrim -25%

				x -= 25;
			}
			if (choice == 3){

				//facebook -25%

				x -= 25;
			}

			//start situation 1.5

			System.out.println("It's almost time for the class to end. You know that the lunch hall is packed by the time you get there. Do you:\n1. Leave class early\n2. Stay until the time is up");

			choice = in.nextInt();

			if (choice == 1){

				//leave early -10%

				x -= 10;
			}
			if (choice == 2){

				//stay +10%

				x += 10;
			}

			//pass/fail

			int random = (int) ((Math.random()*100) + 1);

			if (random > x){

				System.out.println("The choices you have made have caused you to fail and drop out of college.\nYou will move back in with your parents.");
				fail = true;
				firstTime = false;
				startOver = true;
			}
			if (random <= x){

				System.out.println("You have passed this class. Good job.");
				startOver = false;
			}

			if (startOver == false){

				//start situation 2
				System.out.println("There is a project due in two weeks for your 'Experimental Art and Jazz Culture' class. Do you:\n1. Research while on Facebook\n2. Begin project early\n3. Ignore project");

				choice = in.nextInt();
				x = 50;

				if (choice == 1){

					//research + facebook + 10

					x += 10;
				}
				if (choice == 2){

					//begin project early + 30

					x += 30;
				}
				if (choice == 3){

					//ignore - 20

					x -= 20;
				}

				//start 2.5
				System.out.println("The project is due in three hours. Do you:\n1. Make some finishing touches\n2. Leave project as is");

				choice = in.nextInt();

				if (choice == 1){

					//finishing touches + 5

					x += 5;
				}
				if (choice == 2){

					//leave as is - 5

					x -= 5;
				}

				//pass/fail

				random = (int) ((Math.random()*100) + 1);

				if (random > x){

					System.out.println("The choices you have made have caused you to fail and drop out of college.\nYou will move back in with your parents.");
					fail = true;
					firstTime = false;
					startOver = true;
				}
				if (random <= x){

					System.out.println("You have passed this class. Good job.");
					startOver = false;
				}

				if (startOver == false){
					//start situation 3

					System.out.println("Your class, 'The Evolution of Basket-Weaving and You' starts in ten minutes. However, you have just met\nan attractive girl on the campus bus. Do you:\n1. Go get a coffee with her at the campus coffee shop and skip class\n2. Exchange information with her and be ten minutes late\n3. Run to class and be on time");
					choice = in.nextInt();
					x = 50;

					if (choice == 1){

						//go to coffee -40

						x -= 40;
					}
					if (choice == 2){

						//exchange info -10

						x -= 10;
					}
					if (choice == 3){

						//go to class + 10

						x += 10;
					}

					//start 3.5
					System.out.println("The class period is over. Do you:\n1. Spend time with the girl\n2. Go study");

					choice = in.nextInt();

					if (choice == 1){

						//girl -10

						x -= 10;
					}
					if (choice == 2){

						//study +20

						x += 20;
					}

					//pass/fail

					random = (int) ((Math.random()*100) + 1);

					if (random > x){

						System.out.println("The choices you have made have caused you to fail and drop out of college.\nYou will move back in with your parents.");
						fail = true;
						firstTime = false;
						startOver = true;
					}
					if (random <= x){

						System.out.println("You have passed this class. Good job.");
						startOver = false;
					}

					if (startOver == false){
						//start situation 4

						System.out.println("You have a test in 'Advanced Physics of Twirling.' Do you:\n1. Study\n2. Play Xbox\n3. Video chat with an old friend");
						choice = in.nextInt();
						x = 50;

						if (choice == 1){

							//study +30

							x += 30;
						}
						if (choice == 2){

							//xbox -20

							x -= 20;
						}
						if (choice == 3){

							//videochat -10

							x -= 10;
						}

						//start 3.5
						System.out.println("It is lunch. Your test is next period. Do you:\n1. Go out to lunch with some friends\n2. Study alone");

						choice = in.nextInt();

						if (choice == 1){

							//lunch -10

							x -= 10;
						}
						if (choice == 2){

							//study +20

							x += 20;
						}

						//pass/fail

						random = (int) ((Math.random()*100) + 1);

						if (random > x){

							System.out.println("The choices you have made have caused you to fail and drop out of college.\nYou will move back in with your parents.");
							fail = true;
							firstTime = false;
							startOver = true;
						}
						if (random <= x){

							System.out.println("You have passed this class. Good job.");
							startOver = false;
						}

						if (startOver == false){
							
							//start situation 5
							//2. The paper is due tomorrow. improve on introduction and conclusion, or stop working?
							
							System.out.println("You have a 50-page paper due next month for 'Integrated Biochemiphysics and Cheese.' Do you:\n1. Go to a big party\n2. Pull an all-nighter researching and relax for a week\n3. Research some each day");
							choice = in.nextInt();
							x = 50;

							if (choice == 1){

								//party -30

								x -= 30;
							}
							if (choice == 2){

								//all-nighter +20

								x += 20;
							}
							if (choice == 3){

								//research each day +40

								x += 40;
							}

							//start 3.5
							System.out.println("The paper is due tomorrow. Do you:\n1. Revise your introduction and conclusion\n2. Leave it alone");

							choice = in.nextInt();

							if (choice == 1){

								//revise +10

								x += 10;
							}
							if (choice == 2){

								//leave it -10

								x -= 10;
							}

							//pass/fail

							random = (int) ((Math.random()*100) + 1);

							if (random > x){

								System.out.println("The choices you have made have caused you to fail and drop out of college.\nYou will move back in with your parents.");
								fail = true;
								firstTime = false;
								startOver = true;
							}
							if (random <= x){

								System.out.println("You have passed this class, and completed your first year of college, congratulations! You decide that, as a reward, you will visit Jamaica for vacation.");
								
							}
							
							if (startOver == false){
								
								//start vacation & situation 6
								System.out.println("You are now in Jamaica, and decide to take a trip with a discount vacation company- Jambo's Jamaican Jailmonia Tours. Unfortunately, the helicopter is out of gasoline. The group leader, Jambo, asks what you'd like to do: \n1- Walk \n2- Take Jeep");
	
								choice = in.nextInt();
								x = 50;

								if (choice == 1){

									//walk

									x -= 30;
								}
								if (choice ==2){

									//jeep

									x += 20;
								}

								//start 6.5
								System.out.println("You have arrived at your destination, but due to the not having a helicopter it is now night time. You must set up camp, and the tour guide is offering to share his tent. What will you do?: \n1- Share tent with Jambo \n2- Stay alone");

								choice = in.nextInt();

								if (choice == 1){

									//share

									x += 20;
								}
								if (choice == 2){

									//alone

									x -= 10;
								}

								//live/die

								random = (int) ((Math.random()*100) + 1);

								if (random > x){

									System.out.println("The choices you have made have caused you to die.\nYou will now restart.");
									fail = true;
									firstTime = false;
									startOver = true;
								}

								if (startOver == false){
									
									//start situation 7
									
									System.out.println("You are rudely awoken in the middle of the night to the sounds of rustling around the campsite. You go outside and notice bandits stealing from your food stash. What will you do?: \n1- Tell Jambo \n2- Go back into the tent \n3- Throw a stick and run back to the tent");
									choice = in.nextInt();
									x = 50;

									if (choice == 1){

										//tell jambo

										x -= 30;
									}
									if (choice == 2){

										//go back to tent

										x += 20;
									}
									if (choice == 3){

										//throw a stick at thieves

										x -= 40;
									}

									//start 7.5
									System.out.println("Before you are able to get back to the tent, the bandits grab ahold of your shirt's collar. They are threatening to call in backup if you do not give them everything in your pockets. You realize you have bear mace in your right pocket. What will you do?: \n1- Bear mace them \n2- Give them bear mace");

									choice = in.nextInt();

									if (choice == 1){

										//attack

										x += 50;
									}
									if (choice == 2){

										//submit

										x -= 50;
									}

									//live/die

									random = (int) ((Math.random()*100) + 1);

									if (random > x){

										System.out.println("The choices you have made have caused you to die.\nYou will now restart.");
										fail = true;
										firstTime = false;
										startOver = true;
									}


									if (startOver == false){
										
										//start situation 8
										//
										
										System.out.println("The bandits have ran away and Jambo decides it's a perfect day for a tour of the jungle. The group begins the trip, and some time later you realize you have been spacing out and have veered off the trail. A tri-fork in the road lies in front of you. What will you do? \n1- Go left \n2- Go right \n3- Go straight");
										choice = in.nextInt();
										x = 50;

										if (choice == 1){

											//left

											x -= 30;
										}
										if (choice == 2){

											//right

											x += 20;
										}
										if (choice == 3){
											
											//straight

											x += 40;
										}

										//start 8.5
										System.out.println("On your path, you encounter a Jamaican Mudcrab- a crustacean indigenous to Jamaica. While he is small, he is fearsome, and snaps his claws at you with massive force, striking fear into your heart. What will you do?: \n1- Fight it \n2- Flee");

										choice = in.nextInt();

										if (choice == 1){

											//fight

											x += 10;
										}
										if (choice == 2){

											//flee

											x -= 10;
										}

										//live/die

										random = (int) ((Math.random()*100) + 1);

										if (random > x){

											System.out.println("As you are running, the mudcrab grabs your pantleg and you fall. You can do nothing but watch as you are consumed by the beast.\nYou will now restart.");
											fail = true;
											firstTime = false;
											startOver = true;
										}


										if (startOver == false){
											
											//start situation 9
											
											System.out.println("Several hours later, you find yourself miraculously regrouped with Jambo and the rest of the group. As you are walking back to camp, you see a faint light in the trees. What will you do?: \n1- Get closer \n2- Get further \n3- Stay where you are");
											choice = in.nextInt();
											x = 50;

											if (choice == 1){

												//closer

												x -= 30;
											}
											if (choice == 2){

												//further

												x += 20;
											}
											if (choice == 3){

												//stay

											}

											//start 9.5
											System.out.println("The shadow slowly emerges from the foliage, revealing its identity- the mother of the Mudcrab. Jambo is mesmerized by the elegance of its hard shell and is unable to move. With blinding speed, the crustacean charges at the tour guide. What will you do?: \n1- Push Jambo out of the way \n2- Scream loudly at mudcrab  ");

											choice = in.nextInt();

											if (choice == 1){

												//push jambo

												x += 5;
											}
											if (choice == 2){

												//scream

												x += 30;
											}

											//live/die

											random = (int) ((Math.random()*100) + 1);

											if (random > x){

												System.out.println("Jambo falls victim to the mudcrab menace. It's a shame you couldn't have done more. \nYou will now restart.");
												fail = true;
												firstTime = false;
												startOver = true;
											}


											if (startOver == false){
												
												//start situation 10
												//
												
												System.out.println("At this point, everyone is exhausted and ready to head back home. Jambo is offended by this, and begins staring up at the full moon and breathe heavily. In the blink of an eye, he morphs into a werewolf. He lets out a shrieking howl, deafening the group. What will you do?: \n1- Use bear mace \n2- Run \n3- Fall down and cry");
												choice = in.nextInt();
												x = 50;

												if (choice == 1){

													//bear mace

													x += 35;
												}
												if (choice == 2){

													//run

													x += 10;
												}
												if (choice == 3){

													//cry

													x -= 40;
												}

												//start 10.5
												System.out.println("The ex-tour-guide sees a group of aboriginal Jamaican witch/werewolf hunters. They ask if you would like to join them on their hunt. What will you do?: \n1- Join hunt \n2- Head back home with group");

												choice = in.nextInt();

												if (choice == 1){

													//join hunt

													x += 30;
												}
												if (choice == 2){

													//go back

													x -= 30;
												}

												//live/die

												random = (int) ((Math.random()*100) + 1);

												if (random > x){

													System.out.println("Out of the darkness, you are assaulted by Jambo and killed.\nYou will now restart.");
													fail = true;
													firstTime = false;
													startOver = true;
												}
												if (random <= x){

													System.out.println("You have escaped from Jamaica- this time. Congratulations.");
												
												}


						}
					}
				}
			}
		}
	}						
}
				}
			}
		}
	}
}