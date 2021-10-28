/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author RAQUEL
 */
public class Emg implements Serializable {

    private Integer id;
    private String name_emg;
    private Date start_date;
    private Date finish_date;

    public Emg(Integer id, String name_emg) {
        this.id = id;
        this.name_emg = name_emg;
    }

    public Emg(String name_emg, Date start_date, Date finish_date) {
        this.name_emg = name_emg;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    public Emg(Integer id, String name_emg, Date start_date, Date finish_date) {
        this.id = id;
        this.name_emg = name_emg;
        this.start_date = start_date;
        this.finish_date = finish_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_emg() {
        return name_emg;
    }

    public void setName_emg(String name_emg) {
        this.name_emg = name_emg;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.name_emg);
        hash = 67 * hash + Objects.hashCode(this.start_date);
        hash = 67 * hash + Objects.hashCode(this.finish_date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Emg other = (Emg) obj;
        if (!Objects.equals(this.name_emg, other.name_emg)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.start_date, other.start_date)) {
            return false;
        }
        if (!Objects.equals(this.finish_date, other.finish_date)) {
            return false;
        }
        return true;
    }*/

    @Override
    public String toString() {
        return "Emg{" + "id=" + id + ", name_emg=" + name_emg + ", start_date=" + start_date + ", finish_date=" + finish_date + '}';
    }

}
