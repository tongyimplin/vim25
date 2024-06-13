package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterDpmHostConfigInfo;
import com.vmware.vim25.ClusterDpmHostConfigSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDpmHostConfigSpec", propOrder = {"info"})
public class ClusterDpmHostConfigSpec extends ArrayUpdateSpec {
  protected ClusterDpmHostConfigInfo info;
  
  public ClusterDpmHostConfigInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterDpmHostConfigInfo paramClusterDpmHostConfigInfo) {
    this.info = paramClusterDpmHostConfigInfo;
  }
}
