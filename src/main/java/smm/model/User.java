package smm.model;

public class User {
    private String id;

    private Long createdatetime;

    private Long modifydatatime;

    private String name;

    private String pwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getCreatedatetime() {
        return createdatetime;
    }

    public void setCreatedatetime(Long createdatetime) {
        this.createdatetime = createdatetime;
    }

    public Long getModifydatatime() {
        return modifydatatime;
    }

    public void setModifydatatime(Long modifydatatime) {
        this.modifydatatime = modifydatatime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }
}