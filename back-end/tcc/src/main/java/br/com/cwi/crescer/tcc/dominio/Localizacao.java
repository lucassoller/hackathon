// package br.com.cwi.crescer.tcc.dominio;

// import java.math.BigDecimal;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;

// @Entity
// @Table(name="LOCALIZACAO")
// public class Localizacao {

//     public static String getSEQUENCE() {
//         return SEQUENCE;
//     }

//     private static final String SEQUENCE = "LOCALIZACAO_SEQ";

//     @Id
//     @GeneratedValue(strategy=GenerationType.IDENTITY)
//     @Column(name="ID_LOCALIZACAO", nullable=false)
//     private Long id;

//     @Column(name="LATITUDE", nullable=false)
//     private BigDecimal latitude;

//     @Column(name="LONGITUDE", nullable=false)
//     private BigDecimal longitude;

//     public Localizacao(Long id, BigDecimal latitude, BigDecimal longitude) {
//         this.id = id;
//         this.latitude = latitude;
//         this.longitude = longitude;
//     }

//     public Localizacao() {

//     }

//     public Long getId() {
//         return this.id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public BigDecimal getLatitude() {
//         return this.latitude;
//     }

//     public void setLatitude(BigDecimal latitude) {
//         this.latitude = latitude;
//     }

//     public BigDecimal getLongitude() {
//         return this.longitude;
//     }

//     public void setLongitude(BigDecimal longitude) {
//         this.longitude = longitude;
//     }


// }