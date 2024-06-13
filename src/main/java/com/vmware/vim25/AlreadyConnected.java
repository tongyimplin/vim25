package com.vmware.vim25;

import com.vmware.vim25.AlreadyConnected;
import com.vmware.vim25.HostConnectFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlreadyConnected", propOrder = {"name"})
public class AlreadyConnected extends HostConnectFault {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
