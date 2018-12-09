public class TTK_Login {
public TTK_Login() { 

    }
    public boolean checkUsername(String tempUsername, TTK_User List) {
         return userlist.checkUserName(tempUsername); 
         }
 public boolean LogInUser(String tempUsername, String tempPassword, TTK_User List) {
         return userlist.allowlogin(tempUsername,tempPassword); 
    	
	}
     }
 