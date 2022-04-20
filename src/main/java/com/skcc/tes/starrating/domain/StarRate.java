package com.skcc.tes.starrating.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
public class StarRate {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;		// 관리번호
	Date serviceDate;	// 서비스 일자
	Date rateDate; 	// 평가 일자
	Double rate;	// 평점
	Long talentCategoryId;	// 재능 카테고리 아이디

}
