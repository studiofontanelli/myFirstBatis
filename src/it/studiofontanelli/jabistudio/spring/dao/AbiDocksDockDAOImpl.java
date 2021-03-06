package it.studiofontanelli.jabistudio.spring.dao;

import it.studiofontanelli.jabistudio.spring.entity.AbiDocksDock;
import it.studiofontanelli.jabistudio.spring.entity.AbiDocksDockExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class AbiDocksDockDAOImpl extends SqlMapClientDaoSupport implements AbiDocksDockDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public AbiDocksDockDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int countByExample(AbiDocksDockExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("_abi_docks_dock.countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int deleteByExample(AbiDocksDockExample example) {
        int rows = getSqlMapClientTemplate().delete("_abi_docks_dock.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        AbiDocksDock _key = new AbiDocksDock();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("_abi_docks_dock.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public void insert(AbiDocksDock record) {
        getSqlMapClientTemplate().insert("_abi_docks_dock.insert", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public void insertSelective(AbiDocksDock record) {
        getSqlMapClientTemplate().insert("_abi_docks_dock.insertSelective", record);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public List selectByExample(AbiDocksDockExample example) {
        List list = getSqlMapClientTemplate().queryForList("_abi_docks_dock.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public AbiDocksDock selectByPrimaryKey(Integer id) {
        AbiDocksDock _key = new AbiDocksDock();
        _key.setId(id);
        AbiDocksDock record = (AbiDocksDock) getSqlMapClientTemplate().queryForObject("_abi_docks_dock.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByExampleSelective(AbiDocksDock record, AbiDocksDockExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("_abi_docks_dock.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByExample(AbiDocksDock record, AbiDocksDockExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("_abi_docks_dock.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByPrimaryKeySelective(AbiDocksDock record) {
        int rows = getSqlMapClientTemplate().update("_abi_docks_dock.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    public int updateByPrimaryKey(AbiDocksDock record) {
        int rows = getSqlMapClientTemplate().update("_abi_docks_dock.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table _abi_docks_dock
     *
     * @mbggenerated Mon Mar 07 15:19:10 CET 2016
     */
    protected static class UpdateByExampleParms extends AbiDocksDockExample {
        private Object record;

        public UpdateByExampleParms(Object record, AbiDocksDockExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}