package ma.enset.ws;

import java.util.Date;

//@XmlRootElement(name = "compte")
//@XmlAccessorType(XmlAccessType.FIELD) //les annotatios @ sont sur les attributs pas setters et getters
public class Compte {
    private int code;
    private double solde;
    //@XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
