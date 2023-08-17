package com.example.moneytransfer.mapper;

import com.example.moneytransfer.dto.Account;
import com.example.moneytransfer.dto.Group;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    /**
     * < 입금 이체 >
     * user_code = 결제자
     * 비결제자 개인이 결제자에게 입금하는 방식
      */

    public void deposit(@Param("user_code") Integer user_code);

    /**
     *  < 계좌 잔액 조회 >
     *  계좌 고유 PK를 입력받아 해당 계좌의 잔액을 보여주는 방식
     */

    public void getAccountMoney(@Param("account_id") Integer account_id);

    /**
     * < 계좌 통합 조회 >
     */
    public List<Account> getIntegrateAccount(@Param("user_code") Integer user_code);

}
