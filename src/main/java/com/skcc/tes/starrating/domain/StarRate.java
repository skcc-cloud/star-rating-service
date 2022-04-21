package com.skcc.tes.starrating.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.skcc.tes.starrating.dto.StarRateDto;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StarRate {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long id;		// 관리번호
	Long talentCategoryId;	// 재능 카테고리 아이디
	Double rate;	// 평점

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	LocalDateTime serviceDate;	// 서비스 일자

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	LocalDateTime rateDate; 	// 평가 일자

	public StarRateDto toDto() {
		return StarRateDto.builder()
				.id(id)
				.talentCategoryId(talentCategoryId)
				.rate(rate)
				.serviceDate(serviceDate)
				.rateDate(rateDate)
				.build();
	}
}
