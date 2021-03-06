package gal.udc.fic.muei.tfm.dap.flipper.web.rest.dto;

import java.io.Serializable;
import java.util.UUID;


/**
 * A DTO for the PictureFound entity.
 *
 * This file is part of Flipper Open Reverse Image Search.

 Flipper Open Reverse Image Search is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Flipper Open Reverse Image Search is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Flipper Open Reverse Image Search.  If not, see <http://www.gnu.org/licenses/>.
 */
public class PictureFoundDTO implements Serializable {

    private UUID pictureSearch_id;

    private UUID picture_id;

    private String title;

    private String owner;

    private String created;

    private byte[] littlePictureFile;
    private byte[] mediumPictureFile;
    private byte[] bigPictureFile;

    private Float totalScore;
    private Float autocolorCorrelogramScore;
    private Float ceddScore;
    private Float colorHistogramScore;
    private Float colorLayoutScore;
    private Float edgeHistogramScore;
    private Float phogScore;

    public UUID getPicture_id() {
        return picture_id;
    }

    public void setPicture_id(UUID picture_id) {
        this.picture_id = picture_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public byte[] getLittlePictureFile() {
        return littlePictureFile;
    }

    public void setLittlePictureFile(byte[] littlePictureFile) {
        this.littlePictureFile = littlePictureFile;
    }

    public byte[] getMediumPictureFile() {
        return mediumPictureFile;
    }

    public void setMediumPictureFile(byte[] mediumPictureFile) {
        this.mediumPictureFile = mediumPictureFile;
    }

    public byte[] getBigPictureFile() {
        return bigPictureFile;
    }

    public void setBigPictureFile(byte[] bigPictureFile) {
        this.bigPictureFile = bigPictureFile;
    }

    public Float getAutocolorCorrelogramScore() {
        return autocolorCorrelogramScore;
    }

    public void setAutocolorCorrelogramScore(Float autocolorCorrelogramScore) {
        this.autocolorCorrelogramScore = autocolorCorrelogramScore;
    }

    public Float getCeddScore() {
        return ceddScore;
    }

    public void setCeddScore(Float ceddScore) {
        this.ceddScore = ceddScore;
    }

    public Float getColorHistogramScore() {
        return colorHistogramScore;
    }

    public void setColorHistogramScore(Float colorHistogramScore) {
        this.colorHistogramScore = colorHistogramScore;
    }

    public Float getColorLayoutScore() {
        return colorLayoutScore;
    }

    public void setColorLayoutScore(Float colorLayoutScore) {
        this.colorLayoutScore = colorLayoutScore;
    }

    public Float getEdgeHistogramScore() {
        return edgeHistogramScore;
    }

    public void setEdgeHistogramScore(Float edgeHistogramScore) {
        this.edgeHistogramScore = edgeHistogramScore;
    }

    public Float getPhogScore() {
        return phogScore;
    }

    public void setPhogScore(Float phogScore) {
        this.phogScore = phogScore;
    }

    public UUID getPictureSearch_id() {
        return pictureSearch_id;
    }

    public void setPictureSearch_id(UUID pictureSearch_id) {
        this.pictureSearch_id = pictureSearch_id;
    }

    public Float getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Float totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PictureFoundDTO)) return false;

        PictureFoundDTO that = (PictureFoundDTO) o;

        if (!getPictureSearch_id().equals(that.getPictureSearch_id())) return false;
        if (!getPicture_id().equals(that.getPicture_id())) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getOwner() != null ? !getOwner().equals(that.getOwner()) : that.getOwner() != null) return false;
        return !(getCreated() != null ? !getCreated().equals(that.getCreated()) : that.getCreated() != null);

    }

    @Override
    public int hashCode() {
        int result = getPictureSearch_id().hashCode();
        result = 31 * result + getPicture_id().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PictureFoundDTO{" +
            "totalScore=" + totalScore +
            ", autocolorCorrelogramScore=" + autocolorCorrelogramScore +
            ", ceddScore=" + ceddScore +
            ", colorHistogramScore=" + colorHistogramScore +
            ", colorLayoutScore=" + colorLayoutScore +
            ", edgeHistogramScore=" + edgeHistogramScore +
            ", phogScore=" + phogScore +
            ", owner='" + owner + '\'' +
            ", created=" + created +
            ", title='" + title + '\'' +
            ", picture_id=" + picture_id +
            ", pictureSearch_id=" + pictureSearch_id +
            '}';
    }

}
