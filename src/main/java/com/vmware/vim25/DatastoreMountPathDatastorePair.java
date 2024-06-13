package com.vmware.vim25;

import com.vmware.vim25.DatastoreMountPathDatastorePair;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreMountPathDatastorePair", propOrder = {"oldMountPath", "datastore"})
public class DatastoreMountPathDatastorePair extends DynamicData {
  @XmlElement(required = true)
  protected String oldMountPath;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  public String getOldMountPath() {
    return this.oldMountPath;
  }
  
  public void setOldMountPath(String paramString) {
    this.oldMountPath = paramString;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
