package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAamHostInfo;
import com.vmware.vim25.ClusterDasAamNodeState;
import com.vmware.vim25.ClusterDasHostInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAamHostInfo", propOrder = {"hostDasState", "primaryHosts"})
public class ClusterDasAamHostInfo extends ClusterDasHostInfo {
  protected List<ClusterDasAamNodeState> hostDasState;
  
  protected List<String> primaryHosts;
  
  public List<ClusterDasAamNodeState> getHostDasState() {
    if (this.hostDasState == null)
      this.hostDasState = new ArrayList<>(); 
    return this.hostDasState;
  }
  
  public List<String> getPrimaryHosts() {
    if (this.primaryHosts == null)
      this.primaryHosts = new ArrayList<>(); 
    return this.primaryHosts;
  }
}
