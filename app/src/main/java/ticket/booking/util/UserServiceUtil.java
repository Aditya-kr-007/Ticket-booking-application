
package ticket.booking.util;

import org.mindrot.jbcrypt.BCrypt;

    public class UserServiceUtil
    {
        public static String hashPassword(String plainPassword) {
            return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
        }

        public static boolean checkPassword(String plainPassword, String hashedPassword) {
            if (plainPassword == null || hashedPassword == null || hashedPassword.isBlank()) {
                return false;
            }

            try {
                return BCrypt.checkpw(plainPassword, hashedPassword);
            } catch (IllegalArgumentException ex) {
                return false;
            }
        }
    }
