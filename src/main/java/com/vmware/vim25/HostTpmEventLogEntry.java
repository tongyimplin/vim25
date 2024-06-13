package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostTpmEventDetails;
import com.vmware.vim25.HostTpmEventLogEntry;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostTpmEventLogEntry", propOrder = {"pcrIndex", "eventDetails"})
public class HostTpmEventLogEntry extends DynamicData {
  protected int pcrIndex;
  
  @XmlElement(required = true)
  protected HostTpmEventDetails eventDetails;
  
  public int getPcrIndex() {
    return this.pcrIndex;
  }
  
  public void setPcrIndex(int paramInt) {
    this.pcrIndex = paramInt;
  }
  
  public HostTpmEventDetails getEventDetails() {
    return this.eventDetails;
  }
  
  public void setEventDetails(HostTpmEventDetails paramHostTpmEventDetails) {
    this.eventDetails = paramHostTpmEventDetails;
  }
}
