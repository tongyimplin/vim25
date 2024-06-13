package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualAppLinkInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualAppLinkInfo", propOrder = {"key", "destroyWithParent"})
public class VirtualAppLinkInfo extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference key;
  
  protected Boolean destroyWithParent;
  
  public ManagedObjectReference getKey() {
    return this.key;
  }
  
  public void setKey(ManagedObjectReference paramManagedObjectReference) {
    this.key = paramManagedObjectReference;
  }
  
  public Boolean isDestroyWithParent() {
    return this.destroyWithParent;
  }
  
  public void setDestroyWithParent(Boolean paramBoolean) {
    this.destroyWithParent = paramBoolean;
  }
}
