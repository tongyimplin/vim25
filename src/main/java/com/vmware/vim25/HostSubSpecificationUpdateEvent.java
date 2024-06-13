package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostSubSpecification;
import com.vmware.vim25.HostSubSpecificationUpdateEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSubSpecificationUpdateEvent", propOrder = {"hostSubSpec"})
public class HostSubSpecificationUpdateEvent extends HostEvent {
  @XmlElement(required = true)
  protected HostSubSpecification hostSubSpec;
  
  public HostSubSpecification getHostSubSpec() {
    return this.hostSubSpec;
  }
  
  public void setHostSubSpec(HostSubSpecification paramHostSubSpecification) {
    this.hostSubSpec = paramHostSubSpecification;
  }
}
