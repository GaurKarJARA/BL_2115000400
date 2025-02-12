import java.util.*;

class User {
    int userId;
    String name;
    List<Integer> friends;
    User next;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

class SocialMediaFriends {
    private User head;

    public void addUser(int userId, String name) {
        User newUser = new User(userId, name);
        newUser.next = head;
        head = newUser;
    }

    public void addFriend(int userId1, int userId2) {
        User user1 = findUser(userId1);
        User user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.friends.add(userId2);
            user2.friends.add(userId1);
        }
    }

    private User findUser(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void displayFriends(int userId) {
        User user = findUser(userId);
        if (user != null) {
            System.out.println(user.name + " Friends: " + user.friends);
        }
    }

    public static void main(String[] args) {
        SocialMediaFriends sm = new SocialMediaFriends();
        sm.addUser(1, "user1");
        sm.addUser(2, "user2");
        sm.addFriend(1, 2);
        sm.displayFriends(1);
    }
}