import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        boolean Active = true;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Welcome to the Lands of Hyaeprose");

        while (Active) {
            System.out.println(
                "Compendium. What do you wish to know?\n" +
                "[1]Overview\n[2]Regions\n[3]Champions\n[4]Creatures\n[5]Lore\n[6]Quit\n"
            );

            int choice = scanner1.nextInt();

            switch (choice) {
                case 1:
                    overview();
                    break;

                case 2:
                    Regions();
                    break;

                case 3:
                    Champions();
                    break;

                case 4:
                    Creatures();
                    break;

                case 5:
                    Lore();
                    break;

                case 6:
                    System.out.println("See you Later!");
                    Active = false;
                    break;

                default:
                    System.out.println("404 error");
            }
        }

        scanner1.close();
    }

    static void overview(){
        System.out.println("The world of Hyaeprose stands under the imperial golden sun.\nThose under her light are of the empire.\nFoul creatures roam the lands but our Holy Paladins will fight them off.\nMadmen turn into abominations and Madwomen to witches. When you find them, report to your local church.");
    }
    static void Regions(){
        System.out.println("These regions are in present Hyaeprose\n[1]Taeren\n[2]Dwarvholde\n[3]Arcadia\n[4]Minorus\n[5]The Great North\n[6]Dark Sea\n[7]Savage Lands\n");
    }
    static void Champions(){
        System.out.println("These champions once roam the lands. They have disappeared since.\n[1]Gareth - Champion of Light\n[2]Remeld - Mage Tower Master\n[3]Arcadia - Foreign Prince\n[4]Evhinasce - Elven companion to the hero\n[5]Daran - Troll Champion who helped fight the disaster\n");
    }
    static void Creatures(){
        System.out.println("Compendium pending");
    }
    static void Lore(){
        System.out.println("Compendium pending");
    }
};


