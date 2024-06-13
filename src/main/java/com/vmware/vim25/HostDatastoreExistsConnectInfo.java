package com.vmware.vim25;

import com.vmware.vim25.HostDatastoreConnectInfo;
import com.vmware.vim25.HostDatastoreExistsConnectInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDatastoreExistsConnectInfo", propOrder = {"newDatastoreName"})
public class HostDatastoreExistsConnectInfo extends HostDatastoreConnectInfo {
  @XmlElement(required = true)
  protected String newDatastoreName;
  
  public String getNewDatastoreName() {
    return this.newDatastoreName;
  }
  
  public void setNewDatastoreName(String paramString) {
    this.newDatastoreName = paramString;
  }
}
