package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementAffinityRule;
import com.vmware.vim25.PlacementRankSpec;
import com.vmware.vim25.PlacementSpec;
import com.vmware.vim25.StorageDrsPlacementRankVmSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementRankSpec", propOrder = {"specs", "clusters", "rules", "placementRankByVm"})
public class PlacementRankSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<PlacementSpec> specs;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> clusters;
  
  protected List<PlacementAffinityRule> rules;
  
  protected List<StorageDrsPlacementRankVmSpec> placementRankByVm;
  
  public List<PlacementSpec> getSpecs() {
    if (this.specs == null)
      this.specs = new ArrayList<>(); 
    return this.specs;
  }
  
  public List<ManagedObjectReference> getClusters() {
    if (this.clusters == null)
      this.clusters = new ArrayList<>(); 
    return this.clusters;
  }
  
  public List<PlacementAffinityRule> getRules() {
    if (this.rules == null)
      this.rules = new ArrayList<>(); 
    return this.rules;
  }
  
  public List<StorageDrsPlacementRankVmSpec> getPlacementRankByVm() {
    if (this.placementRankByVm == null)
      this.placementRankByVm = new ArrayList<>(); 
    return this.placementRankByVm;
  }
}
