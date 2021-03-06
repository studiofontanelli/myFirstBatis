package it.studiofontanelli.jabistudio.spring.dao;

import it.studiofontanelli.jabistudio.spring.entity.AbiFormsDescr;
import it.studiofontanelli.jabistudio.spring.entity.AbiFormsDescrExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class AbiFormsDescrDAOImpl extends SqlMapClientDaoSupport implements AbiFormsDescrDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public AbiFormsDescrDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int countByExample(AbiFormsDescrExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("_abi_forms_descr.countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int deleteByExample(AbiFormsDescrExample example) {
        int rows = getSqlMapClientTemplate().delete("_abi_forms_descr.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int deleteByPrimaryKey(Integer idForm) {
        AbiFormsDescr _key = new AbiFormsDescr();
        _key.setIdForm(idForm);
        int rows = getSqlMapClientTemplate().delete("_abi_forms_descr.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public void insert(AbiFormsDescr record) {
        getSqlMapClientTemplate().insert("_abi_forms_descr.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public void insertSelective(AbiFormsDescr record) {
        getSqlMapClientTemplate().insert("_abi_forms_descr.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public List selectByExample(AbiFormsDescrExample example) {
        List list = getSqlMapClientTemplate().queryForList("_abi_forms_descr.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public AbiFormsDescr selectByPrimaryKey(Integer idForm) {
        AbiFormsDescr _key = new AbiFormsDescr();
        _key.setIdForm(idForm);
        AbiFormsDescr record = (AbiFormsDescr) getSqlMapClientTemplate().queryForObject("_abi_forms_descr.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByExampleSelective(AbiFormsDescr record, AbiFormsDescrExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("_abi_forms_descr.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByExample(AbiFormsDescr record, AbiFormsDescrExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("_abi_forms_descr.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByPrimaryKeySelective(AbiFormsDescr record) {
        int rows = getSqlMapClientTemplate().update("_abi_forms_descr.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByPrimaryKey(AbiFormsDescr record) {
        int rows = getSqlMapClientTemplate().update("_abi_forms_descr.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _abi_forms_descr
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    protected static class UpdateByExampleParms extends AbiFormsDescrExample {
        private Object record;

        public UpdateByExampleParms(Object record, AbiFormsDescrExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}