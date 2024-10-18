package br.com.fiap.trafegos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name ="tbl_trafegos")
public class Trafego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_trafego")
    private Long numeroTrafego;

    @NotNull
    @Column(name = "estado", length = 100)
    private String estado;

    @NotNull
    @Column(name = "cidade", length = 100)
    private String cidade;

    @NotNull
    @Column(name = "cituacao", length = 100)
    private String cituacao;

    @Column(name = "data_ocorrido")
    private LocalDate dataOcorrido;

}
