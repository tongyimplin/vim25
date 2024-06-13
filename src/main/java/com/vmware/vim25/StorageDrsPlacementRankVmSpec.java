package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementSpec;
import com.vmware.vim25.StorageDrsPlacementRankVmSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StorageDrsPlacementRankVmSpec", propOrder = {"vmPlacementSpec", "vmClusters"})
public class StorageDrsPlacementRankVmSpec extends DynamicData {
  @XmlElement(required = true)
  protected PlacementSpec vmPlacementSpec;
  
  @XmlElement(required = true)
  protected List<ManagedObjectReference> vmClusters;
  
  public PlacementSpec getVmPlacementSpec() {
    return this.vmPlacementSpec;
  }
  
  public void setVmPlacementSpec(PlacementSpec paramPlacementSpec) {
    this.vmPlacementSpec = paramPlacementSpec;
  }
  
  public List<ManagedObjectReference> getVmClusters() {
    if (this.vmClusters == null)
      this.vmClusters = new ArrayList<>(); 
    return this.vmClusters;
  }
}
