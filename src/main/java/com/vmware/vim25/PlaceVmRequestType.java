package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlaceVmRequestType;
import com.vmware.vim25.PlacementSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceVmRequestType", propOrder = {"_this", "placementSpec"})
public class PlaceVmRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected PlacementSpec placementSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public PlacementSpec getPlacementSpec() {
    return this.placementSpec;
  }
  
  public void setPlacementSpec(PlacementSpec paramPlacementSpec) {
    this.placementSpec = paramPlacementSpec;
  }
}
