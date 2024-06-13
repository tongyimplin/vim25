package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDatastoreConnectInfo;
import com.vmware.vim25.HostDatastoreConnectInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDatastoreConnectInfo", propOrder = {"hostDatastoreConnectInfo"})
public class ArrayOfHostDatastoreConnectInfo {
  @XmlElement(name = "HostDatastoreConnectInfo")
  protected List<HostDatastoreConnectInfo> hostDatastoreConnectInfo;
  
  public List<HostDatastoreConnectInfo> getHostDatastoreConnectInfo() {
    if (this.hostDatastoreConnectInfo == null)
      this.hostDatastoreConnectInfo = new ArrayList<>(); 
    return this.hostDatastoreConnectInfo;
  }
}
