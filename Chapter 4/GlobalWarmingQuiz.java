import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int answer;
        int score = 0;

        System.out.println("GLOBAL WARMING FACTS QUIZ");

        System.out.println("\n1. What is the main cause of recent global warming?");
        System.out.println("1. Changes in Earth's orbit");
        System.out.println("2. Human activities that increase greenhouse gases");
        System.out.println("3. Changes in ocean currents alone");
        System.out.println("4. Increased volcanic activity alone");
        answer = input.nextInt();
        if (answer == 2) score++;

        System.out.println("\n2. Which gas contributes significantly to human-caused global warming?");
        System.out.println("1. Oxygen");
        System.out.println("2. Helium");
        System.out.println("3. Carbon dioxide");
        System.out.println("4. Neon");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("\n3. Which factor contributes to uncertainty in climate projections?");
        System.out.println("1. Future human emissions");
        System.out.println("2. Natural climate variability");
        System.out.println("3. Climate model limitations");
        System.out.println("4. All of the above");
        answer = input.nextInt();
        if (answer == 4) score++;

        System.out.println("\n4. What is a major source of evidence for global warming?");
        System.out.println("1. Long-term temperature records");
        System.out.println("2. A single day's weather");
        System.out.println("3. One unusually cold winter");
        System.out.println("4. A single local storm");
        answer = input.nextInt();
        if (answer == 1) score++;

        System.out.println("\n5. Which statement best describes scientific disagreement about climate change?");
        System.out.println("1. Scientists agree that climate never changes");
        System.out.println("2. No evidence of warming exists");
        System.out.println("3. There is debate about some details, impacts, and projections");
        System.out.println("4. Scientists have no climate models");
        answer = input.nextInt();
        if (answer == 3) score++;

        System.out.println("\nYour score: " + score + " out of 5");

        if (score == 5)
            System.out.println("Excellent");
        else if (score == 4)
            System.out.println("Very good");
        else
            System.out.println("Time to brush up on your knowledge of global warming");

        System.out.println("\nSources:");
        System.out.println("1. https://science.nasa.gov/climate-change/");
        System.out.println("2. https://www.ipcc.ch/");
        System.out.println("3. https://www.noaa.gov/climate");

        input.close();
    }
}