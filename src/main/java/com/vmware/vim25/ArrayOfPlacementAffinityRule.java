package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPlacementAffinityRule;
import com.vmware.vim25.PlacementAffinityRule;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPlacementAffinityRule", propOrder = {"placementAffinityRule"})
public class ArrayOfPlacementAffinityRule {
  @XmlElement(name = "PlacementAffinityRule")
  protected List<PlacementAffinityRule> placementAffinityRule;
  
  public List<PlacementAffinityRule> getPlacementAffinityRule() {
    if (this.placementAffinityRule == null)
      this.placementAffinityRule = new ArrayList<>(); 
    return this.placementAffinityRule;
  }
}
