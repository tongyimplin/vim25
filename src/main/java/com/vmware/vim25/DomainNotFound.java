package com.vmware.vim25;

import com.vmware.vim25.ActiveDirectoryFault;
import com.vmware.vim25.DomainNotFound;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainNotFound", propOrder = {"domainName"})
public class DomainNotFound extends ActiveDirectoryFault {
  @XmlElement(required = true)
  protected String domainName;
  
  public String getDomainName() {
    return this.domainName;
  }
  
  public void setDomainName(String paramString) {
    this.domainName = paramString;
  }
}
