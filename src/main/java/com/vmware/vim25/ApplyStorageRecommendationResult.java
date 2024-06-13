package com.vmware.vim25;

import com.vmware.vim25.ApplyStorageRecommendationResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyStorageRecommendationResult", propOrder = {"vm"})
public class ApplyStorageRecommendationResult extends DynamicData {
  protected ManagedObjectReference vm;
  
  public ManagedObjectReference getVm() {
    return this.vm;
  }
  
  public void setVm(ManagedObjectReference paramManagedObjectReference) {
    this.vm = paramManagedObjectReference;
  }
}
