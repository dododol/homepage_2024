package egovframework.let.temp3.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.psl.dataaccess.util.EgovMap;
import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.let.temp3.service.Temp3Service;

@Service("temp3Service")
public class Temp3ServiceImpl extends EgovAbstractServiceImpl implements Temp3Service{

	@Resource(name = "temp3DAO")
	private Temp3DAO temp3DAO;
	
	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;

	
}




















