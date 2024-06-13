package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterDrsVmConfigInfo;
import com.vmware.vim25.ClusterDrsVmConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDrsVmConfigSpec", propOrder = {"info"})
public class ClusterDrsVmConfigSpec extends ArrayUpdateSpec {
  protected ClusterDrsVmConfigInfo info;
  
  public ClusterDrsVmConfigInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterDrsVmConfigInfo paramClusterDrsVmConfigInfo) {
    this.info = paramClusterDrsVmConfigInfo;
  }
}
