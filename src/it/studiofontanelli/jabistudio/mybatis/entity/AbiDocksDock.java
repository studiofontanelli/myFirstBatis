package it.studiofontanelli.jabistudio.mybatis.entity;

public class AbiDocksDock {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _abi_docks_dock.id
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _abi_docks_dock.contactid
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    private Integer contactid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column _abi_docks_dock.descr
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    private String descr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _abi_docks_dock.id
     *
     * @return the value of _abi_docks_dock.id
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _abi_docks_dock.id
     *
     * @param id the value for _abi_docks_dock.id
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _abi_docks_dock.contactid
     *
     * @return the value of _abi_docks_dock.contactid
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public Integer getContactid() {
        return contactid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _abi_docks_dock.contactid
     *
     * @param contactid the value for _abi_docks_dock.contactid
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column _abi_docks_dock.descr
     *
     * @return the value of _abi_docks_dock.descr
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public String getDescr() {
        return descr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column _abi_docks_dock.descr
     *
     * @param descr the value for _abi_docks_dock.descr
     *
     * @mbggenerated Mon Mar 07 14:58:43 CET 2016
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }
}