package com.toystore.toystore.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "sj_product_details")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pid", nullable = false)
	private Long pid;

	private String pname;

	private String pimage;

	private String pdescription;
	
	private Integer price;

	private String addedBy;


    @Column(name = "added_on", nullable = false, insertable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date addedOn;

    @Column(name = "is_available")
    private Boolean isAvailable = true;
}
