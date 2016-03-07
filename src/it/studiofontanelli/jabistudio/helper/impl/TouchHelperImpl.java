package it.studiofontanelli.jabistudio.helper.impl;

import it.studiofontanelli.jabistudio.entity.AbiMainPofT;
import it.studiofontanelli.jabistudio.entity.AbiMainPofTExample;
import it.studiofontanelli.jabistudio.entity.AbiMainPofTExample.Criteria;
import it.studiofontanelli.jabistudio.helper.TouchHelper;
import it.studiofontanelli.jabistudio.mapper.AbiMainPofTMapper;
import it.studiofontanelli.jabistudio.util.Tracer;
import it.studiofontanelli.jabistudio.util.XmlSerializer;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class TouchHelperImpl implements TouchHelper {
	
	public static final String LOGGER_PREFIX = TouchHelperImpl.class.getName();

	private static Logger log = Logger.getLogger(LOGGER_PREFIX);	
	
	@Autowired
	private AbiMainPofTMapper abiMainPofTMapper;
	

	public AbiMainPofTMapper getAbiMainPofTMapper() {
		return abiMainPofTMapper;
	}


	public void setAbiMainPofTMapper(AbiMainPofTMapper abiMainPofTMapper) {
		this.abiMainPofTMapper = abiMainPofTMapper;
	}


	@Override
	public void touch() throws Exception {
		String method  = "touch";
		try{
		
		
		
		
		AbiMainPofTExample example = new AbiMainPofTExample();
		
		
		example.setDistinct(false);
		Criteria criteria = example.createCriteria();
		criteria.andTypeidEqualTo("INVOI");
		
		List<AbiMainPofT> l =  getAbiMainPofTMapper().selectByExample(example);
		
		
		System.out.println("# " + l.size());
		
		Tracer.debug(log, getClass().getName(), method, "result\n " + XmlSerializer.objectToXml(l));
		
		
		
		}
		catch(Exception e){
			System.out.println("Exception " + e);
			
		}
		finally{
			System.out.println("END");
		}
	}

}
