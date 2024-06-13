package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostSpecification;
import com.vmware.vim25.HostSpecificationUpdateEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSpecificationUpdateEvent", propOrder = {"hostSpec"})
public class HostSpecificationUpdateEvent extends HostEvent {
  @XmlElement(required = true)
  protected HostSpecification hostSpec;
  
  public HostSpecification getHostSpec() {
    return this.hostSpec;
  }
  
  public void setHostSpec(HostSpecification paramHostSpecification) {
    this.hostSpec = paramHostSpecification;
  }
}
