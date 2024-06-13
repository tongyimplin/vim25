package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfoBackingInfo;
import com.vmware.vim25.BaseConfigInfoFileBackingInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseConfigInfoBackingInfo", propOrder = {"datastore"})
@XmlSeeAlso({BaseConfigInfoFileBackingInfo.class})
public class BaseConfigInfoBackingInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
}
