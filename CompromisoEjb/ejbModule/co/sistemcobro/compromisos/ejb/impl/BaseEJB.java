package co.sistemcobro.compromisos.ejb.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;


public class BaseEJB {


	
//	@Resource(mappedName = "dc_apps")
//	protected DataSource dc_apps;

	@Resource(mappedName = "dc_compromiso_tigo_colombia")
	protected DataSource dc_compromiso_tigo_colombia;
	
//	@Resource(mappedName = "dg_compromiso_tigo_colombia")
//	protected DataSource dg_compromiso_tigo_colombia;
	
	@Resource(mappedName = "dc_compromiso_tigo")
	protected DataSource dc_compromiso_tigo;
	
	@Resource(mappedName = "dg_compromiso_tigo")
	protected DataSource dg_compromiso_tigo;
//	
	
	
	

}
