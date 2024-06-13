package com.vmware.vim25;

import com.vmware.vim25.ArrayUpdateSpec;
import com.vmware.vim25.ClusterGroupInfo;
import com.vmware.vim25.ClusterGroupSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterGroupSpec", propOrder = {"info"})
public class ClusterGroupSpec extends ArrayUpdateSpec {
  protected ClusterGroupInfo info;
  
  public ClusterGroupInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(ClusterGroupInfo paramClusterGroupInfo) {
    this.info = paramClusterGroupInfo;
  }
}
