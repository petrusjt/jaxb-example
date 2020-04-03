package legoset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public @Data @AllArgsConstructor @NoArgsConstructor
class Weight {
    @XmlValue
    private double value;
    @XmlAttribute
    private String unit;

    /*public Weight(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }*/
}
