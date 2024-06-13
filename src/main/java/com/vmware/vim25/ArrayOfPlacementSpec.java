package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPlacementSpec;
import com.vmware.vim25.PlacementSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlacementSpec", propOrder = {"placementSpec"})
public class ArrayOfPlacementSpec {
  @XmlElement(name = "PlacementSpec")
  protected List<PlacementSpec> placementSpec;
  
  public List<PlacementSpec> getPlacementSpec() {
    if (this.placementSpec == null)
      this.placementSpec = new ArrayList<>(); 
    return this.placementSpec;
  }
}
