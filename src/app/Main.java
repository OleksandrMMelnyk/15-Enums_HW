/*За допомогою типу Enum реалізуйте функціонал дорожнього
світлофора, який має три кольори світла:
червоний - стояти,
жовтий - приготуватися,
зелений - рухатися */

package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getOutput(getResult(getData()));
    }

    private static TrafficLight getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one of RED, YELLOW, GREEN: ");
        return TrafficLight.valueOf(scanner.nextLine().trim());
    }

    private static String getResult(TrafficLight light) {
        return switch (light) {
            case RED -> "STAND!!!";
            case YELLOW -> "GET READY!!!";
            case GREEN -> "GO!!!";
        };
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
