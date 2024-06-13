package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VMwareIpfixConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMwareIpfixConfig", propOrder = {"collectorIpAddress", "collectorPort", "observationDomainId", "activeFlowTimeout", "idleFlowTimeout", "samplingRate", "internalFlowsOnly"})
public class VMwareIpfixConfig extends DynamicData {
  protected String collectorIpAddress;
  
  protected Integer collectorPort;
  
  protected Long observationDomainId;
  
  protected int activeFlowTimeout;
  
  protected int idleFlowTimeout;
  
  protected int samplingRate;
  
  protected boolean internalFlowsOnly;
  
  public String getCollectorIpAddress() {
    return this.collectorIpAddress;
  }
  
  public void setCollectorIpAddress(String paramString) {
    this.collectorIpAddress = paramString;
  }
  
  public Integer getCollectorPort() {
    return this.collectorPort;
  }
  
  public void setCollectorPort(Integer paramInteger) {
    this.collectorPort = paramInteger;
  }
  
  public Long getObservationDomainId() {
    return this.observationDomainId;
  }
  
  public void setObservationDomainId(Long paramLong) {
    this.observationDomainId = paramLong;
  }
  
  public int getActiveFlowTimeout() {
    return this.activeFlowTimeout;
  }
  
  public void setActiveFlowTimeout(int paramInt) {
    this.activeFlowTimeout = paramInt;
  }
  
  public int getIdleFlowTimeout() {
    return this.idleFlowTimeout;
  }
  
  public void setIdleFlowTimeout(int paramInt) {
    this.idleFlowTimeout = paramInt;
  }
  
  public int getSamplingRate() {
    return this.samplingRate;
  }
  
  public void setSamplingRate(int paramInt) {
    this.samplingRate = paramInt;
  }
  
  public boolean isInternalFlowsOnly() {
    return this.internalFlowsOnly;
  }
  
  public void setInternalFlowsOnly(boolean paramBoolean) {
    this.internalFlowsOnly = paramBoolean;
  }
}
