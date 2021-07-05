package G13.NextBase.tests.US9;

//US9. As a user, I should be able to send an event.

import org.testng.annotations.Test;

public class AC1 {

    // 1. Verify users can send events by clicking "EVENT" tab with at least an event name.
    @Test
    public void login(){
        LoginNextBase login = new LoginNextBase();
        login.loginNextBase();
    }

}
