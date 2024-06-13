package com.vmware.vim25;

import com.vmware.vim25.PlaceVmResponse;
import com.vmware.vim25.PlacementResult;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "PlaceVmResponse")
public class PlaceVmResponse {
  @XmlElement(required = true)
  protected PlacementResult returnval;
  
  public PlacementResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(PlacementResult paramPlacementResult) {
    this.returnval = paramPlacementResult;
  }
}
