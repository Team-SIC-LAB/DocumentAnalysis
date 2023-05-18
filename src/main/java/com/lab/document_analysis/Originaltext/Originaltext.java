package com.lab.document_analysis.Originaltext;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@NoArgsConstructor
@Entity
@Getter
public class Originaltext {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    @Column(nullable = false)
    private String text;

    @Builder
    public Originaltext(String text) {
        this.text = text;
    }
}
