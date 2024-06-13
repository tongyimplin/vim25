package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterDasVmConfigInfo;
import com.vmware.vim25.ClusterDasVmConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasVmConfigSpec", propOrder = {"info"})
public class ClusterDasVmConfigSpec extends ArrayUpdateSpec {
  protected ClusterDasVmConfigInfo info;
  
  public ClusterDasVmConfigInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterDasVmConfigInfo paramClusterDasVmConfigInfo) {
    this.info = paramClusterDasVmConfigInfo;
  }
}
