package model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity(name = "viewings")
public class Viewing {
    @Id
    @JoinColumn(name = "artpiece_id")
    @ManyToOne
    private ArtPiece artPiece;

    @Id
    @JoinColumn(name = "visitor_id")
    @ManyToOne
    private Visitor visitor;

    @Id
    @Column(name = "view_date")
    private LocalDate viewDate;

    @Column(name = "score")
    private int score;


    @JoinTable(
            name = "members",
            joinColumns = @JoinColumn(name = "museum_id"),
            inverseJoinColumns = @JoinColumn(name = "visitor_id")
    )

    public void setArtPiece(ArtPiece artPiece) {
        this.artPiece = artPiece;
    }

    public ArtPiece getArtPiece() {
        return artPiece;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public LocalDate getViewDate() {
        return viewDate;
    }

    public void setViewDate(LocalDate viewDate) {
        this.viewDate = viewDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Viewing{" +
                "artPiece=" + artPiece +
                ", visitor=" + visitor +
                ", viewDate=" + viewDate +
                ", score=" + score +
                '}';
    }
}
