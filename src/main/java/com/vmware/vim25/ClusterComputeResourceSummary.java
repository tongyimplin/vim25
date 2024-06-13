package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceSummary;
import com.vmware.vim25.ClusterDasAdmissionControlInfo;
import com.vmware.vim25.ClusterDasData;
import com.vmware.vim25.ClusterUsageSummary;
import com.vmware.vim25.ComputeResourceSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceSummary", propOrder = {"currentFailoverLevel", "admissionControlInfo", "numVmotions", "targetBalance", "currentBalance", "drsScore", "numVmsPerDrsScoreBucket", "usageSummary", "currentEVCModeKey", "dasData"})
public class ClusterComputeResourceSummary extends ComputeResourceSummary {
  protected int currentFailoverLevel;
  
  protected ClusterDasAdmissionControlInfo admissionControlInfo;
  
  protected int numVmotions;
  
  protected Integer targetBalance;
  
  protected Integer currentBalance;
  
  protected Integer drsScore;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> numVmsPerDrsScoreBucket;
  
  protected ClusterUsageSummary usageSummary;
  
  protected String currentEVCModeKey;
  
  protected ClusterDasData dasData;
  
  public int getCurrentFailoverLevel() {
    return this.currentFailoverLevel;
  }
  
  public void setCurrentFailoverLevel(int paramInt) {
    this.currentFailoverLevel = paramInt;
  }
  
  public ClusterDasAdmissionControlInfo getAdmissionControlInfo() {
    return this.admissionControlInfo;
  }
  
  public void setAdmissionControlInfo(ClusterDasAdmissionControlInfo paramClusterDasAdmissionControlInfo) {
    this.admissionControlInfo = paramClusterDasAdmissionControlInfo;
  }
  
  public int getNumVmotions() {
    return this.numVmotions;
  }
  
  public void setNumVmotions(int paramInt) {
    this.numVmotions = paramInt;
  }
  
  public Integer getTargetBalance() {
    return this.targetBalance;
  }
  
  public void setTargetBalance(Integer paramInteger) {
    this.targetBalance = paramInteger;
  }
  
  public Integer getCurrentBalance() {
    return this.currentBalance;
  }
  
  public void setCurrentBalance(Integer paramInteger) {
    this.currentBalance = paramInteger;
  }
  
  public Integer getDrsScore() {
    return this.drsScore;
  }
  
  public void setDrsScore(Integer paramInteger) {
    this.drsScore = paramInteger;
  }
  
  public List<Integer> getNumVmsPerDrsScoreBucket() {
    if (this.numVmsPerDrsScoreBucket == null)
      this.numVmsPerDrsScoreBucket = new ArrayList<>(); 
    return this.numVmsPerDrsScoreBucket;
  }
  
  public ClusterUsageSummary getUsageSummary() {
    return this.usageSummary;
  }
  
  public void setUsageSummary(ClusterUsageSummary paramClusterUsageSummary) {
    this.usageSummary = paramClusterUsageSummary;
  }
  
  public String getCurrentEVCModeKey() {
    return this.currentEVCModeKey;
  }
  
  public void setCurrentEVCModeKey(String paramString) {
    this.currentEVCModeKey = paramString;
  }
  
  public ClusterDasData getDasData() {
    return this.dasData;
  }
  
  public void setDasData(ClusterDasData paramClusterDasData) {
    this.dasData = paramClusterDasData;
  }
}
