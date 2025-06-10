public class Author {
    private String authorId;
    private String name;
    private String biography;

    public Author(String authorId, String name, String biography) {
        this.authorId = authorId;
        this.name = name;
        this.biography = biography;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public void updateAuthorInfo(String name, String biography) {
        setName(name);
        setBiography(biography);
    }
}