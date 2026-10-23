import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");

            String name = parts[0].replace(".", "");

            if (name.contains("+")) {
                name = name.substring(0, name.indexOf("+"));
            }

            String newEmail = name + "@" + parts[1];

            set.add(newEmail);
        }

        return set.size();
    }
}