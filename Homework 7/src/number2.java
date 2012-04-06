import java.io.*;
import java.util.*;

public class number2 {

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

								System.out.println("You have passed this class, and completed your fisrt year of college. Congratulations.");
								break;
							}

						}
					}
				}
			}
		}
	}

}
