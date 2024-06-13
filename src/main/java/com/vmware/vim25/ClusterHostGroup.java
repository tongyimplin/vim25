package com.vmware.vim25;

import com.vmware.vim25.ClusterGroupInfo;
import com.vmware.vim25.ClusterHostGroup;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterHostGroup", propOrder = {"host"})
public class ClusterHostGroup extends ClusterGroupInfo {
  protected List<ManagedObjectReference> host;
  
  public List<ManagedObjectReference> getHost() {
    if (this.host == null)
      this.host = new ArrayList<>(); 
    return this.host;
  }
}
