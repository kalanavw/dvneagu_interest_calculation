package com.dvneagu.interestservice.repository;

import com.dvneagu.interestservice.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * Copyright (c) 2019. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 7/30/2019.
 */
@Repository
public interface RatesRepository extends JpaRepository<Rate, Long>
{
	List<Rate> findAllByFromDateGreaterThanEqualAndFromDateLessThanEqual( LocalDate actualDate, LocalDate receivedDate );

	Rate findTopByFromDateLessThanEqualOrderByFromDateDesc( LocalDate actualDate );

	Rate findTopByFromDateGreaterThanEqual( LocalDate receivedDate );
}
