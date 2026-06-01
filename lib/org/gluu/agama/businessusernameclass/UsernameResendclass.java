package org.gluu.agama.businessusernameclass;

import java.util.Map;
import org.gluu.agama.businessforgetusername.JansForgetUsername;

public abstract class UsernameResendclass {

    public abstract Map<String, String> getUserEntityByMail(String email);

    public abstract boolean sendUsernameEmail(String to, String username, String lang);

    public static UsernameResendclass getInstance() {
        return new JansForgetUsername();
    }
}
