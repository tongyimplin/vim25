package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PerfProviderSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerfProviderSummary", propOrder = {"entity", "currentSupported", "summarySupported", "refreshRate"})
public class PerfProviderSummary extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference entity;
  
  protected boolean currentSupported;
  
  protected boolean summarySupported;
  
  protected Integer refreshRate;
  
  public ManagedObjectReference getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedObjectReference paramManagedObjectReference) {
    this.entity = paramManagedObjectReference;
  }
  
  public boolean isCurrentSupported() {
    return this.currentSupported;
  }
  
  public void setCurrentSupported(boolean paramBoolean) {
    this.currentSupported = paramBoolean;
  }
  
  public boolean isSummarySupported() {
    return this.summarySupported;
  }
  
  public void setSummarySupported(boolean paramBoolean) {
    this.summarySupported = paramBoolean;
  }
  
  public Integer getRefreshRate() {
    return this.refreshRate;
  }
  
  public void setRefreshRate(Integer paramInteger) {
    this.refreshRate = paramInteger;
  }
}
