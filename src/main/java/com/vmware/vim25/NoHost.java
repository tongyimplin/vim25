package com.vmware.vim25;

import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.NoHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoHost", propOrder = {"name"})
public class NoHost extends HostConnectFault {
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
