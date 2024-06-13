package com.vmware.vim25;

import com.vmware.vim25.ClusterAction;
import com.vmware.vim25.ClusterDrsMigration;
import com.vmware.vim25.ClusterMigrationAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterMigrationAction", propOrder = {"drsMigration"})
public class ClusterMigrationAction extends ClusterAction {
  protected ClusterDrsMigration drsMigration;
  
  public ClusterDrsMigration getDrsMigration() {
    return this.drsMigration;
  }
  
  public void setDrsMigration(ClusterDrsMigration paramClusterDrsMigration) {
    this.drsMigration = paramClusterDrsMigration;
  }
}
