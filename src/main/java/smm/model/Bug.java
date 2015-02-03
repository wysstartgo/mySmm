package smm.model;

public class Bug {
    private String id;

    private Long createdatetime;

    private String name;

    private String note;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}