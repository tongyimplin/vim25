package com.vmware.vim25;

import com.vmware.vim25.DvsFault;
import com.vmware.vim25.InvalidIpfixConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidIpfixConfig", propOrder = {"property"})
public class InvalidIpfixConfig extends DvsFault {
  protected String property;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(String paramString) {
    this.property = paramString;
  }
}
