import java.util.Scanner;
public class WashingMachine {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the weight of clothes (grams): ");
int weight = scanner.nextInt();
System.out.print("Enter water level (L, M, H): ");
char waterLevel = scanner.next().toUpperCase().charAt(0);
if (weight < 0) {
System.out.println("INVALID INPUT");
} else if (weight == 0) {
System.out.println("Time Estimated: 0 minutes");
} else if (weight > 7000) {
System.out.println("OVERLOADED");
} else {
int time = 0;
if (waterLevel == 'L' && weight <= 2000) {
time = 25;
} else if (waterLevel == 'M' && weight > 2000 && weight <= 4000) {
time = 35;
} else if (waterLevel == 'H' && weight > 4000 && weight <= 7000) {
time = 45;
} else {
System.out.println("INVALID INPUT");
scanner.close();
return;
}
System.out.println("Time Estimated: " + time + " minutes");
}
scanner.close();
}
}
