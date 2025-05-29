package lesson09.code.bookWithAuthor;

public class Author {
    private String authorName;
    private String authorInfo;

    public Author(String authorName, String authorInfo) {
        this.authorName = authorName;
        this.authorInfo = authorInfo;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorInfo() {
        return authorInfo;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorInfo='" + authorInfo + '\'' +
                '}';
    }
}
