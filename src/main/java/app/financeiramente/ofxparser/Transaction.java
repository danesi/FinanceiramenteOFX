package app.financeiramente.ofxparser;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@XmlRootElement(name = "STMTTRN")
@XmlAccessorType (XmlAccessType.FIELD)
public class Transaction implements Serializable {
    @XmlElement(name="TRNTYPE")
    private String trntype;

    @XmlElement(name="DTPOSTED")
    private String dtposted;

    @XmlElement(name="TRNAMT")
    private BigDecimal trnamt;
    @XmlElement(name="FITID")
    private String fitid;
    @XmlElement(name="MEMO")
    private String memo;

    public String getTrntype() {
        return trntype;
    }

    public void setTrntype(String trntype) {
        this.trntype = trntype;
    }

    public String getDtposted() {
        return dtposted;
    }

    public void setDtposted(String dtposted) {
        this.dtposted = dtposted;
    }

    public BigDecimal getTrnamt() {
        return trnamt;
    }

    public void setTrnamt(BigDecimal trnamt) {
        this.trnamt = trnamt;
    }

    public String getFitid() {
        return fitid;
    }

    public void setFitid(String fitid) {
        this.fitid = fitid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
