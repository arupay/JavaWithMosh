public class Friend {
    String name;

    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void getNumberOfFriends(){
        System.out.println("Your number of friends is: " + numberOfFriends);
    }
}
