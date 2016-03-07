package it.studiofontanelli.jabistudio.dao;

import it.studiofontanelli.jabistudio.mybatis.entity.AbiMainPofR;
import it.studiofontanelli.jabistudio.mybatis.entity.AbiMainPofRExample;
import java.util.List;

public interface AbiMainPofRDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int countByExample(AbiMainPofRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int deleteByExample(AbiMainPofRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    void insert(AbiMainPofR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    void insertSelective(AbiMainPofR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    List selectByExample(AbiMainPofRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    AbiMainPofR selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int updateByExampleSelective(AbiMainPofR record, AbiMainPofRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int updateByExample(AbiMainPofR record, AbiMainPofRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int updateByPrimaryKeySelective(AbiMainPofR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_main_pof_r
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    int updateByPrimaryKey(AbiMainPofR record);
}