package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDasHeartbeatDatastoreInfo;
import com.vmware.vim25.DasHeartbeatDatastoreInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDasHeartbeatDatastoreInfo", propOrder = {"dasHeartbeatDatastoreInfo"})
public class ArrayOfDasHeartbeatDatastoreInfo {
  @XmlElement(name = "DasHeartbeatDatastoreInfo")
  protected List<DasHeartbeatDatastoreInfo> dasHeartbeatDatastoreInfo;
  
  public List<DasHeartbeatDatastoreInfo> getDasHeartbeatDatastoreInfo() {
    if (this.dasHeartbeatDatastoreInfo == null)
      this.dasHeartbeatDatastoreInfo = new ArrayList<>(); 
    return this.dasHeartbeatDatastoreInfo;
  }
}
