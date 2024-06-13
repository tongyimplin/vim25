package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostConfigInfoClusterInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfoClusterInfo", propOrder = {"uuid", "nodeUuid"})
public class VsanHostConfigInfoClusterInfo extends DynamicData {
  protected String uuid;
  
  protected String nodeUuid;
  
  public String getUuid() {
    return this.uuid;
  }
  
  public void setUuid(String paramString) {
    this.uuid = paramString;
  }
  
  public String getNodeUuid() {
    return this.nodeUuid;
  }
  
  public void setNodeUuid(String paramString) {
    this.nodeUuid = paramString;
  }
}
