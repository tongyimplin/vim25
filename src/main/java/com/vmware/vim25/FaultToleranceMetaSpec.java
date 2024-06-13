package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FaultToleranceMetaSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceMetaSpec", propOrder = {"metaDataDatastore"})
public class FaultToleranceMetaSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference metaDataDatastore;
  
  public ManagedObjectReference getMetaDataDatastore() {
    return this.metaDataDatastore;
  }
  
  public void setMetaDataDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.metaDataDatastore = paramManagedObjectReference;
  }
}
