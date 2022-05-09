package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "artpieces")
    public class ArtPiece {
        @Id
        @Column(name = "artpiece_id")
        private int artpieceId;

        @Column(name = "title")
        private String name;

        @Column(name = "artist")
        private String creator;

         @Column(name = "creation_date")
         private LocalDate createDate;

        // The bidirectional link back to the parent Museum.
        @ManyToOne
        @JoinColumn(name = "building_id")
        private Building building;

        @ManyToOne
        @JoinColumn(name = "museum_id")
        private Museum museum;

        public ArtPiece() {
        }

        public ArtPiece(int artpieceId, String name,String creator, Building building, LocalDate cDate) {
            this.artpieceId = artpieceId;
            this.name = name;
            this.creator = creator;
            this.building = building;
            this.createDate = cDate;
        }

        @Override
        public String toString() {
            return "Artpiece " + name + " (ID " + artpieceId + ")";
        }

        public int getArtpieceId() {
            return artpieceId;
        }

        public void setArtpieceId(int artpieceId) {
            this.artpieceId = artpieceId;
        }

        public String getTitle() {
            return name;
        }

        public void setTitle(String name) {
            this.name = name;
        }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public String getArtist() {
            return creator;
        }

        public void setArtist(String name) {
            this.creator = name;
        }


        public Building getBuilding() {
            return building;
        }

        public void setBuilding(Building building) {
            this.building = building;
        }

}

