import java.io.*;
import java.util.*;

public class sat {


	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int guide = 1;
		int begin = 1;
		int choice;
		int numberCorrect = 0;
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int q5 = 0;
		int q6 = 0;
		int q7 = 0;
		int q8 = 0;
		int q9 = 0;
		int q10 = 0;
		int q11 = 0;
		int q12 = 0;
		int q13 = 0;
		int q14 = 0;
		int q15 = 0;
		
		
		while (guide == 1){
			
			//intro, description and main menu
			System.out.println("This is a study guide for the World History SAT Subject Test. \nThe real test will be an hour long and will contain 95 questions, \nbut this practice test is not timed and only has 15 questions. \nYou will receive your score at the end of the practice test.");
			System.out.println("");
			System.out.println("To begin, enter 1.");
			System.out.println("To exit, enter 0.");
			
			begin = in.nextInt();
			
			//start guide
			while (begin == 1){
				
				numberCorrect = 0;
				
				//begin test q1-q15
				//question 1
				q1();
				
				choice = in.nextInt();
				
				if (choice == 2){
					
					//add one to number correct
					numberCorrect = numberCorrect + 1;
					//mark question 1 as being correct
					q1 = 1;
				}
				
				//question 2
				q2();
				
				choice = in.nextInt();
				
				if (choice == 2){
					
					numberCorrect = numberCorrect + 1;
					q2 = 1;
				}
				//question 3
				q3();
				
				choice = in.nextInt();
				
				if (choice == 3){
					
					numberCorrect = numberCorrect + 1;
					q3 = 1;
				}
				//question 4
				q4();
				
				choice = in.nextInt();
				
				if (choice == 3){
					
					numberCorrect = numberCorrect + 1;
					q4 = 1;
				}
				//question 5
				q5();
				
				choice = in.nextInt();
				
				if (choice == 1){
					
					numberCorrect = numberCorrect + 1;
					q5 = 1;
				}
				//question 6
				q6();
				
				choice = in.nextInt();
				
				if (choice == 1){
					
					numberCorrect = numberCorrect + 1;
					q6 = 1;
				}
				//question 7
				q7();
				
				choice = in.nextInt();
				
				if (choice == 1){
					
					numberCorrect = numberCorrect + 1;
					q7 = 1;
				}
				//question 8
				q8();
				
				choice = in.nextInt();
				
				if (choice == 4){
					
					numberCorrect = numberCorrect + 1;
					q8 = 1;
				}
				//question 9
				q9();
				
				choice = in.nextInt();
				
				if (choice == 5){
					
					numberCorrect = numberCorrect + 1;
					q9 = 1;
				}
				//question 10
				q10();
				
				choice = in.nextInt();
				
				if (choice == 5){
					
					numberCorrect = numberCorrect + 1;
					q10 = 1;
				}
				//question 11
				q11();
				
				choice = in.nextInt();
				
				if (choice == 5){
					
					numberCorrect = numberCorrect + 1;
					q11 = 1;
				}
				//question 12
				q12();
				
				choice = in.nextInt();
				
				if (choice == 2){
					
					numberCorrect = numberCorrect + 1;
					q12 = 1;
				}
				//question 13
				q13();
				
				choice = in.nextInt();
				
				if (choice == 4){
					
					numberCorrect = numberCorrect + 1;
					q13 = 1;
				}
				//question 14
				q14();
				
				choice = in.nextInt();
				
				if (choice == 5){
					
					numberCorrect = numberCorrect + 1;
					q14 = 1;
				}
				//question 15
				q15();
				
				choice = in.nextInt();
				
				if (choice == 2){
					
					numberCorrect = numberCorrect + 1;
					q15 = 1;
				}
				//results
				System.out.println("You have reached the end of the test. Here are your results:");
				System.out.println("");
				
				//perfect score
				if (numberCorrect == 15){
					
					System.out.println(".__       ._       ,    __.             |");
					System.out.println("[__) _ ._.|, _  _.-+-  (__  _. _ ._. _  |");
					System.out.println("|   (/,[  | (/,(_. |   .__)(_.(_)[  (/, *");
					System.out.println("");
					System.out.println("15/15 or 100%");
					System.out.println("Try again anyway?");
					System.out.println("1 - Yes");
					System.out.println("0 - No");
					
					choice = in.nextInt();
					
					if (choice == 0){
						break;
					}
				//not-perfect score
				}else{
					
					//display number correct and percent correct
					System.out.println("Number correct: " + numberCorrect + "/15");
					int percentCorrect = ((numberCorrect*100)/15);
					System.out.println("Percent correct: " + percentCorrect + "%");
					
					System.out.println("Question(s) incorrect:");
					
					//show incorrect questions
					if (q1 == 0){
						
						System.out.println("Question 1");
					}
					if (q2 == 0){
						
						System.out.println("Question 2");
					}
					if (q3 == 0){
						
						System.out.println("Question 3");
					}
					if (q4 == 0){
						
						System.out.println("Question 4");
					}
					if (q5 == 0){
						
						System.out.println("Question 5");
					}
					if (q6 == 0){
						
						System.out.println("Question 6");
					}
					if (q7 == 0){
						
						System.out.println("Question 7");
					}
					if (q8 == 0){
						
						System.out.println("Question 8");
					}
					if (q9 == 0){
						
						System.out.println("Question 9");
					}
					if (q10 == 0){
						
						System.out.println("Question 10");
					}
					if (q11 == 0){
						
						System.out.println("Question 11");
					}
					if (q12 == 0){
						
						System.out.println("Question 12");
					}
					if (q13 == 0){
						
						System.out.println("Question 13");
					}
					if (q14 == 0){
						
						System.out.println("Question 14");
					}
					if (q15 == 0){
						
						System.out.println("Question 15");
					}
					
					System.out.println("");
					System.out.println("Try again?");
					System.out.println("1 - Yes");
					System.out.println("0 - No");
					
					begin = 1;
					choice = in.nextInt();
					
					if (choice == 0){
						break;
					}
				}
				
				
			}
			
			break;
		}
				
	
	}
	public static void q1()
	{
		System.out.println("The Maya of Mesoamerica are best known for their achievements in:");
		System.out.println("1) Ship building and navigation");
		System.out.println("2) Mathematics and astronomy");
		System.out.println("3) Animal husbandry");
		System.out.println("4) Carpentry");
		System.out.println("5) Literature");
	}
	public static void q2()
	{
		System.out.println("The rapid colonization of Africa by the European powers after 1880 was motivated primarily by:");
		System.out.println("1) the demand for slaves to cultivate New World cotton and sugar");
		System.out.println("2) the desire for new markets, raw materials, and strategic advantage");
		System.out.println("3) the need to tap the hydroelectric potential of the African rivers");
		System.out.println("4) the heavy demand for African workers in European factories");
		System.out.println("5) heightened interest by Europeans in tourism and big-game hunting");
	}
	public static void q3()
	{
		System.out.println("Social Darwinists such as Herbert Spencer argued that");
		System.out.println("1) Competition allows individuals to develop their talents and meet their needs.");
		System.out.println("2) Competition and cooperation are equally important in building a productive and compassionate society.");
		System.out.println("3) Human societies progress through competition, since the strong survive and the weak perish.");
		System.out.println("4) Human societies progress through cooperation, a natural instinct that should be encouraged.");
		System.out.println("5) God predetermines that some members of society are fated to succeed and some members are fated to fail.");
	}

	public static void q4()
	{
		System.out.println("Differences between which two religions contributed to violent conflicts " +
				"in India during and after the struggle for independence in 1947?");
		System.out.println("1) Hinduism and Buddhism");
		System.out.println("2) Islam and Christianity");
		System.out.println("3) Hinduism and Islam");
		System.out.println("4) Islam and Buddhism");
		System.out.println("5) Hinduism and Jainism");
	}

	public static void q5()
	{
		System.out.println("Which of the following is the correct chronological order, from earliest to latest," +
				"of the origins of the religions listed below?");
		System.out.println("1) Buddhism, Christianity, Islam");
		System.out.println("2) Buddhism, Islam, Christianity");
		System.out.println("3) Christianity, Buddhism, Islam");
		System.out.println("4) Christianity, Islam, Buddhism");
		System.out.println("5) Islam, Christianity, Buddhism");
	}

	public static void q6()
	{
		System.out.println("The Great Leap Forward in China was primarily designed to do which of the following?");
		System.out.println("1) Achieve rapid industrialization of the Chinese economy.");
		System.out.println("2) Oust the imperial government.");
		System.out.println("3) Promote capitalism within the Chinese economy.");
		System.out.println("4) Strengthen the Chinese so they could expel the Japanese from Manchuria.");
		System.out.println("5) Expand Chinese influence in the Third World.");
	}

	public static void q7()
	{
		System.out.println("The Silk Routes were important in ancient times because they");
		System.out.println("1) facilitated the exchange of goods and ideas between China and the Roman Empire");
		System.out.println("2) allowed gold and silver mined in China to be traded for European furs and wool cloth");
		System.out.println("3) provided trade links between the people of Siberia and the people living on islands in the Bering Sea");
		System.out.println("4) provided a conduit for trade in silk, porcelain, and costly gems between China and Japan");
		System.out.println("5) allowed carts and carriages to travel on paved roads across northern Asia as far west as the Caspian Sea");
	}

	public static void q8()
	{
		System.out.println("The encomienda system of colonial Spanish America most closely resembled the European practice of:");
		System.out.println("1) absolutism");
		System.out.println("2) primogeniture");
		System.out.println("3) patronage");
		System.out.println("4) manorialism");
		System.out.println("5) nepotism");
	}

	public static void q9()
	{
		System.out.println("In early modern Europe, governments sought to increase national wealth" +
				"and maintain a favorable balance of trade through government intervention by advocating");
		System.out.println("1) Liberalism");
		System.out.println("2) Capitalism");
		System.out.println("3) Socialism");
		System.out.println("4) Utilitarianism");
		System.out.println("5) Mercantilism");
	}

	public static void q10()
	{
		System.out.println("When the Portuguese sailed around the Cape of Good Hope and entered the" +
				"Indian Ocean in the late fifteenth century, they found");
		System.out.println("1) numerous ports under the control of merchants from Genoa.");
		System.out.println("2) colonial domination of ports and sea lanes by the navy of the Ottoman Empire.");
		System.out.println("3) a region where sea trade had not yet developed.");
		System.out.println("4) a region defended and patrolled by fleets of the Chinese navy.");
		System.out.println("5) a network of long distance trade routes dominated by Muslim merchants.");
	}

	public static void q11()
	{
		System.out.println("Which of the following is an accurate statement about the right of Latin American women to vote?");
		System.out.println("1) It was won when Latin America gained its independence.");
		System.out.println("2) It has typically been won as a result of mass political action and civil disobedience.");
		System.out.println("3) It has been won only where socialist or Marxist governments have come to power.");
		System.out.println("4) It has been tied to property ownership in most countries.");
		System.out.println("5) It was generally won by the mid-1900's.");
	}

	public static void q12()
	{
		System.out.println("Which of the following was an important virtue in Confucianism?");
		System.out.println("1) Warlike prowess");
		System.out.println("2) Filial piety");
		System.out.println("3) Public charity");
		System.out.println("4) Poverty");
		System.out.println("5) Manual labor");
	}

	public static void q13()
	{
		System.out.println("Early Christians developed the monastic ideal as a means of counteracting");
		System.out.println("1) government interference");
		System.out.println("2) heresy");
		System.out.println("3) competition from Eastern religions");
		System.out.println("4) worldliness");
		System.out.println("5) persecution");
	}

	public static void q14()
	{
		System.out.println("Which of the following was characteristic of the physical environments of" +
				"early river-valley civilizations in the Near East?");
		System.out.println("1) Cool summer temperatures encouraged the production of grain crops.");
		System.out.println("2) Tropical forests along the riverbanks provided the population with most of its food.");
		System.out.println("3) The rivers maintained a steady flow year-round, fed by melting mountain glaciers.");
		System.out.println("4) The rivers flowed through deep mountain valleys, which sheltered early civilizations.");
		System.out.println("5) Rainfall was low, requiring irrigation of crops with river water.");
	}

	public static void q15()
	{
		System.out.println("Most of the noncitizens currently residing in Western European countries" +
				"originally came to Western Europe to");
		System.out.println("1) consolidate the European Economic Community agreements");
		System.out.println("2) find employment");
		System.out.println("3) do graduate work in the universities");
		System.out.println("4) participate in the democratic political process");
		System.out.println("5) avoid forced military conscription in their native land");
	}



}

