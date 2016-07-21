package namoo.nara.town.entity;

public class User {
    //
    private String usid;
    private String password;
    private String name;
    
    public static User getExample() {
        //
        User user = new User();
        user.setUsid("kwlee");
        user.setPassword("1234");
        user.setName("LeeKiWang");
        return user;
    }
    
    public String getUsid() {
        return usid;
    }
    public void setUsid(String usid) {
        this.usid = usid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
