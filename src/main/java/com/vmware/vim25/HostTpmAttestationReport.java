package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostTpmAttestationReport;
import com.vmware.vim25.HostTpmDigestInfo;
import com.vmware.vim25.HostTpmEventLogEntry;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmAttestationReport", propOrder = {"tpmPcrValues", "tpmEvents", "tpmLogReliable"})
public class HostTpmAttestationReport extends DynamicData {
  @XmlElement(required = true)
  protected List<HostTpmDigestInfo> tpmPcrValues;
  
  @XmlElement(required = true)
  protected List<HostTpmEventLogEntry> tpmEvents;
  
  protected boolean tpmLogReliable;
  
  public List<HostTpmDigestInfo> getTpmPcrValues() {
    if (this.tpmPcrValues == null)
      this.tpmPcrValues = new ArrayList<>(); 
    return this.tpmPcrValues;
  }
  
  public List<HostTpmEventLogEntry> getTpmEvents() {
    if (this.tpmEvents == null)
      this.tpmEvents = new ArrayList<>(); 
    return this.tpmEvents;
  }
  
  public boolean isTpmLogReliable() {
    return this.tpmLogReliable;
  }
  
  public void setTpmLogReliable(boolean paramBoolean) {
    this.tpmLogReliable = paramBoolean;
  }
}
