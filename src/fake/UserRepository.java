package fake;

import java.util.Map;

/**
 * Created by clouway on 11/17/15.
 */
public interface UserRepository {
    User getUserById(String id);
    void register(User user);
}
