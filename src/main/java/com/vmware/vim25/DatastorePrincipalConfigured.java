package com.vmware.vim25;

import com.vmware.vim25.DatastorePrincipalConfigured;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastorePrincipalConfigured", propOrder = {"datastorePrincipal"})
public class DatastorePrincipalConfigured extends HostEvent {
  @XmlElement(required = true)
  protected String datastorePrincipal;
  
  public String getDatastorePrincipal() {
    return this.datastorePrincipal;
  }
  
  public void setDatastorePrincipal(String paramString) {
    this.datastorePrincipal = paramString;
  }
}
