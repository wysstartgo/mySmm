package smm.model;

public class Online {
    private String id;

    private String ip;

    private Long logindatetime;

    private String loginname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Long getLogindatetime() {
        return logindatetime;
    }

    public void setLogindatetime(Long logindatetime) {
        this.logindatetime = logindatetime;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }
}