package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterHostInfraUpdateHaModeAction;
import com.vmware.vim25.ClusterHostPowerAction;
import com.vmware.vim25.ClusterInitialPlacementAction;
import com.vmware.vim25.ClusterMigrationAction;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HbrDiskMigrationAction;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementAction;
import com.vmware.vim25.StorageMigrationAction;
import com.vmware.vim25.StoragePlacementAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAction", propOrder = {"type", "target"})
@XmlSeeAlso({PlacementAction.class, StoragePlacementAction.class, StorageMigrationAction.class, ClusterHostInfraUpdateHaModeAction.class, HbrDiskMigrationAction.class, ClusterInitialPlacementAction.class, ClusterMigrationAction.class, ClusterHostPowerAction.class})
public class ClusterAction extends DynamicData {
  @XmlElement(required = true)
  protected String type;
  
  protected ManagedObjectReference target;
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public ManagedObjectReference getTarget() {
    return this.target;
  }
  
  public void setTarget(ManagedObjectReference paramManagedObjectReference) {
    this.target = paramManagedObjectReference;
  }
}
