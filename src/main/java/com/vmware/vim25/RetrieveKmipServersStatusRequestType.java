package com.vmware.vim25;

import com.vmware.vim25.KmipClusterInfo;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RetrieveKmipServersStatusRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveKmipServersStatusRequestType", propOrder = {"_this", "clusters"})
public class RetrieveKmipServersStatusRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<KmipClusterInfo> clusters;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<KmipClusterInfo> getClusters() {
    if (this.clusters == null)
      this.clusters = new ArrayList<>(); 
    return this.clusters;
  }
}
