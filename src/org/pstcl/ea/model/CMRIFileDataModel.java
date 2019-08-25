package org.pstcl.ea.model;

import java.util.List;

import org.pstcl.ea.entity.FileMaster;
import org.pstcl.ea.entity.LocationMaster;
import org.pstcl.ea.entity.meterTxnEntity.DailyTransaction;
import org.pstcl.ea.entity.meterTxnEntity.InstantRegisters;
import org.pstcl.ea.entity.meterTxnEntity.TamperLogTransaction;
import org.pstcl.ea.entity.meterTxnEntity.jpa.LoadSurveyTransaction;

public class CMRIFileDataModel {
	private InstantRegisters instantRegistersDetails;
	
	private LocationMaster locationMaster;
	
	public FileMaster getFileMaster() {
		return fileMaster;
	}
	public void setFileMaster(FileMaster fileMaster) {
		this.fileMaster = fileMaster;
	}
	public List<DailyTransaction> getDailyTransactions() {
		return dailyTransactions;
	}
	public void setDailyTransactions(List<DailyTransaction> dailyTransactions) {
		this.dailyTransactions = dailyTransactions;
	}
	public List<LoadSurveyTransaction> getLoadSurveyTransactions() {
		return loadSurveyTransactions;
	}
	public void setLoadSurveyTransactions(List<LoadSurveyTransaction> loadSurveyTransactions) {
		this.loadSurveyTransactions = loadSurveyTransactions;
	}
	public LocationMaster getLocationMaster() {
		return locationMaster;
	}
	public void setLocationMaster(LocationMaster locationMaster) {
		this.locationMaster = locationMaster;
	}
	public List<TamperLogTransaction> getTamperLogs() {
		return tamperLogs;
	}
	public void setTamperLogs(List<TamperLogTransaction> tamperLogs) {
		this.tamperLogs = tamperLogs;
	}
	public InstantRegisters getInstantRegistersDetails() {
		return instantRegistersDetails;
	}
	public void setInstantRegistersDetails(InstantRegisters instantRegistersDetails) {
		this.instantRegistersDetails = instantRegistersDetails;
	}
	private FileMaster fileMaster;
	private List<DailyTransaction> dailyTransactions;

	private List<TamperLogTransaction> tamperLogs;

	private List<LoadSurveyTransaction> loadSurveyTransactions;

}
