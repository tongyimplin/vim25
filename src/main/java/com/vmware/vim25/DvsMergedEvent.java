package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsEventArgument;
import com.vmware.vim25.DvsMergedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsMergedEvent", propOrder = {"sourceDvs", "destinationDvs"})
public class DvsMergedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected DvsEventArgument sourceDvs;
  
  @XmlElement(required = true)
  protected DvsEventArgument destinationDvs;
  
  public DvsEventArgument getSourceDvs() {
    return this.sourceDvs;
  }
  
  public void setSourceDvs(DvsEventArgument paramDvsEventArgument) {
    this.sourceDvs = paramDvsEventArgument;
  }
  
  public DvsEventArgument getDestinationDvs() {
    return this.destinationDvs;
  }
  
  public void setDestinationDvs(DvsEventArgument paramDvsEventArgument) {
    this.destinationDvs = paramDvsEventArgument;
  }
}
