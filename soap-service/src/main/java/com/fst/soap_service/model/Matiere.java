package com.fst.soap_service.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Matiere", propOrder = {
    "id",
    "code",
    "nom",
    "coefficient",
})
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matiere {
     protected int id;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected double coefficient;
}
