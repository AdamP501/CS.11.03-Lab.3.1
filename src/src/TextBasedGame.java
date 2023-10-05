import java.util.Scanner;
import java.util.Random;
public class TextBasedGame {

    public static void main(String[] args) {


        String userName = askName();
        System.out.println("Hello " + userName + ", you are about to live the life of Mathew Bamo, a CIS student.");
        System.out.println("The aim of this game is to make as many good choices as possible and to be made fun of by your friends the lest amount of times possible");
        System.out.println("Every time you make a bad choice, you lose 1 good choice.");
        System.out.println("In order to win, you must finish with 6 good choices and be made fun of by your friends less than 3 times.");

        int score1 = morning();
        int score2 = breakTime();
        int score3 = eL();
        int score4 = mathClass();
        int score5 = lunch();
        int score6 = period4();
        int score7 = basketball();
        int score8 = homework();
        int score9 = bedTime();
        int choiceScore = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9;
        int madeFunOf = 0;
        if(score2 == -1)
        {
            madeFunOf +=1;
        }
        if(score3 == -1)
        {
            madeFunOf +=1;
        }
        if(score7 == -1)
        {
            madeFunOf +=1;
        }
        System.out.println("\nYou made a total of " + choiceScore + " good choices and was made fun of by your friends a total of " + madeFunOf + " time(s).");
        if(choiceScore >= 6 && madeFunOf < 3)
        {
            System.out.println("Because you made 6 good choices and were made fun of less than 3 times, you win! Congratulations");
        }
        else if(choiceScore >= 6 && madeFunOf == 3)
        {
            System.out.println("You made 6 good choices but were made fun of 3 times, therefore you lose.");
        }
        else if(choiceScore < 6 && madeFunOf < 3)
        {
            System.out.println("You were made fun of less than 3 times but made less than 6 good choices, therefore you lose.");
        }
        else
        {
            System.out.println("You made less than 6 good choices and were made fun of 3 times, therefore you lose.");
        }





    }

    public static String askName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        return name;
    }

    public static int morning() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is 6:40. You need to catch the school bus at 7:00. Do you want to sleep or wake up?");
        String decision = scanner.nextLine();

        if (decision.equals("sleep")) {
            System.out.println("You wake up at 7:20 and miss the bus. You walk to school which results in you being 30 minutes late to first period. You miss out on material that is essential to your assessment.");
            return -1;
        }
        else {
            System.out.println("Good Choice. You make it to school at 7:40 and enter class on time.");
            return 1;
        }
    }

    public static int breakTime(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now break time and you go to the library to spend time with your friends. How many minutes are you going to spend in the library?");
        int decision = scanner.nextInt();
        if (decision <= 30)
        {
            System.out.println("Good choice. You spend " + decision + " minutes in the library, which allows you to get to assembly on time.");
            return 1;
        }
        else
        {
            System.out.println("You spent " + decision + " minutes in the library, which causes you to be late to assembly because you are only given 30 minutes of break time. Your friends make fun of you for walking into assembly late.");
            return -1;
        }
    }

    public static int eL()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now Extended Learning. Would you like to spend Extended Learning studying?");
        String decision = scanner.next();
        if (decision.equals("yes")) {
            System.out.println("Good choice. You go to Extended Learning and feel much more confident about your learning.");
            return 1;
        } else {
            System.out.println("Alright. Instead of studying, you sleep during Extended Learning. Your friend draws pictures on your face in your sleep and makes fun of you when you wake up.");
            return -1;
        }
    }

    public static int mathClass()
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        int rand1 = rand.nextInt(101);
        int rand2 = rand.nextInt(101);
        double rand3 = rand.nextInt(101);
        int rand4 = rand.nextInt(101);
        int rand5 = rand.nextInt(101);

        System.out.println("\nIt is now time for the math test.");
        System.out.println("Give a multiple of 5");
        int answer = scanner.nextInt();
        if (answer%5 == 0)
        {
            System.out.println("Correct, " + answer + " is a multiple of 5. Next question.");
            score += 1;
        }
        else {
            System.out.println("That is incorrect. Next question.");
        }

        System.out.println("What is " + rand1 + " multipled by " + rand2 + " ?");
        int answer2 = scanner.nextInt();
        if (answer2 == rand1*rand2)
        {
            System.out.println("Correct, " + answer2 + " is the right answer");
            score += 1;
        }
        else {
        System.out.println("That is incorrect. Next question.");
        }

        System.out.println("What is " + rand3 + " divided by 2?");
        String answer3 = scanner.next();
        double ans3 = Double.parseDouble(answer3);
        double realAnswer = (double) rand3/2;
        if (ans3 == realAnswer){
            System.out.println("Correct, " + answer3 + " is the right answer");
            score += 1;
        }
        else {
            System.out.println("That is incorrect. Next question.");
        }

        System.out.println("What is " + rand4 + " minus " + rand5 + "?");
        int answer4 = scanner.nextInt();
        if (answer4 == rand4-rand5)
        {
            System.out.println("Correct, " + answer4 + " is the right answer");
            score += 1;
        }
        else
        {
            System.out.println("That is incorrect.");
        }

        System.out.println("Your final score on the math test is " + score);

        return score;
    }

    public static int lunch()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now time for lunch time. Would you like to wait in line for lunch?");
        String decision = scanner.next();
        if (decision.equals("yes"))
        {
            System.out.println("Good choice. You spend 10 minutes waiting in line for lunch and have a healthy meal.");
            return 1;
        }
        else
        {
            System.out.println("You chosoe not to wait for lunch and instead eat a chocolate bar you packed at home. The chocolate bar is extremely delicious but your stomach gargles for the rest of lunch.");
            return -1;
        }
    }

    public static int period4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now time for period 4. You are given a worksheet to do for the rest of class. Do you choose to complete it?");
        String decision = scanner.next();
        if (decision.equals("yes")) {
            System.out.println("Good choice. You work productively in class and completed the worksheet. You finish school with one less piece of homework.");
            return 1;
        } else {
            System.out.println("Alright, instead of completing the worksheet, you spend period 4 gaming. When you get home, you will need to do more homework.");
            return -1;
        }
    }
    public static int basketball()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now 3:00 PM and school has ended. You have a basketball game at 4:00. Would you like to practise with your teammates before then?");
        String decision = scanner.next();
        if(decision.equals("yes"))
        {
            System.out.println("Good choice. You spend an hour training with your teammates and perform really well at the game, resulting in a victory for CIS.");
            return 1;
        }
        else
        {
            System.out.println("Instead of training with your teammates, you go down to the local 7-11 and eat some snacks. At the game, you make many mistakes and are unable to cooperate well with your teammates. Your friends make fun of you for missing 10 shots in the game.");
            return -1;
        }
    }

    public static int homework() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYou have finished your basketball game and now you are home. Would you like to complete your homework?");
        String decision = scanner.next();
        if (decision.equals("yes")) {
            System.out.println("Good choice. You complete your homework by 8:00 PM");
            return 1;
        } else {
            System.out.println("You choose not to complete your homework and you choose to play video games instead");
            return -1;
        }
    }

   public static int bedTime()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIt is now 10:00 PM. Would you like to sleep?");
        String decision = scanner.next();
        if(decision.equals("yes"))
        {
            System.out.println("Good choice. You get 8 hours of sleep, allowing you to wake up energised the next day.");
            return 1;
        }
        else
        {
            System.out.println("Instead of sleeping, you play video games until midnight, making you groggy in the morning.");
            return -1;
        }
    }
    }





