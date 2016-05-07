package ym.model;

import javax.persistence.*;

/**
 * Created by jiangyongming on 5/5/16.
 */
@Entity
@Table(name = "poetries", schema = "poet_db")
public class PoetriesModel {
    private int id;
    private Integer poetId;
    private String content;
    private String title;
    private PoetsModel poet;

    @ManyToOne
    public PoetsModel getPoet() {
        return poet;
    }

    public void setPoet(PoetsModel poet) {
        this.poet = poet;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "poet_id", nullable = true)
    public Integer getPoetId() {
        return poetId;
    }

    public void setPoetId(Integer poetId) {
        this.poetId = poetId;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 255)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoetriesModel that = (PoetriesModel) o;

        if (id != that.id) return false;
        if (poetId != null ? !poetId.equals(that.poetId) : that.poetId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (poetId != null ? poetId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }
}
