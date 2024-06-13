package com.vmware.vim25;

import com.vmware.vim25.ClusterDasData;
import com.vmware.vim25.ClusterDasDataSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasDataSummary", propOrder = {"hostListVersion", "clusterConfigVersion", "compatListVersion"})
public class ClusterDasDataSummary extends ClusterDasData {
  protected long hostListVersion;
  
  protected long clusterConfigVersion;
  
  protected long compatListVersion;
  
  public long getHostListVersion() {
    return this.hostListVersion;
  }
  
  public void setHostListVersion(long paramLong) {
    this.hostListVersion = paramLong;
  }
  
  public long getClusterConfigVersion() {
    return this.clusterConfigVersion;
  }
  
  public void setClusterConfigVersion(long paramLong) {
    this.clusterConfigVersion = paramLong;
  }
  
  public long getCompatListVersion() {
    return this.compatListVersion;
  }
  
  public void setCompatListVersion(long paramLong) {
    this.compatListVersion = paramLong;
  }
}
