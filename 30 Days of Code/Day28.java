import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class User implements Comparable<User> {

    private String firstName;

    private String email;

    public User(String firstName, String email) {
        this.firstName = firstName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public int compareTo(User otherUser) {
        return firstName.compareTo(otherUser.firstName);
    }

    public String toString() {
        return firstName;
    }
}

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<User> users = new ArrayList<>();

        for(int NItr = 0 ; NItr < N ; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            users.add(new User(firstNameEmailID[0], firstNameEmailID[1]));
        }

        Collections.sort(users);

        Pattern p = Pattern.compile("@gmail.com$");

        for(User u : users) {
            Matcher m = p.matcher(u.getEmail());

            if(m.find()) {
                System.out.println(u);
            }
        }

        scanner.close();
    }
}
