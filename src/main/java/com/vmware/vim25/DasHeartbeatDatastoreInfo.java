package com.vmware.vim25;

import com.vmware.vim25.DasHeartbeatDatastoreInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasHeartbeatDatastoreInfo", propOrder = {"datastore", "hosts"})
public class DasHeartbeatDatastoreInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> hosts;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getHosts() {
    if (this.hosts == null)
      this.hosts = new ArrayList<>(); 
    return this.hosts;
  }
}
