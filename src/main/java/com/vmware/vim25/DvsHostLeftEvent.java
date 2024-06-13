package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsHostLeftEvent;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostLeftEvent", propOrder = {"hostLeft"})
public class DvsHostLeftEvent extends DvsEvent {
  @XmlElement(required = true)
  protected HostEventArgument hostLeft;
  
  public HostEventArgument getHostLeft() {
    return this.hostLeft;
  }
  
  public void setHostLeft(HostEventArgument paramHostEventArgument) {
    this.hostLeft = paramHostEventArgument;
  }
}
